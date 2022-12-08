package com.cricketlivescore.predictiontips.databinding;

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
import com.cricketlivescore.predictiontips.R;


public final class FragmentIntTeamsBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final LinearLayout llMens;
    public final LinearLayout llWomens;
    public final RelativeLayout rlAdBottom;
    private final ScrollView rootView;
    public final RecyclerView rvMens;
    public final RecyclerView rvWomens;

    private FragmentIntTeamsBinding(ScrollView scrollView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = scrollView;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.llMens = linearLayout;
        this.llWomens = linearLayout2;
        this.rlAdBottom = relativeLayout;
        this.rvMens = recyclerView;
        this.rvWomens = recyclerView2;
    }

    @Override
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIntTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIntTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_int_teams, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentIntTeamsBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.ll_mens;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_mens);
                if (linearLayout != null) {
                    i = R.id.ll_womens;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_womens);
                    if (linearLayout2 != null) {
                        i = R.id.rl_ad_bottom;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                        if (relativeLayout != null) {
                            i = R.id.rv_mens;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_mens);
                            if (recyclerView != null) {
                                i = R.id.rv_womens;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_womens);
                                if (recyclerView2 != null) {
                                    return new FragmentIntTeamsBinding((ScrollView) view, imageView, imageView2, linearLayout, linearLayout2, relativeLayout, recyclerView, recyclerView2);
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
