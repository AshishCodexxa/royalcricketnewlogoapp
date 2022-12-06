package com.cricketscoreprediction.app.databinding;

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

import com.cricketscoreprediction.app.R;

public final class ActivityBattingBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgBack;
    public final LinearLayout llBestAvg;
    public final LinearLayout llBestSr;
    public final LinearLayout llHighestScore;
    public final LinearLayout llMost4s;
    public final LinearLayout llMost50;
    public final LinearLayout llMost6s;
    public final LinearLayout llMostRuns;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvBestAvg;
    public final RecyclerView rvBestSr;
    public final RecyclerView rvHighestScore;
    public final RecyclerView rvMost4s;
    public final RecyclerView rvMost50;
    public final RecyclerView rvMost6s;
    public final RecyclerView rvMostRuns;
    public final LinearLayout toolbar;
    public final TextView txtTitle;

    private ActivityBattingBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, LinearLayout linearLayout8, TextView textView) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgBack = imageView3;
        this.llBestAvg = linearLayout;
        this.llBestSr = linearLayout2;
        this.llHighestScore = linearLayout3;
        this.llMost4s = linearLayout4;
        this.llMost50 = linearLayout5;
        this.llMost6s = linearLayout6;
        this.llMostRuns = linearLayout7;
        this.rlAdBottom = relativeLayout2;
        this.rvBestAvg = recyclerView;
        this.rvBestSr = recyclerView2;
        this.rvHighestScore = recyclerView3;
        this.rvMost4s = recyclerView4;
        this.rvMost50 = recyclerView5;
        this.rvMost6s = recyclerView6;
        this.rvMostRuns = recyclerView7;
        this.toolbar = linearLayout8;
        this.txtTitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBattingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBattingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_batting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBattingBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_back;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                if (imageView3 != null) {
                    i = R.id.ll_best_avg;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_avg);
                    if (linearLayout != null) {
                        i = R.id.ll_best_sr;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_best_sr);
                        if (linearLayout2 != null) {
                            i = R.id.ll_highest_score;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_highest_score);
                            if (linearLayout3 != null) {
                                i = R.id.ll_most_4s;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_4s);
                                if (linearLayout4 != null) {
                                    i = R.id.ll_most_50;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_50);
                                    if (linearLayout5 != null) {
                                        i = R.id.ll_most_6s;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_6s);
                                        if (linearLayout6 != null) {
                                            i = R.id.ll_most_runs;
                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_runs);
                                            if (linearLayout7 != null) {
                                                i = R.id.rl_ad_bottom;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                if (relativeLayout != null) {
                                                    i = R.id.rv_best_avg;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_avg);
                                                    if (recyclerView != null) {
                                                        i = R.id.rv_best_sr;
                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_best_sr);
                                                        if (recyclerView2 != null) {
                                                            i = R.id.rv_highest_score;
                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_highest_score);
                                                            if (recyclerView3 != null) {
                                                                i = R.id.rv_most_4s;
                                                                RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_4s);
                                                                if (recyclerView4 != null) {
                                                                    i = R.id.rv_most_50;
                                                                    RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_50);
                                                                    if (recyclerView5 != null) {
                                                                        i = R.id.rv_most_6s;
                                                                        RecyclerView recyclerView6 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_6s);
                                                                        if (recyclerView6 != null) {
                                                                            i = R.id.rv_most_runs;
                                                                            RecyclerView recyclerView7 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_runs);
                                                                            if (recyclerView7 != null) {
                                                                                i = R.id.toolbar;
                                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                if (linearLayout8 != null) {
                                                                                    i = R.id.txt_title;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                                    if (textView != null) {
                                                                                        return new ActivityBattingBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, relativeLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, linearLayout8, textView);
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
