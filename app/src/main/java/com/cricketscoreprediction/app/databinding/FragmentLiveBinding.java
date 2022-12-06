package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.cricketscoreprediction.app.R;


public final class FragmentLiveBinding implements ViewBinding {
    public final FrameLayout frameLiveSchedule;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutLiveSchedule;

    private FragmentLiveBinding(LinearLayout linearLayout, FrameLayout frameLayout, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.frameLiveSchedule = frameLayout;
        this.tabLayoutLiveSchedule = tabLayout;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLiveBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLiveBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_live, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLiveBinding bind(View view) {
        int i = R.id.frame_liveSchedule;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame_liveSchedule);
        if (frameLayout != null) {
            i = R.id.tabLayout_LiveSchedule;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_LiveSchedule);
            if (tabLayout != null) {
                return new FragmentLiveBinding((LinearLayout) view, frameLayout, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
