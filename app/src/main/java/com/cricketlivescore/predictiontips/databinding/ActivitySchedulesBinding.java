package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.cricketlivescore.predictiontips.R;


public final class ActivitySchedulesBinding implements ViewBinding {
    public final FrameLayout frameSchedule;
    public final ImageView imgBack;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutSchedule;

    private ActivitySchedulesBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.frameSchedule = frameLayout;
        this.imgBack = imageView;
        this.tabLayoutSchedule = tabLayout;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySchedulesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySchedulesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_schedules, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySchedulesBinding bind(View view) {
        int i = R.id.frame_schedule;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame_schedule);
        if (frameLayout != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.tabLayout_schedule;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_schedule);
                if (tabLayout != null) {
                    return new ActivitySchedulesBinding((LinearLayout) view, frameLayout, imageView, tabLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
