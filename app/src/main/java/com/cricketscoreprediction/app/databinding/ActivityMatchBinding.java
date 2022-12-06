package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.cricketscoreprediction.app.R;


public final class ActivityMatchBinding implements ViewBinding {
    public final TabLayout TabLayoutMa;
    public final ViewPager ViewPagerMa;
    public final ImageView imgBack;
    public final LinearLayout llCricklytics;
    public final LinearLayout llFantacy;
    public final LinearLayout llPrediction;
    private final LinearLayout rootView;
    public final RecyclerView rvMatchDetail;
    public final TextView txtMaLive;
    public final TextView txtMaMatchStatus;
    public final TextView txtToolbarTitle;

    private ActivityMatchBinding(LinearLayout linearLayout, TabLayout tabLayout, ViewPager viewPager, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.TabLayoutMa = tabLayout;
        this.ViewPagerMa = viewPager;
        this.imgBack = imageView;
        this.llCricklytics = linearLayout2;
        this.llFantacy = linearLayout3;
        this.llPrediction = linearLayout4;
        this.rvMatchDetail = recyclerView;
        this.txtMaLive = textView;
        this.txtMaMatchStatus = textView2;
        this.txtToolbarTitle = textView3;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMatchBinding bind(View view) {
        int i = R.id.TabLayout_ma;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.TabLayout_ma);
        if (tabLayout != null) {
            i = R.id.ViewPager_ma;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.ViewPager_ma);
            if (viewPager != null) {
                i = R.id.img_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                if (imageView != null) {
                    i = R.id.ll_cricklytics;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_cricklytics);
                    if (linearLayout != null) {
                        i = R.id.ll_fantacy;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fantacy);
                        if (linearLayout2 != null) {
                            i = R.id.ll_prediction;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                            if (linearLayout3 != null) {
                                i = R.id.rv_match_detail;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_match_detail);
                                if (recyclerView != null) {
                                    i = R.id.txt_ma_live;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ma_live);
                                    if (textView != null) {
                                        i = R.id.txt_ma_matchStatus;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ma_matchStatus);
                                        if (textView2 != null) {
                                            i = R.id.txt_toolbar_title;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_title);
                                            if (textView3 != null) {
                                                return new ActivityMatchBinding((LinearLayout) view, tabLayout, viewPager, imageView, linearLayout, linearLayout2, linearLayout3, recyclerView, textView, textView2, textView3);
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
