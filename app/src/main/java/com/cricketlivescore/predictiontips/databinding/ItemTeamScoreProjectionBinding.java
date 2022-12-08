package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

import com.cricketlivescore.predictiontips.R;
import androidx.viewbinding.ViewBindings;


public final class ItemTeamScoreProjectionBinding implements ViewBinding {
    public final ImageView imgFlag;
    private final ConstraintLayout rootView;
    public final TextView txtOver;
    public final TextView txtProjectionOver;
    public final TextView txtProjectionScore;
    public final TextView txtScore;
    public final TextView txtTeam;

    private ItemTeamScoreProjectionBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.imgFlag = imageView;
        this.txtOver = textView;
        this.txtProjectionOver = textView2;
        this.txtProjectionScore = textView3;
        this.txtScore = textView4;
        this.txtTeam = textView5;
    }

    @Override
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemTeamScoreProjectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTeamScoreProjectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_team_score_projection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTeamScoreProjectionBinding bind(View view) {
        int i = R.id.img_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag);
        if (imageView != null) {
            i = R.id.txt_over;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over);
            if (textView != null) {
                i = R.id.txt_projection_over;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_over);
                if (textView2 != null) {
                    i = R.id.txt_projection_score;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection_score);
                    if (textView3 != null) {
                        i = R.id.txt_score;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score);
                        if (textView4 != null) {
                            i = R.id.txt_team;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                            if (textView5 != null) {
                                return new ItemTeamScoreProjectionBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
