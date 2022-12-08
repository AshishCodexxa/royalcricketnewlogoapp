package com.cricketlivescore.predictiontips.Activities.Fantasy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Adapter.Fantasy.AdapterFantasyAllRounder;
import com.cricketlivescore.predictiontips.Adapter.Fantasy.AdapterFantasyBatter;
import com.cricketlivescore.predictiontips.Adapter.Fantasy.AdapterFantasyBowler;
import com.cricketlivescore.predictiontips.Adapter.Fantasy.AdapterFantasyKeeper;
import com.cricketlivescore.predictiontips.Adapter.Fantasy.AdapterFantasyMatchTeam;
import com.cricketlivescore.predictiontips.GetFantasySixTeamsQuery;
import com.cricketlivescore.predictiontips.MiniScoreCardQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.cricketlivescore.predictiontips.Activities.Player.PlayerDetailActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FantasyMatchActivity extends AppCompatActivity {
    public static String LOG = "<<<FantasyMatchActivity>>>";
    List<GetFantasySixTeamsQuery.All_rounder> AllRounderArrayList = new ArrayList();
    List<GetFantasySixTeamsQuery.Batsman> BatterArrayList = new ArrayList();
    List<GetFantasySixTeamsQuery.Bowler> BowlerArrayList = new ArrayList();
    List<GetFantasySixTeamsQuery.Keeper> KeeperArrayList = new ArrayList();
    AdapterFantasyMatchTeam adapterFantasyMatchTeam;
    String fantasyTeamName = "";
    LinearLayout ll_matchStatus;
    String matchId = "";
    String matchStatus = "";
    String playerId = "";
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                FantasyMatchActivity fantasyMatchActivity = FantasyMatchActivity.this;
                fantasyMatchActivity.onNext(fantasyMatchActivity.whereLocal);
                return;
            }
            FantasyMatchActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rvAllRounder;
    RecyclerView rvBatter;
    RecyclerView rvBowler;
    RecyclerView rvKeeper;
    RecyclerView rv_match_detail;
    TextView txt_matchStatus;
    TextView txt_points;
    TextView txt_seriesName;
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
        setContentView(R.layout.activity_fantasy_match);
        BannerIDCardAds();
        Intent intent = getIntent();
        if (intent != null) {
            this.matchId = intent.getStringExtra(Glob.MATCH_ID);
            this.fantasyTeamName = intent.getStringExtra("fantasyTeamName");
            this.matchStatus = intent.getStringExtra(Glob.MATCH_STATUS);
        }
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        String str = LOG;
        Glob.log(str, this.matchId + " : " + Glob.playerArrayList);
        initView();
    }

    private void initView() {
        if (this.matchStatus.equals("Upcomingmatch") || this.matchStatus.equals("upcoming")) {
            findViewById(R.id.rl_score).setVisibility(View.GONE);
            findViewById(R.id.rl_point).setVisibility(View.GONE);
        }
        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        findViewById(R.id.img_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHome(v);
            }
        });
        this.ll_matchStatus = (LinearLayout) findViewById(R.id.ll_matchStatus);
        TextView textView = (TextView) findViewById(R.id.txt_points);
        this.txt_points = textView;
        textView.setTypeface(Glob.oswald_medium);
        this.txt_matchStatus = (TextView) findViewById(R.id.txt_matchStatus);
        this.txt_seriesName = (TextView) findViewById(R.id.txt_seriesName);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_match_detail);
        this.rv_match_detail = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GraphqlApi graphqlApi = new GraphqlApi(this);
        graphqlApi.getMiniScoreCardQuery(this.matchId, new Interface.GetMiniScoreCardQuery() {

            @Override
            public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                FantasyMatchActivity.this.getMatchDetail(miniScoreCard);
            }
        });
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rvBatter);
        this.rvBatter = recyclerView2;
        recyclerView2.setLayoutManager(new GridLayoutManager((Context) this, 3, RecyclerView.VERTICAL, false));
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rvKeeper);
        this.rvKeeper = recyclerView3;
        recyclerView3.setLayoutManager(new GridLayoutManager((Context) this, 3, RecyclerView.VERTICAL, false));
        RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rvAllRounder);
        this.rvAllRounder = recyclerView4;
        recyclerView4.setLayoutManager(new GridLayoutManager((Context) this, 3, RecyclerView.VERTICAL, false));
        RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.rvBowler);
        this.rvBowler = recyclerView5;
        recyclerView5.setLayoutManager(new GridLayoutManager((Context) this, 3, RecyclerView.VERTICAL, false));
        graphqlApi.getFantasySixTeams(this.matchId, new Interface.GetFantasySixTeam() {

            @Override
            public void getResponse(List<GetFantasySixTeamsQuery.GetFantasySixTeam> list) {
                FantasyMatchActivity.this.getFantasyTeam(list);
            }
        });
    }


    public void getFantasyTeam(final List<GetFantasySixTeamsQuery.GetFantasySixTeam> list) {
        runOnUiThread(new Runnable() {

            public void run() {
                List list2 = list;
                if (!(list2 == null || list2.isEmpty())) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).fantasy_teamName().equals(FantasyMatchActivity.this.fantasyTeamName)) {
                            FantasyMatchActivity.this.txt_points.setText(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).teamtotalpoints());
                            List<GetFantasySixTeamsQuery.Batsman> list6 = FantasyMatchActivity.this.BatterArrayList;
                            List<GetFantasySixTeamsQuery.Batsman> batsman = ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman();
                            Objects.requireNonNull(batsman);
                            list6.addAll(batsman);
                            List<GetFantasySixTeamsQuery.Bowler> list3 = FantasyMatchActivity.this.BowlerArrayList;
                            List<GetFantasySixTeamsQuery.Bowler> bowler = ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler();
                            Objects.requireNonNull(bowler);
                            list3.addAll(bowler);
                            List<GetFantasySixTeamsQuery.Keeper> list4 = FantasyMatchActivity.this.KeeperArrayList;
                            List<GetFantasySixTeamsQuery.Keeper> keeper = ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper();
                            Objects.requireNonNull(keeper);
                            list4.addAll(keeper);
                            List<GetFantasySixTeamsQuery.All_rounder> list5 = FantasyMatchActivity.this.AllRounderArrayList;
                            List<GetFantasySixTeamsQuery.All_rounder> all_rounder = ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder();
                            Objects.requireNonNull(all_rounder);
                            list5.addAll(all_rounder);
                            FantasyMatchActivity fantasyMatchActivity = FantasyMatchActivity.this;
                            FantasyMatchActivity.this.rvBatter.setAdapter(new AdapterFantasyBatter(fantasyMatchActivity, fantasyMatchActivity.BatterArrayList, FantasyMatchActivity.this.matchStatus, new AdapterFantasyBatter.OnItemClickListener() {

                                @Override
                                public void onItemClick(String str) {
                                    FantasyMatchActivity.this.playerId = str;
                                    FantasyMatchActivity.this.onShowInterstitialAd("player");
                                }
                            }));
                            FantasyMatchActivity fantasyMatchActivity2 = FantasyMatchActivity.this;
                            FantasyMatchActivity.this.rvKeeper.setAdapter(new AdapterFantasyKeeper(fantasyMatchActivity2, fantasyMatchActivity2.KeeperArrayList, FantasyMatchActivity.this.matchStatus, new AdapterFantasyKeeper.OnItemClickListener() {

                                @Override
                                public void onItemClick(String str) {
                                    FantasyMatchActivity.this.playerId = str;
                                    FantasyMatchActivity.this.onShowInterstitialAd("player");
                                }
                            }));
                            FantasyMatchActivity fantasyMatchActivity3 = FantasyMatchActivity.this;
                            FantasyMatchActivity.this.rvAllRounder.setAdapter(new AdapterFantasyAllRounder(fantasyMatchActivity3, fantasyMatchActivity3.AllRounderArrayList, FantasyMatchActivity.this.matchStatus, new AdapterFantasyAllRounder.OnItemClickListener() {

                                @Override
                                public void onItemClick(String str) {
                                    FantasyMatchActivity.this.playerId = str;
                                    FantasyMatchActivity.this.onShowInterstitialAd("player");
                                }
                            }));
                            FantasyMatchActivity fantasyMatchActivity4 = FantasyMatchActivity.this;
                            FantasyMatchActivity.this.rvBowler.setAdapter(new AdapterFantasyBowler(fantasyMatchActivity4, fantasyMatchActivity4.BowlerArrayList, FantasyMatchActivity.this.matchStatus, new AdapterFantasyBowler.OnItemClickListener() {

                                @Override
                                public void onItemClick(String str) {
                                    FantasyMatchActivity.this.playerId = str;
                                    FantasyMatchActivity.this.onShowInterstitialAd("player");
                                }
                            }));
                        }
                    }
                }
            }
        });
    }


    private void getMatchDetail(final MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
        runOnUiThread(new Runnable() {

            public void run() {
                MiniScoreCardQuery.MiniScoreCard miniScoreCard9 = miniScoreCard;
                if (!(miniScoreCard9 == null || miniScoreCard9.data() == null || miniScoreCard.data().isEmpty())) {
                    FantasyMatchActivity.this.adapterFantasyMatchTeam = new AdapterFantasyMatchTeam(FantasyMatchActivity.this, miniScoreCard.data().get(0).matchScore());
                    FantasyMatchActivity.this.rv_match_detail.setAdapter(FantasyMatchActivity.this.adapterFantasyMatchTeam);
                    TextView textView = FantasyMatchActivity.this.txt_seriesName;
                    textView.setText(miniScoreCard.data().get(0).matchNumber() + ", " + miniScoreCard.data().get(0).seriesName());
                    String matchStatus = miniScoreCard.data().get(0).matchStatus();
                    String matchResult = miniScoreCard.data().get(0).matchResult();
                    String startDate = miniScoreCard.data().get(0).startDate();
                    String statusMessage = miniScoreCard.data().get(0).statusMessage();
                    for (int i = 0; i < miniScoreCard.data().get(0).matchScore().size(); i++) {
                        if (matchStatus.equals("live")) {
                            FantasyMatchActivity.this.txt_matchStatus.setText(statusMessage);
                            FantasyMatchActivity.this.ll_matchStatus.setVisibility(View.VISIBLE);
                            ;
                        } else if (matchStatus.equals("completed")) {
                            FantasyMatchActivity.this.txt_matchStatus.setText(matchResult);
                        } else if (matchStatus.equals("upcoming")) {
                            FantasyMatchActivity.this.txt_matchStatus.setText(String.format("%s", Glob.getDateTime(Long.parseLong(startDate))));
                        } else {
                            FantasyMatchActivity.this.txt_matchStatus.setText(matchStatus);
                        }
                    }
                }
            }
        });
    }


    public void onBack(View view) {
        onBackPressed();
    }


    public void onHome(View view) {
        onShowInterstitialAd("home");
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
        if (str.equals("player")) {
            Intent intent = new Intent(this, PlayerDetailActivity.class);
            intent.putExtra(Glob.PLAYER_ID, this.playerId);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else if (str.equals("home")) {
            Glob.goToHome(this);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Glob.showInappReview(this);
    }
}
