package com.gsbusiness.livecricketscoreprediction.Fragments.More.Teams;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.gsbusiness.livecricketscoreprediction.Adapter.More.AdapterTeamsOther;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.Models.More.ModelTeams;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.TeamDiscoveryV2Query;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.ArrayList;
import java.util.List;

public class OtherLeaguesFragment extends Fragment {
    private static final String LOG = "<<<OtherLeaguesFragment>>>";
    private static Activity myActivity;
    AdapterTeamsOther adapterTeamsMens;
    AdapterTeamsOther adapterTeamsWomens;
    ArrayList<ModelTeams> bblArrayList;
    GraphqlApi graphqlApi;
    ArrayList<ModelTeams> iplArrayList;
    RecyclerView rv_bbl;
    RecyclerView rv_ipl;
    View view;

    public static OtherLeaguesFragment newInstance(Activity activity) {
        OtherLeaguesFragment otherLeaguesFragment = new OtherLeaguesFragment();
        myActivity = activity;
        return otherLeaguesFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_other_leagues, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {
            this.graphqlApi = new GraphqlApi(myActivity);
            this.iplArrayList = new ArrayList<>();
            this.bblArrayList = new ArrayList<>();
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_ipl);
            this.rv_ipl = recyclerView;
            recyclerView.setLayoutManager(new GridLayoutManager((Context) myActivity, 2, RecyclerView.VERTICAL, false));
            AdapterTeamsOther adapterTeamsOther = new AdapterTeamsOther(myActivity, this.iplArrayList, new AdapterTeamsOther.OnItemClickListener() {

                @Override
                public void onItemClick() {
                }
            });
            this.adapterTeamsMens = adapterTeamsOther;
            this.rv_ipl.setAdapter(adapterTeamsOther);
            RecyclerView recyclerView2 = (RecyclerView) this.view.findViewById(R.id.rv_bbl);
            this.rv_bbl = recyclerView2;
            recyclerView2.setLayoutManager(new GridLayoutManager((Context) myActivity, 2, RecyclerView.VERTICAL, false));
            AdapterTeamsOther adapterTeamsOther2 = new AdapterTeamsOther(myActivity, this.bblArrayList, new AdapterTeamsOther.OnItemClickListener() {

                @Override
                public void onItemClick() {
                }
            });
            this.adapterTeamsWomens = adapterTeamsOther2;
            this.rv_bbl.setAdapter(adapterTeamsOther2);
            TeamDiscovery();
        }
    }

    public void TeamDiscovery() {
        this.graphqlApi.getTeamDiscovery(new Interface.GetTeamDiscovery() {

            @Override
            public void getResponse(final TeamDiscoveryV2Query.TeamDiscoveryV2 teamDiscoveryV2) {
                Glob.log("TeamDiscovery", teamDiscoveryV2.international() + "");
                OtherLeaguesFragment.myActivity.runOnUiThread(new Runnable() {


                    public void run() {
                        for (int i = 0; i < teamDiscoveryV2.otherLeagues().ipl().size(); i++) {
                            String teamID = teamDiscoveryV2.otherLeagues().ipl().get(i).teamID();
                            String teamName = teamDiscoveryV2.otherLeagues().ipl().get(i).teamName();
                            String odiRanking = teamDiscoveryV2.otherLeagues().ipl().get(i).odiRanking();
                            String testRanking = teamDiscoveryV2.otherLeagues().ipl().get(i).testRanking();
                            String t20Ranking = teamDiscoveryV2.otherLeagues().ipl().get(i).t20Ranking();
                            List<String> trophy_details = teamDiscoveryV2.otherLeagues().ipl().get(i).trophy_details();
                            String teamShortName = teamDiscoveryV2.otherLeagues().ipl().get(i).teamShortName();
                            ModelTeams modelTeams = new ModelTeams();
                            modelTeams.ModelTeams(teamID, teamName, odiRanking, testRanking, t20Ranking, trophy_details, teamShortName);
                            OtherLeaguesFragment.this.iplArrayList.add(modelTeams);
                            OtherLeaguesFragment.this.adapterTeamsMens.notifyItemInserted(i);
                            if (OtherLeaguesFragment.this.view.findViewById(R.id.ll_ipl).getVisibility() == View.GONE) {
                                OtherLeaguesFragment.this.view.findViewById(R.id.ll_ipl).setVisibility(View.VISIBLE);;
                            }
                        }
                        if (OtherLeaguesFragment.this.iplArrayList == null || OtherLeaguesFragment.this.iplArrayList.isEmpty()) {
                            OtherLeaguesFragment.this.view.findViewById(R.id.ll_ipl).setVisibility(View.GONE);
                        }
                        for (int i2 = 0; i2 < teamDiscoveryV2.otherLeagues().bbl().size(); i2++) {
                            String teamID2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).teamID();
                            String teamName2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).teamName();
                            String odiRanking2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).odiRanking();
                            String testRanking2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).testRanking();
                            String t20Ranking2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).t20Ranking();
                            List<String> trophy_details2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).trophy_details();
                            String teamShortName2 = teamDiscoveryV2.otherLeagues().bbl().get(i2).teamShortName();
                            ModelTeams modelTeams2 = new ModelTeams();
                            modelTeams2.ModelTeams(teamID2, teamName2, odiRanking2, testRanking2, t20Ranking2, trophy_details2, teamShortName2);
                            OtherLeaguesFragment.this.bblArrayList.add(modelTeams2);
                            OtherLeaguesFragment.this.adapterTeamsWomens.notifyItemInserted(i2);
                            if (OtherLeaguesFragment.this.view.findViewById(R.id.ll_bbl).getVisibility() == View.GONE) {
                                OtherLeaguesFragment.this.view.findViewById(R.id.ll_bbl).setVisibility(View.VISIBLE);;
                            }
                        }
                        if (OtherLeaguesFragment.this.bblArrayList == null || OtherLeaguesFragment.this.bblArrayList.isEmpty()) {
                            OtherLeaguesFragment.this.view.findViewById(R.id.ll_bbl).setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
    }
}
