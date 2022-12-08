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

public class BowlingStatsActivity extends AppCompatActivity {
    public static String LOG = "<<<BowlingStatsActivity>>>";
    ImageView img_3Wicket;
    ImageView img_bestAvg;
    ImageView img_bestEco;
    ImageView img_bestFigure;
    ImageView img_bestSR;
    ImageView img_mostWickets;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                BowlingStatsActivity bowlingStatsActivity = BowlingStatsActivity.this;
                bowlingStatsActivity.onNext(bowlingStatsActivity.whereLocal);
                return;
            }
            BowlingStatsActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    TextView txt_3Wicket;
    TextView txt_3Wicket_playerName;
    TextView txt_3Wicket_playerTeam;
    TextView txt_bestAvg;
    TextView txt_bestAvg_playerName;
    TextView txt_bestAvg_playerTeam;
    TextView txt_bestEco;
    TextView txt_bestEco_playerName;
    TextView txt_bestEco_playerTeam;
    TextView txt_bestFigure;
    TextView txt_bestFigure_playerName;
    TextView txt_bestFigure_playerTeam;
    TextView txt_bestSR;
    TextView txt_bestSR_playerName;
    TextView txt_bestSR_playerTeam;
    TextView txt_mostWickets;
    TextView txt_mostWickets_playerName;
    TextView txt_mostWickets_playerTeam;
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
        setContentView(R.layout.activity_bowling_stats);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                BowlingStatsActivity.this.onBackPressed();
            }
        });
        this.img_mostWickets = (ImageView) findViewById(R.id.img_mostWickets);
        this.txt_mostWickets = (TextView) findViewById(R.id.txt_mostWickets);
        this.txt_mostWickets_playerName = (TextView) findViewById(R.id.txt_mostWickets_playerName);
        this.txt_mostWickets_playerTeam = (TextView) findViewById(R.id.txt_mostWickets_playerTeam);
        this.img_bestFigure = (ImageView) findViewById(R.id.img_bestFigure);
        this.txt_bestFigure = (TextView) findViewById(R.id.txt_bestFigure);
        this.txt_bestFigure_playerName = (TextView) findViewById(R.id.txt_bestFigure_playerName);
        this.txt_bestFigure_playerTeam = (TextView) findViewById(R.id.txt_bestFigure_playerTeam);
        this.img_bestAvg = (ImageView) findViewById(R.id.img_bestAvg);
        this.txt_bestAvg = (TextView) findViewById(R.id.txt_bestAvg);
        this.txt_bestAvg_playerName = (TextView) findViewById(R.id.txt_bestAvg_playerName);
        this.txt_bestAvg_playerTeam = (TextView) findViewById(R.id.txt_bestAvg_playerTeam);
        this.img_bestSR = (ImageView) findViewById(R.id.img_bestSR);
        this.txt_bestSR = (TextView) findViewById(R.id.txt_bestSR);
        this.txt_bestSR_playerName = (TextView) findViewById(R.id.txt_bestSR_playerName);
        this.txt_bestSR_playerTeam = (TextView) findViewById(R.id.txt_bestSR_playerTeam);
        this.img_bestEco = (ImageView) findViewById(R.id.img_bestEco);
        this.txt_bestEco = (TextView) findViewById(R.id.txt_bestEco);
        this.txt_bestEco_playerName = (TextView) findViewById(R.id.txt_bestEco_playerName);
        this.txt_bestEco_playerTeam = (TextView) findViewById(R.id.txt_bestEco_playerTeam);
        this.img_3Wicket = (ImageView) findViewById(R.id.img_3Wicket);
        this.txt_3Wicket = (TextView) findViewById(R.id.txt_3Wicket);
        this.txt_3Wicket_playerName = (TextView) findViewById(R.id.txt_3Wicket_playerName);
        this.txt_3Wicket_playerTeam = (TextView) findViewById(R.id.txt_3Wicket_playerTeam);
        setStats();
        findViewById(R.id.card_most_wickets).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMostWickets(v);

            }
        });
        findViewById(R.id.ll_best_figure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBestFigure(v);

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
        findViewById(R.id.ll_best_eco).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBestEco(v);

            }
        });
        findViewById(R.id.ll_3_wicket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick3Wickets(v);

            }
        });

    }

    private void setStats() {
        if (Glob.bowlingStatsList != null) {
            if (Glob.bowlingStatsList.Most_Wickets() != null) {
                RequestManager with = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + Glob.bowlingStatsList.Most_Wickets().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_mostWickets);
                this.txt_mostWickets.setText(Glob.bowlingStatsList.Most_Wickets().get(0).wickets());
                this.txt_mostWickets_playerName.setText(Glob.bowlingStatsList.Most_Wickets().get(0).player_name());
                this.txt_mostWickets_playerTeam.setText(Glob.bowlingStatsList.Most_Wickets().get(0).team_short_name());
            }
            if (Glob.bowlingStatsList.Best_figures() != null) {
                RequestManager with2 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with2.load(Glob.player_start + Glob.bowlingStatsList.Best_figures().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestFigure);
                this.txt_bestFigure.setText(Glob.bowlingStatsList.Best_figures().get(0).best_bowling_figures());
                this.txt_bestFigure_playerName.setText(Glob.bowlingStatsList.Best_figures().get(0).player_name());
                this.txt_bestFigure_playerTeam.setText(Glob.bowlingStatsList.Best_figures().get(0).team_short_name());
            }
            if (Glob.bowlingStatsList.Best_Bowling_Average() != null) {
                RequestManager with3 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + Glob.bowlingStatsList.Best_Bowling_Average().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestAvg);
                this.txt_bestAvg.setText(Glob.bowlingStatsList.Best_Bowling_Average().get(0).best_bowling_average());
                this.txt_bestAvg_playerName.setText(Glob.bowlingStatsList.Best_Bowling_Average().get(0).player_name());
                this.txt_bestAvg_playerTeam.setText(Glob.bowlingStatsList.Best_Bowling_Average().get(0).team_short_name());
            }
            if (Glob.bowlingStatsList.Best_Bowling_Strike_Rate() != null) {
                RequestManager with4 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with4.load(Glob.player_start + Glob.bowlingStatsList.Best_Bowling_Strike_Rate().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestSR);
                this.txt_bestSR.setText(Glob.bowlingStatsList.Best_Bowling_Strike_Rate().get(0).bowling_strike_rate());
                this.txt_bestSR_playerName.setText(Glob.bowlingStatsList.Best_Bowling_Strike_Rate().get(0).player_name());
                this.txt_bestSR_playerTeam.setText(Glob.bowlingStatsList.Best_Bowling_Strike_Rate().get(0).team_short_name());
            }
            if (Glob.bowlingStatsList.Best_Economy_Rates() != null) {
                RequestManager with5 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with5.load(Glob.player_start + Glob.bowlingStatsList.Best_Economy_Rates().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_bestEco);
                this.txt_bestEco.setText(Glob.bowlingStatsList.Best_Economy_Rates().get(0).economy());
                this.txt_bestEco_playerName.setText(Glob.bowlingStatsList.Best_Economy_Rates().get(0).player_name());
                this.txt_bestEco_playerTeam.setText(Glob.bowlingStatsList.Best_Economy_Rates().get(0).team_short_name());
            }
            if (Glob.bowlingStatsList.Three_Wicket_Haul() != null) {
                RequestManager with6 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with6.load(Glob.player_start + Glob.bowlingStatsList.Three_Wicket_Haul().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_3Wicket);
                this.txt_3Wicket.setText(Glob.bowlingStatsList.Three_Wicket_Haul().get(0).three_wickets_haul());
                this.txt_3Wicket_playerName.setText(Glob.bowlingStatsList.Three_Wicket_Haul().get(0).player_name());
                this.txt_3Wicket_playerTeam.setText(Glob.bowlingStatsList.Three_Wicket_Haul().get(0).team_short_name());
            }
        }
    }


    public void onClickMostWickets(View view) {
        onShowInterstitialAd("onClickMostWickets");
    }


    public void onClickBestFigure(View view) {
        onShowInterstitialAd("onClickBestFigure");
    }


    public void onClickBestAvg(View view) {
        onShowInterstitialAd("onClickBestAvg");
    }


    public void onClickBestSR(View view) {
        onShowInterstitialAd("onClickBestSR");
    }


    public void onClickBestEco(View view) {
        onShowInterstitialAd("onClickBestEco");
    }


    public void onClick3Wickets(View view) {
        onShowInterstitialAd("onClick3Wickets");
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
            case -1989930012:
                if (str.equals("onClickBestEco")) {
                    c = 1;
                    break;
                }
                break;
            case -1771646240:
                if (str.equals("onClick3Wickets")) {
                    c = 2;
                    break;
                }
                break;
            case 39316734:
                if (str.equals("onClickMostWickets")) {
                    c = 3;
                    break;
                }
                break;
            case 1321282444:
                if (str.equals("onClickBestSR")) {
                    c = 4;
                    break;
                }
                break;
            case 1462647217:
                if (str.equals("onClickBestFigure")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this, BowlingActivity.class);
                intent.putExtra("statsType", "bestAvg");
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this, BowlingActivity.class);
                intent2.putExtra("statsType", "bestEco");
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this, BowlingActivity.class);
                intent3.putExtra("statsType", "3Wicket");
                startActivity(intent3);
                return;
            case 3:
                Intent intent4 = new Intent(this, BowlingActivity.class);
                intent4.putExtra("statsType", "mostWickets");
                startActivity(intent4);
                return;
            case 4:
                Intent intent5 = new Intent(this, BowlingActivity.class);
                intent5.putExtra("statsType", "bestSR");
                startActivity(intent5);
                return;
            case 5:
                Intent intent6 = new Intent(this, BowlingActivity.class);
                intent6.putExtra("statsType", "bestFigure");
                startActivity(intent6);
                return;
            default:
                return;
        }
    }

}
