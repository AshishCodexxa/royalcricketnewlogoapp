package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemPredictorBinding implements ViewBinding {
    public final CardView card;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final TextView txtTeam;
    public final TextView txtTeamPer;

    private ItemPredictorBinding(LinearLayout linearLayout, CardView cardView, ProgressBar progressBar2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.card = cardView;
        this.progressBar = progressBar2;
        this.txtTeam = textView;
        this.txtTeamPer = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPredictorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPredictorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_predictor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPredictorBinding bind(View view) {
        int i = R.id.card;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card);
        if (cardView != null) {
            i = R.id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
            if (progressBar2 != null) {
                i = R.id.txt_team;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                if (textView != null) {
                    i = R.id.txt_team_per;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_per);
                    if (textView2 != null) {
                        return new ItemPredictorBinding((LinearLayout) view, cardView, progressBar2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
