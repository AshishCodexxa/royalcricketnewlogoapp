package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentStatsBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardBall;
    public final CardView cardBat;
    public final CardView cardField;
    public final CardView cardTopGun;
    public final ImageView imgCapBowler;
    public final ImageView imgPlayerBatter;
    public final ImageView imgPlayerBowler;
    public final ImageView imgPlayerTopScorer;
    public final ImageView imgPlayerTopTaker;
    public final LinearLayout llHighestScore;
    public final LinearLayout llHighestWickets;
    public final LinearLayout llMostRuns;
    public final LinearLayout llMostWickets;
    public final LinearLayout llNoData;
    public final LinearLayout llStats;
    public final RelativeLayout rlAdBottom;
    private final ScrollView rootView;
    public final TextView txtNumberBatter;
    public final TextView txtNumberBowler;
    public final TextView txtNumberTopScorer;
    public final TextView txtNumberTopTaker;
    public final TextView txtPlayerBatter;
    public final TextView txtPlayerBowler;
    public final TextView txtPlayerTeamBatter;
    public final TextView txtPlayerTeamBowler;
    public final TextView txtPlayerTeamTopScorer;
    public final TextView txtPlayerTeamTopTaker;
    public final TextView txtPlayerTopScorer;
    public final TextView txtPlayerTopTaker;

    private FragmentStatsBinding(ScrollView scrollView, ProgressBar progressBar, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = scrollView;
        this.ProgressBar = progressBar;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardBall = cardView;
        this.cardBat = cardView2;
        this.cardField = cardView3;
        this.cardTopGun = cardView4;
        this.imgCapBowler = imageView3;
        this.imgPlayerBatter = imageView4;
        this.imgPlayerBowler = imageView5;
        this.imgPlayerTopScorer = imageView6;
        this.imgPlayerTopTaker = imageView7;
        this.llHighestScore = linearLayout;
        this.llHighestWickets = linearLayout2;
        this.llMostRuns = linearLayout3;
        this.llMostWickets = linearLayout4;
        this.llNoData = linearLayout5;
        this.llStats = linearLayout6;
        this.rlAdBottom = relativeLayout;
        this.txtNumberBatter = textView;
        this.txtNumberBowler = textView2;
        this.txtNumberTopScorer = textView3;
        this.txtNumberTopTaker = textView4;
        this.txtPlayerBatter = textView5;
        this.txtPlayerBowler = textView6;
        this.txtPlayerTeamBatter = textView7;
        this.txtPlayerTeamBowler = textView8;
        this.txtPlayerTeamTopScorer = textView9;
        this.txtPlayerTeamTopTaker = textView10;
        this.txtPlayerTopScorer = textView11;
        this.txtPlayerTopTaker = textView12;
    }

    @Override 
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentStatsBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.ad_banner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
            if (imageView != null) {
                i = R.id.ad_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
                if (imageView2 != null) {
                    i = R.id.card_ball;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_ball);
                    if (cardView != null) {
                        i = R.id.card_bat;
                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_bat);
                        if (cardView2 != null) {
                            i = R.id.card_field;
                            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_field);
                            if (cardView3 != null) {
                                i = R.id.card_top_gun;
                                CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, R.id.card_top_gun);
                                if (cardView4 != null) {
                                    i = R.id.img_cap_bowler;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_cap_bowler);
                                    if (imageView3 != null) {
                                        i = R.id.img_player_batter;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_batter);
                                        if (imageView4 != null) {
                                            i = R.id.img_player_bowler;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_bowler);
                                            if (imageView5 != null) {
                                                i = R.id.img_player_topScorer;
                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_topScorer);
                                                if (imageView6 != null) {
                                                    i = R.id.img_player_topTaker;
                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_topTaker);
                                                    if (imageView7 != null) {
                                                        i = R.id.ll_highest_score;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_highest_score);
                                                        if (linearLayout != null) {
                                                            i = R.id.ll_highest_wickets;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_highest_wickets);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.ll_most_runs;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_runs);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.ll_most_wickets;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_wickets);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.ll_no_data;
                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                                                        if (linearLayout5 != null) {
                                                                            i = R.id.ll_stats;
                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stats);
                                                                            if (linearLayout6 != null) {
                                                                                i = R.id.rl_ad_bottom;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                                if (relativeLayout != null) {
                                                                                    i = R.id.txt_number_batter;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_batter);
                                                                                    if (textView != null) {
                                                                                        i = R.id.txt_number_bowler;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_bowler);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.txt_number_topScorer;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_topScorer);
                                                                                            if (textView3 != null) {
                                                                                                i = R.id.txt_number_topTaker;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_topTaker);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.txt_player_batter;
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_batter);
                                                                                                    if (textView5 != null) {
                                                                                                        i = R.id.txt_player_bowler;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bowler);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.txt_player_team_batter;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_batter);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.txt_player_team_bowler;
                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_bowler);
                                                                                                                if (textView8 != null) {
                                                                                                                    i = R.id.txt_player_team_topScorer;
                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_topScorer);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i = R.id.txt_player_team_topTaker;
                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team_topTaker);
                                                                                                                        if (textView10 != null) {
                                                                                                                            i = R.id.txt_player_topScorer;
                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_topScorer);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i = R.id.txt_player_topTaker;
                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_topTaker);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    return new FragmentStatsBinding((ScrollView) view, progressBar, imageView, imageView2, cardView, cardView2, cardView3, cardView4, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
