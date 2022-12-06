package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
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

import com.cricketscoreprediction.app.GetmatchStatsQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.List;

public class MatchStatesFragment extends Fragment {
    private static final String LOG = "<<<MatchStatesFragment>>>";
    String currentInnings;
    ImageView img_flag_1;
    ImageView img_flag_2;
    ImageView img_info;
    String matchId;
    String matchType;
    Activity myActivity;
    ProgressBar progressBar_a_4s;
    ProgressBar progressBar_a_6s;
    ProgressBar progressBar_a_bestBowling;
    ProgressBar progressBar_a_dotBall;
    ProgressBar progressBar_a_extra;
    ProgressBar progressBar_a_highPartner;
    ProgressBar progressBar_a_highScore;
    ProgressBar progressBar_a_runBoundaries;
    ProgressBar progressBar_a_runRate;
    ProgressBar progressBar_a_runRateDeath;
    ProgressBar progressBar_a_runRateMid;
    ProgressBar progressBar_a_runRatePowerPlay;
    ProgressBar progressBar_h_4s;
    ProgressBar progressBar_h_6s;
    ProgressBar progressBar_h_bestBowling;
    ProgressBar progressBar_h_dotBall;
    ProgressBar progressBar_h_extra;
    ProgressBar progressBar_h_highPartner;
    ProgressBar progressBar_h_highScore;
    ProgressBar progressBar_h_runBoundaries;
    ProgressBar progressBar_h_runRate;
    ProgressBar progressBar_h_runRateDeath;
    ProgressBar progressBar_h_runRateMid;
    ProgressBar progressBar_h_runRatePowerPlay;
    RelativeLayout rl_info;
    RelativeLayout rl_runRateDeath;
    RelativeLayout rl_runRateMid;
    RelativeLayout rl_runRatePowerPlay;
    TextView txt_a_4s;
    TextView txt_a_6s;
    TextView txt_a_bestBowling;
    TextView txt_a_dotBall;
    TextView txt_a_extra;
    TextView txt_a_highPartner;
    TextView txt_a_highScore;
    TextView txt_a_runBoundaries;
    TextView txt_a_runRate;
    TextView txt_a_runRateDeath;
    TextView txt_a_runRateMid;
    TextView txt_a_runRatePowerPlay;
    TextView txt_h_4s;
    TextView txt_h_6s;
    TextView txt_h_bestBowling;
    TextView txt_h_dotBall;
    TextView txt_h_extra;
    TextView txt_h_highPartner;
    TextView txt_h_highScore;
    TextView txt_h_runBoundaries;
    TextView txt_h_runRate;
    TextView txt_h_runRateDeath;
    TextView txt_h_runRateMid;
    TextView txt_h_runRatePowerPlay;
    TextView txt_team1;
    TextView txt_team2;
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
        this.view = layoutInflater.inflate(R.layout.fragment_match_states, viewGroup, false);
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType + " : ");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {
             

                public void onClick(View view) {
                    MatchStatesFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {
                  

                        public void run() {
                            MatchStatesFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            this.img_flag_1 = (ImageView) this.view.findViewById(R.id.img_flag_1);
            this.img_flag_2 = (ImageView) this.view.findViewById(R.id.img_flag_2);
            this.txt_team1 = (TextView) this.view.findViewById(R.id.txt_team1);
            this.txt_team2 = (TextView) this.view.findViewById(R.id.txt_team2);
            this.txt_h_highScore = (TextView) this.view.findViewById(R.id.txt_h_highScore);
            this.txt_a_highScore = (TextView) this.view.findViewById(R.id.txt_a_highScore);
            this.progressBar_h_highScore = (ProgressBar) this.view.findViewById(R.id.progressBar_h_highScore);
            this.progressBar_a_highScore = (ProgressBar) this.view.findViewById(R.id.progressBar_a_highScore);
            this.txt_h_highPartner = (TextView) this.view.findViewById(R.id.txt_h_highPartner);
            this.txt_a_highPartner = (TextView) this.view.findViewById(R.id.txt_a_highPartner);
            this.progressBar_h_highPartner = (ProgressBar) this.view.findViewById(R.id.progressBar_h_highPartner);
            this.progressBar_a_highPartner = (ProgressBar) this.view.findViewById(R.id.progressBar_a_highPartner);
            this.txt_h_4s = (TextView) this.view.findViewById(R.id.txt_h_4s);
            this.txt_a_4s = (TextView) this.view.findViewById(R.id.txt_a_4s);
            this.progressBar_h_4s = (ProgressBar) this.view.findViewById(R.id.progressBar_h_4s);
            this.progressBar_a_4s = (ProgressBar) this.view.findViewById(R.id.progressBar_a_4s);
            this.txt_h_6s = (TextView) this.view.findViewById(R.id.txt_h_6s);
            this.txt_a_6s = (TextView) this.view.findViewById(R.id.txt_a_6s);
            this.progressBar_h_6s = (ProgressBar) this.view.findViewById(R.id.progressBar_h_6s);
            this.progressBar_a_6s = (ProgressBar) this.view.findViewById(R.id.progressBar_a_6s);
            this.txt_h_runBoundaries = (TextView) this.view.findViewById(R.id.txt_h_runBoundaries);
            this.txt_a_runBoundaries = (TextView) this.view.findViewById(R.id.txt_a_runBoundaries);
            this.progressBar_h_runBoundaries = (ProgressBar) this.view.findViewById(R.id.progressBar_h_runBoundaries);
            this.progressBar_a_runBoundaries = (ProgressBar) this.view.findViewById(R.id.progressBar_a_runBoundaries);
            this.txt_h_dotBall = (TextView) this.view.findViewById(R.id.txt_h_dotBall);
            this.txt_a_dotBall = (TextView) this.view.findViewById(R.id.txt_a_dotBall);
            this.progressBar_h_dotBall = (ProgressBar) this.view.findViewById(R.id.progressBar_h_dotBall);
            this.progressBar_a_dotBall = (ProgressBar) this.view.findViewById(R.id.progressBar_a_dotBall);
            this.txt_h_bestBowling = (TextView) this.view.findViewById(R.id.txt_h_bestBowling);
            this.txt_a_bestBowling = (TextView) this.view.findViewById(R.id.txt_a_bestBowling);
            this.progressBar_h_bestBowling = (ProgressBar) this.view.findViewById(R.id.progressBar_h_bestBowling);
            this.progressBar_a_bestBowling = (ProgressBar) this.view.findViewById(R.id.progressBar_a_bestBowling);
            this.txt_h_extra = (TextView) this.view.findViewById(R.id.txt_h_extra);
            this.txt_a_extra = (TextView) this.view.findViewById(R.id.txt_a_extra);
            this.progressBar_h_extra = (ProgressBar) this.view.findViewById(R.id.progressBar_h_extra);
            this.progressBar_a_extra = (ProgressBar) this.view.findViewById(R.id.progressBar_a_extra);
            this.txt_h_runRate = (TextView) this.view.findViewById(R.id.txt_h_runRate);
            this.txt_a_runRate = (TextView) this.view.findViewById(R.id.txt_a_runRate);
            this.progressBar_h_runRate = (ProgressBar) this.view.findViewById(R.id.progressBar_h_runRate);
            this.progressBar_a_runRate = (ProgressBar) this.view.findViewById(R.id.progressBar_a_runRate);
            this.txt_h_runRatePowerPlay = (TextView) this.view.findViewById(R.id.txt_h_runRatePowerPlay);
            this.txt_a_runRatePowerPlay = (TextView) this.view.findViewById(R.id.txt_a_runRatePowerPlay);
            this.progressBar_h_runRatePowerPlay = (ProgressBar) this.view.findViewById(R.id.progressBar_h_runRatePowerPlay);
            this.progressBar_a_runRatePowerPlay = (ProgressBar) this.view.findViewById(R.id.progressBar_a_runRatePowerPlay);
            this.txt_h_runRateMid = (TextView) this.view.findViewById(R.id.txt_h_runRateMid);
            this.txt_a_runRateMid = (TextView) this.view.findViewById(R.id.txt_a_runRateMid);
            this.progressBar_h_runRateMid = (ProgressBar) this.view.findViewById(R.id.progressBar_h_runRateMid);
            this.progressBar_a_runRateMid = (ProgressBar) this.view.findViewById(R.id.progressBar_a_runRateMid);
            this.txt_h_runRateDeath = (TextView) this.view.findViewById(R.id.txt_h_runRateDeath);
            this.txt_a_runRateDeath = (TextView) this.view.findViewById(R.id.txt_a_runRateDeath);
            this.progressBar_h_runRateDeath = (ProgressBar) this.view.findViewById(R.id.progressBar_h_runRateDeath);
            this.progressBar_a_runRateDeath = (ProgressBar) this.view.findViewById(R.id.progressBar_a_runRateDeath);
            new GraphqlApi(this.myActivity).getMatchStats(this.matchId, new Interface.GetmatchStats() {
             

                @Override 
                public void getResponse(GetmatchStatsQuery.GetmatchStats getmatchStats) {
                    MatchStatesFragment.this.getMatchStates(getmatchStats);
                }
            });
        }
    }

    
  
    private void getMatchStates(final GetmatchStatsQuery.GetmatchStats getmatchStats) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
               

                public void run() {
                    if (getmatchStats.matchStatsArray() != null) {
                        Glob.log(MatchStatesFragment.LOG, getmatchStats + "");
                        GetmatchStatsQuery.MatchStatsArray matchStatsArray = MatchStatesFragment.this.getMatchStatsArray(getmatchStats.matchStatsArray(), getmatchStats.homeTeamID());
                        RequestManager with = Glide.with(MatchStatesFragment.this.myActivity);
                        ((RequestBuilder) with.load(Glob.flag_start + matchStatsArray.teamId() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchStatesFragment.this.img_flag_1);
                        MatchStatesFragment.this.txt_team1.setText(MatchStatesFragment.this.isString(matchStatsArray.shortName()));
                        GetmatchStatsQuery.MatchStatsArray matchStatsArray2 = MatchStatesFragment.this.getMatchStatsArray(getmatchStats.matchStatsArray(), getmatchStats.awayTeamID());
                        RequestManager with2 = Glide.with(MatchStatesFragment.this.myActivity);
                        ((RequestBuilder) with2.load(Glob.flag_start + matchStatsArray2.teamId() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchStatesFragment.this.img_flag_2);
                        MatchStatesFragment.this.txt_team2.setText(MatchStatesFragment.this.isString(matchStatsArray2.shortName()));
                        MatchStatesFragment.this.txt_h_highScore.setText(MatchStatesFragment.this.isString(matchStatsArray.highestBattingScore().value()));
                        MatchStatesFragment.this.txt_a_highScore.setText(MatchStatesFragment.this.isString(matchStatsArray2.highestBattingScore().value()));
                        MatchStatesFragment.this.progressBar_h_highScore.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.highestBattingScore().percent()));
                        MatchStatesFragment.this.progressBar_a_highScore.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.highestBattingScore().percent()));
                        MatchStatesFragment.this.txt_h_highPartner.setText(MatchStatesFragment.this.isString(matchStatsArray.highestPartnership().value()));
                        MatchStatesFragment.this.txt_a_highPartner.setText(MatchStatesFragment.this.isString(matchStatsArray2.highestPartnership().value()));
                        MatchStatesFragment.this.progressBar_h_highPartner.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.highestPartnership().percent()));
                        MatchStatesFragment.this.progressBar_a_highPartner.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.highestPartnership().percent()));
                        MatchStatesFragment.this.txt_h_4s.setText(MatchStatesFragment.this.isString(matchStatsArray.totalFours().value()));
                        MatchStatesFragment.this.txt_a_4s.setText(MatchStatesFragment.this.isString(matchStatsArray2.totalFours().value()));
                        MatchStatesFragment.this.progressBar_h_4s.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.totalFours().percent()));
                        MatchStatesFragment.this.progressBar_a_4s.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.totalFours().percent()));
                        MatchStatesFragment.this.txt_h_6s.setText(MatchStatesFragment.this.isString(matchStatsArray.totalSix().value()));
                        MatchStatesFragment.this.txt_a_6s.setText(MatchStatesFragment.this.isString(matchStatsArray2.totalSix().value()));
                        MatchStatesFragment.this.progressBar_h_6s.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.totalSix().percent()));
                        MatchStatesFragment.this.progressBar_a_6s.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.totalSix().percent()));
                        MatchStatesFragment.this.txt_h_runBoundaries.setText(MatchStatesFragment.this.isString(matchStatsArray.runsScoredInBoundaries().value()));
                        MatchStatesFragment.this.txt_a_runBoundaries.setText(MatchStatesFragment.this.isString(matchStatsArray2.runsScoredInBoundaries().value()));
                        MatchStatesFragment.this.progressBar_h_runBoundaries.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runsScoredInBoundaries().percent()));
                        MatchStatesFragment.this.progressBar_a_runBoundaries.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runsScoredInBoundaries().percent()));
                        MatchStatesFragment.this.txt_h_dotBall.setText(MatchStatesFragment.this.isString(matchStatsArray.totalDotBalls().value()));
                        MatchStatesFragment.this.txt_a_dotBall.setText(MatchStatesFragment.this.isString(matchStatsArray2.totalDotBalls().value()));
                        MatchStatesFragment.this.progressBar_h_dotBall.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.totalDotBalls().percent()));
                        MatchStatesFragment.this.progressBar_a_dotBall.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.totalDotBalls().percent()));
                        MatchStatesFragment.this.txt_h_bestBowling.setText(MatchStatesFragment.this.isString(matchStatsArray.highestWickets().value()));
                        MatchStatesFragment.this.txt_a_bestBowling.setText(MatchStatesFragment.this.isString(matchStatsArray2.highestWickets().value()));
                        MatchStatesFragment.this.progressBar_h_bestBowling.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.highestWickets().percent()));
                        MatchStatesFragment.this.progressBar_a_bestBowling.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.highestWickets().percent()));
                        MatchStatesFragment.this.txt_h_extra.setText(MatchStatesFragment.this.isString(matchStatsArray.extras().value()));
                        MatchStatesFragment.this.txt_a_extra.setText(MatchStatesFragment.this.isString(matchStatsArray2.extras().value()));
                        MatchStatesFragment.this.progressBar_h_extra.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.extras().percent()));
                        MatchStatesFragment.this.progressBar_a_extra.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.extras().percent()));
                        MatchStatesFragment.this.txt_h_runRate.setText(MatchStatesFragment.this.isString(matchStatsArray.runRate().value()));
                        MatchStatesFragment.this.txt_a_runRate.setText(MatchStatesFragment.this.isString(matchStatsArray2.runRate().value()));
                        MatchStatesFragment.this.progressBar_h_runRate.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runRate().percent()));
                        MatchStatesFragment.this.progressBar_a_runRate.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runRate().percent()));
                        if (MatchStatesFragment.this.matchType.equals("T20")) {
                            if (!Glob.isNull(matchStatsArray.runRateInPowerplay1_6() + "")) {
                                MatchStatesFragment.this.txt_h_runRatePowerPlay.setText(MatchStatesFragment.this.isString(matchStatsArray.runRateInPowerplay1_6().value()));
                                MatchStatesFragment.this.txt_a_runRatePowerPlay.setText(MatchStatesFragment.this.isString(matchStatsArray2.runRateInPowerplay1_6().value()));
                                MatchStatesFragment.this.progressBar_h_runRatePowerPlay.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runRateInPowerplay1_6().percent()));
                                MatchStatesFragment.this.progressBar_a_runRatePowerPlay.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runRateInPowerplay1_6().percent()));
                            } else {
                                MatchStatesFragment matchStatesFragment = MatchStatesFragment.this;
                                matchStatesFragment.rl_runRatePowerPlay = (RelativeLayout) matchStatesFragment.view.findViewById(R.id.rl_runRatePowerPlay);
                                MatchStatesFragment.this.rl_runRatePowerPlay.setVisibility(View.GONE);
                            }
                        }
                        if (MatchStatesFragment.this.matchType.equals("ODI")) {
                            if (!Glob.isNull(matchStatsArray.runRateInPowerplay1_10() + "")) {
                                MatchStatesFragment.this.txt_h_runRatePowerPlay.setText(MatchStatesFragment.this.isString(matchStatsArray.runRateInPowerplay1_10().value()));
                                MatchStatesFragment.this.txt_a_runRatePowerPlay.setText(MatchStatesFragment.this.isString(matchStatsArray2.runRateInPowerplay1_10().value()));
                                MatchStatesFragment.this.progressBar_h_runRatePowerPlay.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runRateInPowerplay1_10().percent()));
                                MatchStatesFragment.this.progressBar_a_runRatePowerPlay.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runRateInPowerplay1_10().percent()));
                            } else {
                                MatchStatesFragment matchStatesFragment2 = MatchStatesFragment.this;
                                matchStatesFragment2.rl_runRatePowerPlay = (RelativeLayout) matchStatesFragment2.view.findViewById(R.id.rl_runRatePowerPlay);
                                MatchStatesFragment.this.rl_runRatePowerPlay.setVisibility(View.GONE);
                            }
                        }
                        if (!Glob.isNull(matchStatsArray.runRateInPowerplay11_40() + "")) {
                            MatchStatesFragment.this.txt_h_runRateMid.setText(MatchStatesFragment.this.isString(matchStatsArray.runRateInPowerplay11_40().value()));
                            MatchStatesFragment.this.txt_a_runRateMid.setText(MatchStatesFragment.this.isString(matchStatsArray2.runRateInPowerplay11_40().value()));
                            MatchStatesFragment.this.progressBar_h_runRateMid.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runRateInPowerplay11_40().percent()));
                            MatchStatesFragment.this.progressBar_a_runRateMid.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runRateInPowerplay11_40().percent()));
                        } else {
                            MatchStatesFragment matchStatesFragment3 = MatchStatesFragment.this;
                            matchStatesFragment3.rl_runRateMid = (RelativeLayout) matchStatesFragment3.view.findViewById(R.id.rl_runRateMid);
                            MatchStatesFragment.this.rl_runRateMid.setVisibility(View.GONE);
                        }
                        if (!Glob.isNull(matchStatsArray.runRateDeathOver() + "")) {
                            MatchStatesFragment.this.txt_h_runRateDeath.setText(MatchStatesFragment.this.isString(matchStatsArray.runRateDeathOver().value()));
                            MatchStatesFragment.this.txt_a_runRateDeath.setText(MatchStatesFragment.this.isString(matchStatsArray2.runRateDeathOver().value()));
                            MatchStatesFragment.this.progressBar_h_runRateDeath.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray.runRateDeathOver().percent()));
                            MatchStatesFragment.this.progressBar_a_runRateDeath.setProgress((int) MatchStatesFragment.this.isInt(matchStatsArray2.runRateDeathOver().percent()));
                        } else {
                            MatchStatesFragment matchStatesFragment4 = MatchStatesFragment.this;
                            matchStatesFragment4.rl_runRateDeath = (RelativeLayout) matchStatesFragment4.view.findViewById(R.id.rl_runRateDeath);
                            MatchStatesFragment.this.rl_runRateDeath.setVisibility(View.GONE);
                        }
                        MatchStatesFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.VISIBLE);;
                        MatchStatesFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                        return;
                    }
                    MatchStatesFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.GONE);
                    MatchStatesFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                    MatchStatesFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                }
            });
        }
    }

    public GetmatchStatsQuery.MatchStatsArray getMatchStatsArray(List<GetmatchStatsQuery.MatchStatsArray> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).teamId().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    public String isString(String str) {
        return (str == null || str.equals("")) ? "" : str;
    }

    public double isInt(Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }


    @Override 
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
    }
}
