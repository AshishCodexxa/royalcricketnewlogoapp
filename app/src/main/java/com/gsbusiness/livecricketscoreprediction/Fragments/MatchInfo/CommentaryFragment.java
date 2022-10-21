package com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo.AdapterCommentary;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetBallByBallQuery;
import com.gsbusiness.livecricketscoreprediction.ProbablePlaying11Query;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.List;

public class CommentaryFragment extends Fragment {
    static final  boolean $assertionsDisabled = false;
    public static String LOG = "<<<CommentaryFragment>>>";
    AdapterCommentary adapterCommentary;
    ProgressBar commentary_progress;
    String currentInnings;
    GraphqlApi graphqlApi;
    LinearLayout ll_error_no_data;
    String matchId;
    Activity myActivity;
    NestedScrollView nestedScrollView;
    RecyclerView rv_commentary;
    TextView txt_team_away;
    TextView txt_team_away_xi;
    TextView txt_team_home;
    TextView txt_team_home_xi;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString("MatchId");
        this.currentInnings = getArguments().getString(Glob.INNINGS);
        this.view = layoutInflater.inflate(R.layout.fragment_commentary, viewGroup, false);
        String str = LOG;
        Log.d(str, this.matchId + " : " + this.currentInnings);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.graphqlApi = new GraphqlApi(this.myActivity);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_commentary);
            this.rv_commentary = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            this.nestedScrollView = (NestedScrollView) this.view.findViewById(R.id.nestedScrollView);
            this.ll_error_no_data = (LinearLayout) this.view.findViewById(R.id.ll_error_no_data);
            this.commentary_progress = (ProgressBar) this.view.findViewById(R.id.commentary_progress);
            this.txt_team_home = (TextView) this.view.findViewById(R.id.txt_team_home);
            this.txt_team_home_xi = (TextView) this.view.findViewById(R.id.txt_team_home_xi);
            this.txt_team_away = (TextView) this.view.findViewById(R.id.txt_team_away);
            this.txt_team_away_xi = (TextView) this.view.findViewById(R.id.txt_team_away_xi);
            this.graphqlApi.getBallByBallQuery(this.matchId, this.currentInnings, new Interface.GetBallByBall() {


                @Override
                public void getResponse(GetBallByBallQuery.GetBallByBall getBallByBall) {
                    CommentaryFragment.this.getScoreOverByOver(getBallByBall);
                }
            });
        }
    }

    
  
    private void getScoreOverByOver(final GetBallByBallQuery.GetBallByBall getBallByBall) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    GetBallByBallQuery.GetBallByBall getBallByBall2 = getBallByBall;
                    if (getBallByBall2 == null) {
                        CommentaryFragment.this.playingXI();
                        return;
                    }
                    if (getBallByBall2.overs() == null || getBallByBall.overs().isEmpty()) {
                        CommentaryFragment.this.playingXI();
                    } else {
                        if (getBallByBall.overs().size() > 10) {
                            CommentaryFragment.this.adapterCommentary = new AdapterCommentary(CommentaryFragment.this.myActivity, getBallByBall.overs().subList(0, 10));
                        } else {
                            CommentaryFragment.this.adapterCommentary = new AdapterCommentary(CommentaryFragment.this.myActivity, getBallByBall.overs());
                        }
                        CommentaryFragment.this.rv_commentary.setAdapter(CommentaryFragment.this.adapterCommentary);
                        CommentaryFragment.this.commentary_progress.setVisibility(View.GONE);
                        CommentaryFragment.this.nestedScrollView.setVisibility(View.VISIBLE);
                    }
                    if (getBallByBall.inningsSummary() == null || getBallByBall.inningsSummary().isEmpty()) {
                        CommentaryFragment.this.view.findViewById(R.id.ll_complete_summary).setVisibility(View.GONE);
                        return;
                    }
                    ((TextView) CommentaryFragment.this.view.findViewById(R.id.txt_team)).setText(getBallByBall.inningsSummary().get(0).score().battingTeamName());
                    ((TextView) CommentaryFragment.this.view.findViewById(R.id.txt_score)).setText(getBallByBall.inningsSummary().get(0).score().runsScored() + "/" + getBallByBall.inningsSummary().get(0).score().wickets() + " (" + getBallByBall.inningsSummary().get(0).score().overs() + ")");
                    Glide.with(CommentaryFragment.this.myActivity).load(Glob.teams_start + getBallByBall.inningsSummary().get(0).score().battingTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag).into((ImageView) CommentaryFragment.this.view.findViewById(R.id.img_flag));
                    RecyclerView recyclerView = (RecyclerView) CommentaryFragment.this.view.findViewById(R.id.rv_stats);
                    recyclerView.setLayoutManager(new LinearLayoutManager(CommentaryFragment.this.myActivity));
                    CommentaryFragment commentaryFragment = CommentaryFragment.this;
                    recyclerView.setAdapter(new AdapterComScore(commentaryFragment.myActivity, getBallByBall.inningsSummary().get(0).battingList(), getBallByBall.inningsSummary().get(0).bowlingList()));
                    CommentaryFragment.this.view.findViewById(R.id.ll_complete_summary).setVisibility(View.VISIBLE);
                }
            });
        }

    }

    public void playingXI() {
        this.commentary_progress.setVisibility(View.GONE);
        this.txt_team_home = (TextView) this.view.findViewById(R.id.txt_team_home);
        this.txt_team_home_xi = (TextView) this.view.findViewById(R.id.txt_team_home_xi);
        this.txt_team_away = (TextView) this.view.findViewById(R.id.txt_team_away);
        this.txt_team_away_xi = (TextView) this.view.findViewById(R.id.txt_team_away_xi);
        this.graphqlApi.getProbablePlaying11Query(this.matchId, new Interface.GetProbablePlaying11() {

            @Override
            public void getResponse(ProbablePlaying11Query.ProbablePlaying11 probablePlaying11) {
                CommentaryFragment.this.getProbablePlaying11(probablePlaying11);
            }
        });
    }

    
  
    private void getProbablePlaying11(final ProbablePlaying11Query.ProbablePlaying11 probablePlaying11) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    ProbablePlaying11Query.ProbablePlaying11 probablePlaying112 = probablePlaying11;
                    if (probablePlaying112 == null || probablePlaying112.homeTeamPP11().isEmpty() || probablePlaying11.awayTeamPP11().isEmpty()) {
                        CommentaryFragment.this.ll_error_no_data.setVisibility(View.GONE);
//                        CommentaryFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                        return;
                    }
                    CommentaryFragment.this.ll_error_no_data.setVisibility(View.VISIBLE);
                    CommentaryFragment.this.txt_team_home.setText(probablePlaying11.homeTeamShortName() + " :");
                    String str = "";
                    String str2 = str;
                    for (int i = 0; i < probablePlaying11.homeTeamPP11().size(); i++) {
                        str2 = str2 + probablePlaying11.homeTeamPP11().get(i).playerName() + ", ";
                    }
                    CommentaryFragment.this.txt_team_home_xi.setText(str2);
                    CommentaryFragment.this.txt_team_away.setText(probablePlaying11.awayTeamShortName() + " :");
                    for (int i2 = 0; i2 < probablePlaying11.awayTeamPP11().size(); i2++) {
                        str = str + probablePlaying11.awayTeamPP11().get(i2).playerName() + ", ";
                    }
                    CommentaryFragment.this.txt_team_away_xi.setText(str);
                }
            });
        }

    }


    public class AdapterComScore extends RecyclerView.Adapter<AdapterComScore.ViewHolder> {
        List<GetBallByBallQuery.BattingList1> battingLists;
        List<GetBallByBallQuery.BowlingList1> bowlingLists;
        Context context;

        public AdapterComScore(Context context2, List<GetBallByBallQuery.BattingList1> list, List<GetBallByBallQuery.BowlingList1> list2) {
            this.context = context2;
            this.battingLists = list;
            this.bowlingLists = list2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_com_score, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            viewHolder.txt_batter.setText(this.battingLists.get(i).playerName());
            viewHolder.txt_batter_score.setText(this.battingLists.get(i).playerMatchRuns());
            viewHolder.txt_bowler.setText(this.bowlingLists.get(i).playerName());
            viewHolder.txt_bowler_wicket.setText(this.bowlingLists.get(i).playerWicketsTaken() + "/" + this.bowlingLists.get(i).playerRunsConceeded());
        }

        @Override 
        public int getItemCount() {
            return this.battingLists.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView txt_batter;
            TextView txt_batter_score;
            TextView txt_bowler;
            TextView txt_bowler_wicket;

            public ViewHolder(View view) {
                super(view);
                this.txt_batter = (TextView) view.findViewById(R.id.txt_batter);
                this.txt_batter_score = (TextView) view.findViewById(R.id.txt_batter_score);
                this.txt_bowler = (TextView) view.findViewById(R.id.txt_bowler);
                this.txt_bowler_wicket = (TextView) view.findViewById(R.id.txt_bowler_wicket);
            }
        }
    }
}
