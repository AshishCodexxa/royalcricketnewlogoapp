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


public final class ItemHighestScoreBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgPlayerImage;
    public final LinearLayout llHs;
    private final LinearLayout rootView;
    public final TextView txtBall;
    public final TextView txtOpponent;
    public final TextView txtPlayerName;
    public final TextView txtRun;
    public final TextView txtTeamName;
    public final TextView txtVs;

    private ItemHighestScoreBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgPlayerImage = imageView;
        this.llHs = linearLayout2;
        this.txtBall = textView;
        this.txtOpponent = textView2;
        this.txtPlayerName = textView3;
        this.txtRun = textView4;
        this.txtTeamName = textView5;
        this.txtVs = textView6;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHighestScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHighestScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_highest_score, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHighestScoreBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.img_playerImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
            if (imageView != null) {
                i = R.id.ll_hs;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_hs);
                if (linearLayout != null) {
                    i = R.id.txt_ball;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ball);
                    if (textView != null) {
                        i = R.id.txt_opponent;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_opponent);
                        if (textView2 != null) {
                            i = R.id.txt_player_name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                            if (textView3 != null) {
                                i = R.id.txt_run;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_run);
                                if (textView4 != null) {
                                    i = R.id.txt_team_name;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                    if (textView5 != null) {
                                        i = R.id.txt_vs;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_vs);
                                        if (textView6 != null) {
                                            return new ItemHighestScoreBinding((LinearLayout) view, cardView, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
