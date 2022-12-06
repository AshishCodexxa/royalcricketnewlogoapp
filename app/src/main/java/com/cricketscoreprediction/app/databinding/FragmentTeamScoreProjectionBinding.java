package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.CustomProgressBar;

public final class FragmentTeamScoreProjectionBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardF1;
    public final CardView cardF2;
    public final CardView cardFi1;
    public final CardView cardFi2;
    public final CardView cardFi3;
    public final CardView cardFi4;
    public final ImageView imgFlagInning1;
    public final ImageView imgFlagInning2;
    public final ImageView imgFlagInning3;
    public final ImageView imgFlagInning4;
    public final ImageView imgFlagOne;
    public final ImageView imgFlagTwo;
    public final ImageView imgInfo;
    public final LinearLayout llLiveTeamScorePro;
    public final LinearLayout llNoData;
    public final LinearLayout llTest;
    public final LinearLayout llTwoInnings;
    public final ProgressBar progressBar;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final CustomProgressBar seekBar0;
    public final TextView txtDrawPer;
    public final TextView txtOverInning1;
    public final TextView txtOverInning2;
    public final TextView txtOverInning3;
    public final TextView txtOverInning4;
    public final TextView txtOverOne;
    public final TextView txtOverTwo;
    public final TextView txtProjectedResult;
    public final TextView txtProjectionOverInning1;
    public final TextView txtProjectionOverInning2;
    public final TextView txtProjectionOverInning3;
    public final TextView txtProjectionOverInning4;
    public final TextView txtProjectionOverOne;
    public final TextView txtProjectionOverTwo;
    public final TextView txtProjectionScoreInning1;
    public final TextView txtProjectionScoreInning2;
    public final TextView txtProjectionScoreInning3;
    public final TextView txtProjectionScoreInning4;
    public final TextView txtProjectionScoreOne;
    public final TextView txtProjectionScoreTwo;
    public final TextView txtScoreInning1;
    public final TextView txtScoreInning2;
    public final TextView txtScoreInning3;
    public final TextView txtScoreInning4;
    public final TextView txtScoreOne;
    public final TextView txtScoreTwo;
    public final TextView txtTeam1;
    public final TextView txtTeam1Per;
    public final TextView txtTeam2;
    public final TextView txtTeam2Per;
    public final TextView txtTeamInning1;
    public final TextView txtTeamInning2;
    public final TextView txtTeamInning3;
    public final TextView txtTeamInning4;
    public final TextView txtTeamOne;
    public final TextView txtTeamTwo;
    public final TextView txtWinnerPrediction;

    private FragmentTeamScoreProjectionBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, CustomProgressBar customProgressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardF1 = cardView;
        this.cardF2 = cardView2;
        this.cardFi1 = cardView3;
        this.cardFi2 = cardView4;
        this.cardFi3 = cardView5;
        this.cardFi4 = cardView6;
        this.imgFlagInning1 = imageView3;
        this.imgFlagInning2 = imageView4;
        this.imgFlagInning3 = imageView5;
        this.imgFlagInning4 = imageView6;
        this.imgFlagOne = imageView7;
        this.imgFlagTwo = imageView8;
        this.imgInfo = imageView9;
        this.llLiveTeamScorePro = linearLayout;
        this.llNoData = linearLayout2;
        this.llTest = linearLayout3;
        this.llTwoInnings = linearLayout4;
        this.progressBar = progressBar2;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.seekBar0 = customProgressBar;
        this.txtDrawPer = textView;
        this.txtOverInning1 = textView2;
        this.txtOverInning2 = textView3;
        this.txtOverInning3 = textView4;
        this.txtOverInning4 = textView5;
        this.txtOverOne = textView6;
        this.txtOverTwo = textView7;
        this.txtProjectedResult = textView8;
        this.txtProjectionOverInning1 = textView9;
        this.txtProjectionOverInning2 = textView10;
        this.txtProjectionOverInning3 = textView11;
        this.txtProjectionOverInning4 = textView12;
        this.txtProjectionOverOne = textView13;
        this.txtProjectionOverTwo = textView14;
        this.txtProjectionScoreInning1 = textView15;
        this.txtProjectionScoreInning2 = textView16;
        this.txtProjectionScoreInning3 = textView17;
        this.txtProjectionScoreInning4 = textView18;
        this.txtProjectionScoreOne = textView19;
        this.txtProjectionScoreTwo = textView20;
        this.txtScoreInning1 = textView21;
        this.txtScoreInning2 = textView22;
        this.txtScoreInning3 = textView23;
        this.txtScoreInning4 = textView24;
        this.txtScoreOne = textView25;
        this.txtScoreTwo = textView26;
        this.txtTeam1 = textView27;
        this.txtTeam1Per = textView28;
        this.txtTeam2 = textView29;
        this.txtTeam2Per = textView30;
        this.txtTeamInning1 = textView31;
        this.txtTeamInning2 = textView32;
        this.txtTeamInning3 = textView33;
        this.txtTeamInning4 = textView34;
        this.txtTeamOne = textView35;
        this.txtTeamTwo = textView36;
        this.txtWinnerPrediction = textView37;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTeamScoreProjectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTeamScoreProjectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_team_score_projection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTeamScoreProjectionBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_f1;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_f1);
                if (cardView != null) {
                    i = R.id.card_f2;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_f2);
                    if (cardView2 != null) {
                        i = R.id.card_fi1;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_fi1);
                        if (cardView3 != null) {
                            i = R.id.card_fi2;
                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, R.id.card_fi2);
                            if (cardView4 != null) {
                                i = R.id.card_fi3;
                                CardView cardView5 = (CardView) ViewBindings.findChildViewById(view, R.id.card_fi3);
                                if (cardView5 != null) {
                                    i = R.id.card_fi4;
                                    CardView cardView6 = (CardView) ViewBindings.findChildViewById(view, R.id.card_fi4);
                                    if (cardView6 != null) {
                                        i = R.id.img_flag_inning1;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_inning1);
                                        if (imageView3 != null) {
                                            i = R.id.img_flag_inning2;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_inning2);
                                            if (imageView4 != null) {
                                                i = R.id.img_flag_inning3;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_inning3);
                                                if (imageView5 != null) {
                                                    i = R.id.img_flag_inning4;
                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_inning4);
                                                    if (imageView6 != null) {
                                                        i = R.id.img_flag_one;
                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_one);
                                                        if (imageView7 != null) {
                                                            i = R.id.img_flag_two;
                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_two);
                                                            if (imageView8 != null) {
                                                                i = R.id.img_info;
                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                                                                if (imageView9 != null) {
                                                                    i = R.id.ll_live_team_score_pro;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_live_team_score_pro);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.ll_no_data;
                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                                                        if (linearLayout2 != null) {
                                                                            i = R.id.ll_test;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_test);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.ll_two_innings;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_two_innings);
                                                                                if (linearLayout4 != null) {
                                                                                    i = R.id.progressBar;
                                                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                                                    if (progressBar2 != null) {
                                                                                        i = R.id.rl_ad_bottom;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                                        if (relativeLayout != null) {
                                                                                            i = R.id.rl_info;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i = R.id.seekBar0;
                                                                                                CustomProgressBar customProgressBar = (CustomProgressBar) ViewBindings.findChildViewById(view, R.id.seekBar0);
                                                                                                if (customProgressBar != null) {
                                                                                                    i = R.id.txt_draw_per;
                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_draw_per);
                                                                                                    if (textView != null) {
                                                                                                        i = R.id.txt_over_inning1;
                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_inning1);
                                                                                                        if (textView2 != null) {
                                                                                                            i = R.id.txt_over_inning2;
                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_inning2);
                                                                                                            if (textView3 != null) {
                                                                                                                i = R.id.txt_over_inning3;
                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_inning3);
                                                                                                                if (textView4 != null) {
                                                                                                                    i = R.id.txt_over_inning4;
                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_inning4);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i = R.id.txt_over_one;
                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_one);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i = R.id.txt_over_two;
                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over_two);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i = R.id.txt_projectedResult;
                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projectedResult);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.txt_projection_over_inning1;
                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_inning1);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i = R.id.txt_projection_over_inning2;
                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_inning2);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i = R.id.txt_projection_over_inning3;
                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_inning3);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                i = R.id.txt_projection_over_inning4;
                                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_inning4);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    i = R.id.txt_projection_over_one;
                                                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_one);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        i = R.id.txt_projection_over_two;
                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over_two);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i = R.id.txt_projection_score_inning1;
                                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_inning1);
                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                i = R.id.txt_projection_score_inning2;
                                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_inning2);
                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                    i = R.id.txt_projection_score_inning3;
                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_inning3);
                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                        i = R.id.txt_projection_score_inning4;
                                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_inning4);
                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                            i = R.id.txt_projection_score_one;
                                                                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_one);
                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                i = R.id.txt_projection_score_two;
                                                                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score_two);
                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                    i = R.id.txt_score_inning1;
                                                                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_inning1);
                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                        i = R.id.txt_score_inning2;
                                                                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_inning2);
                                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                                            i = R.id.txt_score_inning3;
                                                                                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_inning3);
                                                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                                                i = R.id.txt_score_inning4;
                                                                                                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_inning4);
                                                                                                                                                                                                if (textView24 != null) {
                                                                                                                                                                                                    i = R.id.txt_score_one;
                                                                                                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_one);
                                                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                                                        i = R.id.txt_score_two;
                                                                                                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score_two);
                                                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                                                            i = R.id.txt_team1;
                                                                                                                                                                                                            TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1);
                                                                                                                                                                                                            if (textView27 != null) {
                                                                                                                                                                                                                i = R.id.txt_team1_per;
                                                                                                                                                                                                                TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1_per);
                                                                                                                                                                                                                if (textView28 != null) {
                                                                                                                                                                                                                    i = R.id.txt_team2;
                                                                                                                                                                                                                    TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2);
                                                                                                                                                                                                                    if (textView29 != null) {
                                                                                                                                                                                                                        i = R.id.txt_team2_per;
                                                                                                                                                                                                                        TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2_per);
                                                                                                                                                                                                                        if (textView30 != null) {
                                                                                                                                                                                                                            i = R.id.txt_team_inning1;
                                                                                                                                                                                                                            TextView textView31 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_inning1);
                                                                                                                                                                                                                            if (textView31 != null) {
                                                                                                                                                                                                                                i = R.id.txt_team_inning2;
                                                                                                                                                                                                                                TextView textView32 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_inning2);
                                                                                                                                                                                                                                if (textView32 != null) {
                                                                                                                                                                                                                                    i = R.id.txt_team_inning3;
                                                                                                                                                                                                                                    TextView textView33 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_inning3);
                                                                                                                                                                                                                                    if (textView33 != null) {
                                                                                                                                                                                                                                        i = R.id.txt_team_inning4;
                                                                                                                                                                                                                                        TextView textView34 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_inning4);
                                                                                                                                                                                                                                        if (textView34 != null) {
                                                                                                                                                                                                                                            i = R.id.txt_team_one;
                                                                                                                                                                                                                                            TextView textView35 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_one);
                                                                                                                                                                                                                                            if (textView35 != null) {
                                                                                                                                                                                                                                                i = R.id.txt_team_two;
                                                                                                                                                                                                                                                TextView textView36 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_two);
                                                                                                                                                                                                                                                if (textView36 != null) {
                                                                                                                                                                                                                                                    i = R.id.txt_winner_prediction;
                                                                                                                                                                                                                                                    TextView textView37 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_winner_prediction);
                                                                                                                                                                                                                                                    if (textView37 != null) {
                                                                                                                                                                                                                                                        return new FragmentTeamScoreProjectionBinding((RelativeLayout) view, imageView, imageView2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar2, relativeLayout, relativeLayout2, customProgressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37);
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
