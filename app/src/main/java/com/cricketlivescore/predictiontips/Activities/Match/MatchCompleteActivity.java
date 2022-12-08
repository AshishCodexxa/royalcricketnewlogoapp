package com.cricketlivescore.predictiontips.Activities.Match;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Activities.Criclytics.CriclyticsCompleteActivity;
import com.cricketlivescore.predictiontips.Activities.Fantasy.FantasyTeamActivity;
import com.cricketlivescore.predictiontips.Adapter.MatchInfo.AdapterFeatureTeam;
import com.cricketlivescore.predictiontips.FeaturematchQuery;
import com.cricketlivescore.predictiontips.MiniScoreCardQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;

import com.cricketlivescore.predictiontips.Fragments.MatchInfo.CommentaryFragment;
import com.cricketlivescore.predictiontips.Fragments.MatchInfo.HighlightsFragment;
import com.cricketlivescore.predictiontips.Fragments.MatchInfo.MatchInfoFragment;
import com.cricketlivescore.predictiontips.Fragments.MatchInfo.ScoreCardFragment;
import com.cricketlivescore.predictiontips.Fragments.MatchInfo.SummaryFragment;
import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class MatchCompleteActivity extends AppCompatActivity {
    static final String LOG = "LogMatchCompleteActivity";
    public static List<FeaturematchQuery.Featurematch> currentMatch = new ArrayList();
    String currentInnings;
    ImageView img_back;
    ImageView img_playerOfTheMatchImage;
    LinearLayout ll_fantacy;
    LinearLayout ll_prediction;
    String matchId;
    String matchStatus;
    String matchType;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                MatchCompleteActivity matchCompleteActivity = MatchCompleteActivity.this;
                matchCompleteActivity.onNext(matchCompleteActivity.whereLocal);
                return;
            }
            MatchCompleteActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_match_detail;
    TabLayout tl_matchCompleteActivity;
    TextView txt_mca_matchStatus;
    TextView txt_playerOfTheMatchName;
    TextView txt_toolbar_title;
    ViewPager vp_matchCompleteActivity;
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
        setContentView(R.layout.activity_match_complete);
        BannerIDCardAds();
        Intent intent = getIntent();
        this.matchId = intent.getStringExtra(Glob.MATCH_ID);
        this.currentInnings = intent.getStringExtra(Glob.INNINGS);
        Log.d("LOG", this.matchId + " : " + this.currentInnings);
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
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
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_match_detail);
        this.rv_match_detail = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        this.txt_mca_matchStatus = (TextView) findViewById(R.id.txt_mca_matchStatus);
        this.img_playerOfTheMatchImage = (ImageView) findViewById(R.id.img_playerOfTheMatchImage);
        this.txt_playerOfTheMatchName = (TextView) findViewById(R.id.txt_playerOfTheMatchName);
        this.tl_matchCompleteActivity = (TabLayout) findViewById(R.id.tl_matchCompleteActivity);
        this.vp_matchCompleteActivity = (ViewPager) findViewById(R.id.vp_matchCompleteActivity);
        TabLayout tabLayout = this.tl_matchCompleteActivity;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.summary));
        TabLayout tabLayout2 = this.tl_matchCompleteActivity;
        tabLayout2.addTab(tabLayout2.newTab().setText(R.string.commentary));
        TabLayout tabLayout3 = this.tl_matchCompleteActivity;
        tabLayout3.addTab(tabLayout3.newTab().setText(R.string.scorecard));
        TabLayout tabLayout4 = this.tl_matchCompleteActivity;
        tabLayout4.addTab(tabLayout4.newTab().setText(R.string.highlights));
        TabLayout tabLayout5 = this.tl_matchCompleteActivity;
        tabLayout5.addTab(tabLayout5.newTab().setText(R.string.match_info));
        this.tl_matchCompleteActivity.setTabGravity(0);
        this.vp_matchCompleteActivity.setAdapter(new AdapterMatchInfo(getSupportFragmentManager(), this, this.tl_matchCompleteActivity.getTabCount(), this.matchId, this.currentInnings));
        this.vp_matchCompleteActivity.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.tl_matchCompleteActivity));
        this.tl_matchCompleteActivity.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                MatchCompleteActivity.this.vp_matchCompleteActivity.setCurrentItem(tab.getPosition());
            }
        });
        this.ll_fantacy = (LinearLayout) findViewById(R.id.ll_fantacy);
        this.ll_prediction = (LinearLayout) findViewById(R.id.ll_prediction);
        new GraphqlApi(this).getMiniScoreCardQuery(this.matchId, new Interface.GetMiniScoreCardQuery() {

            @Override
            public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                MatchCompleteActivity.this.getMatchDetail(miniScoreCard);
            }
        });
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    
  
    private void getMatchDetail(final MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
        runOnUiThread(new Runnable() {

            public void run() {
                MiniScoreCardQuery.MiniScoreCard miniScoreCard2 = miniScoreCard;
                if (!(miniScoreCard2 == null || miniScoreCard2.data() == null || miniScoreCard.data().isEmpty())) {
                    for (int i = 0; i < miniScoreCard.data().size(); i++) {
                        String homeTeamName = miniScoreCard.data().get(i).homeTeamName();
                        String awayTeamName = miniScoreCard.data().get(i).awayTeamName();
                        String matchResult = miniScoreCard.data().get(i).matchResult();
                        String playerOfTheMatch = miniScoreCard.data().get(i).playerOfTheMatch();
                        MatchCompleteActivity.this.matchStatus = miniScoreCard.data().get(0).matchStatus();
                        MatchCompleteActivity.this.matchType = miniScoreCard.data().get(0).matchType();
                        if (MatchCompleteActivity.this.matchType.equals("Test")) {
                            MatchCompleteActivity.this.findViewById(R.id.rl_player_of_the_match).setVisibility(View.GONE);
                        } else if (playerOfTheMatch != null && !playerOfTheMatch.equals("") && miniScoreCard.data().get(i).playerID() != null && !miniScoreCard.data().get(i).playerID().equals("")) {
                            MatchCompleteActivity.this.findViewById(R.id.rl_player_of_the_match).setVisibility(View.VISIBLE);;
                            MatchCompleteActivity.this.txt_playerOfTheMatchName.setText(playerOfTheMatch);
                            RequestManager with = Glide.with((FragmentActivity) MatchCompleteActivity.this);
                            ((RequestBuilder) with.load(Glob.player_start + miniScoreCard.data().get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).into(MatchCompleteActivity.this.img_playerOfTheMatchImage);
                        }
                        MatchCompleteActivity.this.txt_toolbar_title.setText(String.format("%s %s %s %s %s", homeTeamName, "vs", awayTeamName, ",", miniScoreCard.data().get(i).matchNumber()));
                        MatchCompleteActivity.this.rv_match_detail.setAdapter(new AdapterFeatureTeam(MatchCompleteActivity.this, miniScoreCard.data().get(0).matchScore()));
                        MatchCompleteActivity.this.txt_mca_matchStatus.setText(matchResult);
                        if (miniScoreCard.data().get(0).isCricklyticsAvailable() != null && miniScoreCard.data().get(0).isCricklyticsAvailable().booleanValue()) {
                            MatchCompleteActivity.this.findViewById(R.id.ll_cricklytics).setVisibility(View.VISIBLE);;
                        }
                        MatchCompleteActivity.this.ll_fantacy.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View view) {
                                MatchCompleteActivity.this.onClickFantacy();
                            }
                        });
                        MatchCompleteActivity.this.ll_prediction.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View view) {
                                MatchCompleteActivity.this.onClickPrediction();
                            }
                        });
                    }
                }
            }
        });
    }

    
  
    private void onClickPrediction() {
        onShowInterstitialAd("criclyticsCompleted");
    }

    
  
    private void onClickFantacy() {
        onShowInterstitialAd("FantasyTeamActivity");
    }

    @Override 
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        finish();
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
        if (str.equals("criclyticsCompleted")) {
            Intent intent = new Intent(this, CriclyticsCompleteActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra(Glob.INNINGS, this.currentInnings);
            intent.putExtra(Glob.TYPES, this.matchType);
            intent.putExtra(Glob.MATCH_STATUS, "criclyticsCompleted");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else if (str.equals("FantasyTeamActivity")) {
            Intent intent2 = new Intent(this, FantasyTeamActivity.class);
            intent2.putExtra(Glob.MATCH_ID, this.matchId);
            intent2.putExtra(Glob.MATCH_STATUS, this.matchStatus);
            startActivity(intent2);
        }
    }

    public class AdapterMatchInfo extends FragmentPagerAdapter {
        private Context context;
        String currentInnings;
        String matchId;
        int totalTabs;

        public AdapterMatchInfo(FragmentManager fragmentManager, Context context2, int i, String str, String str2) {
            super(fragmentManager);
            this.context = context2;
            this.totalTabs = i;
            this.matchId = str;
            this.currentInnings = str2;
        }

        @Override
        public Fragment getItem(int i) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("MatchId", this.matchId);
                SummaryFragment summaryFragment = new SummaryFragment();
                summaryFragment.setArguments(bundle);
                return summaryFragment;
            } else if (i == 1) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("MatchId", this.matchId);
                bundle2.putString(Glob.INNINGS, this.currentInnings);
                CommentaryFragment commentaryFragment = new CommentaryFragment();
                commentaryFragment.setArguments(bundle2);
                return commentaryFragment;
            } else if (i == 2) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("MatchId", this.matchId);
                ScoreCardFragment scoreCardFragment = new ScoreCardFragment();
                scoreCardFragment.setArguments(bundle3);
                return scoreCardFragment;
            } else if (i == 3) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("MatchId", this.matchId);
                HighlightsFragment highlightsFragment = new HighlightsFragment();
                highlightsFragment.setArguments(bundle4);
                return highlightsFragment;
            } else if (i != 4) {
                return null;
            } else {
                Bundle bundle5 = new Bundle();
                bundle5.putString("MatchId", this.matchId);
                MatchInfoFragment matchInfoFragment = new MatchInfoFragment();
                matchInfoFragment.setArguments(bundle5);
                return matchInfoFragment;
            }
        }

        @Override
        public int getCount() {
            return this.totalTabs;
        }
    }

    
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
