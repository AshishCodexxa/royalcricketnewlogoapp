package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentResultsBinding implements ViewBinding {
    public final FrameLayout frameResultSchedule;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutResultSchedule;

    private FragmentResultsBinding(LinearLayout linearLayout, FrameLayout frameLayout, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.frameResultSchedule = frameLayout;
        this.tabLayoutResultSchedule = tabLayout;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResultsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentResultsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_results, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentResultsBinding bind(View view) {
        int i = R.id.frame_resultSchedule;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame_resultSchedule);
        if (frameLayout != null) {
            i = R.id.tabLayout_ResultSchedule;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_ResultSchedule);
            if (tabLayout != null) {
                return new FragmentResultsBinding((LinearLayout) view, frameLayout, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
