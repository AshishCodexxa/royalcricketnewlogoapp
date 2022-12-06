package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class ItemComScoreBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView txtBatter;
    public final TextView txtBatterScore;
    public final TextView txtBowler;
    public final TextView txtBowlerWicket;

    private ItemComScoreBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.txtBatter = textView;
        this.txtBatterScore = textView2;
        this.txtBowler = textView3;
        this.txtBowlerWicket = textView4;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemComScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemComScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_com_score, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemComScoreBinding bind(View view) {
        int i = R.id.txt_batter;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_batter);
        if (textView != null) {
            i = R.id.txt_batter_score;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_batter_score);
            if (textView2 != null) {
                i = R.id.txt_bowler;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler);
                if (textView3 != null) {
                    i = R.id.txt_bowler_wicket;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_wicket);
                    if (textView4 != null) {
                        return new ItemComScoreBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
