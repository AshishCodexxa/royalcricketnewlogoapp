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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentLive2Binding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgFlag;
    public final LinearLayout llBowler;
    public final LinearLayout llNoData;
    public final LinearLayout llScoreCard;
    public final LinearLayout llScoreDetail;
    public final ProgressBar progressLive;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvBatter;
    public final ScrollView scrollView;
    public final TextView txtBowlerEco;
    public final TextView txtBowlerMaiden;
    public final TextView txtBowlerName;
    public final TextView txtBowlerOver;
    public final TextView txtBowlerRun;
    public final TextView txtBowlerWickets;
    public final TextView txtPartnerShip;
    public final TextView txtRr;
    public final TextView txtTeam;
    public final TextView txtTeamScore;
    public final TextView txtTotalRun;

    private FragmentLive2Binding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, RelativeLayout relativeLayout2, RecyclerView recyclerView, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgFlag = imageView3;
        this.llBowler = linearLayout;
        this.llNoData = linearLayout2;
        this.llScoreCard = linearLayout3;
        this.llScoreDetail = linearLayout4;
        this.progressLive = progressBar;
        this.rlAdViewBottom = relativeLayout2;
        this.rvBatter = recyclerView;
        this.scrollView = scrollView2;
        this.txtBowlerEco = textView;
        this.txtBowlerMaiden = textView2;
        this.txtBowlerName = textView3;
        this.txtBowlerOver = textView4;
        this.txtBowlerRun = textView5;
        this.txtBowlerWickets = textView6;
        this.txtPartnerShip = textView7;
        this.txtRr = textView8;
        this.txtTeam = textView9;
        this.txtTeamScore = textView10;
        this.txtTotalRun = textView11;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLive2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLive2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_live2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLive2Binding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_flag;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag);
                if (imageView3 != null) {
                    i = R.id.ll_bowler;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_bowler);
                    if (linearLayout != null) {
                        i = R.id.ll_no_data;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                        if (linearLayout2 != null) {
                            i = R.id.ll_scoreCard;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_scoreCard);
                            if (linearLayout3 != null) {
                                i = R.id.ll_score_detail;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_detail);
                                if (linearLayout4 != null) {
                                    i = R.id.progress_live;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress_live);
                                    if (progressBar != null) {
                                        i = R.id.rl_adView_bottom;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                                        if (relativeLayout != null) {
                                            i = R.id.rv_batter;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_batter);
                                            if (recyclerView != null) {
                                                i = R.id.scrollView;
                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                if (scrollView2 != null) {
                                                    i = R.id.txt_bowler_eco;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_eco);
                                                    if (textView != null) {
                                                        i = R.id.txt_bowler_maiden;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_maiden);
                                                        if (textView2 != null) {
                                                            i = R.id.txt_bowler_name;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_name);
                                                            if (textView3 != null) {
                                                                i = R.id.txt_bowler_over;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_over);
                                                                if (textView4 != null) {
                                                                    i = R.id.txt_bowler_run;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_run);
                                                                    if (textView5 != null) {
                                                                        i = R.id.txt_bowler_wickets;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_wickets);
                                                                        if (textView6 != null) {
                                                                            i = R.id.txt_partnerShip;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_partnerShip);
                                                                            if (textView7 != null) {
                                                                                i = R.id.txt_rr;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_rr);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.txt_team;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.txt_teamScore;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_teamScore);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.txt_totalRun;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_totalRun);
                                                                                            if (textView11 != null) {
                                                                                                return new FragmentLive2Binding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar, relativeLayout, recyclerView, scrollView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
