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


public final class ItemCommentaryBallBinding implements ViewBinding {
    public final LinearLayout llCommentary;
    public final LinearLayout llItemCommentary;
    public final LinearLayout llLastBallView;
    private final LinearLayout rootView;
    public final RecyclerView rvOver;
    public final TextView txtBatterOne;
    public final TextView txtBatterOneState;
    public final TextView txtBatterTwo;
    public final TextView txtBatterTwoState;
    public final TextView txtBowerName;
    public final TextView txtBowerState;
    public final TextView txtItemCBall;
    public final TextView txtItemCOver;
    public final TextView txtItemColor;
    public final TextView txtItemOver;
    public final TextView txtItemScore;
    public final TextView txtItemTeam;
    public final View view;

    private ItemCommentaryBallBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, View view2) {
        this.rootView = linearLayout;
        this.llCommentary = linearLayout2;
        this.llItemCommentary = linearLayout3;
        this.llLastBallView = linearLayout4;
        this.rvOver = recyclerView;
        this.txtBatterOne = textView;
        this.txtBatterOneState = textView2;
        this.txtBatterTwo = textView3;
        this.txtBatterTwoState = textView4;
        this.txtBowerName = textView5;
        this.txtBowerState = textView6;
        this.txtItemCBall = textView7;
        this.txtItemCOver = textView8;
        this.txtItemColor = textView9;
        this.txtItemOver = textView10;
        this.txtItemScore = textView11;
        this.txtItemTeam = textView12;
        this.view = view2;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemCommentaryBallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCommentaryBallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_commentary_ball, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCommentaryBallBinding bind(View view2) {
        LinearLayout linearLayout = (LinearLayout) view2;
        int i = R.id.ll_item_commentary;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, R.id.ll_item_commentary);
        if (linearLayout2 != null) {
            i = R.id.ll_lastBallView;
            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, R.id.ll_lastBallView);
            if (linearLayout3 != null) {
                i = R.id.rv_over;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, R.id.rv_over);
                if (recyclerView != null) {
                    i = R.id.txt_batter_one;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_batter_one);
                    if (textView != null) {
                        i = R.id.txt_batter_one_state;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_batter_one_state);
                        if (textView2 != null) {
                            i = R.id.txt_batter_two;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_batter_two);
                            if (textView3 != null) {
                                i = R.id.txt_batter_two_state;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_batter_two_state);
                                if (textView4 != null) {
                                    i = R.id.txt_bower_name;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_bower_name);
                                    if (textView5 != null) {
                                        i = R.id.txt_bower_state;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_bower_state);
                                        if (textView6 != null) {
                                            i = R.id.txt_item_cBall;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_cBall);
                                            if (textView7 != null) {
                                                i = R.id.txt_item_cOver;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_cOver);
                                                if (textView8 != null) {
                                                    i = R.id.txt_item_color;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_color);
                                                    if (textView9 != null) {
                                                        i = R.id.txt_item_over;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_over);
                                                        if (textView10 != null) {
                                                            i = R.id.txt_item_score;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_score);
                                                            if (textView11 != null) {
                                                                i = R.id.txt_item_team;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, R.id.txt_item_team);
                                                                if (textView12 != null) {
                                                                    i = R.id.view;
                                                                    View findChildViewById = ViewBindings.findChildViewById(view2, R.id.view);
                                                                    if (findChildViewById != null) {
                                                                        return new ItemCommentaryBallBinding(linearLayout, linearLayout, linearLayout2, linearLayout3, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, findChildViewById);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
