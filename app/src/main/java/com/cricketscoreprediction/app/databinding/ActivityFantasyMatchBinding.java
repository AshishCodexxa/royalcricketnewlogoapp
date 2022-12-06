package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;

public final class ActivityFantasyMatchBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView card;
    public final ImageView imgBack;
    public final ImageView imgHome;
    public final LinearLayout llMatchStatus;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlPoint;
    public final RelativeLayout rlScore;
    private final LinearLayout rootView;
    public final RecyclerView rvAllRounder;
    public final RecyclerView rvBatter;
    public final RecyclerView rvBowler;
    public final RecyclerView rvKeeper;
    public final RecyclerView rvMatchDetail;
    public final TextView txtMatchStatus;
    public final TextView txtPoints;
    public final TextView txtSeriesName;

    private ActivityFantasyMatchBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.card = cardView;
        this.imgBack = imageView3;
        this.imgHome = imageView4;
        this.llMatchStatus = linearLayout2;
        this.rlAdBottom = relativeLayout;
        this.rlPoint = relativeLayout2;
        this.rlScore = relativeLayout3;
        this.rvAllRounder = recyclerView;
        this.rvBatter = recyclerView2;
        this.rvBowler = recyclerView3;
        this.rvKeeper = recyclerView4;
        this.rvMatchDetail = recyclerView5;
        this.txtMatchStatus = textView;
        this.txtPoints = textView2;
        this.txtSeriesName = textView3;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFantasyMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFantasyMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_fantasy_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFantasyMatchBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card);
                if (cardView != null) {
                    i = R.id.img_back;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                    if (imageView3 != null) {
                        i = R.id.img_home;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_home);
                        if (imageView4 != null) {
                            i = R.id.ll_matchStatus;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_matchStatus);
                            if (linearLayout != null) {
                                i = R.id.rl_ad_bottom;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                if (relativeLayout != null) {
                                    i = R.id.rl_point;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_point);
                                    if (relativeLayout2 != null) {
                                        i = R.id.rl_score;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_score);
                                        if (relativeLayout3 != null) {
                                            i = R.id.rvAllRounder;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvAllRounder);
                                            if (recyclerView != null) {
                                                i = R.id.rvBatter;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBatter);
                                                if (recyclerView2 != null) {
                                                    i = R.id.rvBowler;
                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBowler);
                                                    if (recyclerView3 != null) {
                                                        i = R.id.rvKeeper;
                                                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvKeeper);
                                                        if (recyclerView4 != null) {
                                                            i = R.id.rv_match_detail;
                                                            RecyclerView recyclerView5 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_match_detail);
                                                            if (recyclerView5 != null) {
                                                                i = R.id.txt_matchStatus;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_matchStatus);
                                                                if (textView != null) {
                                                                    i = R.id.txt_points;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_points);
                                                                    if (textView2 != null) {
                                                                        i = R.id.txt_seriesName;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_seriesName);
                                                                        if (textView3 != null) {
                                                                            return new ActivityFantasyMatchBinding((LinearLayout) view, imageView, imageView2, cardView, imageView3, imageView4, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, textView, textView2, textView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
