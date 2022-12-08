package com.cricketlivescore.predictiontips.Fragments.Ipl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Activities.Match.MatchActivity;
import com.cricketlivescore.predictiontips.Activities.Match.MatchCompleteActivity;
import com.cricketlivescore.predictiontips.Activities.Match.MatchUpComingActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;
import com.cricketlivescore.predictiontips.Adapter.Ipl.AdapterIplMatch;
import com.cricketlivescore.predictiontips.MatcheslistQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class IplMatchFragment extends Fragment {
    private static final String LOG = "<<<IplMatchFragment>>>";
    AdapterIplMatch adapterIplMatch;
    String cInnings = "";
    String currentMatchId = "";
    Activity myActivity;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {


        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                IplMatchFragment iplMatchFragment = IplMatchFragment.this;
                iplMatchFragment.onNext(iplMatchFragment.whereLocal);
                return;
            }
            IplMatchFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_ipl_match;
    String seriesId = "";
    View view;
    String whereLocal = "";

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.seriesId = getArguments().getString("seriesId");
        this.view = layoutInflater.inflate(R.layout.fragment_ipl_match, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_ipl_match);
            this.rv_ipl_match = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.VERTICAL, false));
            new GraphqlApi(this.myActivity).getMatchList(this.seriesId, new Interface.GetMatcheslist() {


                @Override
                public void getResponse(List<MatcheslistQuery.Matcheslist> list) {
                    IplMatchFragment.this.onGetMatchList(list);
                }
            });
        }
    }

    
  
    private void onGetMatchList(final List<MatcheslistQuery.Matcheslist> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList.addAll(list);
                        } else {
                            int i = 0;
                            while (i < list.size()) {
                                int i2 = i + 1;
                                if (i2 % Glob.adCountInCategory == 0) {
                                    arrayList.add((MatcheslistQuery.Matcheslist) list.get(i));
                                    arrayList.add(null);
                                } else {
                                    arrayList.add((MatcheslistQuery.Matcheslist) list.get(i));
                                }
                                i = i2;
                            }
                        }
                        IplMatchFragment.this.adapterIplMatch = new AdapterIplMatch(IplMatchFragment.this.myActivity, arrayList, new AdapterIplMatch.OnItemClickListener() {


                            @Override
                            public void onItemClick(String str, String str2, String str3) {
                                IplMatchFragment.this.currentMatchId = str;
                                IplMatchFragment.this.cInnings = str2;
                                IplMatchFragment.this.onShowInterstitialAd(str3);
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(IplMatchFragment.this.myActivity);
                            }
                        });
                        IplMatchFragment.this.rv_ipl_match.setAdapter(IplMatchFragment.this.adapterIplMatch);
                    }
                }
            });
        }
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
        char c = 65535;
        switch (str.hashCode()) {
            case -1402931637:
                if (str.equals("completed")) {
                    c = 0;
                    break;
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    c = 1;
                    break;
                }
                break;
            case 1306691868:
                if (str.equals("upcoming")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this.myActivity, MatchCompleteActivity.class);
                intent.putExtra(Glob.MATCH_ID, this.currentMatchId);
                intent.putExtra(Glob.INNINGS, this.cInnings);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this.myActivity, MatchActivity.class);
                intent2.putExtra(Glob.MATCH_ID, this.currentMatchId);
                intent2.putExtra(Glob.INNINGS, this.cInnings);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this.myActivity, MatchUpComingActivity.class);
                intent3.putExtra(Glob.MATCH_ID, this.currentMatchId);
                intent3.putExtra(Glob.INNINGS, this.cInnings);
                intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                return;
            default:
                return;
        }
    }
}
