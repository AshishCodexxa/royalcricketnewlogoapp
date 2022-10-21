package com.gsbusiness.livecricketscoreprediction.Fragments.Ipl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.gsbusiness.livecricketscoreprediction.Activities.Ipl.BattingActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Ipl.BattingStatsActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Ipl.BowlingActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Ipl.BowlingStatsActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.Ipl.FieldingStatsActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;

public class StatsFragment extends Fragment {
    private static final String LOG = "<<<StatsFragment>>>";
    CardView card_ball;
    CardView card_bat;
    CardView card_field;
    ImageView img_player_batter;
    ImageView img_player_bowler;
    ImageView img_player_topScorer;
    ImageView img_player_topTaker;
    Activity myActivity;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                StatsFragment statsFragment = StatsFragment.this;
                statsFragment.onNext(statsFragment.whereLocal);
                return;
            }
            StatsFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    String seriesId = "";
    TextView txt_number_batter;
    TextView txt_number_bowler;
    TextView txt_number_topScorer;
    TextView txt_number_topTaker;
    TextView txt_player_batter;
    TextView txt_player_bowler;
    TextView txt_player_team_batter;
    TextView txt_player_team_bowler;
    TextView txt_player_team_topScorer;
    TextView txt_player_team_topTaker;
    TextView txt_player_topScorer;
    TextView txt_player_topTaker;
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
        this.view = layoutInflater.inflate(R.layout.fragment_stats, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            this.img_player_batter = (ImageView) this.view.findViewById(R.id.img_player_batter);
            this.txt_number_batter = (TextView) this.view.findViewById(R.id.txt_number_batter);
            this.txt_player_batter = (TextView) this.view.findViewById(R.id.txt_player_batter);
            this.txt_player_team_batter = (TextView) this.view.findViewById(R.id.txt_player_team_batter);
            this.img_player_bowler = (ImageView) this.view.findViewById(R.id.img_player_bowler);
            this.txt_number_bowler = (TextView) this.view.findViewById(R.id.txt_number_bowler);
            this.txt_player_bowler = (TextView) this.view.findViewById(R.id.txt_player_bowler);
            this.txt_player_team_bowler = (TextView) this.view.findViewById(R.id.txt_player_team_bowler);
            this.img_player_topScorer = (ImageView) this.view.findViewById(R.id.img_player_topScorer);
            this.txt_number_topScorer = (TextView) this.view.findViewById(R.id.txt_number_topScorer);
            this.txt_player_topScorer = (TextView) this.view.findViewById(R.id.txt_player_topScorer);
            this.txt_player_team_topScorer = (TextView) this.view.findViewById(R.id.txt_player_team_topScorer);
            this.img_player_topTaker = (ImageView) this.view.findViewById(R.id.img_player_topTaker);
            this.txt_number_topTaker = (TextView) this.view.findViewById(R.id.txt_number_topTaker);
            this.txt_player_topTaker = (TextView) this.view.findViewById(R.id.txt_player_topTaker);
            this.txt_player_team_topTaker = (TextView) this.view.findViewById(R.id.txt_player_team_topTaker);
            this.view.findViewById(R.id.ll_most_runs).setOnClickListener(new StatsFragment$$ExternalSyntheticLambda5(this));
            this.view.findViewById(R.id.ll_most_wickets).setOnClickListener(new StatsFragment$$ExternalSyntheticLambda2(this));
            this.view.findViewById(R.id.ll_highest_score).setOnClickListener(new StatsFragment$$ExternalSyntheticLambda1(this));
            this.view.findViewById(R.id.ll_highest_wickets).setOnClickListener(new StatsFragment$$ExternalSyntheticLambda6(this));
            this.card_bat = (CardView) this.view.findViewById(R.id.card_bat);
            this.card_ball = (CardView) this.view.findViewById(R.id.card_ball);
            this.card_field = (CardView) this.view.findViewById(R.id.card_field);
            this.card_bat.setOnClickListener(new StatsFragment$$ExternalSyntheticLambda4(this));
            this.card_ball.setOnClickListener(new StatsFragment$$ExternalSyntheticLambda0(this));
            this.card_field.setOnClickListener(new StatsFragment$$ExternalSyntheticLambda3(this));
            new GraphqlApi(this.myActivity).getStatsResolver(this.seriesId, new Interface.GetStatsResolver() {

                @Override
                public void getResponse(GetStatsResolverQuery.GetStatsResolver getStatsResolver) {
                    StatsFragment.this.onGetStats(getStatsResolver);
                }
            });
        }
    }

    
  
    private void onGetStats(final GetStatsResolverQuery.GetStatsResolver getStatsResolver) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    GetStatsResolverQuery.GetStatsResolver getStatsResolver2 = getStatsResolver;
                    if (getStatsResolver2 == null || getStatsResolver2.t20() == null) {
                        StatsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                        StatsFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                        return;
                    }
                    if (getStatsResolver.t20().topGuns() != null) {
                        if (getStatsResolver.t20().topGuns().Most_Runs() != null) {
                            RequestManager with = Glide.with(StatsFragment.this.myActivity);
                            with.load(Glob.player_start + getStatsResolver.t20().topGuns().Most_Runs().player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(StatsFragment.this.img_player_batter);
                            StatsFragment.this.txt_number_batter.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Runs().runs_scored()));
                            StatsFragment.this.txt_player_batter.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Runs().player_name()));
                            StatsFragment.this.txt_player_team_batter.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Runs().team_short_name()));
                        }
                        if (getStatsResolver.t20().topGuns().Most_Wickets() != null) {
                            RequestManager with2 = Glide.with(StatsFragment.this.myActivity);
                            with2.load(Glob.player_start + getStatsResolver.t20().topGuns().Most_Wickets().player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(StatsFragment.this.img_player_bowler);
                            StatsFragment.this.txt_number_bowler.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Wickets().wickets()));
                            StatsFragment.this.txt_player_bowler.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Wickets().player_name()));
                            StatsFragment.this.txt_player_team_bowler.setText(Glob.getString(getStatsResolver.t20().topGuns().Most_Wickets().team_short_name()));
                        }
                        if (getStatsResolver.t20().topGuns().Highest_Score() != null) {
                            RequestManager with3 = Glide.with(StatsFragment.this.myActivity);
                            with3.load(Glob.player_start + getStatsResolver.t20().topGuns().Highest_Score().player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(StatsFragment.this.img_player_topScorer);
                            StatsFragment.this.txt_number_topScorer.setText(Glob.getString(getStatsResolver.t20().topGuns().Highest_Score().highest_score()));
                            StatsFragment.this.txt_player_topScorer.setText(Glob.getString(getStatsResolver.t20().topGuns().Highest_Score().player_name()));
                            StatsFragment.this.txt_player_team_topScorer.setText(Glob.getString(getStatsResolver.t20().topGuns().Highest_Score().team_short_name()));
                        }
                        if (getStatsResolver.t20().topGuns().Best_figures() != null) {
                            RequestManager with4 = Glide.with(StatsFragment.this.myActivity);
                            with4.load(Glob.player_start + getStatsResolver.t20().topGuns().Best_figures().player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(StatsFragment.this.img_player_topTaker);
                            StatsFragment.this.txt_number_topTaker.setText(Glob.getString(getStatsResolver.t20().topGuns().Best_figures().best_bowling_figures()));
                            StatsFragment.this.txt_player_topTaker.setText(Glob.getString(getStatsResolver.t20().topGuns().Best_figures().player_name()));
                            StatsFragment.this.txt_player_team_topTaker.setText(Glob.getString(getStatsResolver.t20().topGuns().Best_figures().team_short_name()));
                        }
                    } else {
                        StatsFragment.this.view.findViewById(R.id.card_top_gun).setVisibility(View.GONE);
                    }
                    if (getStatsResolver.t20().Batting() != null) {
                        Glob.battingStatsList = getStatsResolver.t20().Batting();
                    } else {
                        StatsFragment.this.card_bat.setVisibility(View.GONE);
                    }
                    if (getStatsResolver.t20().Bowling() != null) {
                        Glob.bowlingStatsList = getStatsResolver.t20().Bowling();
                    } else {
                        StatsFragment.this.card_ball.setVisibility(View.GONE);
                    }
                    if (getStatsResolver.t20().fielding() != null) {
                        Glob.fieldingStatsList = getStatsResolver.t20().fielding();
                    } else {
                        StatsFragment.this.card_field.setVisibility(View.GONE);
                    }
                    StatsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                    StatsFragment.this.view.findViewById(R.id.ll_stats).setVisibility(View.VISIBLE);
                }
            });
        }

    }

    
    public void onClickMostRun(View view2) {
        onShowInterstitialAd("onClickMostRun");
    }

    
    public void onClickMostWickets(View view2) {
        onShowInterstitialAd("onClickMostWickets");
    }

    
    public void onClickHighestScore(View view2) {
        onShowInterstitialAd("onClickHighestScore");
    }

    
    public void onClickHighestWickets(View view2) {
        onShowInterstitialAd("onClickHighestWickets");
    }

    
    public void onBatClick(View view2) {
        onShowInterstitialAd("onBatClick");
    }

    
    public void onBallClick(View view2) {
        onShowInterstitialAd("onBallClick");
    }

    
    public void onFieldClick(View view2) {
        onShowInterstitialAd("onFieldClick");
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
            case -531019553:
                if (str.equals("onClickMostRun")) {
                    c = 0;
                    break;
                }
                break;
            case -403628051:
                if (str.equals("onFieldClick")) {
                    c = 1;
                    break;
                }
                break;
            case 39316734:
                if (str.equals("onClickMostWickets")) {
                    c = 2;
                    break;
                }
                break;
            case 422100439:
                if (str.equals("onClickHighestScore")) {
                    c = 3;
                    break;
                }
                break;
            case 704508842:
                if (str.equals("onBallClick")) {
                    c = 4;
                    break;
                }
                break;
            case 1046397298:
                if (str.equals("onBatClick")) {
                    c = 5;
                    break;
                }
                break;
            case 1327131311:
                if (str.equals("onClickHighestWickets")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this.myActivity, BattingActivity.class);
                intent.putExtra("statsType", "mostRuns");
                startActivity(intent);
                return;
            case 1:
                startActivity(new Intent(this.myActivity, FieldingStatsActivity.class));
                return;
            case 2:
                Intent intent2 = new Intent(this.myActivity, BowlingActivity.class);
                intent2.putExtra("statsType", "mostWickets");
                startActivity(intent2);
                return;
            case 3:
                Intent intent3 = new Intent(this.myActivity, BattingActivity.class);
                intent3.putExtra("statsType", "highestScore");
                startActivity(intent3);
                return;
            case 4:
                startActivity(new Intent(this.myActivity, BowlingStatsActivity.class));
                return;
            case 5:
                startActivity(new Intent(this.myActivity, BattingStatsActivity.class));
                return;
            case 6:
                Intent intent4 = new Intent(this.myActivity, BowlingActivity.class);
                intent4.putExtra("statsType", "bestFigure");
                startActivity(intent4);
                return;
            default:
                return;
        }
    }

}
