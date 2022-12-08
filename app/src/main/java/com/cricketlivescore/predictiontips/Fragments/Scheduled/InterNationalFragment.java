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

import com.cricketlivescore.predictiontips.Activities.Match.MatchUpComingActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;
import com.cricketlivescore.predictiontips.Adapter.Schedules.AdapterUpScheduleMatch;
import com.cricketlivescore.predictiontips.ScheduleQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class InterNationalFragment extends Fragment {
    private static final String LOG = "<<<InterNationalFragment>>>";
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
                InterNationalFragment interNationalFragment = InterNationalFragment.this;
                interNationalFragment.onNext(interNationalFragment.whereLocal);
                return;
            }
            InterNationalFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_intScheduleLive;
    RecyclerView rv_intScheduleResult;
    RecyclerView rv_intScheduleUp;
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
        this.view = layoutInflater.inflate(R.layout.fragment_inter_national, viewGroup, false);
        this.type = getArguments().getString("Type");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_intScheduleUp);
            this.rv_intScheduleUp = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.VERTICAL, false));
            this.progressBar = (ProgressBar) this.view.findViewById(R.id.progressBar);
            this.rv_intScheduleLive = (RecyclerView) this.view.findViewById(R.id.rv_intScheduleLive);
            this.rv_intScheduleResult = (RecyclerView) this.view.findViewById(R.id.rv_intScheduleResult);
            this.rv_intScheduleLive.setVisibility(View.GONE);
            this.rv_intScheduleResult.setVisibility(View.GONE);
            new GraphqlApi(this.myActivity).getScheduleQuery("international", this.type, new Interface.GetSchedule() {

                @Override
                public void getResponse(List<ScheduleQuery.Schedule> list) {
                    InterNationalFragment.this.getUpInternationalSchedule(list);
                }
            });
        }
    }

    
  
    private void getUpInternationalSchedule(final List<ScheduleQuery.Schedule> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {

                public void run() {
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        InterNationalFragment.this.rv_intScheduleUp.setVisibility(View.GONE);
                        InterNationalFragment.this.progressBar.setVisibility(View.GONE);
                        InterNationalFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
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
                    InterNationalFragment.this.rv_intScheduleUp.setAdapter(new AdapterUpScheduleMatch(InterNationalFragment.this.myActivity, arrayList, new AdapterUpScheduleMatch.OnItemClickListener() {

                        @Override
                        public void onItemClick(String str, String str2) {
                            InterNationalFragment.this.matchId = str;
                            InterNationalFragment.this.cInnings = str2;
                            InterNationalFragment.this.onShowInterstitialAd("Upcoming");
                        }

                        @Override
                        public void onClickBanner() {
                            Glob.openCustomTab(InterNationalFragment.this.myActivity);
                        }
                    }));
                    InterNationalFragment.this.progressBar.setVisibility(View.GONE);
                    InterNationalFragment.this.rv_intScheduleUp.setVisibility(View.VISIBLE);;
                }
            });
        }
    }

    @Override 
    public void onResume() {
        super.onResume();
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
        if (str.equals("Upcoming")) {
            Intent intent = new Intent(this.myActivity, MatchUpComingActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
