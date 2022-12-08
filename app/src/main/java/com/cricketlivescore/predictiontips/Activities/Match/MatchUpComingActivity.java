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
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Activities.Criclytics.CriclyticsUCActivity;
import com.cricketlivescore.predictiontips.Activities.Fantasy.FantasyTeamActivity;
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
import com.cricketlivescore.predictiontips.Fragments.MatchInfo.MatchInfoFragment;
import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class MatchUpComingActivity extends AppCompatActivity {
    static final String LOG = "LogMatchUpComingActivity";
    public static List<FeaturematchQuery.Featurematch> currentMatch = new ArrayList();
    String currentInnings;
    ImageView img_back;
    ImageView img_muca_a_flag;
    ImageView img_muca_h_flag;
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
                MatchUpComingActivity matchUpComingActivity = MatchUpComingActivity.this;
                matchUpComingActivity.onNext(matchUpComingActivity.whereLocal);
                return;
            }
            MatchUpComingActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    TabLayout tabLayout_upComing;
    TextView txt_muca_a_score;
    TextView txt_muca_a_team;
    TextView txt_muca_h_score;
    TextView txt_muca_h_team;
    TextView txt_muca_matchStatus;
    TextView txt_toolbar_title;
    ViewPager viewPager_upComing;
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
        setContentView(R.layout.activity_match_up_coming);
        BannerIDCardAds();
        this.matchId = getIntent().getStringExtra(Glob.MATCH_ID);
        Log.d("LOG", this.matchId + " : ");
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
        this.img_muca_h_flag = (ImageView) findViewById(R.id.img_muca_h_flag);
        this.img_muca_a_flag = (ImageView) findViewById(R.id.img_muca_a_flag);
        this.txt_muca_h_team = (TextView) findViewById(R.id.txt_muca_h_team);
        this.txt_muca_a_team = (TextView) findViewById(R.id.txt_muca_a_team);
        this.txt_muca_h_score = (TextView) findViewById(R.id.txt_muca_h_score);
        this.txt_muca_a_score = (TextView) findViewById(R.id.txt_muca_a_score);
        this.txt_muca_matchStatus = (TextView) findViewById(R.id.txt_muca_matchStatus);
        this.tabLayout_upComing = (TabLayout) findViewById(R.id.tabLayout_upComing);
        this.viewPager_upComing = (ViewPager) findViewById(R.id.viewPager_upComing);
        TabLayout tabLayout = this.tabLayout_upComing;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.commentary));
        TabLayout tabLayout2 = this.tabLayout_upComing;
        tabLayout2.addTab(tabLayout2.newTab().setText(R.string.match_info));
        this.tabLayout_upComing.setTabGravity(0);
        this.viewPager_upComing.setAdapter(new AdapterMatchInfo(getSupportFragmentManager(), this, this.tabLayout_upComing.getTabCount(), this.matchId));
        this.viewPager_upComing.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.tabLayout_upComing));
        this.tabLayout_upComing.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                MatchUpComingActivity.this.viewPager_upComing.setCurrentItem(tab.getPosition());
            }
        });
        this.ll_fantacy = (LinearLayout) findViewById(R.id.ll_fantacy);
        this.ll_prediction = (LinearLayout) findViewById(R.id.ll_prediction);
        new GraphqlApi(this).getMiniScoreCardQuery(this.matchId, new Interface.GetMiniScoreCardQuery() {

            @Override
            public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                MatchUpComingActivity.this.getMatchDetail(miniScoreCard);
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
                        MatchUpComingActivity.this.matchStatus = miniScoreCard.data().get(i).matchStatus();
                        MatchUpComingActivity.this.matchType = miniScoreCard.data().get(i).matchType();
                        String startDate = miniScoreCard.data().get(i).startDate();
                        MatchUpComingActivity.this.txt_toolbar_title.setText(String.format("%s %s %s %s %s", homeTeamName, "vs", awayTeamName, ",", miniScoreCard.data().get(i).matchNumber()));
                        if (miniScoreCard.data().get(0).isCricklyticsAvailable() != null && miniScoreCard.data().get(0).isCricklyticsAvailable().booleanValue()) {
                            MatchUpComingActivity.this.findViewById(R.id.ll_cricklytics).setVisibility(View.VISIBLE);;
                        }
                        for (int i2 = 0; i2 < miniScoreCard.data().get(i).matchScore().size(); i2++) {
                            String teamShortName = miniScoreCard.data().get(i).matchScore().get(i2).teamShortName();
                            MatchUpComingActivity.this.txt_muca_h_team.setText(homeTeamName);
                            MatchUpComingActivity.this.txt_muca_a_team.setText(awayTeamName);
                            if (homeTeamName.equals(teamShortName)) {
                                String teamID = miniScoreCard.data().get(i).matchScore().get(i2).teamID();
                                RequestManager with = Glide.with((FragmentActivity) MatchUpComingActivity.this);
                                ((RequestBuilder) with.load(Glob.flag_start + teamID + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchUpComingActivity.this.img_muca_h_flag);
                            } else {
                                String teamID2 = miniScoreCard.data().get(i).matchScore().get(i2).teamID();
                                RequestManager with2 = Glide.with((FragmentActivity) MatchUpComingActivity.this);
                                ((RequestBuilder) with2.load(Glob.flag_start + teamID2 + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchUpComingActivity.this.img_muca_a_flag);
                            }
                            MatchUpComingActivity.this.txt_muca_matchStatus.setText(Glob.getTimeDiff(Glob.getTimes(Long.parseLong(startDate))));
                            MatchUpComingActivity.this.txt_muca_h_score.setText(Glob.getDate(startDate));
                            MatchUpComingActivity.this.txt_muca_a_score.setText(Glob.getTime(Long.parseLong(startDate)));
                            MatchUpComingActivity.this.ll_fantacy.setOnClickListener(new View.OnClickListener() {

                                public void onClick(View view) {
                                    MatchUpComingActivity.this.onClickFantacy();
                                }
                            });
                            MatchUpComingActivity.this.ll_prediction.setOnClickListener(new View.OnClickListener() {

                                public void onClick(View view) {
                                    MatchUpComingActivity.this.onClickPrediction();
                                }
                            });
                        }
                    }
                }
            }
        });
    }

    
  
    private void onClickPrediction() {
        onShowInterstitialAd("criclyticsUpcoming");
    }

    
  
    private void onClickFantacy() {
        onShowInterstitialAd("FantasyTeamActivity");
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
        if (str.equals("criclyticsUpcoming")) {
            Intent intent = new Intent(this, CriclyticsUCActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra(Glob.INNINGS, this.currentInnings);
            intent.putExtra(Glob.TYPES, this.matchType);
            intent.putExtra(Glob.MATCH_STATUS, "criclyticsUpcoming");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else if (str.equals("FantasyTeamActivity")) {
            Intent intent2 = new Intent(this, FantasyTeamActivity.class);
            intent2.putExtra(Glob.MATCH_ID, this.matchId);
            intent2.putExtra(Glob.MATCH_STATUS, this.matchStatus);
            startActivity(intent2);
        }
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        finish();
    }

    public class AdapterMatchInfo extends FragmentPagerAdapter {
        private Context context;
        String matchId;
        int totalTabs;

        public AdapterMatchInfo(FragmentManager fragmentManager, Context context2, int i, String str) {
            super(fragmentManager);
            this.context = context2;
            this.totalTabs = i;
            this.matchId = str;
        }

        @Override
        public Fragment getItem(int i) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("MatchId", this.matchId);
                CommentaryFragment commentaryFragment = new CommentaryFragment();
                commentaryFragment.setArguments(bundle);
                return commentaryFragment;
            } else if (i != 1) {
                return null;
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("MatchId", this.matchId);
                MatchInfoFragment matchInfoFragment = new MatchInfoFragment();
                matchInfoFragment.setArguments(bundle2);
                return matchInfoFragment;
            }
        }

        @Override
        public int getCount() {
            return this.totalTabs;
        }
    }
}
