package com.gsbusiness.livecricketscoreprediction.Activities.Match;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.work.WorkRequest;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;
import com.gsbusiness.livecricketscoreprediction.Activities.Criclytics.CriclyticsLiveActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Fantasy.FantasyTeamActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo.AdapterFeatureTeam;
import com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo.AdapterMatchInfo;

import com.gsbusiness.livecricketscoreprediction.MiniScoreCardQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;

public class MatchActivity extends AppCompatActivity {
    static final String LOG = "<<<MatchActivity>>>";
    TabLayout TabLayout_ma;
    ViewPager ViewPager_ma;
    String currentInnings;
    Handler handler = new Handler();
    ImageView img_back;
    LinearLayout ll_fantacy;
    LinearLayout ll_prediction;
    String matchId;
    String matchStatus;
    String matchType;
    Runnable refresh;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                MatchActivity matchActivity = MatchActivity.this;
                matchActivity.onNext(matchActivity.whereLocal);
                return;
            }
            MatchActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_match_detail;
    TextView txt_ma_live;
    TextView txt_ma_matchStatus;
    TextView txt_toolbar_title;
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
        setContentView(R.layout.activity_match);
        BannerIDCardAds();
        Intent intent = getIntent();
        this.matchId = intent.getStringExtra(Glob.MATCH_ID);
        this.currentInnings = intent.getStringExtra(Glob.INNINGS);
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
        Log.d(LOG, this.matchId + " : " + this.currentInnings);
    }

    private void initView() {
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.img_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        this.txt_toolbar_title = (TextView) findViewById(R.id.txt_toolbar_title);
        this.txt_ma_matchStatus = (TextView) findViewById(R.id.txt_ma_matchStatus);
        this.txt_ma_live = (TextView) findViewById(R.id.txt_ma_live);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_match_detail);
        this.rv_match_detail = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        this.ll_fantacy = (LinearLayout) findViewById(R.id.ll_fantacy);
        this.ll_prediction = (LinearLayout) findViewById(R.id.ll_prediction);
        final GraphqlApi graphqlApi = new GraphqlApi(this);
        Runnable r1 = new Runnable() {

            public void run() {
                graphqlApi.getMiniScoreCardQuery(MatchActivity.this.matchId, new Interface.GetMiniScoreCardQuery() {

                    @Override
                    public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                        MatchActivity.this.getMatchDetail(miniScoreCard);
                    }
                });
                MatchActivity.this.handler.postDelayed(MatchActivity.this.refresh, WorkRequest.MIN_BACKOFF_MILLIS);
            }
        };
        this.refresh = r1;
        this.handler.post(r1);
        this.TabLayout_ma = (TabLayout) findViewById(R.id.TabLayout_ma);
        this.ViewPager_ma = (ViewPager) findViewById(R.id.ViewPager_ma);
        TabLayout tabLayout = this.TabLayout_ma;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.live));
        TabLayout tabLayout2 = this.TabLayout_ma;
        tabLayout2.addTab(tabLayout2.newTab().setText(R.string.commentary));
        TabLayout tabLayout3 = this.TabLayout_ma;
        tabLayout3.addTab(tabLayout3.newTab().setText(R.string.scorecard));
        TabLayout tabLayout4 = this.TabLayout_ma;
        tabLayout4.addTab(tabLayout4.newTab().setText(R.string.match_info));
        this.TabLayout_ma.setTabGravity(0);
        this.ViewPager_ma.setAdapter(new AdapterMatchInfo(getSupportFragmentManager(), this, this.TabLayout_ma.getTabCount(), this.matchId, this.currentInnings));
        this.ViewPager_ma.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.TabLayout_ma));
        this.TabLayout_ma.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                MatchActivity.this.ViewPager_ma.setCurrentItem(tab.getPosition());
            }
        });
    }

    
  
    private void onClickPrediction() {
        onShowInterstitialAd("criclyticsLive");
    }

    
  
    private void onClickFantacy() {
        onShowInterstitialAd("FantasyTeamActivity");
    }

    
  
    private void getMatchDetail(final MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
        runOnUiThread(new Runnable() {

            public void run() {
                MiniScoreCardQuery.MiniScoreCard miniScoreCard2 = miniScoreCard;
                if (!(miniScoreCard2 == null || miniScoreCard2.data() == null || miniScoreCard.data().isEmpty())) {
                    MatchActivity.this.rv_match_detail.setAdapter(new AdapterFeatureTeam(MatchActivity.this, miniScoreCard.data().get(0).matchScore()));
                    String homeTeamName = miniScoreCard.data().get(0).homeTeamName();
                    String awayTeamName = miniScoreCard.data().get(0).awayTeamName();
                    MatchActivity.this.txt_toolbar_title.setText(String.format("%s %s %s %s %s", homeTeamName, "vs", awayTeamName, ",", miniScoreCard.data().get(0).matchNumber()));
                    MatchActivity.this.matchStatus = miniScoreCard.data().get(0).matchStatus();
                    String statusMessage = miniScoreCard.data().get(0).statusMessage();
                    MatchActivity.this.matchType = miniScoreCard.data().get(0).matchType();
                    if (miniScoreCard.data().get(0).isCricklyticsAvailable() != null && miniScoreCard.data().get(0).isCricklyticsAvailable().booleanValue()) {
                        MatchActivity.this.findViewById(R.id.ll_cricklytics).setVisibility(View.VISIBLE);;
                    }
                    for (int i = 0; i < miniScoreCard.data().get(0).matchScore().size(); i++) {
                        if (MatchActivity.this.matchStatus.equals("live")) {
                            MatchActivity.this.txt_ma_live.setVisibility(View.VISIBLE);;
                            MatchActivity.this.txt_ma_matchStatus.setText(statusMessage);
                            MatchActivity.this.ll_fantacy.setOnClickListener(new View.OnClickListener() {


                                public void onClick(View view) {
                                    MatchActivity.this.onClickFantacy();
                                }
                            });
                            MatchActivity.this.ll_prediction.setOnClickListener(new View.OnClickListener() {


                                public void onClick(View view) {
                                    MatchActivity.this.onClickPrediction();
                                }
                            });
                        }
                    }
                }
            }
        });
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
        if (str.equals("criclyticsLive")) {
            Intent intent = new Intent(this, CriclyticsLiveActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra(Glob.INNINGS, this.currentInnings);
            intent.putExtra(Glob.TYPES, this.matchType);
            intent.putExtra(Glob.MATCH_STATUS, "criclyticsLive");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else if (str.equals("FantasyTeamActivity")) {
            Intent intent2 = new Intent(this, FantasyTeamActivity.class);
            intent2.putExtra(Glob.MATCH_ID, this.matchId);
            intent2.putExtra(Glob.MATCH_STATUS, this.matchStatus);
            startActivity(intent2);
        }
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    @Override 
    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override
    public void onStop() {
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override 
    public void onBackPressed() {
        this.handler.removeCallbacks(this.refresh);
        Glob.showInappReview(this);
        finish();
    }
}
