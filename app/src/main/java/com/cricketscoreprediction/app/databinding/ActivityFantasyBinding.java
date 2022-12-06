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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;

public final class ActivityFantasyBinding implements ViewBinding {
    public final ImageView imgBack;
    public final LinearLayout llCompleted;
    public final LinearLayout llLive;
    public final LinearLayout llNoData;
    public final LinearLayout llUpcoming;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvCompleted;
    public final RecyclerView rvLive;
    public final RecyclerView rvUpcoming;
    public final ScrollView scrollView;
    public final RelativeLayout toolbar;
    public final TextView txtToolbarMaTitle;

    private ActivityFantasyBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.imgBack = imageView;
        this.llCompleted = linearLayout;
        this.llLive = linearLayout2;
        this.llNoData = linearLayout3;
        this.llUpcoming = linearLayout4;
        this.progressBar = progressBar2;
        this.rvCompleted = recyclerView;
        this.rvLive = recyclerView2;
        this.rvUpcoming = recyclerView3;
        this.scrollView = scrollView2;
        this.toolbar = relativeLayout2;
        this.txtToolbarMaTitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFantasyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFantasyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_fantasy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFantasyBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.ll_completed;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_completed);
            if (linearLayout != null) {
                i = R.id.ll_live;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_live);
                if (linearLayout2 != null) {
                    i = R.id.ll_no_data;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                    if (linearLayout3 != null) {
                        i = R.id.ll_upcoming;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_upcoming);
                        if (linearLayout4 != null) {
                            i = R.id.progressBar;
                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                            if (progressBar2 != null) {
                                i = R.id.rv_completed;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_completed);
                                if (recyclerView != null) {
                                    i = R.id.rv_live;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_live);
                                    if (recyclerView2 != null) {
                                        i = R.id.rv_upcoming;
                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_upcoming);
                                        if (recyclerView3 != null) {
                                            i = R.id.scrollView;
                                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                            if (scrollView2 != null) {
                                                i = R.id.toolbar;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                if (relativeLayout != null) {
                                                    i = R.id.txt_toolbar_ma_title;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_ma_title);
                                                    if (textView != null) {
                                                        return new ActivityFantasyBinding((RelativeLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar2, recyclerView, recyclerView2, recyclerView3, scrollView2, relativeLayout, textView);
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
