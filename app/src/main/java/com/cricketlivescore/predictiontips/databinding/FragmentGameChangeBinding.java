package com.cricketlivescore.predictiontips.databinding;

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
import com.cricketlivescore.predictiontips.R;


public final class FragmentGameChangeBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgInfo;
    public final LinearLayout llHeadToHead;
    public final LinearLayout llNoData;
    public final ProgressBar progressBar;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvGameChange;
    public final ScrollView scrollView;

    private FragmentGameChangeBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, ScrollView scrollView2) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgInfo = imageView3;
        this.llHeadToHead = linearLayout;
        this.llNoData = linearLayout2;
        this.progressBar = progressBar2;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rvGameChange = recyclerView;
        this.scrollView = scrollView2;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentGameChangeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGameChangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_game_change, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentGameChangeBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_info;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                if (imageView3 != null) {
                    i = R.id.ll_headToHead;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_headToHead);
                    if (linearLayout != null) {
                        i = R.id.ll_no_data;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                        if (linearLayout2 != null) {
                            i = R.id.progressBar;
                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                            if (progressBar2 != null) {
                                i = R.id.rl_ad_bottom;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                if (relativeLayout != null) {
                                    i = R.id.rl_info;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                    if (relativeLayout2 != null) {
                                        i = R.id.rv_game_change;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_game_change);
                                        if (recyclerView != null) {
                                            i = R.id.scrollView;
                                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                            if (scrollView2 != null) {
                                                return new FragmentGameChangeBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, progressBar2, relativeLayout, relativeLayout2, recyclerView, scrollView2);
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
