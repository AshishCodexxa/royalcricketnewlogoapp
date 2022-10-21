package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;


import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.CustomProgressBar;

public final class ItemGameChangeBinding implements ViewBinding {
    public final CustomProgressBar customProgressBar;
    public final LinearLayout llReportCard;
    private final LinearLayout rootView;
    public final RecyclerView rvOver;
    public final TextView txtAway;
    public final TextView txtAwayPer;
    public final TextView txtHome;
    public final TextView txtHomePer;
    public final TextView txtOver;
    public final TextView txtScore;
    public final TextView txtTie;
    public final TextView txtTiePer;

    private ItemGameChangeBinding(LinearLayout linearLayout, CustomProgressBar customProgressBar2, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = linearLayout;
        this.customProgressBar = customProgressBar2;
        this.llReportCard = linearLayout2;
        this.rvOver = recyclerView;
        this.txtAway = textView;
        this.txtAwayPer = textView2;
        this.txtHome = textView3;
        this.txtHomePer = textView4;
        this.txtOver = textView5;
        this.txtScore = textView6;
        this.txtTie = textView7;
        this.txtTiePer = textView8;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemGameChangeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGameChangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_game_change, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGameChangeBinding bind(View view) {
        int i = R.id.customProgressBar;
        CustomProgressBar customProgressBar2 = (CustomProgressBar) ViewBindings.findChildViewById(view, R.id.customProgressBar);
        if (customProgressBar2 != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.rv_over;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_over);
            if (recyclerView != null) {
                i = R.id.txt_away;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_away);
                if (textView != null) {
                    i = R.id.txt_away_per;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_away_per);
                    if (textView2 != null) {
                        i = R.id.txt_home;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_home);
                        if (textView3 != null) {
                            i = R.id.txt_home_per;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_home_per);
                            if (textView4 != null) {
                                i = R.id.txt_over;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_over);
                                if (textView5 != null) {
                                    i = R.id.txt_score;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score);
                                    if (textView6 != null) {
                                        i = R.id.txt_tie;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie);
                                        if (textView7 != null) {
                                            i = R.id.txt_tie_per;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie_per);
                                            if (textView8 != null) {
                                                return new ItemGameChangeBinding(linearLayout, customProgressBar2, linearLayout, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
