package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.cricketlivescore.predictiontips.R;


public final class FragmentUpComingBinding implements ViewBinding {
    public final FrameLayout frameUpSchedule;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutUpSchedule;

    private FragmentUpComingBinding(LinearLayout linearLayout, FrameLayout frameLayout, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.frameUpSchedule = frameLayout;
        this.tabLayoutUpSchedule = tabLayout;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUpComingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUpComingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_up_coming, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUpComingBinding bind(View view) {
        int i = R.id.frame_UpSchedule;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame_UpSchedule);
        if (frameLayout != null) {
            i = R.id.tabLayout_UpSchedule;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_UpSchedule);
            if (tabLayout != null) {
                return new FragmentUpComingBinding((LinearLayout) view, frameLayout, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
