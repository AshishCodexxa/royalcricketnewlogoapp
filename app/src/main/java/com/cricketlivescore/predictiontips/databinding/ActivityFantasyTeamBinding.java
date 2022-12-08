package com.cricketlivescore.predictiontips.databinding;

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

import com.cricketlivescore.predictiontips.R;

public final class ActivityFantasyTeamBinding implements ViewBinding {
    public final ImageView imgBack;
    public final ImageView imgHome;
    public final LinearLayout llNoData;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvTeams;
    public final ScrollView scrollView;
    public final RelativeLayout toolbar;
    public final TextView txtToolbarMaTitle;

    private ActivityFantasyTeamBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar2, RecyclerView recyclerView, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.imgBack = imageView;
        this.imgHome = imageView2;
        this.llNoData = linearLayout;
        this.progressBar = progressBar2;
        this.rvTeams = recyclerView;
        this.scrollView = scrollView2;
        this.toolbar = relativeLayout2;
        this.txtToolbarMaTitle = textView;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFantasyTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFantasyTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_fantasy_team, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFantasyTeamBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.img_home;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_home);
            if (imageView2 != null) {
                i = R.id.ll_no_data;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                if (linearLayout != null) {
                    i = R.id.progressBar;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                    if (progressBar2 != null) {
                        i = R.id.rv_teams;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_teams);
                        if (recyclerView != null) {
                            i = R.id.scrollView;
                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                            if (scrollView2 != null) {
                                i = R.id.toolbar;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                if (relativeLayout != null) {
                                    i = R.id.txt_toolbar_ma_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_ma_title);
                                    if (textView != null) {
                                        return new ActivityFantasyTeamBinding((RelativeLayout) view, imageView, imageView2, linearLayout, progressBar2, recyclerView, scrollView2, relativeLayout, textView);
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
