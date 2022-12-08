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


public final class FragmentHighlightsBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final LinearLayout llFour;
    public final LinearLayout llNoData;
    public final LinearLayout llSix;
    public final LinearLayout llTotal;
    public final LinearLayout llWicket;
    public final ProgressBar progressHighlights;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvHighlightsType;
    public final RecyclerView rvInnings;
    public final RecyclerView rvTypeData;
    public final ScrollView scrollHighlights;
    public final TextView txtFour;
    public final TextView txtSix;
    public final TextView txtWicket;

    private FragmentHighlightsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ProgressBar progressBar, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.llFour = linearLayout;
        this.llNoData = linearLayout2;
        this.llSix = linearLayout3;
        this.llTotal = linearLayout4;
        this.llWicket = linearLayout5;
        this.progressHighlights = progressBar;
        this.rlAdViewBottom = relativeLayout2;
        this.rvHighlightsType = recyclerView;
        this.rvInnings = recyclerView2;
        this.rvTypeData = recyclerView3;
        this.scrollHighlights = scrollView;
        this.txtFour = textView;
        this.txtSix = textView2;
        this.txtWicket = textView3;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHighlightsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHighlightsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_highlights, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHighlightsBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.ll_four;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_four);
                if (linearLayout != null) {
                    i = R.id.ll_no_data;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                    if (linearLayout2 != null) {
                        i = R.id.ll_six;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_six);
                        if (linearLayout3 != null) {
                            i = R.id.ll_total;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_total);
                            if (linearLayout4 != null) {
                                i = R.id.ll_wicket;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_wicket);
                                if (linearLayout5 != null) {
                                    i = R.id.progress_highlights;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress_highlights);
                                    if (progressBar != null) {
                                        i = R.id.rl_adView_bottom;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                                        if (relativeLayout != null) {
                                            i = R.id.rv_highlightsType;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_highlightsType);
                                            if (recyclerView != null) {
                                                i = R.id.rv_innings;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_innings);
                                                if (recyclerView2 != null) {
                                                    i = R.id.rv_type_data;
                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_type_data);
                                                    if (recyclerView3 != null) {
                                                        i = R.id.scroll_highlights;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_highlights);
                                                        if (scrollView != null) {
                                                            i = R.id.txt_four;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_four);
                                                            if (textView != null) {
                                                                i = R.id.txt_six;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_six);
                                                                if (textView2 != null) {
                                                                    i = R.id.txt_wicket;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_wicket);
                                                                    if (textView3 != null) {
                                                                        return new FragmentHighlightsBinding((RelativeLayout) view, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, progressBar, relativeLayout, recyclerView, recyclerView2, recyclerView3, scrollView, textView, textView2, textView3);
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
