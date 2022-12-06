package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentOtherLeaguesBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final LinearLayout llBbl;
    public final LinearLayout llIpl;
    public final RelativeLayout rlAdBottom;
    private final ScrollView rootView;
    public final RecyclerView rvBbl;
    public final RecyclerView rvIpl;

    private FragmentOtherLeaguesBinding(ScrollView scrollView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = scrollView;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.llBbl = linearLayout;
        this.llIpl = linearLayout2;
        this.rlAdBottom = relativeLayout;
        this.rvBbl = recyclerView;
        this.rvIpl = recyclerView2;
    }

    @Override 
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentOtherLeaguesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOtherLeaguesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_other_leagues, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOtherLeaguesBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.ll_bbl;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_bbl);
                if (linearLayout != null) {
                    i = R.id.ll_ipl;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_ipl);
                    if (linearLayout2 != null) {
                        i = R.id.rl_ad_bottom;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                        if (relativeLayout != null) {
                            i = R.id.rv_bbl;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_bbl);
                            if (recyclerView != null) {
                                i = R.id.rv_ipl;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_ipl);
                                if (recyclerView2 != null) {
                                    return new FragmentOtherLeaguesBinding((ScrollView) view, imageView, imageView2, linearLayout, linearLayout2, relativeLayout, recyclerView, recyclerView2);
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
