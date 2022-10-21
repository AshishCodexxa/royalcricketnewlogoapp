package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemScorecardBinding implements ViewBinding {
    public final ImageView imgItemScArrow;
    public final ImageView imgItemScFlag;
    public final LinearLayout llScoreCard;
    public final LinearLayout llScoreDetail;
    private final LinearLayout rootView;
    public final RecyclerView rvBatter;
    public final RecyclerView rvBowler;
    public final RecyclerView rvFallOfWickets;
    public final TextView txtItemScTeam;
    public final TextView txtItemScTeamScore;
    public final TextView txtScERun;
    public final TextView txtScExtra;
    public final TextView txtScTotalOver;
    public final TextView txtScTotalRun;
    public final TextView txtYetToBat;

    private ItemScorecardBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.imgItemScArrow = imageView;
        this.imgItemScFlag = imageView2;
        this.llScoreCard = linearLayout2;
        this.llScoreDetail = linearLayout3;
        this.rvBatter = recyclerView;
        this.rvBowler = recyclerView2;
        this.rvFallOfWickets = recyclerView3;
        this.txtItemScTeam = textView;
        this.txtItemScTeamScore = textView2;
        this.txtScERun = textView3;
        this.txtScExtra = textView4;
        this.txtScTotalOver = textView5;
        this.txtScTotalRun = textView6;
        this.txtYetToBat = textView7;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemScorecardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScorecardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_scorecard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemScorecardBinding bind(View view) {
        int i = R.id.img_item_sc_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_sc_arrow);
        if (imageView != null) {
            i = R.id.img_item_sc_flag;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_sc_flag);
            if (imageView2 != null) {
                i = R.id.ll_scoreCard;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_scoreCard);
                if (linearLayout != null) {
                    i = R.id.ll_score_detail;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_detail);
                    if (linearLayout2 != null) {
                        i = R.id.rv_batter;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_batter);
                        if (recyclerView != null) {
                            i = R.id.rv_bowler;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_bowler);
                            if (recyclerView2 != null) {
                                i = R.id.rv_fall_of_wickets;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_fall_of_wickets);
                                if (recyclerView3 != null) {
                                    i = R.id.txt_item_sc_team;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_sc_team);
                                    if (textView != null) {
                                        i = R.id.txt_item_sc_teamScore;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_sc_teamScore);
                                        if (textView2 != null) {
                                            i = R.id.txt_sc_eRun;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_sc_eRun);
                                            if (textView3 != null) {
                                                i = R.id.txt_sc_extra;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_sc_extra);
                                                if (textView4 != null) {
                                                    i = R.id.txt_sc_totalOver;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_sc_totalOver);
                                                    if (textView5 != null) {
                                                        i = R.id.txt_sc_totalRun;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_sc_totalRun);
                                                        if (textView6 != null) {
                                                            i = R.id.txt_yetToBat;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_yetToBat);
                                                            if (textView7 != null) {
                                                                return new ItemScorecardBinding((LinearLayout) view, imageView, imageView2, linearLayout, linearLayout2, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
