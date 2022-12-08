package com.cricketlivescore.predictiontips.Fragments.MatchInfo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Adapter.MatchInfo.AdapterBatterMini;
import com.cricketlivescore.predictiontips.MiniScoreCardQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

public class LiveFragment extends Fragment {
    static final  boolean $assertionsDisabled = false;
    private static final String LOG = "<<<LiveFragment>>>";
    String currentInnings;
    Handler handler = new Handler();
    ImageView img_flag;
    LinearLayout ll_bowler;
    String matchId;
    Activity myActivity;
    ProgressBar progress_live;
    Runnable refresh;
    RecyclerView rv_batter;
    ScrollView scrollView;
    TextView txt_bowler_eco;
    TextView txt_bowler_maiden;
    TextView txt_bowler_name;
    TextView txt_bowler_over;
    TextView txt_bowler_run;
    TextView txt_bowler_wickets;
    TextView txt_partnerShip;
    TextView txt_rr;
    TextView txt_team;
    TextView txt_teamScore;
    TextView txt_totalRun;
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
        this.view = layoutInflater.inflate(R.layout.fragment_live2, viewGroup, false);
        Log.d(LOG, this.matchId + " : " + this.currentInnings);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.progress_live = (ProgressBar) this.view.findViewById(R.id.progress_live);
            this.scrollView = (ScrollView) this.view.findViewById(R.id.scrollView);
            this.img_flag = (ImageView) this.view.findViewById(R.id.img_flag);
            this.txt_team = (TextView) this.view.findViewById(R.id.txt_team);
            this.txt_teamScore = (TextView) this.view.findViewById(R.id.txt_teamScore);
            this.txt_totalRun = (TextView) this.view.findViewById(R.id.txt_totalRun);
            this.rv_batter = (RecyclerView) this.view.findViewById(R.id.rv_batter);
            this.txt_bowler_name = (TextView) this.view.findViewById(R.id.txt_bowler_name);
            this.txt_bowler_over = (TextView) this.view.findViewById(R.id.txt_bowler_over);
            this.txt_bowler_maiden = (TextView) this.view.findViewById(R.id.txt_bowler_maiden);
            this.txt_bowler_run = (TextView) this.view.findViewById(R.id.txt_bowler_run);
            this.txt_bowler_wickets = (TextView) this.view.findViewById(R.id.txt_bowler_wickets);
            this.txt_bowler_eco = (TextView) this.view.findViewById(R.id.txt_bowler_eco);
            this.txt_partnerShip = (TextView) this.view.findViewById(R.id.txt_partnerShip);
            this.txt_rr = (TextView) this.view.findViewById(R.id.txt_rr);
            this.ll_bowler = (LinearLayout) this.view.findViewById(R.id.ll_bowler);
            final GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            Runnable r1 = new Runnable() {

                public void run() {
                    graphqlApi.getMiniScoreCardLive(LiveFragment.this.matchId, new Interface.GetMiniScoreCardLive() {


                        @Override
                        public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                            LiveFragment.this.getMatchDetail(miniScoreCard);
                        }
                    });
                    LiveFragment.this.handler.postDelayed(LiveFragment.this.refresh, WorkRequest.MIN_BACKOFF_MILLIS);
                }
            };
            this.refresh = r1;
            this.handler.post(r1);
        }
    }

    
  
    private void getMatchDetail(final MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    MiniScoreCardQuery.MiniScoreCard miniScoreCard2 = miniScoreCard;
                    if (miniScoreCard2 == null || miniScoreCard2.data() == null || miniScoreCard.data().isEmpty() || miniScoreCard.batting().isEmpty()) {
                        LiveFragment.this.progress_live.setVisibility(View.GONE);
                        LiveFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                        return;
                    }
                    LiveFragment.this.progress_live.setVisibility(View.GONE);
                    LiveFragment.this.scrollView.setVisibility(View.VISIBLE);
                    RequestManager with = Glide.with(LiveFragment.this.myActivity);
                    with.load(Glob.teams_start + miniScoreCard.data().get(0).currentInningteamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag).into(LiveFragment.this.img_flag);
                    for (int i = 0; i < miniScoreCard.data().get(0).matchScore().size(); i++) {
                        for (int i2 = 0; i2 < miniScoreCard.data().get(0).matchScore().get(i).teamScore().size(); i2++) {
                            String runsScored = miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).runsScored();
                            String wickets = miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).wickets();
                            String overs = miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).overs();
                            String runRate = miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).runRate();
                            String format = String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")");
                            if (overs.length() != 0) {
                                LiveFragment.this.txt_teamScore.setText(format);
                                LiveFragment.this.txt_totalRun.setText(format);
                                LiveFragment.this.txt_rr.setText(runRate);
                            }
                            LiveFragment.this.txt_team.setText(Glob.getString(miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).battingTeamShortName()));
                        }
                    }
                    LiveFragment.this.txt_partnerShip.setText(Glob.getString(miniScoreCard.partnership()));
                    AdapterBatterMini adapterBatterMini = new AdapterBatterMini(LiveFragment.this.myActivity, miniScoreCard.batting());
                    LiveFragment.this.rv_batter.setLayoutManager(new LinearLayoutManager(LiveFragment.this.myActivity, RecyclerView.VERTICAL, false));
                    LiveFragment.this.rv_batter.setAdapter(adapterBatterMini);
                    if (!miniScoreCard.bowling().isEmpty()) {
                        LiveFragment.this.txt_bowler_name.setText(miniScoreCard.bowling().get(0).playerName());
                        LiveFragment.this.txt_bowler_over.setText(miniScoreCard.bowling().get(0).overs());
                        LiveFragment.this.txt_bowler_maiden.setText(miniScoreCard.bowling().get(0).maiden());
                        LiveFragment.this.txt_bowler_run.setText(miniScoreCard.bowling().get(0).RunsConceeded());
                        LiveFragment.this.txt_bowler_wickets.setText(miniScoreCard.bowling().get(0).wickets());
                        LiveFragment.this.txt_bowler_eco.setText(miniScoreCard.bowling().get(0).economy());
                    }
                    LiveFragment.this.ll_bowler.setOnClickListener(new View.OnClickListener() { 
                        @Override 
                        public void onClick(View view) {
                            Glob.goToPlayerDetail(LiveFragment.this.myActivity, miniScoreCard.bowling().get(0).playerID());
                        }
                    });
                }
            });
        }

    }

    @Override 
    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override 
    public void onStop() {
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

}
