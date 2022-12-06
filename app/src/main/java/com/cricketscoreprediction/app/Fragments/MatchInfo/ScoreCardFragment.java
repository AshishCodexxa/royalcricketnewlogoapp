package com.cricketscoreprediction.app.Fragments.MatchInfo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.Adapter.MatchInfo.AdapterScoreCard;

import com.cricketscoreprediction.app.GetScoreCardQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

public class ScoreCardFragment extends Fragment {
    static final  boolean $assertionsDisabled = false;
    public static String LOG = ">>>>>LogScoreCardFragment";
    Handler handler = new Handler();
    String matchId;
    Activity myActivity;
    ProgressBar progress_scorecard;
    Runnable refresh;
    RecyclerView rv_scorecard;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString("MatchId");
        this.view = layoutInflater.inflate(R.layout.fragment_score_card, viewGroup, false);
        String str = LOG;
        Log.d(str, this.matchId + " : ");
        Glob.matchIds = this.matchId;
        String str2 = LOG;
        Log.d(str2, this.matchId + "");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.rv_scorecard = (RecyclerView) this.view.findViewById(R.id.rv_scorecard);
            this.progress_scorecard = (ProgressBar) this.view.findViewById(R.id.progress_scorecard);
            final GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            Runnable r1 = new Runnable() {

                public void run() {
                    graphqlApi.getScoreCardQuery(Glob.matchIds, new Interface.GetScoreCards() {

                        @Override
                        public void getResponse(GetScoreCardQuery.GetScoreCard getScoreCard) {
                            ScoreCardFragment.this.getMatchScoreCard(getScoreCard);
                        }
                    });
                    ScoreCardFragment.this.handler.postDelayed(ScoreCardFragment.this.refresh, 20000);
                }
            };
            this.refresh = r1;
            this.handler.post(r1);
        }
    }

    
  
    private void getMatchScoreCard(final GetScoreCardQuery.GetScoreCard getScoreCard) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    GetScoreCardQuery.GetScoreCard getScoreCard2 = getScoreCard;
                    if (getScoreCard2 == null || getScoreCard2.fullScoreCard() == null || getScoreCard.fullScoreCard().isEmpty()) {
                        ScoreCardFragment.this.view.findViewById(R.id.rv_scorecard).setVisibility(View.GONE);
                        ScoreCardFragment.this.progress_scorecard.setVisibility(View.GONE);
                        ScoreCardFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                        return;
                    }
                    AdapterScoreCard adapterScoreCard = new AdapterScoreCard(ScoreCardFragment.this.myActivity, getScoreCard.fullScoreCard());
                    ScoreCardFragment.this.rv_scorecard.setLayoutManager(new LinearLayoutManager(ScoreCardFragment.this.myActivity, RecyclerView.VERTICAL, false));
                    ScoreCardFragment.this.rv_scorecard.setAdapter(adapterScoreCard);
                    ScoreCardFragment.this.view.findViewById(R.id.rv_scorecard).setVisibility(View.VISIBLE);
                    ScoreCardFragment.this.progress_scorecard.setVisibility(View.GONE);
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
