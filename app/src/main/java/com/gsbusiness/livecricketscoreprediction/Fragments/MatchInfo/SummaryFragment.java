package com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.MatchSummaryQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;

public class SummaryFragment extends Fragment {
    private static final String LOG = "<<<SummaryFragment>>>";
    GraphqlApi graphqlApi;
    ImageView img_flag;
    ImageView img_flag_away;
    ImageView img_flag_bowler;
    ImageView img_flag_home;
    ImageView img_player;
    ImageView img_player_bowler;
    String matchId;
    Activity myActivity;
    ProgressBar progress_scorecard;
    String status = "completed";
    TextView txt_4s;
    TextView txt_6s;
    TextView txt_b_over;
    TextView txt_b_wicket;
    TextView txt_ball;
    TextView txt_name;
    TextView txt_name_bowler;
    TextView txt_score;
    TextView txt_team_away;
    TextView txt_team_away_batterRunner;
    TextView txt_team_away_batterRunner_score;
    TextView txt_team_away_batterTop;
    TextView txt_team_away_batterTop_score;
    TextView txt_team_away_bowlerRunner;
    TextView txt_team_away_bowlerRunner_wicket;
    TextView txt_team_away_bowlerTop;
    TextView txt_team_away_bowlerTop_wicket;
    TextView txt_team_away_over;
    TextView txt_team_away_score;
    TextView txt_team_home;
    TextView txt_team_home_batterRunner;
    TextView txt_team_home_batterRunner_score;
    TextView txt_team_home_batterTop;
    TextView txt_team_home_batterTop_score;
    TextView txt_team_home_bowlerRunner;
    TextView txt_team_home_bowlerRunner_wicket;
    TextView txt_team_home_bowlerTop;
    TextView txt_team_home_bowlerTop_wicket;
    TextView txt_team_home_over;
    TextView txt_team_home_score;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString("MatchId");
        this.view = layoutInflater.inflate(R.layout.fragment_summary, viewGroup, false);
        Log.d(LOG, this.matchId + " : ");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
//            innerNativeAdBottom();
            this.graphqlApi = new GraphqlApi(this.myActivity);
            this.progress_scorecard = (ProgressBar) this.view.findViewById(R.id.progress_scorecard);
            this.img_flag = (ImageView) this.view.findViewById(R.id.img_flag);
            this.img_player = (ImageView) this.view.findViewById(R.id.img_player);
            this.txt_name = (TextView) this.view.findViewById(R.id.txt_name);
            this.txt_score = (TextView) this.view.findViewById(R.id.txt_score);
            this.txt_ball = (TextView) this.view.findViewById(R.id.txt_ball);
            this.txt_4s = (TextView) this.view.findViewById(R.id.txt_4s);
            this.txt_6s = (TextView) this.view.findViewById(R.id.txt_6s);
            this.txt_name_bowler = (TextView) this.view.findViewById(R.id.txt_name_bowler);
            this.txt_b_wicket = (TextView) this.view.findViewById(R.id.txt_b_wicket);
            this.txt_b_over = (TextView) this.view.findViewById(R.id.txt_b_over);
            this.img_flag_bowler = (ImageView) this.view.findViewById(R.id.img_flag_bowler);
            this.img_player_bowler = (ImageView) this.view.findViewById(R.id.img_player_bowler);
            this.img_flag_home = (ImageView) this.view.findViewById(R.id.img_flag_home);
            this.txt_team_home = (TextView) this.view.findViewById(R.id.txt_team_home);
            this.txt_team_home_score = (TextView) this.view.findViewById(R.id.txt_team_home_score);
            this.txt_team_home_over = (TextView) this.view.findViewById(R.id.txt_team_home_over);
            this.txt_team_home_batterTop = (TextView) this.view.findViewById(R.id.txt_team_home_batterTop);
            this.txt_team_home_batterTop_score = (TextView) this.view.findViewById(R.id.txt_team_home_batterTop_score);
            this.txt_team_home_bowlerTop = (TextView) this.view.findViewById(R.id.txt_team_home_bowlerTop);
            this.txt_team_home_bowlerTop_wicket = (TextView) this.view.findViewById(R.id.txt_team_home_bowlerTop_wicket);
            this.txt_team_home_batterRunner = (TextView) this.view.findViewById(R.id.txt_team_home_batterRunner);
            this.txt_team_home_batterRunner_score = (TextView) this.view.findViewById(R.id.txt_team_home_batterRunner_score);
            this.txt_team_home_bowlerRunner = (TextView) this.view.findViewById(R.id.txt_team_home_bowlerRunner);
            this.txt_team_home_bowlerRunner_wicket = (TextView) this.view.findViewById(R.id.txt_team_home_bowlerRunner_wicket);
            this.img_flag_away = (ImageView) this.view.findViewById(R.id.img_flag_away);
            this.txt_team_away = (TextView) this.view.findViewById(R.id.txt_team_away);
            this.txt_team_away_score = (TextView) this.view.findViewById(R.id.txt_team_away_score);
            this.txt_team_away_over = (TextView) this.view.findViewById(R.id.txt_team_away_over);
            this.txt_team_away_batterTop = (TextView) this.view.findViewById(R.id.txt_team_away_batterTop);
            this.txt_team_away_batterTop_score = (TextView) this.view.findViewById(R.id.txt_team_away_batterTop_score);
            this.txt_team_away_bowlerTop = (TextView) this.view.findViewById(R.id.txt_team_away_bowlerTop);
            this.txt_team_away_bowlerTop_wicket = (TextView) this.view.findViewById(R.id.txt_team_away_bowlerTop_wicket);
            this.txt_team_away_batterRunner = (TextView) this.view.findViewById(R.id.txt_team_away_batterRunner);
            this.txt_team_away_batterRunner_score = (TextView) this.view.findViewById(R.id.txt_team_away_batterRunner_score);
            this.txt_team_away_bowlerRunner = (TextView) this.view.findViewById(R.id.txt_team_away_bowlerRunner);
            this.txt_team_away_bowlerRunner_wicket = (TextView) this.view.findViewById(R.id.txt_team_away_bowlerRunner_wicket);
            getMatchSummary();
        }
    }

    private void getMatchSummary() {
        this.graphqlApi.getMatchSummary(this.matchId, this.status, new Interface.GetMatchSummary() {


            @Override
            public void getResponse(final MatchSummaryQuery.MatchSummary matchSummary) {
                if (SummaryFragment.this.myActivity != null) {
                    SummaryFragment.this.myActivity.runOnUiThread(new Runnable() {


                        public void run() {
                            if (matchSummary != null) {
                                RequestManager with = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + matchSummary.bestBatsman().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(SummaryFragment.this.img_player);
                                RequestManager with2 = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) with2.load(Glob.teams_start + matchSummary.bestBatsman().playerTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(SummaryFragment.this.img_flag);
                                SummaryFragment.this.txt_name.setText(matchSummary.bestBatsman().playerName());
                                SummaryFragment.this.txt_score.setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).runs().toString()));
                                TextView textView = SummaryFragment.this.txt_ball;
                                textView.setText("(" + matchSummary.bestBatsman().battingStatsList().get(0).balls() + ")");
                                SummaryFragment.this.txt_6s.setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).sixes().toString()));
                                SummaryFragment.this.txt_4s.setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).fours().toString()));
                                RequestManager with3 = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + matchSummary.bestBowler().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(SummaryFragment.this.img_player_bowler);
                                RequestManager with4 = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) with4.load(Glob.teams_start + matchSummary.bestBowler().playerTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(SummaryFragment.this.img_flag_bowler);
                                SummaryFragment.this.txt_name_bowler.setText(matchSummary.bestBowler().playerName());
                                SummaryFragment.this.txt_b_wicket.setText(matchSummary.bestBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.bestBowler().bowlingStatsList().get(0).runsConceded());
                                SummaryFragment.this.txt_b_over.setText("(" + matchSummary.bestBowler().bowlingStatsList().get(0).overs() + ")");
                                RequestManager with5 = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) with5.load(Glob.teams_start + matchSummary.homeTeamData().teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(SummaryFragment.this.img_flag_home);
                                SummaryFragment.this.txt_team_home.setText(matchSummary.homeTeamData().teamName());
                                SummaryFragment.this.txt_team_home_score.setText(matchSummary.homeTeamData().runs().get(0) + "/" + matchSummary.homeTeamData().wickets().get(0));
                                TextView textView2 = SummaryFragment.this.txt_team_home_over;
                                textView2.setText("(" + matchSummary.homeTeamData().overs().get(0) + ")");
                                SummaryFragment.this.txt_team_home_batterTop.setText(matchSummary.homeTeamData().batsmanSummary1().topBatsman().playerName());
                                TextView textView3 = SummaryFragment.this.txt_team_home_batterTop_score;
                                textView3.setText("" + matchSummary.homeTeamData().batsmanSummary1().topBatsman().battingStatsList().get(0).runs());
                                SummaryFragment.this.txt_team_home_bowlerTop.setText(matchSummary.awayTeamData().bowlerSummary1().topBowler().playerName());
                                SummaryFragment.this.txt_team_home_bowlerTop_wicket.setText(matchSummary.awayTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.awayTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).runsConceded());
                                SummaryFragment.this.txt_team_home_batterRunner.setText(matchSummary.homeTeamData().batsmanSummary1().runnerBatsman().playerName());
                                TextView textView4 = SummaryFragment.this.txt_team_home_batterRunner_score;
                                textView4.setText("" + matchSummary.homeTeamData().batsmanSummary1().runnerBatsman().battingStatsList().get(0).runs());
                                SummaryFragment.this.txt_team_home_bowlerRunner.setText(matchSummary.awayTeamData().bowlerSummary1().runnerBowler().playerName());
                                SummaryFragment.this.txt_team_home_bowlerRunner_wicket.setText(matchSummary.awayTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.awayTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).runsConceded());
                                RequestManager with6 = Glide.with(SummaryFragment.this.myActivity);
                                ((RequestBuilder) with6.load(Glob.teams_start + matchSummary.awayTeamData().teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(SummaryFragment.this.img_flag_away);
                                SummaryFragment.this.txt_team_away.setText(matchSummary.awayTeamData().teamName());
                                SummaryFragment.this.txt_team_away_score.setText(matchSummary.awayTeamData().runs().get(0) + "/" + matchSummary.awayTeamData().wickets().get(0));
                                TextView textView5 = SummaryFragment.this.txt_team_away_over;
                                textView5.setText("(" + matchSummary.awayTeamData().overs().get(0) + ")");
                                SummaryFragment.this.txt_team_away_batterTop.setText(matchSummary.awayTeamData().batsmanSummary1().topBatsman().playerName());
                                TextView textView6 = SummaryFragment.this.txt_team_away_batterTop_score;
                                textView6.setText("" + matchSummary.awayTeamData().batsmanSummary1().topBatsman().battingStatsList().get(0).runs());
                                SummaryFragment.this.txt_team_away_bowlerTop.setText(matchSummary.homeTeamData().bowlerSummary1().topBowler().playerName());
                                SummaryFragment.this.txt_team_away_bowlerTop_wicket.setText(matchSummary.homeTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.homeTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).runsConceded());
                                SummaryFragment.this.txt_team_away_batterRunner.setText(matchSummary.awayTeamData().batsmanSummary1().runnerBatsman().playerName());
                                TextView textView7 = SummaryFragment.this.txt_team_away_batterRunner_score;
                                textView7.setText("" + matchSummary.awayTeamData().batsmanSummary1().runnerBatsman().battingStatsList().get(0).runs());
                                SummaryFragment.this.txt_team_away_bowlerRunner.setText(matchSummary.homeTeamData().bowlerSummary1().runnerBowler().playerName());
                                SummaryFragment.this.txt_team_away_bowlerRunner_wicket.setText(matchSummary.homeTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.homeTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).runsConceded());
                                SummaryFragment.this.progress_scorecard.setVisibility(View.GONE);
                                SummaryFragment.this.view.findViewById(R.id.ll_summary).setVisibility(View.VISIBLE);;
                                return;
                            }
                            SummaryFragment.this.view.findViewById(R.id.ll_summary).setVisibility(View.GONE);
                            SummaryFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                            SummaryFragment.this.progress_scorecard.setVisibility(View.GONE);
                        }
                    });
                }
            }
        });
    }


    @Override 
    public void onDestroy() {
        super.onDestroy();
    }
}
