package com.cricketlivescore.predictiontips.databinding;

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

import com.cricketlivescore.predictiontips.R;

public final class ActivityBowlingStatsBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardBestSr;
    public final CardView cardMostWickets;
    public final CardView cardToolbar;
    public final ImageView img3Wicket;
    public final ImageView imgBack;
    public final ImageView imgBestAvg;
    public final ImageView imgBestEco;
    public final ImageView imgBestFigure;
    public final ImageView imgBestSR;
    public final ImageView imgMostWickets;
    public final LinearLayout ll3Wicket;
    public final LinearLayout llBestAvg;
    public final LinearLayout llBestEco;
    public final LinearLayout llBestFigure;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final LinearLayout toolbar;
    public final TextView txt3Wicket;
    public final TextView txt3WicketPlayerName;
    public final TextView txt3WicketPlayerTeam;
    public final TextView txtBestAvg;
    public final TextView txtBestAvgPlayerName;
    public final TextView txtBestAvgPlayerTeam;
    public final TextView txtBestEco;
    public final TextView txtBestEcoPlayerName;
    public final TextView txtBestEcoPlayerTeam;
    public final TextView txtBestFigure;
    public final TextView txtBestFigurePlayerName;
    public final TextView txtBestFigurePlayerTeam;
    public final TextView txtBestSR;
    public final TextView txtBestSRPlayerName;
    public final TextView txtBestSRPlayerTeam;
    public final TextView txtMostWickets;
    public final TextView txtMostWicketsPlayerName;
    public final TextView txtMostWicketsPlayerTeam;
    public final TextView txtTitle;

    private ActivityBowlingStatsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, CardView cardView3, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardBestSr = cardView;
        this.cardMostWickets = cardView2;
        this.cardToolbar = cardView3;
        this.img3Wicket = imageView3;
        this.imgBack = imageView4;
        this.imgBestAvg = imageView5;
        this.imgBestEco = imageView6;
        this.imgBestFigure = imageView7;
        this.imgBestSR = imageView8;
        this.imgMostWickets = imageView9;
        this.ll3Wicket = linearLayout;
        this.llBestAvg = linearLayout2;
        this.llBestEco = linearLayout3;
        this.llBestFigure = linearLayout4;
        this.rlAdBottom = relativeLayout2;
        this.toolbar = linearLayout5;
        this.txt3Wicket = textView;
        this.txt3WicketPlayerName = textView2;
        this.txt3WicketPlayerTeam = textView3;
        this.txtBestAvg = textView4;
        this.txtBestAvgPlayerName = textView5;
        this.txtBestAvgPlayerTeam = textView6;
        this.txtBestEco = textView7;
        this.txtBestEcoPlayerName = textView8;
        this.txtBestEcoPlayerTeam = textView9;
        this.txtBestFigure = textView10;
        this.txtBestFigurePlayerName = textView11;
        this.txtBestFigurePlayerTeam = textView12;
        this.txtBestSR = textView13;
        this.txtBestSRPlayerName = textView14;
        this.txtBestSRPlayerTeam = textView15;
        this.txtMostWickets = textView16;
        this.txtMostWicketsPlayerName = textView17;
        this.txtMostWicketsPlayerTeam = textView18;
        this.txtTitle = textView19;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBowlingStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBowlingStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_bowling_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBowlingStatsBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_best_sr;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_best_sr);
                if (cardView != null) {
                    i = R.id.card_most_wickets;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_most_wickets);
                    if (cardView2 != null) {
                        i = R.id.card_toolbar;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_toolbar);
                        if (cardView3 != null) {
                            i = R.id.img_3Wicket;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_3Wicket);
                            if (imageView3 != null) {
                                i = R.id.img_back;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                                if (imageView4 != null) {
                                    i = R.id.img_bestAvg;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestAvg);
                                    if (imageView5 != null) {
                                        i = R.id.img_bestEco;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestEco);
                                        if (imageView6 != null) {
                                            i = R.id.img_bestFigure;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestFigure);
                                            if (imageView7 != null) {
                                                i = R.id.img_bestSR;
                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bestSR);
                                                if (imageView8 != null) {
                                                    i = R.id.img_mostWickets;
                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mostWickets);
                                                    if (imageView9 != null) {
                                                        i = R.id.ll_3_wicket;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_3_wicket);
                                                        if (linearLayout != null) {
                                                            i = R.id.ll_best_avg;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_avg);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.ll_best_eco;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_eco);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.ll_best_figure;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_figure);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.rl_ad_bottom;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.toolbar;
                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                            if (linearLayout5 != null) {
                                                                                i = R.id.txt_3Wicket;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_3Wicket);
                                                                                if (textView != null) {
                                                                                    i = R.id.txt_3Wicket_playerName;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_3Wicket_playerName);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.txt_3Wicket_playerTeam;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_3Wicket_playerTeam);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.txt_bestAvg;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.txt_bestAvg_playerName;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg_playerName);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.txt_bestAvg_playerTeam;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestAvg_playerTeam);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.txt_bestEco;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestEco);
                                                                                                        if (textView7 != null) {
                                                                                                            i = R.id.txt_bestEco_playerName;
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestEco_playerName);
                                                                                                            if (textView8 != null) {
                                                                                                                i = R.id.txt_bestEco_playerTeam;
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestEco_playerTeam);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = R.id.txt_bestFigure;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestFigure);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = R.id.txt_bestFigure_playerName;
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestFigure_playerName);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i = R.id.txt_bestFigure_playerTeam;
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestFigure_playerTeam);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i = R.id.txt_bestSR;
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i = R.id.txt_bestSR_playerName;
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR_playerName);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = R.id.txt_bestSR_playerTeam;
                                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bestSR_playerTeam);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i = R.id.txt_mostWickets;
                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostWickets);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i = R.id.txt_mostWickets_playerName;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostWickets_playerName);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i = R.id.txt_mostWickets_playerTeam;
                                                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostWickets_playerTeam);
                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                        i = R.id.txt_title;
                                                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                            return new ActivityBowlingStatsBinding((RelativeLayout) view, imageView, imageView2, cardView, cardView2, cardView3, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, linearLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19);
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
