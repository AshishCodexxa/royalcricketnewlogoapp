package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentScoreCardBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final LinearLayout llNoData;
    public final ProgressBar progressScorecard;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvScorecard;
    public final ScrollView scrollScorecard;

    private FragmentScoreCardBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, RecyclerView recyclerView, ScrollView scrollView) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.llNoData = linearLayout;
        this.progressScorecard = progressBar;
        this.rlAdViewBottom = relativeLayout2;
        this.rvScorecard = recyclerView;
        this.scrollScorecard = scrollView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentScoreCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScoreCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_score_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentScoreCardBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.ll_no_data;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                if (linearLayout != null) {
                    i = R.id.progress_scorecard;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress_scorecard);
                    if (progressBar != null) {
                        i = R.id.rl_adView_bottom;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                        if (relativeLayout != null) {
                            i = R.id.rv_scorecard;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_scorecard);
                            if (recyclerView != null) {
                                i = R.id.scroll_scorecard;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_scorecard);
                                if (scrollView != null) {
                                    return new FragmentScoreCardBinding((RelativeLayout) view, imageView, imageView2, linearLayout, progressBar, relativeLayout, recyclerView, scrollView);
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
