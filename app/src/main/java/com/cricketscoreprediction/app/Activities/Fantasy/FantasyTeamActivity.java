package com.cricketscoreprediction.app.Activities.Fantasy;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.Fantasy.AdapterFantasyTeams;

import com.cricketscoreprediction.app.GetFantasySixTeamsQuery;
import com.cricketscoreprediction.app.Models.ModelPlayer;
import com.cricketscoreprediction.app.Models.ModelTeam;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;
import java.util.List;

public class FantasyTeamActivity extends AppCompatActivity {
    public static String LOG = "<<<FantasyTeamActivity>>>";
    AdapterFantasyTeams adapterFantasyTeams;
    String fantasyTeamName;
    String matchId;
    String matchStatus;
    ProgressBar progressBar;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                FantasyTeamActivity fantasyTeamActivity = FantasyTeamActivity.this;
                fantasyTeamActivity.onNext(fantasyTeamActivity.whereLocal);
                return;
            }
            FantasyTeamActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_teams;
    ScrollView scrollView;
    String whereLocal;
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
        setContentView(R.layout.activity_fantasy_team);
        BannerIDCardAds();
        Intent intent = getIntent();
        if (intent != null) {
            this.matchId = intent.getStringExtra(Glob.MATCH_ID);
            this.matchStatus = intent.getStringExtra(Glob.MATCH_STATUS);
        }
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        Glob.log(LOG, this.matchId);
        initView();
    }

    private void initView() {
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
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.scrollView = (ScrollView) findViewById(R.id.scrollView);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_teams);
        this.rv_teams = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        new GraphqlApi(this).getFantasySixTeams(this.matchId, new Interface.GetFantasySixTeam() {


            @Override
            public void getResponse(List<GetFantasySixTeamsQuery.GetFantasySixTeam> list) {
                FantasyTeamActivity.this.getFantasyTeam(list);
            }
        });
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    
    public void onHome(View view) {
        onShowInterstitialAd("home");
    }

    public void getFantasyTeam(final List<GetFantasySixTeamsQuery.GetFantasySixTeam> list) {
        String str = LOG;
        Glob.log(str, list + "");
        runOnUiThread(new Runnable() {

            public void run() {
                List list9 = list;
                if (list9 == null || list9.isEmpty()) {
                    FantasyTeamActivity.this.scrollView.setVisibility(View.GONE);
                    FantasyTeamActivity.this.progressBar.setVisibility(View.GONE);
                    FantasyTeamActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                    return;
                }
                FantasyTeamActivity.this.scrollView.setVisibility(View.VISIBLE);;
                FantasyTeamActivity.this.progressBar.setVisibility(View.GONE);
                ArrayList arrayList = new ArrayList();
                if (Glob.adCountInCategory == 0) {
                    for (int i = 0; i < list.size(); i++) {
                        ArrayList<ModelPlayer> arrayList2 = new ArrayList<>();
                        for (int i2 = 0; i2 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().size(); i2++) {
                            ModelPlayer modelPlayer = new ModelPlayer();
                            modelPlayer.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).batsman().get(i2).projectedPoints());
                            arrayList2.add(modelPlayer);
                        }
                        for (int i3 = 0; i3 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().size(); i3++) {
                            ModelPlayer modelPlayer2 = new ModelPlayer();
                            modelPlayer2.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).keeper().get(i3).projectedPoints());
                            arrayList2.add(modelPlayer2);
                        }
                        for (int i4 = 0; i4 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().size(); i4++) {
                            ModelPlayer modelPlayer3 = new ModelPlayer();
                            modelPlayer3.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).all_rounder().get(i4).projectedPoints());
                            arrayList2.add(modelPlayer3);
                        }
                        for (int i5 = 0; i5 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().size(); i5++) {
                            ModelPlayer modelPlayer4 = new ModelPlayer();
                            modelPlayer4.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).bowler().get(i5).projectedPoints());
                            arrayList2.add(modelPlayer4);
                        }
                        ModelTeam modelTeam = new ModelTeam();
                        if (((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).teamtotalpoints() == null) {
                            modelTeam.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).totalProjectedPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).totalProjectedPoints(), arrayList2);
                        } else {
                            modelTeam.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).teamtotalpoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i)).totalProjectedPoints(), arrayList2);
                        }
                        arrayList.add(modelTeam);
                    }
                } else {
                    int i6 = 0;
                    while (i6 < list.size()) {
                        int i7 = i6 + 1;
                        if (i7 % Glob.adCountInCategory == 0) {
                            ArrayList<ModelPlayer> arrayList3 = new ArrayList<>();
                            for (int i8 = 0; i8 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().size(); i8++) {
                                ModelPlayer modelPlayer5 = new ModelPlayer();
                                modelPlayer5.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i8).projectedPoints());
                                arrayList3.add(modelPlayer5);
                            }
                            for (int i9 = 0; i9 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().size(); i9++) {
                                ModelPlayer modelPlayer6 = new ModelPlayer();
                                modelPlayer6.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i9).projectedPoints());
                                arrayList3.add(modelPlayer6);
                            }
                            for (int i10 = 0; i10 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().size(); i10++) {
                                ModelPlayer modelPlayer7 = new ModelPlayer();
                                modelPlayer7.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i10).projectedPoints());
                                arrayList3.add(modelPlayer7);
                            }
                            for (int i11 = 0; i11 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().size(); i11++) {
                                ModelPlayer modelPlayer8 = new ModelPlayer();
                                modelPlayer8.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i11).projectedPoints());
                                arrayList3.add(modelPlayer8);
                            }
                            ModelTeam modelTeam2 = new ModelTeam();
                            if (((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).teamtotalpoints() == null) {
                                modelTeam2.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), arrayList3);
                            } else {
                                modelTeam2.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).teamtotalpoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), arrayList3);
                            }
                            arrayList.add(modelTeam2);
                            arrayList.add(null);
                        } else {
                            ArrayList<ModelPlayer> arrayList4 = new ArrayList<>();
                            for (int i12 = 0; i12 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().size(); i12++) {
                                ModelPlayer modelPlayer9 = new ModelPlayer();
                                modelPlayer9.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).batsman().get(i12).projectedPoints());
                                arrayList4.add(modelPlayer9);
                            }
                            for (int i13 = 0; i13 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().size(); i13++) {
                                ModelPlayer modelPlayer10 = new ModelPlayer();
                                modelPlayer10.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).keeper().get(i13).projectedPoints());
                                arrayList4.add(modelPlayer10);
                            }
                            for (int i14 = 0; i14 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().size(); i14++) {
                                ModelPlayer modelPlayer11 = new ModelPlayer();
                                modelPlayer11.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).all_rounder().get(i14).projectedPoints());
                                arrayList4.add(modelPlayer11);
                            }
                            for (int i15 = 0; i15 < ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().size(); i15++) {
                                ModelPlayer modelPlayer12 = new ModelPlayer();
                                modelPlayer12.ModelPlayer(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).playerName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).playerNameHindi(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).credits(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).playerId(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).vice_captain(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).teamID(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).totalPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).player_role(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).bowler().get(i15).projectedPoints());
                                arrayList4.add(modelPlayer12);
                            }
                            ModelTeam modelTeam3 = new ModelTeam();
                            if (((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).teamtotalpoints() == null) {
                                modelTeam3.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), arrayList4);
                            } else {
                                modelTeam3.ModelTeam(((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).teamtotalpoints(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).fantasy_teamName(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).timestamp(), ((GetFantasySixTeamsQuery.GetFantasySixTeam) list.get(i6)).totalProjectedPoints(), arrayList4);
                            }
                            arrayList.add(modelTeam3);
                        }
                        i6 = i7;
                    }
                }
                FantasyTeamActivity.this.adapterFantasyTeams = new AdapterFantasyTeams(FantasyTeamActivity.this, arrayList, new AdapterFantasyTeams.OnItemClickListener() {

                    @Override
                    public void onItemClick(String str) {
                        FantasyTeamActivity.this.fantasyTeamName = str;
                        FantasyTeamActivity.this.onShowInterstitialAd("FantasyMatch");
                    }

                    @Override
                    public void onClickBanner() {
                        Glob.openCustomTab(FantasyTeamActivity.this);
                    }
                });
                FantasyTeamActivity.this.rv_teams.setAdapter(FantasyTeamActivity.this.adapterFantasyTeams);
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
        if (str.equals("FantasyMatch")) {
            Intent intent = new Intent(this, FantasyMatchActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra("fantasyTeamName", this.fantasyTeamName);
            intent.putExtra(Glob.MATCH_STATUS, this.matchStatus);
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
