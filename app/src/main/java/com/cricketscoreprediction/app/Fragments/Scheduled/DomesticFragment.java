package com.cricketscoreprediction.app.Fragments.Scheduled;

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
import com.cricketscoreprediction.app.Activities.Match.MatchUpComingActivity;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.Schedules.AdapterUpScheduleMatch;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.ScheduleQuery;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;
import java.util.List;

public class DomesticFragment extends Fragment {
    private static final String LOG = "<<<DomesticFragment>>>";
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
                DomesticFragment domesticFragment = DomesticFragment.this;
                domesticFragment.onNext(domesticFragment.whereLocal);
                return;
            }
            DomesticFragment.this.onNext(activityResult.getData().getStringExtra("where"));
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
            this.progressBar = (ProgressBar) this.view.findViewById(R.id.progressBar);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleUp);
            this.rv_domScheduleUp = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.VERTICAL, false));
            this.rv_domScheduleLive = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleLive);
            this.rv_domScheduleResult = (RecyclerView) this.view.findViewById(R.id.rv_domScheduleResult);
            this.rv_domScheduleLive.setVisibility(View.GONE);
            this.rv_domScheduleResult.setVisibility(View.GONE);
            new GraphqlApi(this.myActivity).getScheduleQuery("domestic", this.type, new Interface.GetSchedule() {

                @Override
                public void getResponse(List<ScheduleQuery.Schedule> list) {
                    DomesticFragment.this.getUpDomesticSchedule(list);
                }
            });
        }
    }

    
  
    private void getUpDomesticSchedule(final List<ScheduleQuery.Schedule> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        DomesticFragment.this.rv_domScheduleUp.setVisibility(View.GONE);
                        DomesticFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        DomesticFragment.this.progressBar.setVisibility(View.GONE);
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
                    AdapterUpScheduleMatch adapterUpScheduleMatch = new AdapterUpScheduleMatch(DomesticFragment.this.myActivity, arrayList, new AdapterUpScheduleMatch.OnItemClickListener() {

                        @Override
                        public void onItemClick(String str, String str2) {
                            DomesticFragment.this.matchId = str;
                            DomesticFragment.this.cInnings = str2;
                            DomesticFragment.this.onShowInterstitialAd("Upcoming");
                        }

                        @Override
                        public void onClickBanner() {
                            Glob.openCustomTab(DomesticFragment.this.myActivity);
                        }
                    });
                    DomesticFragment.this.progressBar.setVisibility(View.GONE);
                    DomesticFragment.this.rv_domScheduleUp.setVisibility(View.VISIBLE);;
                    DomesticFragment.this.rv_domScheduleUp.setAdapter(adapterUpScheduleMatch);
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
        if (str.equals("Upcoming")) {
            Intent intent = new Intent(this.myActivity, MatchUpComingActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
