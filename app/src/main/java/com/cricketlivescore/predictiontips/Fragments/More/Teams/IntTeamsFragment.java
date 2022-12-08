package com.cricketlivescore.predictiontips.Fragments.More.Teams;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Adapter.More.AdapterTeams;
import com.cricketlivescore.predictiontips.Models.More.ModelTeams;
import com.cricketlivescore.predictiontips.TeamDiscoveryV2Query;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class IntTeamsFragment extends Fragment {
    private static final String LOG = "<<<IntTeamsFragment>>>";
    private static Activity myActivity;
    AdapterTeams adapterTeamsMens;
    AdapterTeams adapterTeamsWomens;
    GraphqlApi graphqlApi;
    ArrayList<ModelTeams> menArrayList;
    RecyclerView rv_mens;
    RecyclerView rv_womens;
    View view;
    ArrayList<ModelTeams> womenArrayList;

    public static IntTeamsFragment newInstance(Activity activity) {
        IntTeamsFragment intTeamsFragment = new IntTeamsFragment();
        myActivity = activity;
        return intTeamsFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_int_teams, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {
            this.graphqlApi = new GraphqlApi(myActivity);
            this.menArrayList = new ArrayList<>();
            this.womenArrayList = new ArrayList<>();
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_mens);
            this.rv_mens = recyclerView;
            recyclerView.setLayoutManager(new GridLayoutManager((Context) myActivity, 2, RecyclerView.VERTICAL, false));
            AdapterTeams adapterTeams = new AdapterTeams(myActivity, this.menArrayList, "mens", new AdapterTeams.OnItemClickListener() {

                @Override
                public void onItemClick() {
                }
            });
            this.adapterTeamsMens = adapterTeams;
            this.rv_mens.setAdapter(adapterTeams);
            RecyclerView recyclerView2 = (RecyclerView) this.view.findViewById(R.id.rv_womens);
            this.rv_womens = recyclerView2;
            recyclerView2.setLayoutManager(new GridLayoutManager((Context) myActivity, 2, RecyclerView.VERTICAL, false));
            AdapterTeams adapterTeams2 = new AdapterTeams(myActivity, this.womenArrayList, "womens", new AdapterTeams.OnItemClickListener() {


                @Override
                public void onItemClick() {
                }
            });
            this.adapterTeamsWomens = adapterTeams2;
            this.rv_womens.setAdapter(adapterTeams2);
            TeamDiscovery();

        }
    }


    public void TeamDiscovery() {
        this.graphqlApi.getTeamDiscovery(new Interface.GetTeamDiscovery() {

            @Override
            public void getResponse(final TeamDiscoveryV2Query.TeamDiscoveryV2 teamDiscoveryV2) {
                Glob.log("TeamDiscovery", teamDiscoveryV2.international() + "");
                IntTeamsFragment.myActivity.runOnUiThread(new Runnable() {


                    public void run() {
                        for (int i = 0; i < teamDiscoveryV2.international().mens().size(); i++) {
                            String teamID = teamDiscoveryV2.international().mens().get(i).teamID();
                            String teamName = teamDiscoveryV2.international().mens().get(i).teamName();
                            String odiRanking = teamDiscoveryV2.international().mens().get(i).odiRanking();
                            String testRanking = teamDiscoveryV2.international().mens().get(i).testRanking();
                            String t20Ranking = teamDiscoveryV2.international().mens().get(i).t20Ranking();
                            List<String> trophy_details = teamDiscoveryV2.international().mens().get(i).trophy_details();
                            String teamShortName = teamDiscoveryV2.international().mens().get(i).teamShortName();
                            ModelTeams modelTeams = new ModelTeams();
                            modelTeams.ModelTeams(teamID, teamName, odiRanking, testRanking, t20Ranking, trophy_details, teamShortName);
                            IntTeamsFragment.this.menArrayList.add(modelTeams);
                            IntTeamsFragment.this.adapterTeamsMens.notifyItemInserted(i);
                            if (IntTeamsFragment.this.view.findViewById(R.id.ll_mens).getVisibility() == View.GONE) {
                                IntTeamsFragment.this.view.findViewById(R.id.ll_mens).setVisibility(View.VISIBLE);;
                            }
                        }
                        if (IntTeamsFragment.this.menArrayList == null || IntTeamsFragment.this.menArrayList.isEmpty()) {
                            IntTeamsFragment.this.view.findViewById(R.id.ll_mens).setVisibility(View.GONE);
                        }
                        for (int i2 = 0; i2 < teamDiscoveryV2.international().womens().size(); i2++) {
                            String teamID2 = teamDiscoveryV2.international().womens().get(i2).teamID();
                            String teamName2 = teamDiscoveryV2.international().womens().get(i2).teamName();
                            String odiRanking2 = teamDiscoveryV2.international().womens().get(i2).odiRanking();
                            String testRanking2 = teamDiscoveryV2.international().womens().get(i2).testRanking();
                            String t20Ranking2 = teamDiscoveryV2.international().womens().get(i2).t20Ranking();
                            List<String> trophy_details2 = teamDiscoveryV2.international().womens().get(i2).trophy_details();
                            String teamShortName2 = teamDiscoveryV2.international().womens().get(i2).teamShortName();
                            ModelTeams modelTeams2 = new ModelTeams();
                            modelTeams2.ModelTeams(teamID2, teamName2, odiRanking2, testRanking2, t20Ranking2, trophy_details2, teamShortName2);
                            IntTeamsFragment.this.womenArrayList.add(modelTeams2);
                            IntTeamsFragment.this.adapterTeamsWomens.notifyItemInserted(i2);
                            if (IntTeamsFragment.this.view.findViewById(R.id.ll_womens).getVisibility() == View.GONE) {
                                IntTeamsFragment.this.view.findViewById(R.id.ll_womens).setVisibility(View.VISIBLE);;
                            }
                        }
                        if (IntTeamsFragment.this.womenArrayList == null || IntTeamsFragment.this.womenArrayList.isEmpty()) {
                            IntTeamsFragment.this.view.findViewById(R.id.ll_womens).setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
    }
}
