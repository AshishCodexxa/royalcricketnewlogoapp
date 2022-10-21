package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;

import com.gsbusiness.livecricketscoreprediction.CustomProgressBar;

public final class FragmentKeyStatsBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CustomProgressBar customProgressBar;
    public final ImageView imgInfo;
    public final ImageView imgTeam1TopScorer;
    public final ImageView imgTeam1TopTaker;
    public final ImageView imgTeam2TopScorer;
    public final ImageView imgTeam2TopTaker;
    public final LinearLayout llHeadToHead;
    public final LinearLayout llNoData;
    public final LinearLayout llStadium;
    public final LinearLayout llTopRun;
    public final LinearLayout llTopWicket;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextView txt1stBattingAvg;
    public final TextView txt1stBattingWin;
    public final TextView txtDraw;
    public final TextView txtHighestScoreChased;
    public final TextView txtLast;
    public final TextView txtPace;
    public final TextView txtSpin;
    public final TextView txtStadium;
    public final TextView txtTeam1Scorer;
    public final TextView txtTeam1Taker;
    public final TextView txtTeam1TopScorer;
    public final TextView txtTeam1TopScorerAvg;
    public final TextView txtTeam1TopScorerRun;
    public final TextView txtTeam1TopTaker;
    public final TextView txtTeam1TopTakerAvg;
    public final TextView txtTeam1TopTakerWicket;
    public final TextView txtTeam2Scorer;
    public final TextView txtTeam2Taker;
    public final TextView txtTeam2TopScorer;
    public final TextView txtTeam2TopScorerAvg;
    public final TextView txtTeam2TopScorerRun;
    public final TextView txtTeam2TopTaker;
    public final TextView txtTeam2TopTakerAvg;
    public final TextView txtTeam2TopTakerWicket;
    public final TextView txtTeamA;
    public final TextView txtTeamAWin;
    public final TextView txtTeamB;
    public final TextView txtTeamBWin;

    private FragmentKeyStatsBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, ImageView imageView2, CustomProgressBar customProgressBar2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28) {
        this.rootView = relativeLayout;
        this.ProgressBar = progressBar;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.customProgressBar = customProgressBar2;
        this.imgInfo = imageView3;
        this.imgTeam1TopScorer = imageView4;
        this.imgTeam1TopTaker = imageView5;
        this.imgTeam2TopScorer = imageView6;
        this.imgTeam2TopTaker = imageView7;
        this.llHeadToHead = linearLayout;
        this.llNoData = linearLayout2;
        this.llStadium = linearLayout3;
        this.llTopRun = linearLayout4;
        this.llTopWicket = linearLayout5;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.scrollView = scrollView2;
        this.txt1stBattingAvg = textView;
        this.txt1stBattingWin = textView2;
        this.txtDraw = textView3;
        this.txtHighestScoreChased = textView4;
        this.txtLast = textView5;
        this.txtPace = textView6;
        this.txtSpin = textView7;
        this.txtStadium = textView8;
        this.txtTeam1Scorer = textView9;
        this.txtTeam1Taker = textView10;
        this.txtTeam1TopScorer = textView11;
        this.txtTeam1TopScorerAvg = textView12;
        this.txtTeam1TopScorerRun = textView13;
        this.txtTeam1TopTaker = textView14;
        this.txtTeam1TopTakerAvg = textView15;
        this.txtTeam1TopTakerWicket = textView16;
        this.txtTeam2Scorer = textView17;
        this.txtTeam2Taker = textView18;
        this.txtTeam2TopScorer = textView19;
        this.txtTeam2TopScorerAvg = textView20;
        this.txtTeam2TopScorerRun = textView21;
        this.txtTeam2TopTaker = textView22;
        this.txtTeam2TopTakerAvg = textView23;
        this.txtTeam2TopTakerWicket = textView24;
        this.txtTeamA = textView25;
        this.txtTeamAWin = textView26;
        this.txtTeamB = textView27;
        this.txtTeamBWin = textView28;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentKeyStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentKeyStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_key_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentKeyStatsBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.ad_banner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
            if (imageView != null) {
                i = R.id.ad_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
                if (imageView2 != null) {
                    i = R.id.customProgressBar;
                    CustomProgressBar customProgressBar2 = (CustomProgressBar) ViewBindings.findChildViewById(view, R.id.customProgressBar);
                    if (customProgressBar2 != null) {
                        i = R.id.img_info;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                        if (imageView3 != null) {
                            i = R.id.img_team1_top_scorer;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team1_top_scorer);
                            if (imageView4 != null) {
                                i = R.id.img_team1_top_taker;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team1_top_taker);
                                if (imageView5 != null) {
                                    i = R.id.img_team2_top_scorer;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team2_top_scorer);
                                    if (imageView6 != null) {
                                        i = R.id.img_team2_top_taker;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team2_top_taker);
                                        if (imageView7 != null) {
                                            i = R.id.ll_headToHead;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_headToHead);
                                            if (linearLayout != null) {
                                                i = R.id.ll_no_data;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                                if (linearLayout2 != null) {
                                                    i = R.id.ll_stadium;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stadium);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.ll_top_run;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_top_run);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.ll_top_wicket;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_top_wicket);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.rl_ad_bottom;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                if (relativeLayout != null) {
                                                                    i = R.id.rl_info;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                                    if (relativeLayout2 != null) {
                                                                        i = R.id.scrollView;
                                                                        ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                        if (scrollView2 != null) {
                                                                            i = R.id.txt_1st_batting_avg;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_1st_batting_avg);
                                                                            if (textView != null) {
                                                                                i = R.id.txt_1st_batting_win;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_1st_batting_win);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.txt_draw;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_draw);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.txt_highest_score_chased;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highest_score_chased);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.txt_last;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_last);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.txt_pace;
                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_pace);
                                                                                                if (textView6 != null) {
                                                                                                    i = R.id.txt_spin;
                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_spin);
                                                                                                    if (textView7 != null) {
                                                                                                        i = R.id.txt_stadium;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_stadium);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.txt_team1_scorer;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_scorer);
                                                                                                            if (textView9 != null) {
                                                                                                                i = R.id.txt_team1_taker;
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_taker);
                                                                                                                if (textView10 != null) {
                                                                                                                    i = R.id.txt_team1_top_scorer;
                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_scorer);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i = R.id.txt_team1_top_scorer_avg;
                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_scorer_avg);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i = R.id.txt_team1_top_scorer_run;
                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_scorer_run);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = R.id.txt_team1_top_taker;
                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_taker);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i = R.id.txt_team1_top_taker_avg;
                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_taker_avg);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        i = R.id.txt_team1_top_taker_wicket;
                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_top_taker_wicket);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            i = R.id.txt_team2_scorer;
                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_scorer);
                                                                                                                                            if (textView17 != null) {
                                                                                                                                                i = R.id.txt_team2_taker;
                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_taker);
                                                                                                                                                if (textView18 != null) {
                                                                                                                                                    i = R.id.txt_team2_top_scorer;
                                                                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_scorer);
                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                        i = R.id.txt_team2_top_scorer_avg;
                                                                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_scorer_avg);
                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                            i = R.id.txt_team2_top_scorer_run;
                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_scorer_run);
                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                i = R.id.txt_team2_top_taker;
                                                                                                                                                                TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_taker);
                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                    i = R.id.txt_team2_top_taker_avg;
                                                                                                                                                                    TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_taker_avg);
                                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                                        i = R.id.txt_team2_top_taker_wicket;
                                                                                                                                                                        TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_top_taker_wicket);
                                                                                                                                                                        if (textView24 != null) {
                                                                                                                                                                            i = R.id.txt_teamA;
                                                                                                                                                                            TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_teamA);
                                                                                                                                                                            if (textView25 != null) {
                                                                                                                                                                                i = R.id.txt_teamA_win;
                                                                                                                                                                                TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_teamA_win);
                                                                                                                                                                                if (textView26 != null) {
                                                                                                                                                                                    i = R.id.txt_teamB;
                                                                                                                                                                                    TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_teamB);
                                                                                                                                                                                    if (textView27 != null) {
                                                                                                                                                                                        i = R.id.txt_teamB_win;
                                                                                                                                                                                        TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_teamB_win);
                                                                                                                                                                                        if (textView28 != null) {
                                                                                                                                                                                            return new FragmentKeyStatsBinding((RelativeLayout) view, progressBar, imageView, imageView2, customProgressBar2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, relativeLayout2, scrollView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
