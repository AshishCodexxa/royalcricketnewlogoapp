package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;

public final class ActivityBowlingBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgBack;
    public final LinearLayout ll3Wicket;
    public final LinearLayout llBestAvg;
    public final LinearLayout llBestEco;
    public final LinearLayout llBestFigure;
    public final LinearLayout llBestSr;
    public final LinearLayout llMostWickets;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rv3Wicket;
    public final RecyclerView rvBestAvg;
    public final RecyclerView rvBestEco;
    public final RecyclerView rvBestFigure;
    public final RecyclerView rvBestSr;
    public final RecyclerView rvMostWickets;
    public final LinearLayout toolbar;
    public final TextView txtTitle;

    private ActivityBowlingBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, LinearLayout linearLayout7, TextView textView) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgBack = imageView3;
        this.ll3Wicket = linearLayout;
        this.llBestAvg = linearLayout2;
        this.llBestEco = linearLayout3;
        this.llBestFigure = linearLayout4;
        this.llBestSr = linearLayout5;
        this.llMostWickets = linearLayout6;
        this.rlAdBottom = relativeLayout2;
        this.rv3Wicket = recyclerView;
        this.rvBestAvg = recyclerView2;
        this.rvBestEco = recyclerView3;
        this.rvBestFigure = recyclerView4;
        this.rvBestSr = recyclerView5;
        this.rvMostWickets = recyclerView6;
        this.toolbar = linearLayout7;
        this.txtTitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBowlingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBowlingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_bowling, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBowlingBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_back;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                if (imageView3 != null) {
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
                                    i = R.id.ll_best_sr;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_sr);
                                    if (linearLayout5 != null) {
                                        i = R.id.ll_most_wickets;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_wickets);
                                        if (linearLayout6 != null) {
                                            i = R.id.rl_ad_bottom;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                            if (relativeLayout != null) {
                                                i = R.id.rv_3_wicket;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_3_wicket);
                                                if (recyclerView != null) {
                                                    i = R.id.rv_best_avg;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_avg);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.rv_best_eco;
                                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_eco);
                                                        if (recyclerView3 != null) {
                                                            i = R.id.rv_best_figure;
                                                            RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_figure);
                                                            if (recyclerView4 != null) {
                                                                i = R.id.rv_best_sr;
                                                                RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_sr);
                                                                if (recyclerView5 != null) {
                                                                    i = R.id.rv_most_wickets;
                                                                    RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_wickets);
                                                                    if (recyclerView6 != null) {
                                                                        i = R.id.toolbar;
                                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                        if (linearLayout7 != null) {
                                                                            i = R.id.txt_title;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                            if (textView != null) {
                                                                                return new ActivityBowlingBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, linearLayout7, textView);
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
