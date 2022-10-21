package com.gsbusiness.livecricketscoreprediction.databinding;

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

import com.gsbusiness.livecricketscoreprediction.R;

public final class ActivityFieldingBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView imgBack;
    public final LinearLayout llMostCatches;
    public final LinearLayout llMostDismissal;
    public final LinearLayout llMostRunout;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvMostCatches;
    public final RecyclerView rvMostDismissal;
    public final RecyclerView rvMostRunout;
    public final LinearLayout toolbar;
    public final TextView txtTitle;

    private ActivityFieldingBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, LinearLayout linearLayout4, TextView textView) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.imgBack = imageView3;
        this.llMostCatches = linearLayout;
        this.llMostDismissal = linearLayout2;
        this.llMostRunout = linearLayout3;
        this.rlAdBottom = relativeLayout2;
        this.rvMostCatches = recyclerView;
        this.rvMostDismissal = recyclerView2;
        this.rvMostRunout = recyclerView3;
        this.toolbar = linearLayout4;
        this.txtTitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFieldingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFieldingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_fielding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFieldingBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_back;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                if (imageView3 != null) {
                    i = R.id.ll_most_catches;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_catches);
                    if (linearLayout != null) {
                        i = R.id.ll_most_dismissal;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_dismissal);
                        if (linearLayout2 != null) {
                            i = R.id.ll_most_runout;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_runout);
                            if (linearLayout3 != null) {
                                i = R.id.rl_ad_bottom;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                if (relativeLayout != null) {
                                    i = R.id.rv_most_catches;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_catches);
                                    if (recyclerView != null) {
                                        i = R.id.rv_most_dismissal;
                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_dismissal);
                                        if (recyclerView2 != null) {
                                            i = R.id.rv_most_runout;
                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_most_runout);
                                            if (recyclerView3 != null) {
                                                i = R.id.toolbar;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                if (linearLayout4 != null) {
                                                    i = R.id.txt_title;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                    if (textView != null) {
                                                        return new ActivityFieldingBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, relativeLayout, recyclerView, recyclerView2, recyclerView3, linearLayout4, textView);
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
