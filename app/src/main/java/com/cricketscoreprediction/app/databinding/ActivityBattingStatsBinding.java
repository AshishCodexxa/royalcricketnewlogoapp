package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;

public final class ActivityBattingStatsBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardBestSr;
    public final CardView cardMost4s;
    public final CardView cardMostRuns;
    public final CardView cardToolbar;
    public final ImageView imgBack;
    public final ImageView imgBestAvg;
    public final ImageView imgBestSR;
    public final ImageView imgMost4s;
    public final ImageView imgMost6s;
    public final ImageView imgMostRuns;
    public final ImageView imgPlayerMost50;
    public final ImageView imgPlayerTopScorer;
    public final LinearLayout llBestAvg;
    public final LinearLayout llHighestScore;
    public final LinearLayout llMost50;
    public final LinearLayout llMost6s;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final LinearLayout toolbar;
    public final TextView txtBestAvg;
    public final TextView txtBestAvgPlayerName;
    public final TextView txtBestAvgPlayerTeam;
    public final TextView txtBestSR;
    public final TextView txtBestSRPlayerName;
    public final TextView txtBestSRPlayerTeam;
    public final TextView txtMost4s;
    public final TextView txtMost4sPlayerName;
    public final TextView txtMost4sPlayerTeam;
    public final TextView txtMost6s;
    public final TextView txtMost6sPlayerName;
    public final TextView txtMost6sPlayerTeam;
    public final TextView txtMostRun;
    public final TextView txtMostRunPlayerName;
    public final TextView txtMostRunPlayerTeam;
    public final TextView txtNumberMost50;
    public final TextView txtNumberTopScorer;
    public final TextView txtNumberTopScorerBall;
    public final TextView txtPlayerMost50;
    public final TextView txtPlayerTeamMost50;
    public final TextView txtPlayerTeamTopScorer;
    public final TextView txtPlayerTopScorer;
    public final TextView txtTitle;

    private ActivityBattingStatsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardBestSr = cardView;
        this.cardMost4s = cardView2;
        this.cardMostRuns = cardView3;
        this.cardToolbar = cardView4;
        this.imgBack = imageView3;
        this.imgBestAvg = imageView4;
        this.imgBestSR = imageView5;
        this.imgMost4s = imageView6;
        this.imgMost6s = imageView7;
        this.imgMostRuns = imageView8;
        this.imgPlayerMost50 = imageView9;
        this.imgPlayerTopScorer = imageView10;
        this.llBestAvg = linearLayout;
        this.llHighestScore = linearLayout2;
        this.llMost50 = linearLayout3;
        this.llMost6s = linearLayout4;
        this.rlAdBottom = relativeLayout2;
        this.toolbar = linearLayout5;
        this.txtBestAvg = textView;
        this.txtBestAvgPlayerName = textView2;
        this.txtBestAvgPlayerTeam = textView3;
        this.txtBestSR = textView4;
        this.txtBestSRPlayerName = textView5;
        this.txtBestSRPlayerTeam = textView6;
        this.txtMost4s = textView7;
        this.txtMost4sPlayerName = textView8;
        this.txtMost4sPlayerTeam = textView9;
        this.txtMost6s = textView10;
        this.txtMost6sPlayerName = textView11;
        this.txtMost6sPlayerTeam = textView12;
        this.txtMostRun = textView13;
        this.txtMostRunPlayerName = textView14;
        this.txtMostRunPlayerTeam = textView15;
        this.txtNumberMost50 = textView16;
        this.txtNumberTopScorer = textView17;
        this.txtNumberTopScorerBall = textView18;
        this.txtPlayerMost50 = textView19;
        this.txtPlayerTeamMost50 = textView20;
        this.txtPlayerTeamTopScorer = textView21;
        this.txtPlayerTopScorer = textView22;
        this.txtTitle = textView23;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBattingStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBattingStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_batting_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBattingStatsBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_best_sr;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_best_sr);
                if (cardView != null) {
                    i = R.id.card_most_4s;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_most_4s);
                    if (cardView2 != null) {
                        i = R.id.card_most_runs;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_most_runs);
                        if (cardView3 != null) {
                            i = R.id.card_toolbar;
                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, R.id.card_toolbar);
                            if (cardView4 != null) {
                                i = R.id.img_back;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                                if (imageView3 != null) {
                                    i = R.id.img_bestAvg;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestAvg);
                                    if (imageView4 != null) {
                                        i = R.id.img_bestSR;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestSR);
                                        if (imageView5 != null) {
                                            i = R.id.img_most4s;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_most4s);
                                            if (imageView6 != null) {
                                                i = R.id.img_most6s;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_most6s);
                                                if (imageView7 != null) {
                                                    i = R.id.img_mostRuns;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mostRuns);
                                                    if (imageView8 != null) {
                                                        i = R.id.img_player_most50;
                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_most50);
                                                        if (imageView9 != null) {
                                                            i = R.id.img_player_topScorer;
                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_topScorer);
                                                            if (imageView10 != null) {
                                                                i = R.id.ll_best_avg;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_avg);
                                                                if (linearLayout != null) {
                                                                    i = R.id.ll_highest_score;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_highest_score);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.ll_most_50;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_50);
                                                                        if (linearLayout3 != null) {
                                                                            i = R.id.ll_most_6s;
                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_6s);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.rl_ad_bottom;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                                if (relativeLayout != null) {
                                                                                    i = R.id.toolbar;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                    if (linearLayout5 != null) {
                                                                                        i = R.id.txt_bestAvg;
                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg);
                                                                                        if (textView != null) {
                                                                                            i = R.id.txt_bestAvg_playerName;
                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg_playerName);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.txt_bestAvg_playerTeam;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg_playerTeam);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.txt_bestSR;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.txt_bestSR_playerName;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR_playerName);
                                                                                                        if (textView5 != null) {
                                                                                                            i = R.id.txt_bestSR_playerTeam;
                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR_playerTeam);
                                                                                                            if (textView6 != null) {
                                                                                                                i = R.id.txt_most4s;
                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most4s);
                                                                                                                if (textView7 != null) {
                                                                                                                    i = R.id.txt_most4s_playerName;
                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most4s_playerName);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.txt_most4s_playerTeam;
                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most4s_playerTeam);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = R.id.txt_most6s;
                                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most6s);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = R.id.txt_most6s_playerName;
                                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most6s_playerName);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i = R.id.txt_most6s_playerTeam;
                                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_most6s_playerTeam);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i = R.id.txt_mostRun;
                                                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRun);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            i = R.id.txt_mostRun_playerName;
                                                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRun_playerName);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i = R.id.txt_mostRun_playerTeam;
                                                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRun_playerTeam);
                                                                                                                                                if (textView15 != null) {
                                                                                                                                                    i = R.id.txt_number_most50;
                                                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_most50);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i = R.id.txt_number_topScorer;
                                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_topScorer);
                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                            i = R.id.txt_number_topScorerBall;
                                                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_topScorerBall);
                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                i = R.id.txt_player_most50;
                                                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_most50);
                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                    i = R.id.txt_player_team_most50;
                                                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_most50);
                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                        i = R.id.txt_player_team_topScorer;
                                                                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_topScorer);
                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                            i = R.id.txt_player_topScorer;
                                                                                                                                                                            TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_topScorer);
                                                                                                                                                                            if (textView22 != null) {
                                                                                                                                                                                i = R.id.txt_title;
                                                                                                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                                                                                                                                if (textView23 != null) {
                                                                                                                                                                                    return new ActivityBattingStatsBinding((RelativeLayout) view, imageView, imageView2, cardView, cardView2, cardView3, cardView4, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, linearLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23);
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
