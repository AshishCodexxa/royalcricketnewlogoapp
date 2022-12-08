package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentSummaryBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgFlag;
    public final ImageView imgFlagAway;
    public final ImageView imgFlagBowler;
    public final ImageView imgFlagHome;
    public final ImageView imgPlayer;
    public final ImageView imgPlayerBowler;
    public final LinearLayout llNoData;
    public final LinearLayout llScoreAway;
    public final LinearLayout llScoreHome;
    public final LinearLayout llSummary;
    public final ProgressBar progressScorecard;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final TextView txt4s;
    public final TextView txt6s;
    public final TextView txtBOver;
    public final TextView txtBWicket;
    public final TextView txtBall;
    public final TextView txtName;
    public final TextView txtNameBowler;
    public final TextView txtScore;
    public final TextView txtTeamAway;
    public final TextView txtTeamAwayBatterRunner;
    public final TextView txtTeamAwayBatterRunnerScore;
    public final TextView txtTeamAwayBatterTop;
    public final TextView txtTeamAwayBatterTopScore;
    public final TextView txtTeamAwayBowlerRunner;
    public final TextView txtTeamAwayBowlerRunnerWicket;
    public final TextView txtTeamAwayBowlerTop;
    public final TextView txtTeamAwayBowlerTopWicket;
    public final TextView txtTeamAwayOver;
    public final TextView txtTeamAwayScore;
    public final TextView txtTeamHome;
    public final TextView txtTeamHomeBatterRunner;
    public final TextView txtTeamHomeBatterRunnerScore;
    public final TextView txtTeamHomeBatterTop;
    public final TextView txtTeamHomeBatterTopScore;
    public final TextView txtTeamHomeBowlerRunner;
    public final TextView txtTeamHomeBowlerRunnerWicket;
    public final TextView txtTeamHomeBowlerTop;
    public final TextView txtTeamHomeBowlerTopWicket;
    public final TextView txtTeamHomeOver;
    public final TextView txtTeamHomeScore;

    private FragmentSummaryBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgFlag = imageView3;
        this.imgFlagAway = imageView4;
        this.imgFlagBowler = imageView5;
        this.imgFlagHome = imageView6;
        this.imgPlayer = imageView7;
        this.imgPlayerBowler = imageView8;
        this.llNoData = linearLayout;
        this.llScoreAway = linearLayout2;
        this.llScoreHome = linearLayout3;
        this.llSummary = linearLayout4;
        this.progressScorecard = progressBar;
        this.rlAdViewBottom = relativeLayout2;
        this.txt4s = textView;
        this.txt6s = textView2;
        this.txtBOver = textView3;
        this.txtBWicket = textView4;
        this.txtBall = textView5;
        this.txtName = textView6;
        this.txtNameBowler = textView7;
        this.txtScore = textView8;
        this.txtTeamAway = textView9;
        this.txtTeamAwayBatterRunner = textView10;
        this.txtTeamAwayBatterRunnerScore = textView11;
        this.txtTeamAwayBatterTop = textView12;
        this.txtTeamAwayBatterTopScore = textView13;
        this.txtTeamAwayBowlerRunner = textView14;
        this.txtTeamAwayBowlerRunnerWicket = textView15;
        this.txtTeamAwayBowlerTop = textView16;
        this.txtTeamAwayBowlerTopWicket = textView17;
        this.txtTeamAwayOver = textView18;
        this.txtTeamAwayScore = textView19;
        this.txtTeamHome = textView20;
        this.txtTeamHomeBatterRunner = textView21;
        this.txtTeamHomeBatterRunnerScore = textView22;
        this.txtTeamHomeBatterTop = textView23;
        this.txtTeamHomeBatterTopScore = textView24;
        this.txtTeamHomeBowlerRunner = textView25;
        this.txtTeamHomeBowlerRunnerWicket = textView26;
        this.txtTeamHomeBowlerTop = textView27;
        this.txtTeamHomeBowlerTopWicket = textView28;
        this.txtTeamHomeOver = textView29;
        this.txtTeamHomeScore = textView30;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSummaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSummaryBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_flag;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag);
                if (imageView3 != null) {
                    i = R.id.img_flag_away;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_away);
                    if (imageView4 != null) {
                        i = R.id.img_flag_bowler;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_bowler);
                        if (imageView5 != null) {
                            i = R.id.img_flag_home;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_home);
                            if (imageView6 != null) {
                                i = R.id.img_player;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
                                if (imageView7 != null) {
                                    i = R.id.img_player_bowler;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_bowler);
                                    if (imageView8 != null) {
                                        i = R.id.ll_no_data;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                        if (linearLayout != null) {
                                            i = R.id.ll_score_away;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_away);
                                            if (linearLayout2 != null) {
                                                i = R.id.ll_score_home;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_home);
                                                if (linearLayout3 != null) {
                                                    i = R.id.ll_summary;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_summary);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.progress_scorecard;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress_scorecard);
                                                        if (progressBar != null) {
                                                            i = R.id.rl_adView_bottom;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                                                            if (relativeLayout != null) {
                                                                i = R.id.txt_4s;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_4s);
                                                                if (textView != null) {
                                                                    i = R.id.txt_6s;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_6s);
                                                                    if (textView2 != null) {
                                                                        i = R.id.txt_b_over;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_b_over);
                                                                        if (textView3 != null) {
                                                                            i = R.id.txt_b_wicket;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_b_wicket);
                                                                            if (textView4 != null) {
                                                                                i = R.id.txt_ball;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ball);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.txt_name;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_name);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.txt_name_bowler;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_name_bowler);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.txt_score;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.txt_team_away;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.txt_team_away_batterRunner;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_batterRunner);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.txt_team_away_batterRunner_score;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_batterRunner_score);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.txt_team_away_batterTop;
                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_batterTop);
                                                                                                            if (textView12 != null) {
                                                                                                                i = R.id.txt_team_away_batterTop_score;
                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_batterTop_score);
                                                                                                                if (textView13 != null) {
                                                                                                                    i = R.id.txt_team_away_bowlerRunner;
                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_bowlerRunner);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i = R.id.txt_team_away_bowlerRunner_wicket;
                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_bowlerRunner_wicket);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = R.id.txt_team_away_bowlerTop;
                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_bowlerTop);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i = R.id.txt_team_away_bowlerTop_wicket;
                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_bowlerTop_wicket);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    i = R.id.txt_team_away_over;
                                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_over);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        i = R.id.txt_team_away_score;
                                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_score);
                                                                                                                                        if (textView19 != null) {
                                                                                                                                            i = R.id.txt_team_home;
                                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home);
                                                                                                                                            if (textView20 != null) {
                                                                                                                                                i = R.id.txt_team_home_batterRunner;
                                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_batterRunner);
                                                                                                                                                if (textView21 != null) {
                                                                                                                                                    i = R.id.txt_team_home_batterRunner_score;
                                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_batterRunner_score);
                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                        i = R.id.txt_team_home_batterTop;
                                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_batterTop);
                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                            i = R.id.txt_team_home_batterTop_score;
                                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_batterTop_score);
                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                i = R.id.txt_team_home_bowlerRunner;
                                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_bowlerRunner);
                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                    i = R.id.txt_team_home_bowlerRunner_wicket;
                                                                                                                                                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_bowlerRunner_wicket);
                                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                                        i = R.id.txt_team_home_bowlerTop;
                                                                                                                                                                        TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_bowlerTop);
                                                                                                                                                                        if (textView27 != null) {
                                                                                                                                                                            i = R.id.txt_team_home_bowlerTop_wicket;
                                                                                                                                                                            TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_bowlerTop_wicket);
                                                                                                                                                                            if (textView28 != null) {
                                                                                                                                                                                i = R.id.txt_team_home_over;
                                                                                                                                                                                TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_over);
                                                                                                                                                                                if (textView29 != null) {
                                                                                                                                                                                    i = R.id.txt_team_home_score;
                                                                                                                                                                                    TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_score);
                                                                                                                                                                                    if (textView30 != null) {
                                                                                                                                                                                        return new FragmentSummaryBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
