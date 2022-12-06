package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;


import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.CustomProgressBar;

public final class ItemScheduleMatchBinding implements ViewBinding {
    public final CardView cardItemFm;
    public final CardView cardLoader;
    public final CustomProgressBar customProgressBar;
    public final ImageView imgDot;
    public final ImageView imgItemAFlag;
    public final ImageView imgItemHFlag;
    public final LinearLayout llPrediction;
    public final RelativeLayout rlNoProjection;
    private final CardView rootView;
    public final TextView txtAway;
    public final TextView txtAwayPer;
    public final TextView txtHome;
    public final TextView txtHomePer;
    public final TextView txtItemATeam;
    public final TextView txtItemDate;
    public final TextView txtItemHTeam;
    public final TextView txtItemMatchNo;
    public final TextView txtItemMatchStatus;
    public final TextView txtItemTime;
    public final TextView txtItemVenue;
    public final TextView txtTie;
    public final TextView txtTiePer;

    private ItemScheduleMatchBinding(CardView cardView, CardView cardView2, CardView cardView3, CustomProgressBar customProgressBar2, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = cardView;
        this.cardItemFm = cardView2;
        this.cardLoader = cardView3;
        this.customProgressBar = customProgressBar2;
        this.imgDot = imageView;
        this.imgItemAFlag = imageView2;
        this.imgItemHFlag = imageView3;
        this.llPrediction = linearLayout;
        this.rlNoProjection = relativeLayout;
        this.txtAway = textView;
        this.txtAwayPer = textView2;
        this.txtHome = textView3;
        this.txtHomePer = textView4;
        this.txtItemATeam = textView5;
        this.txtItemDate = textView6;
        this.txtItemHTeam = textView7;
        this.txtItemMatchNo = textView8;
        this.txtItemMatchStatus = textView9;
        this.txtItemTime = textView10;
        this.txtItemVenue = textView11;
        this.txtTie = textView12;
        this.txtTiePer = textView13;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemScheduleMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScheduleMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_schedule_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemScheduleMatchBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.card_loader;
        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_loader);
        if (cardView2 != null) {
            i = R.id.customProgressBar;
            CustomProgressBar customProgressBar2 = (CustomProgressBar) ViewBindings.findChildViewById(view, R.id.customProgressBar);
            if (customProgressBar2 != null) {
                i = R.id.img_dot;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_dot);
                if (imageView != null) {
                    i = R.id.img_item_a_flag;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_a_flag);
                    if (imageView2 != null) {
                        i = R.id.img_item_h_flag;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_h_flag);
                        if (imageView3 != null) {
                            i = R.id.ll_prediction;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                            if (linearLayout != null) {
                                i = R.id.rl_no_projection;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_no_projection);
                                if (relativeLayout != null) {
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
                                                    i = R.id.txt_item_a_team;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_a_team);
                                                    if (textView5 != null) {
                                                        i = R.id.txt_item_date;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_date);
                                                        if (textView6 != null) {
                                                            i = R.id.txt_item_h_team;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_h_team);
                                                            if (textView7 != null) {
                                                                i = R.id.txt_item_matchNo;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchNo);
                                                                if (textView8 != null) {
                                                                    i = R.id.txt_item_matchStatus;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchStatus);
                                                                    if (textView9 != null) {
                                                                        i = R.id.txt_item_time;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_time);
                                                                        if (textView10 != null) {
                                                                            i = R.id.txt_item_venue;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_venue);
                                                                            if (textView11 != null) {
                                                                                i = R.id.txt_tie;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.txt_tie_per;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_tie_per);
                                                                                    if (textView13 != null) {
                                                                                        return new ItemScheduleMatchBinding(cardView, cardView, cardView2, customProgressBar2, imageView, imageView2, imageView3, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
