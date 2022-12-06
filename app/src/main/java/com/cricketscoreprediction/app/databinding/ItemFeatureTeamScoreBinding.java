package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;


public final class ItemFeatureTeamScoreBinding implements ViewBinding {
    public final LinearLayout llTeamScore;
    private final LinearLayout rootView;
    public final TextView txtItemTeamOver;
    public final TextView txtItemTeamScore;

    private ItemFeatureTeamScoreBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.llTeamScore = linearLayout2;
        this.txtItemTeamOver = textView;
        this.txtItemTeamScore = textView2;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFeatureTeamScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFeatureTeamScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_feature_team_score, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFeatureTeamScoreBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.txt_item_team_over;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_team_over);
        if (textView != null) {
            i = R.id.txt_item_team_score;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_team_score);
            if (textView2 != null) {
                return new ItemFeatureTeamScoreBinding(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
