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


public final class ActivityTeamListBinding implements ViewBinding {
    public final FrameLayout frameLayoutTeams;
    public final ImageView imgBack;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutTeams;

    private ActivityTeamListBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.frameLayoutTeams = frameLayout;
        this.imgBack = imageView;
        this.tabLayoutTeams = tabLayout;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTeamListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTeamListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_team_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTeamListBinding bind(View view) {
        int i = R.id.frameLayout_teams;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout_teams);
        if (frameLayout != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.tabLayout_teams;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_teams);
                if (tabLayout != null) {
                    return new ActivityTeamListBinding((LinearLayout) view, frameLayout, imageView, tabLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
