package com.cricketlivescore.predictiontips.Fragments.Scheduled;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Activities.Match.MatchActivity;
import com.cricketlivescore.predictiontips.Activities.Match.MatchCompleteActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;
import com.cricketlivescore.predictiontips.Adapter.Schedules.AdapterLiveScheduleMatch;
import com.cricketlivescore.predictiontips.ScheduleQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class DomesticScoreFragment extends Fragment {
    private static final String LOG = "<<<DomesticScoreFragment>>>";
    String cInnings = "";
    String matchId = "";
    Activity myActivity;
    ProgressBar progressBar;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                DomesticScoreFragment domesticScoreFragment = DomesticScoreFragment.this;
                domesticScoreFragment.onNext(domesticScoreFragment.whereLocal);
                return;
            }
            DomesticScoreFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_domScheduleLive;
    RecyclerView rv_domScheduleResult;
    RecyclerView rv_domScheduleUp;
    String type;
    View view;
    String whereLocal = "";

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_domestic, viewGroup, false);
        this.type = getArguments().getString("Type");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            this.progressBar = (ProgressBar) this.view.findViewById(R.id.progressBar);
            this.rv_domScheduleUp = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleUp);
            this.rv_domScheduleLive = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleLive);
            this.rv_domScheduleResult = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleResult);
            if (this.type.equals("live")) {
                this.rv_domScheduleUp.setVisibility(View.GONE);
                this.rv_domScheduleResult.setVisibility(View.GONE);
                this.rv_domScheduleLive.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.VERTICAL, false));
                graphqlApi.getScheduleQuery("domestic", this.type, new Interface.GetSchedule() {

                    @Override
                    public void getResponse(List<ScheduleQuery.Schedule> list) {
                        DomesticScoreFragment.this.getLiveDomesticSchedule(list);
                    }
                });
            }
            if (this.type.equals("completed")) {
                this.rv_domScheduleLive.setVisibility(View.GONE);
                this.rv_domScheduleUp.setVisibility(View.GONE);
                this.rv_domScheduleResult.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.VERTICAL, false));
                graphqlApi.getScheduleQuery("domestic", this.type, new Interface.GetSchedule() {

                    @Override
                    public void getResponse(List<ScheduleQuery.Schedule> list) {
                        DomesticScoreFragment.this.getResultDomesticSchedule(list);
                    }
                });
            }
        }
    }

    
  
    private void getLiveDomesticSchedule(final List<ScheduleQuery.Schedule> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        DomesticScoreFragment.this.rv_domScheduleLive.setVisibility(View.GONE);
                        DomesticScoreFragment.this.progressBar.setVisibility(View.GONE);
                        DomesticScoreFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (Glob.adCountInCategory == 0) {
                        arrayList.addAll(list);
                    } else {
                        int i = 0;
                        while (i < list.size()) {
                            int i2 = i + 1;
                            if (i2 % Glob.adCountInCategory == 0) {
                                arrayList.add((ScheduleQuery.Schedule) list.get(i));
                                arrayList.add(null);
                            } else {
                                arrayList.add((ScheduleQuery.Schedule) list.get(i));
                            }
                            i = i2;
                        }
                    }
                    AdapterLiveScheduleMatch adapterLiveScheduleMatch = new AdapterLiveScheduleMatch(DomesticScoreFragment.this.myActivity, arrayList, new AdapterLiveScheduleMatch.OnItemClickListener() {


                        @Override
                        public void onItemClick(String str, String str2) {
                            DomesticScoreFragment.this.matchId = str;
                            DomesticScoreFragment.this.cInnings = str2;
                            DomesticScoreFragment.this.onShowInterstitialAd("live");
                        }

                        @Override
                        public void onClickBanner() {
                            Glob.openCustomTab(DomesticScoreFragment.this.myActivity);
                        }
                    });
                    DomesticScoreFragment.this.progressBar.setVisibility(View.GONE);
                    DomesticScoreFragment.this.rv_domScheduleLive.setVisibility(View.VISIBLE);;
                    DomesticScoreFragment.this.rv_domScheduleLive.setAdapter(adapterLiveScheduleMatch);
                }
            });
        }
    }

    
  
    private void getResultDomesticSchedule(final List<ScheduleQuery.Schedule> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        DomesticScoreFragment.this.rv_domScheduleResult.setVisibility(View.GONE);
                        DomesticScoreFragment.this.progressBar.setVisibility(View.GONE);
                        DomesticScoreFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (Glob.adCountInCategory == 0) {
                        arrayList.addAll(list);
                    } else {
                        int i = 0;
                        while (i < list.size()) {
                            int i2 = i + 1;
                            if (i2 % Glob.adCountInCategory == 0) {
                                arrayList.add((ScheduleQuery.Schedule) list.get(i));
                                arrayList.add(null);
                            } else {
                                arrayList.add((ScheduleQuery.Schedule) list.get(i));
                            }
                            i = i2;
                        }
                    }
                    AdapterLiveScheduleMatch adapterLiveScheduleMatch = new AdapterLiveScheduleMatch(DomesticScoreFragment.this.myActivity, arrayList, new AdapterLiveScheduleMatch.OnItemClickListener() {

                        @Override
                        public void onItemClick(String str, String str2) {
                            DomesticScoreFragment.this.matchId = str;
                            DomesticScoreFragment.this.cInnings = str2;
                            DomesticScoreFragment.this.onShowInterstitialAd("Result");
                        }

                        @Override
                        public void onClickBanner() {
                            Glob.openCustomTab(DomesticScoreFragment.this.myActivity);
                        }
                    });
                    DomesticScoreFragment.this.progressBar.setVisibility(View.GONE);
                    DomesticScoreFragment.this.rv_domScheduleResult.setVisibility(View.VISIBLE);;
                    DomesticScoreFragment.this.rv_domScheduleResult.setAdapter(adapterLiveScheduleMatch);
                }
            });
        }
    }

    @Override 
    public void onResume() {
        super.onResume();
        initView();
    }

    
  
    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(this.myActivity)) {
            Glob.noInternetDialogShowFragment(this.myActivity);
            return;
        }
        this.whereLocal = str;
        Intent intent = new Intent(this.myActivity, TestAdActivity.class);
        intent.putExtra("where", str);
        this.resultLauncher.launch(intent);
    }

    
  
    private void onNext(String str) {
        str.hashCode();
        if (str.equals("Result")) {
            Intent intent = new Intent(this.myActivity, MatchCompleteActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra(Glob.INNINGS, this.cInnings);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else if (str.equals("live")) {
            Intent intent2 = new Intent(this.myActivity, MatchActivity.class);
            intent2.putExtra(Glob.MATCH_ID, this.matchId);
            intent2.putExtra(Glob.INNINGS, this.cInnings);
            intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent2);
        }
    }
}
