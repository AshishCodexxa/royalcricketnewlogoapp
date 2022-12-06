package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.cricketscoreprediction.app.R;


public final class ActivityIplBinding implements ViewBinding {
    public final FrameLayout frameLayout;
    public final ImageView imgBack;
    private final RelativeLayout rootView;
    public final TabLayout tabLayout;
    public final TextView txtTitle;
    public final ViewPager2 viewPager;

    private ActivityIplBinding(RelativeLayout relativeLayout, FrameLayout frameLayout2, ImageView imageView, TabLayout tabLayout2, TextView textView, ViewPager2 viewPager2) {
        this.rootView = relativeLayout;
        this.frameLayout = frameLayout2;
        this.imgBack = imageView;
        this.tabLayout = tabLayout2;
        this.txtTitle = textView;
        this.viewPager = viewPager2;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityIplBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityIplBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_ipl, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityIplBinding bind(View view) {
        int i = R.id.frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
        if (frameLayout2 != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.tabLayout;
                TabLayout tabLayout2 = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout);
                if (tabLayout2 != null) {
                    i = R.id.txt_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                    if (textView != null) {
                        i = R.id.view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.view_pager);
                        if (viewPager2 != null) {
                            return new ActivityIplBinding((RelativeLayout) view, frameLayout2, imageView, tabLayout2, textView, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
