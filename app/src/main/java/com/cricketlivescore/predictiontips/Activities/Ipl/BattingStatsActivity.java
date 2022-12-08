package com.cricketlivescore.predictiontips.Activities.Ipl;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;

import com.cricketlivescore.predictiontips.R;

public class BattingStatsActivity extends AppCompatActivity {
    public static String LOG = "<<<BattingStatsActivity>>>";
    ImageView img_bestAvg;
    ImageView img_bestSR;
    ImageView img_most4s;
    ImageView img_most6s;
    ImageView img_mostRuns;
    ImageView img_player_most50;
    ImageView img_player_topScorer;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                BattingStatsActivity battingStatsActivity = BattingStatsActivity.this;
                battingStatsActivity.onNext(battingStatsActivity.whereLocal);
                return;
            }
            BattingStatsActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    TextView txt_bestAvg;
    TextView txt_bestAvg_playerName;
    TextView txt_bestAvg_playerTeam;
    TextView txt_bestSR;
    TextView txt_bestSR_playerName;
    TextView txt_bestSR_playerTeam;
    TextView txt_most4s;
    TextView txt_most4s_playerName;
    TextView txt_most4s_playerTeam;
    TextView txt_most6s;
    TextView txt_most6s_playerName;
    TextView txt_most6s_playerTeam;
    TextView txt_mostRun;
    TextView txt_mostRun_playerName;
    TextView txt_mostRun_playerTeam;
    TextView txt_number_most50;
    TextView txt_number_topScorer;
    TextView txt_number_topScorerBall;
    TextView txt_player_most50;
    TextView txt_player_team_most50;
    TextView txt_player_team_topScorer;
    TextView txt_player_topScorer;
    String whereLocal = "";
    LinearLayout adContainerView;
    AdView adViewone;

    public void BannerIDCardAds() {
        adContainerView = findViewById(R.id.adsmultyViews);
        adViewone = new AdView(getApplicationContext());
        adViewone.setAdUnitId(getString(R.string.AdMob_Banner));
        adContainerView.addView(adViewone);
        BannerLoad();
        adViewone.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

            }
        });
    }

    private void BannerLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        AdSize adSize = BannerGetSize();
        adViewone.setAdSize(adSize);
        adViewone.loadAd(adRequest);
    }

    private AdSize BannerGetSize() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }
    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_batting_stats);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                BattingStatsActivity.this.onBackPressed();
            }
        });
        this.img_mostRuns = (ImageView) findViewById(R.id.img_mostRuns);
        this.txt_mostRun = (TextView) findViewById(R.id.txt_mostRun);
        this.txt_mostRun_playerName = (TextView) findViewById(R.id.txt_mostRun_playerName);
        this.txt_mostRun_playerTeam = (TextView) findViewById(R.id.txt_mostRun_playerTeam);
        this.img_player_topScorer = (ImageView) findViewById(R.id.img_player_topScorer);
        this.txt_number_topScorer = (TextView) findViewById(R.id.txt_number_topScorer);
        this.txt_number_topScorerBall = (TextView) findViewById(R.id.txt_number_topScorerBall);
        this.txt_player_topScorer = (TextView) findViewById(R.id.txt_player_topScorer);
        this.txt_player_team_topScorer = (TextView) findViewById(R.id.txt_player_team_topScorer);
        this.img_player_most50 = (ImageView) findViewById(R.id.img_player_most50);
        this.txt_number_most50 = (TextView) findViewById(R.id.txt_number_most50);
        this.txt_player_most50 = (TextView) findViewById(R.id.txt_player_most50);
        this.txt_player_team_most50 = (TextView) findViewById(R.id.txt_player_team_most50);
        this.img_most4s = (ImageView) findViewById(R.id.img_most4s);
        this.txt_most4s = (TextView) findViewById(R.id.txt_most4s);
        this.txt_most4s_playerName = (TextView) findViewById(R.id.txt_most4s_playerName);
        this.txt_most4s_playerTeam = (TextView) findViewById(R.id.txt_most4s_playerTeam);
        this.img_most6s = (ImageView) findViewById(R.id.img_most6s);
        this.txt_most6s = (TextView) findViewById(R.id.txt_most6s);
        this.txt_most6s_playerName = (TextView) findViewById(R.id.txt_most6s_playerName);
        this.txt_most6s_playerTeam = (TextView) findViewById(R.id.txt_most6s_playerTeam);
        this.img_bestAvg = (ImageView) findViewById(R.id.img_bestAvg);
        this.txt_bestAvg = (TextView) findViewById(R.id.txt_bestAvg);
        this.txt_bestAvg_playerName = (TextView) findViewById(R.id.txt_bestAvg_playerName);
        this.txt_bestAvg_playerTeam = (TextView) findViewById(R.id.txt_bestAvg_playerTeam);
        this.img_bestSR = (ImageView) findViewById(R.id.img_bestSR);
        this.txt_bestSR = (TextView) findViewById(R.id.txt_bestSR);
        this.txt_bestSR_playerName = (TextView) findViewById(R.id.txt_bestSR_playerName);
        this.txt_bestSR_playerTeam = (TextView) findViewById(R.id.txt_bestSR_playerTeam);
        findViewById(R.id.card_most_runs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMostRuns(v);

            }
        });
        findViewById(R.id.ll_highest_score).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickHighestScore(v);

            }
        });
        findViewById(R.id.ll_most_50).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMost50(v);

            }
        });
        findViewById(R.id.card_most_4s).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMost4s(v);

            }
        });
        findViewById(R.id.ll_most_6s).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMost6s(v);

            }
        });
        findViewById(R.id.ll_best_avg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBestAvg(v);

            }
        });
        findViewById(R.id.card_best_sr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBestSR(v);

            }
        });
        setStats();
    }

    private void setStats() {
        if (Glob.battingStatsList != null) {
            if (Glob.battingStatsList.Most_Runs() != null) {
                RequestManager with = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + Glob.battingStatsList.Most_Runs().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_mostRuns);
                this.txt_mostRun.setText(Glob.battingStatsList.Most_Runs().get(0).runs_scored());
                this.txt_mostRun_playerName.setText(Glob.battingStatsList.Most_Runs().get(0).player_name());
                this.txt_mostRun_playerTeam.setText(Glob.battingStatsList.Most_Runs().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Highest_Score() != null) {
                RequestManager with2 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with2.load(Glob.player_start + Glob.battingStatsList.Highest_Score().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_player_topScorer);
                this.txt_number_topScorer.setText(Glob.battingStatsList.Highest_Score().get(0).highest_score());
                TextView textView = this.txt_number_topScorerBall;
                textView.setText("(" + Glob.battingStatsList.Highest_Score().get(0).balls_faced() + ")");
                this.txt_player_topScorer.setText(Glob.battingStatsList.Highest_Score().get(0).player_name());
                this.txt_player_team_topScorer.setText(Glob.battingStatsList.Highest_Score().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Most_Fifties() != null) {
                RequestManager with3 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + Glob.battingStatsList.Most_Fifties().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_player_most50);
                this.txt_number_most50.setText(Glob.battingStatsList.Most_Fifties().get(0).fifties());
                this.txt_player_most50.setText(Glob.battingStatsList.Most_Fifties().get(0).player_name());
                this.txt_player_team_most50.setText(Glob.battingStatsList.Most_Fifties().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Most_4s() != null) {
                RequestManager with4 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with4.load(Glob.player_start + Glob.battingStatsList.Most_4s().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_most4s);
                this.txt_most4s.setText(Glob.battingStatsList.Most_4s().get(0).fours());
                this.txt_most4s_playerName.setText(Glob.battingStatsList.Most_4s().get(0).player_name());
                this.txt_most4s_playerTeam.setText(Glob.battingStatsList.Most_4s().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Most_6s() != null) {
                RequestManager with5 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with5.load(Glob.player_start + Glob.battingStatsList.Most_6s().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_most6s);
                this.txt_most6s.setText(Glob.battingStatsList.Most_6s().get(0).sixes());
                this.txt_most6s_playerName.setText(Glob.battingStatsList.Most_6s().get(0).player_name());
                this.txt_most6s_playerTeam.setText(Glob.battingStatsList.Most_6s().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Best_Batting_Average() != null) {
                RequestManager with6 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with6.load(Glob.player_start + Glob.battingStatsList.Best_Batting_Average().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestAvg);
                this.txt_bestAvg.setText(Glob.battingStatsList.Best_Batting_Average().get(0).average());
                this.txt_bestAvg_playerName.setText(Glob.battingStatsList.Best_Batting_Average().get(0).player_name());
                this.txt_bestAvg_playerTeam.setText(Glob.battingStatsList.Best_Batting_Average().get(0).team_short_name());
            }
            if (Glob.battingStatsList.Best_Strike_Rate() != null) {
                RequestManager with7 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with7.load(Glob.player_start + Glob.battingStatsList.Best_Strike_Rate().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestSR);
                this.txt_bestSR.setText(Glob.battingStatsList.Best_Strike_Rate().get(0).batting_strike_rate());
                this.txt_bestSR_playerName.setText(Glob.battingStatsList.Best_Strike_Rate().get(0).player_name());
                this.txt_bestSR_playerTeam.setText(Glob.battingStatsList.Best_Strike_Rate().get(0).team_short_name());
            }
        }
    }

    
    public void onClickMostRuns(View view) {
        onShowInterstitialAd("onClickMostRuns");
    }

    
    public void onClickHighestScore(View view) {
        onShowInterstitialAd("onClickHighestScore");
    }

    
    public void onClickMost50(View view) {
        onShowInterstitialAd("onClickMost50");
    }

    
    public void onClickMost4s(View view) {
        onShowInterstitialAd("onClickMost4s");
    }

    
    public void onClickMost6s(View view) {
        onShowInterstitialAd("onClickMost6s");
    }

    
    public void onClickBestAvg(View view) {
        onShowInterstitialAd("onClickBestAvg");
    }

    
    public void onClickBestSR(View view) {
        onShowInterstitialAd("onClickBestSR");
    }

    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
            return;
        }
        this.whereLocal = str;
        Intent intent = new Intent(this, TestAdActivity.class);
        intent.putExtra("where", str);
        this.resultLauncher.launch(intent);
    }

    
  
    private void onNext(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1989933275:
                if (str.equals("onClickBestAvg")) {
                    c = 0;
                    break;
                }
                break;
            case 422100439:
                if (str.equals("onClickHighestScore")) {
                    c = 1;
                    break;
                }
                break;
            case 718263156:
                if (str.equals("onClickMostRuns")) {
                    c = 2;
                    break;
                }
                break;
            case 1321282444:
                if (str.equals("onClickBestSR")) {
                    c = 3;
                    break;
                }
                break;
            case 1645437351:
                if (str.equals("onClickMost50")) {
                    c = 4;
                    break;
                }
                break;
            case 1645437387:
                if (str.equals("onClickMost4s")) {
                    c = 5;
                    break;
                }
                break;
            case 1645437449:
                if (str.equals("onClickMost6s")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this, BattingActivity.class);
                intent.putExtra("statsType", "bestAvg");
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this, BattingActivity.class);
                intent2.putExtra("statsType", "highestScore");
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this, BattingActivity.class);
                intent3.putExtra("statsType", "mostRuns");
                startActivity(intent3);
                return;
            case 3:
                Intent intent4 = new Intent(this, BattingActivity.class);
                intent4.putExtra("statsType", "bestSR");
                startActivity(intent4);
                return;
            case 4:
                Intent intent5 = new Intent(this, BattingActivity.class);
                intent5.putExtra("statsType", "most50");
                startActivity(intent5);
                return;
            case 5:
                Intent intent6 = new Intent(this, BattingActivity.class);
                intent6.putExtra("statsType", "most4s");
                startActivity(intent6);
                return;
            case 6:
                Intent intent7 = new Intent(this, BattingActivity.class);
                intent7.putExtra("statsType", "most6s");
                startActivity(intent7);
                return;
            default:
                return;
        }
    }

}
