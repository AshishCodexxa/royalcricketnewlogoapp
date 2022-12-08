package com.cricketlivescore.predictiontips.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Adapter.Criclytics.AdapterPlayerProjection;
import com.cricketlivescore.predictiontips.Models.ModelTeamPlayer;
import com.cricketlivescore.predictiontips.PreMatchPredectionQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;

public class PlayerProjectionFragment extends Fragment {
    private static final String LOG = "<<<PlayerProjectionFragment>>>";
    CardView card_allRounder;
    String currentInnings;
    ImageView img_ball;
    ImageView img_bat;
    ImageView img_info;
    ImageView img_player;
    ImageView img_role;
    String matchId;
    String matchType;
    Activity myActivity;
    RelativeLayout rl_info;
    RecyclerView rv_player;
    TabLayout tabLayout_team;
    ArrayList<PreMatchPredectionQuery.Teams_Runs_Projection> teamsRuns;
    TextView txt_player;
    TextView txt_player_projected;
    ArrayList<PreMatchPredectionQuery.ListProjection> valueArrayBat;
    ArrayList<PreMatchPredectionQuery.ListProjection> valueArrayBowl;
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
        this.view = layoutInflater.inflate(R.layout.fragment_player_projection, viewGroup, false);
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType + " : ");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    PlayerProjectionFragment.this.rl_info.setVisibility(View.VISIBLE);

                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            PlayerProjectionFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            TabLayout tabLayout = (TabLayout) this.view.findViewById(R.id.tabLayout_team);
            this.tabLayout_team = tabLayout;
            tabLayout.addTab(tabLayout.newTab().setText(""));
            TabLayout tabLayout2 = this.tabLayout_team;
            tabLayout2.addTab(tabLayout2.newTab().setText(""));
            this.tabLayout_team.setTabGravity(0);
            graphqlApi.getPreMatchPrediction(this.matchId, new Interface.GetPreMatchPredection() {


                @Override
                public void getResponse(PreMatchPredectionQuery.PreMatchPredection preMatchPredection) {
                    PlayerProjectionFragment.this.getPreMatchPrediction(preMatchPredection);
                }
            });
            this.img_role = (ImageView) this.view.findViewById(R.id.img_role);
            this.img_player = (ImageView) this.view.findViewById(R.id.img_player);
            this.txt_player = (TextView) this.view.findViewById(R.id.txt_player);
            this.txt_player_projected = (TextView) this.view.findViewById(R.id.txt_player_projected);
            this.card_allRounder = (CardView) this.view.findViewById(R.id.card_allRounder);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_player);
            this.rv_player = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity, 0, false));
        }
    }


    private void getPreMatchPrediction(final PreMatchPredectionQuery.PreMatchPredection preMatchPredection) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    if (preMatchPredection != null) {
                        final ArrayList arrayList = new ArrayList();
                        PlayerProjectionFragment.this.teamsRuns = new ArrayList<>();
                        for (int i = 0; i < preMatchPredection.teams_Runs_Projection().size(); i++) {
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < preMatchPredection.playerList().size(); i2++) {
                                if (preMatchPredection.playerList().get(i2).teamId().equals(preMatchPredection.teams_Runs_Projection().get(i).teamId())) {
                                    arrayList2.add(preMatchPredection.playerList().get(i2));
                                }
                            }
                            arrayList.add(new ModelTeamPlayer(arrayList2));
                            PlayerProjectionFragment.this.teamsRuns.add(preMatchPredection.teams_Runs_Projection().get(i));
                        }
                        for (int i3 = 0; i3 < PlayerProjectionFragment.this.tabLayout_team.getTabCount(); i3++) {
                            TabLayout.Tab tabAt = PlayerProjectionFragment.this.tabLayout_team.getTabAt(i3);
                            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(PlayerProjectionFragment.this.myActivity).inflate(R.layout.tab_layout, (ViewGroup) PlayerProjectionFragment.this.tabLayout_team, false);
                            if (i3 == 0) {
                                relativeLayout.findViewById(R.id.view).setVisibility(View.GONE);
                            }
                            ((TextView) relativeLayout.findViewById(R.id.tab_title)).setText(PlayerProjectionFragment.this.teamsRuns.get(i3).teamName());
                            tabAt.setCustomView(relativeLayout);
                        }
                        PlayerProjectionFragment.this.tabLayout_team.getTabAt(0).select();
                        PlayerProjectionFragment.this.rv_player.setAdapter(new AdapterPlayerProjection(PlayerProjectionFragment.this.myActivity, ((ModelTeamPlayer) arrayList.get(0)).getTeamsPlayer(), new AdapterPlayerProjection.OnItemClickListener() {


                            @Override
                            public void onItemClick(PreMatchPredectionQuery.PlayerList playerList) {
                                PlayerProjectionFragment.this.onItemClickNew(playerList);
                            }
                        }));
                        PlayerProjectionFragment.this.tabLayout_team.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

                            @Override
                            public void onTabReselected(TabLayout.Tab tab) {
                            }

                            @Override
                            public void onTabUnselected(TabLayout.Tab tab) {
                            }

                            @Override
                            public void onTabSelected(TabLayout.Tab tab) {
                                int position = tab.getPosition();
                                if (position == 0) {
                                    PlayerProjectionFragment.this.rv_player.setAdapter(new AdapterPlayerProjection(PlayerProjectionFragment.this.myActivity, ((ModelTeamPlayer) arrayList.get(0)).getTeamsPlayer(), new AdapterPlayerProjection.OnItemClickListener() {


                                        @Override
                                        public void onItemClick(PreMatchPredectionQuery.PlayerList playerList) {
                                            PlayerProjectionFragment.this.onItemClickNew(playerList);
                                        }
                                    }));
                                } else if (position == 1) {
                                    PlayerProjectionFragment.this.rv_player.setAdapter(new AdapterPlayerProjection(PlayerProjectionFragment.this.myActivity, ((ModelTeamPlayer) arrayList.get(1)).getTeamsPlayer(), new AdapterPlayerProjection.OnItemClickListener() {

                                        @Override
                                        public void onItemClick(PreMatchPredectionQuery.PlayerList playerList) {
                                            PlayerProjectionFragment.this.onItemClickNew(playerList);
                                        }
                                    }));
                                }
                            }
                        });
                        PlayerProjectionFragment.this.view.findViewById(R.id.ll_player_projection).setVisibility(View.VISIBLE);
                        ;
                        PlayerProjectionFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                        return;
                    }
                    PlayerProjectionFragment.this.view.findViewById(R.id.ll_player_projection).setVisibility(View.GONE);
                    PlayerProjectionFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                    ;
                    PlayerProjectionFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                }
            });
        }
    }

    public void onItemClickNew(PreMatchPredectionQuery.PlayerList playerList) {
        this.valueArrayBat = new ArrayList<>();
        this.valueArrayBowl = new ArrayList<>();
        this.txt_player.setText(playerList.playerName());
        this.txt_player_projected.setTypeface(Glob.oswald_medium);
        RequestManager with = Glide.with(this.myActivity);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + playerList.playerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_player);
        if (playerList.playerRole().equals("Batsman")) {
            Glide.with(this.myActivity).load(Integer.valueOf((int) R.drawable.bat)).into(this.img_role);
            if (this.card_allRounder.getVisibility() == View.VISIBLE) {
                this.card_allRounder.setVisibility(View.INVISIBLE);
                ;
            }
        } else if (playerList.playerRole().equals("Bowler")) {
            Glide.with(this.myActivity).load(Integer.valueOf((int) R.drawable.ball)).into(this.img_role);
            if (this.card_allRounder.getVisibility() == View.VISIBLE) {
                this.card_allRounder.setVisibility(View.INVISIBLE);
                ;
            }
        } else if (playerList.playerRole().equals("All Rounder")) {
            if (this.card_allRounder.getVisibility() == View.INVISIBLE) {
                this.card_allRounder.setVisibility(View.VISIBLE);
                ;
            }
            Glide.with(this.myActivity).load(Integer.valueOf((int) R.drawable.all_rounder)).into(this.img_role);
            this.img_bat = (ImageView) this.view.findViewById(R.id.img_bat);
            this.img_ball = (ImageView) this.view.findViewById(R.id.img_ball);
            this.img_bat.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    PlayerProjectionFragment.this.img_bat.setBackground(ResourcesCompat.getDrawable(PlayerProjectionFragment.this.getResources(), R.drawable.back_prole_selected, PlayerProjectionFragment.this.myActivity.getTheme()));
                    PlayerProjectionFragment.this.img_ball.setBackground(null);
                    PlayerProjectionFragment.this.setRuns();
                }
            });
            this.img_ball.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    PlayerProjectionFragment.this.img_ball.setBackground(ResourcesCompat.getDrawable(PlayerProjectionFragment.this.getResources(), R.drawable.back_prole_selected, PlayerProjectionFragment.this.myActivity.getTheme()));
                    PlayerProjectionFragment.this.img_bat.setBackground(null);
                    PlayerProjectionFragment.this.setWickets();
                }
            });
        }
        for (int i = 0; i < playerList.listProjections().size(); i++) {
            if (playerList.listProjections().size() == 2) {
                if (playerList.listProjections().get(i).role().equals("Batting")) {
                    this.valueArrayBat.add(playerList.listProjections().get(i));
                    this.img_bat.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_prole_selected, this.myActivity.getTheme()));
                    this.img_ball.setBackground(null);
                    setRuns();
                } else if (playerList.listProjections().get(i).role().equals("Bowling")) {
                    this.valueArrayBowl.add(playerList.listProjections().get(i));
                }
            } else if (playerList.listProjections().get(i).role().equals("Batting")) {
                this.valueArrayBat.add(playerList.listProjections().get(i));
                setRuns();
            } else if (playerList.listProjections().get(i).role().equals("Bowling")) {
                this.valueArrayBowl.add(playerList.listProjections().get(i));
                setWickets();
            }
        }
    }

    public void setRuns() {
        TextView textView = this.txt_player_projected;
        textView.setText(this.valueArrayBat.get(0).values().get(0).bound() + HelpFormatter.DEFAULT_OPT_PREFIX + this.valueArrayBat.get(0).values().get(2).bound() + " runs");
    }

    public void setWickets() {
        TextView textView = this.txt_player_projected;
        textView.setText(this.valueArrayBowl.get(0).values().get(0).bound() + HelpFormatter.DEFAULT_OPT_PREFIX + this.valueArrayBowl.get(0).values().get(2).bound() + " wickets");
    }


    @Override
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
    }
}
