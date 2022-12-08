package com.cricketlivescore.predictiontips.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Adapter.Criclytics.AdapterReportCard;
import com.cricketlivescore.predictiontips.MatchRatingsQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class ReportCardFragment extends Fragment {
    private static final String LOG = "<<<ReportCardFragment>>>";
    AdapterReportCard adapterReportCard;
    String currentInnings;
    ImageView img_info;
    String matchId;
    String matchType;
    Activity myActivity;
    RelativeLayout rl_info;
    RecyclerView rv_report_card;
    View view;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString(Glob.MATCH_ID);
        this.currentInnings = getArguments().getString(Glob.INNINGS);
        this.matchType = getArguments().getString(Glob.TYPES);
        this.view = layoutInflater.inflate(R.layout.fragment_report_card, viewGroup, false);
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    ReportCardFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {

                        public void run() {
                            ReportCardFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_report_card);
            this.rv_report_card = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            this.adapterReportCard = new AdapterReportCard();
            new GraphqlApi(this.myActivity).getMatchRatings(this.matchId, new Interface.GetFinalArray() {

                @Override
                public void getResponse(List<MatchRatingsQuery.FinalArray> list) {
                    ReportCardFragment.this.getReportCard(list);
                }
            });
        }
    }

    
  
    private void getReportCard(final List<MatchRatingsQuery.FinalArray> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        ReportCardFragment.this.view.findViewById(R.id.ll_report_card).setVisibility(View.GONE);
                        ReportCardFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        ReportCardFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
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
                                arrayList.add((MatchRatingsQuery.FinalArray) list.get(i));
                                arrayList.add(null);
                            } else {
                                arrayList.add((MatchRatingsQuery.FinalArray) list.get(i));
                            }
                            i = i2;
                        }
                    }
                    ReportCardFragment.this.adapterReportCard.AdapterReportCard(ReportCardFragment.this.myActivity, arrayList, new AdapterReportCard.OnItemClickListener() {


                        @Override
                        public void onClickBanner() {
                        }

                        @Override
                        public void onItemClick(String str) {
                            Glob.goToPlayerDetail(ReportCardFragment.this.myActivity, str);
                        }
                    });
                    ReportCardFragment.this.rv_report_card.setAdapter(ReportCardFragment.this.adapterReportCard);
                    ReportCardFragment.this.view.findViewById(R.id.ll_report_card).setVisibility(View.VISIBLE);;
                    ReportCardFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                }
            });
        }
    }

    @Override 
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
    }
}
