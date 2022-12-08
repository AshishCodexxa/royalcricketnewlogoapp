package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemUpScheduleMatchBinding implements ViewBinding {
    public final CardView cardItemUps;
    public final ImageView imgItemUpsAFlag;
    public final ImageView imgItemUpsHFlag;
    public final LinearLayout llItemUps;
    private final CardView rootView;
    public final TextView txtItemUpsAScore;
    public final TextView txtItemUpsATeam;
    public final TextView txtItemUpsHScore;
    public final TextView txtItemUpsHTeam;
    public final TextView txtItemUpsMatchNumber;
    public final TextView txtItemUpsMatchStatus;
    public final TextView txtItemUpsMatchType;
    public final TextView txtItemUpsVenue;

    private ItemUpScheduleMatchBinding(CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = cardView;
        this.cardItemUps = cardView2;
        this.imgItemUpsAFlag = imageView;
        this.imgItemUpsHFlag = imageView2;
        this.llItemUps = linearLayout;
        this.txtItemUpsAScore = textView;
        this.txtItemUpsATeam = textView2;
        this.txtItemUpsHScore = textView3;
        this.txtItemUpsHTeam = textView4;
        this.txtItemUpsMatchNumber = textView5;
        this.txtItemUpsMatchStatus = textView6;
        this.txtItemUpsMatchType = textView7;
        this.txtItemUpsVenue = textView8;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemUpScheduleMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemUpScheduleMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_up_schedule_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemUpScheduleMatchBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.img_item_ups_a_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_ups_a_flag);
        if (imageView != null) {
            i = R.id.img_item_ups_h_flag;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_ups_h_flag);
            if (imageView2 != null) {
                i = R.id.ll_item_ups;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_item_ups);
                if (linearLayout != null) {
                    i = R.id.txt_item_ups_a_score;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_a_score);
                    if (textView != null) {
                        i = R.id.txt_item_ups_a_team;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_a_team);
                        if (textView2 != null) {
                            i = R.id.txt_item_ups_h_score;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_h_score);
                            if (textView3 != null) {
                                i = R.id.txt_item_ups_h_team;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_h_team);
                                if (textView4 != null) {
                                    i = R.id.txt_item_ups_matchNumber;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_matchNumber);
                                    if (textView5 != null) {
                                        i = R.id.txt_item_ups_matchStatus;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_matchStatus);
                                        if (textView6 != null) {
                                            i = R.id.txt_item_ups_matchType;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_matchType);
                                            if (textView7 != null) {
                                                i = R.id.txt_item_ups_venue;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_ups_venue);
                                                if (textView8 != null) {
                                                    return new ItemUpScheduleMatchBinding(cardView, cardView, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
