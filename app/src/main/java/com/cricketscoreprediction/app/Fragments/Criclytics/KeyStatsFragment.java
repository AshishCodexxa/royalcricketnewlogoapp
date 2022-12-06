package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.CustomProgressBar;
import com.cricketscoreprediction.app.GetKeyStatsQuery;
import com.cricketscoreprediction.app.Models.ProgressItem;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;

public class KeyStatsFragment extends Fragment {
    private static final String LOG = "<<<KeyStatsFragment>>>";
    String currentInnings;
    private CustomProgressBar customProgressBar;
    ImageView img_info;
    ImageView img_team1_top_scorer;
    ImageView img_team1_top_taker;
    ImageView img_team2_top_scorer;
    ImageView img_team2_top_taker;
    private ProgressItem mProgressItem;
    String matchId;
    String matchType;
    Activity myActivity;
    private ArrayList<ProgressItem> progressItemList;
    RelativeLayout rl_info;
    TextView txt_1st_batting_avg;
    TextView txt_1st_batting_win;
    TextView txt_draw;
    TextView txt_highest_score_chased;
    TextView txt_last;
    TextView txt_pace;
    TextView txt_spin;
    TextView txt_stadium;
    TextView txt_team1_scorer;
    TextView txt_team1_taker;
    TextView txt_team1_top_scorer;
    TextView txt_team1_top_scorer_avg;
    TextView txt_team1_top_scorer_run;
    TextView txt_team1_top_taker;
    TextView txt_team1_top_taker_avg;
    TextView txt_team1_top_taker_wicket;
    TextView txt_team2_scorer;
    TextView txt_team2_taker;
    TextView txt_team2_top_scorer;
    TextView txt_team2_top_scorer_avg;
    TextView txt_team2_top_scorer_run;
    TextView txt_team2_top_taker;
    TextView txt_team2_top_taker_avg;
    TextView txt_team2_top_taker_wicket;
    TextView txt_teamA;
    TextView txt_teamA_win;
    TextView txt_teamB;
    TextView txt_teamB_win;
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
        this.view = layoutInflater.inflate(R.layout.fragment_key_stats, viewGroup, false);
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
                    KeyStatsFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            KeyStatsFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            this.txt_last = (TextView) this.view.findViewById(R.id.txt_last);
            this.txt_teamA_win = (TextView) this.view.findViewById(R.id.txt_teamA_win);
            this.txt_teamB_win = (TextView) this.view.findViewById(R.id.txt_teamB_win);
            this.txt_draw = (TextView) this.view.findViewById(R.id.txt_draw);
            this.txt_teamA = (TextView) this.view.findViewById(R.id.txt_teamA);
            this.txt_teamB = (TextView) this.view.findViewById(R.id.txt_teamB);
            this.txt_stadium = (TextView) this.view.findViewById(R.id.txt_stadium);
            this.txt_1st_batting_avg = (TextView) this.view.findViewById(R.id.txt_1st_batting_avg);
            this.txt_1st_batting_win = (TextView) this.view.findViewById(R.id.txt_1st_batting_win);
            this.txt_highest_score_chased = (TextView) this.view.findViewById(R.id.txt_highest_score_chased);
            this.txt_pace = (TextView) this.view.findViewById(R.id.txt_pace);
            this.txt_spin = (TextView) this.view.findViewById(R.id.txt_spin);
            this.txt_team1_scorer = (TextView) this.view.findViewById(R.id.txt_team1_scorer);
            this.txt_team2_scorer = (TextView) this.view.findViewById(R.id.txt_team2_scorer);
            this.txt_team1_top_scorer = (TextView) this.view.findViewById(R.id.txt_team1_top_scorer);
            this.txt_team2_top_scorer = (TextView) this.view.findViewById(R.id.txt_team2_top_scorer);
            this.txt_team1_top_scorer_run = (TextView) this.view.findViewById(R.id.txt_team1_top_scorer_run);
            this.txt_team2_top_scorer_run = (TextView) this.view.findViewById(R.id.txt_team2_top_scorer_run);
            this.txt_team1_top_scorer_avg = (TextView) this.view.findViewById(R.id.txt_team1_top_scorer_avg);
            this.txt_team2_top_scorer_avg = (TextView) this.view.findViewById(R.id.txt_team2_top_scorer_avg);
            this.img_team1_top_scorer = (ImageView) this.view.findViewById(R.id.img_team1_top_scorer);
            this.img_team2_top_scorer = (ImageView) this.view.findViewById(R.id.img_team2_top_scorer);
            this.txt_team1_taker = (TextView) this.view.findViewById(R.id.txt_team1_taker);
            this.txt_team2_taker = (TextView) this.view.findViewById(R.id.txt_team2_taker);
            this.txt_team1_top_taker = (TextView) this.view.findViewById(R.id.txt_team1_top_taker);
            this.txt_team2_top_taker = (TextView) this.view.findViewById(R.id.txt_team2_top_taker);
            this.txt_team1_top_taker_wicket = (TextView) this.view.findViewById(R.id.txt_team1_top_taker_wicket);
            this.txt_team2_top_taker_wicket = (TextView) this.view.findViewById(R.id.txt_team2_top_taker_wicket);
            this.txt_team1_top_taker_avg = (TextView) this.view.findViewById(R.id.txt_team1_top_taker_avg);
            this.txt_team2_top_taker_avg = (TextView) this.view.findViewById(R.id.txt_team2_top_taker_avg);
            this.img_team1_top_taker = (ImageView) this.view.findViewById(R.id.img_team1_top_taker);
            this.img_team2_top_taker = (ImageView) this.view.findViewById(R.id.img_team2_top_taker);
            CustomProgressBar customProgressBar2 = (CustomProgressBar) this.view.findViewById(R.id.customProgressBar);
            this.customProgressBar = customProgressBar2;
            customProgressBar2.getThumb().mutate().setAlpha(0);
            this.progressItemList = new ArrayList<>();
            ProgressItem progressItem = new ProgressItem();
            this.mProgressItem = progressItem;
            progressItem.progressItemPercentage = 100.0f;
            this.mProgressItem.color = R.color.gray_ad_border;
            this.progressItemList.add(this.mProgressItem);
            this.customProgressBar.initData(this.progressItemList);
            this.customProgressBar.invalidate();
            new GraphqlApi(this.myActivity).getKeyStates(this.matchId, new Interface.GetKeyStats() {


                @Override
                public void getResponse(GetKeyStatsQuery.GetKeyStats getKeyStats) {
                    KeyStatsFragment.this.getKeyStates(getKeyStats);
                }
            });
        }
    }

    
  
    private void getKeyStates(final GetKeyStatsQuery.GetKeyStats getKeyStats) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override 
                public void run() {
                    GetKeyStatsQuery.GetKeyStats getKeyStats2 = getKeyStats;
                    if (getKeyStats2 != null) {
                        if (getKeyStats2.head2headStats() != null) {
                            Integer num = getKeyStats.head2headStats().head2Head().totalMatches();
                            if (num == null || num.intValue() == 0) {
                                KeyStatsFragment.this.view.findViewById(R.id.ll_headToHead).setVisibility(View.GONE);
                            } else {
                                KeyStatsFragment.this.txt_last.setText(String.format("%s %s %s", "*last", num, "matches"));
                                int intValue = getKeyStats.head2headStats().head2Head().teamA().intValue();
                                int intValue2 = getKeyStats.head2headStats().head2Head().teamB().intValue();
                                int intValue3 = getKeyStats.head2headStats().head2Head().noResult().intValue();
                                TextView textView = KeyStatsFragment.this.txt_teamA_win;
                                textView.setText(Glob.getString(intValue + ""));
                                TextView textView2 = KeyStatsFragment.this.txt_teamB_win;
                                textView2.setText(Glob.getString(intValue2 + ""));
                                TextView textView3 = KeyStatsFragment.this.txt_draw;
                                textView3.setText(Glob.getString(intValue3 + ""));
                                KeyStatsFragment.this.txt_teamA.setText(getKeyStats.head2headStats().teamA().teamShortName());
                                KeyStatsFragment.this.txt_teamB.setText(getKeyStats.head2headStats().teamB().teamShortName());
                                KeyStatsFragment.this.initDataToSeekbar((intValue * 100) / num.intValue(), (intValue2 * 100) / num.intValue(), (intValue3 * 100) / num.intValue());
                            }
                            if (getKeyStats.head2headStats().venueStatsData() == null || getKeyStats.head2headStats().venueStatsData().avgFirstInningScore() == null) {
                                KeyStatsFragment.this.view.findViewById(R.id.ll_stadium).setVisibility(View.GONE);
                            } else {
                                KeyStatsFragment.this.txt_stadium.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().venueName()));
                                KeyStatsFragment.this.txt_1st_batting_avg.setTypeface(Glob.oswald_medium);
                                KeyStatsFragment.this.txt_1st_batting_avg.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().avgFirstInningScore()));
                                KeyStatsFragment.this.txt_1st_batting_win.setTypeface(Glob.oswald_medium);
                                TextView textView4 = KeyStatsFragment.this.txt_1st_batting_win;
                                StringBuilder sb = new StringBuilder();
                                sb.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().firstBattingWinPercent() + ""));
                                sb.append("%");
                                textView4.setText(sb.toString());
                                KeyStatsFragment.this.txt_highest_score_chased.setTypeface(Glob.oswald_medium);
                                KeyStatsFragment.this.txt_highest_score_chased.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().highestScoreChased()));
                                KeyStatsFragment.this.txt_pace.setTypeface(Glob.oswald_medium);
                                TextView textView5 = KeyStatsFragment.this.txt_pace;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().paceWicketPercent() + ""));
                                sb2.append("%");
                                textView5.setText(sb2.toString());
                                KeyStatsFragment.this.txt_spin.setTypeface(Glob.oswald_medium);
                                TextView textView6 = KeyStatsFragment.this.txt_spin;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().spinWicketPercent() + ""));
                                sb3.append("%");
                                textView6.setText(sb3.toString());
                            }
                        } else {
                            KeyStatsFragment.this.view.findViewById(R.id.ll_stadium).setVisibility(View.GONE);
                            KeyStatsFragment.this.view.findViewById(R.id.ll_headToHead).setVisibility(View.GONE);
                        }
                        if (getKeyStats.topRunScorer1() == null || getKeyStats.topRunScorer1().fullName() == null || getKeyStats.topRunScorer2() == null || getKeyStats.topRunScorer2().fullName() == null) {
                            KeyStatsFragment.this.view.findViewById(R.id.ll_top_run).setVisibility(View.GONE);
                        } else {
                            KeyStatsFragment.this.txt_team1_scorer.setText(getKeyStats.topRunScorer1().fullName());
                            KeyStatsFragment.this.txt_team1_top_scorer.setText(getKeyStats.topRunScorer1().playerName());
                            KeyStatsFragment.this.txt_team1_top_scorer_run.setTypeface(Glob.oswald_medium);
                            KeyStatsFragment.this.txt_team1_top_scorer_avg.setTypeface(Glob.oswald_medium);
                            TextView textView7 = KeyStatsFragment.this.txt_team1_top_scorer_run;
                            textView7.setText(getKeyStats.topRunScorer1().playerRuns() + "");
                            TextView textView8 = KeyStatsFragment.this.txt_team1_top_scorer_avg;
                            textView8.setText(getKeyStats.topRunScorer1().average() + "");
                            RequestManager with = Glide.with(KeyStatsFragment.this.myActivity);
                            with.load(Glob.player_start + getKeyStats.topRunScorer1().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(KeyStatsFragment.this.img_team1_top_scorer);
                            KeyStatsFragment.this.txt_team2_scorer.setText(getKeyStats.topRunScorer2().fullName());
                            KeyStatsFragment.this.txt_team2_top_scorer.setText(getKeyStats.topRunScorer2().playerName());
                            KeyStatsFragment.this.txt_team2_top_scorer_run.setTypeface(Glob.oswald_medium);
                            KeyStatsFragment.this.txt_team2_top_scorer_avg.setTypeface(Glob.oswald_medium);
                            TextView textView9 = KeyStatsFragment.this.txt_team2_top_scorer_run;
                            textView9.setText(getKeyStats.topRunScorer2().playerRuns() + "");
                            TextView textView10 = KeyStatsFragment.this.txt_team2_top_scorer_avg;
                            textView10.setText(getKeyStats.topRunScorer2().average() + "");
                            RequestManager with2 = Glide.with(KeyStatsFragment.this.myActivity);
                            with2.load(Glob.player_start + getKeyStats.topRunScorer2().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(KeyStatsFragment.this.img_team2_top_scorer);
                        }
                        if (getKeyStats.topWicketTaker1() == null || getKeyStats.topWicketTaker1().fullName() == null || getKeyStats.topWicketTaker2() == null || getKeyStats.topWicketTaker2().fullName() == null) {
                            ((LinearLayout) KeyStatsFragment.this.view.findViewById(R.id.ll_top_wicket)).setVisibility(View.GONE);
                        } else {
                            KeyStatsFragment.this.txt_team1_taker.setText(getKeyStats.topWicketTaker1().fullName());
                            KeyStatsFragment.this.txt_team1_top_taker.setText(getKeyStats.topWicketTaker1().playerName());
                            KeyStatsFragment.this.txt_team1_top_taker_wicket.setTypeface(Glob.oswald_medium);
                            KeyStatsFragment.this.txt_team1_top_taker_avg.setTypeface(Glob.oswald_medium);
                            TextView textView11 = KeyStatsFragment.this.txt_team1_top_taker_wicket;
                            textView11.setText(getKeyStats.topWicketTaker1().totalWickets() + "");
                            TextView textView12 = KeyStatsFragment.this.txt_team1_top_taker_avg;
                            textView12.setText(getKeyStats.topWicketTaker1().average() + "");
                            RequestManager with3 = Glide.with(KeyStatsFragment.this.myActivity);
                            with3.load(Glob.player_start + getKeyStats.topWicketTaker1().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(KeyStatsFragment.this.img_team1_top_taker);
                            KeyStatsFragment.this.txt_team2_taker.setText(getKeyStats.topWicketTaker2().fullName());
                            KeyStatsFragment.this.txt_team2_top_taker.setText(getKeyStats.topWicketTaker2().playerName());
                            KeyStatsFragment.this.txt_team2_top_taker_wicket.setTypeface(Glob.oswald_medium);
                            KeyStatsFragment.this.txt_team2_top_taker_avg.setTypeface(Glob.oswald_medium);
                            TextView textView13 = KeyStatsFragment.this.txt_team2_top_taker_wicket;
                            textView13.setText(getKeyStats.topWicketTaker2().totalWickets() + "");
                            TextView textView14 = KeyStatsFragment.this.txt_team2_top_taker_avg;
                            textView14.setText(getKeyStats.topWicketTaker2().average() + "");
                            RequestManager with4 = Glide.with(KeyStatsFragment.this.myActivity);
                            with4.load(Glob.player_start + getKeyStats.topWicketTaker2().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy).error(R.drawable.player_dummy).into(KeyStatsFragment.this.img_team2_top_taker);
                        }
//                        KeyStatsFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.VISIBLE);
//                        KeyStatsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                        return;
                    }
                    KeyStatsFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.GONE);
                    KeyStatsFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                    KeyStatsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                }
            });
        }

    }

    
  
    private void initDataToSeekbar(int i, int i2, int i3) {
        this.progressItemList = new ArrayList<>();
        ProgressItem progressItem = new ProgressItem();
        this.mProgressItem = progressItem;
        progressItem.progressItemPercentage = (float) i;
        this.mProgressItem.color = R.color.green;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem2 = new ProgressItem();
        this.mProgressItem = progressItem2;
        progressItem2.progressItemPercentage = (float) i2;
        this.mProgressItem.color = R.color.orangeLight;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem3 = new ProgressItem();
        this.mProgressItem = progressItem3;
        progressItem3.progressItemPercentage = (float) i3;
        this.mProgressItem.color = R.color.gray_ad_border;
        this.progressItemList.add(this.mProgressItem);
        this.customProgressBar.initData(this.progressItemList);
        this.customProgressBar.invalidate();
    }


    @Override 
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
    }
}
