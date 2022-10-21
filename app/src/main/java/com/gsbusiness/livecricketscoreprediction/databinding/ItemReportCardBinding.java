package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemReportCardBinding implements ViewBinding {
    public final ImageView imgFlag;
    public final ImageView imgPlayerImage;
    public final LinearLayout llRating;
    public final LinearLayout llReportCard;
    private final CardView rootView;
    public final TextView txtPlayerBatRate;
    public final TextView txtPlayerBowlRate;
    public final TextView txtPlayerName;
    public final TextView txtPlayerRate;
    public final TextView txtTeam;

    private ItemReportCardBinding(CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = cardView;
        this.imgFlag = imageView;
        this.imgPlayerImage = imageView2;
        this.llRating = linearLayout;
        this.llReportCard = linearLayout2;
        this.txtPlayerBatRate = textView;
        this.txtPlayerBowlRate = textView2;
        this.txtPlayerName = textView3;
        this.txtPlayerRate = textView4;
        this.txtTeam = textView5;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemReportCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemReportCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_report_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemReportCardBinding bind(View view) {
        int i = R.id.img_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag);
        if (imageView != null) {
            i = R.id.img_playerImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
            if (imageView2 != null) {
                i = R.id.ll_rating;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_rating);
                if (linearLayout != null) {
                    i = R.id.ll_report_card;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_report_card);
                    if (linearLayout2 != null) {
                        i = R.id.txt_player_bat_rate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bat_rate);
                        if (textView != null) {
                            i = R.id.txt_player_bowl_rate;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bowl_rate);
                            if (textView2 != null) {
                                i = R.id.txt_playerName;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_playerName);
                                if (textView3 != null) {
                                    i = R.id.txt_player_rate;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_rate);
                                    if (textView4 != null) {
                                        i = R.id.txt_team;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                                        if (textView5 != null) {
                                            return new ItemReportCardBinding((CardView) view, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
