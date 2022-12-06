package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;


public final class ItemFieldingStatsBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgPlayerImage;
    private final LinearLayout rootView;
    public final TextView txtOne;
    public final TextView txtPlayerName;
    public final TextView txtTeamName;
    public final TextView txtTwo;

    private ItemFieldingStatsBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgPlayerImage = imageView;
        this.txtOne = textView;
        this.txtPlayerName = textView2;
        this.txtTeamName = textView3;
        this.txtTwo = textView4;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFieldingStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFieldingStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fielding_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFieldingStatsBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.img_playerImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
            if (imageView != null) {
                i = R.id.txt_one;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_one);
                if (textView != null) {
                    i = R.id.txt_player_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                    if (textView2 != null) {
                        i = R.id.txt_team_name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                        if (textView3 != null) {
                            i = R.id.txt_two;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_two);
                            if (textView4 != null) {
                                return new ItemFieldingStatsBinding((LinearLayout) view, cardView, imageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
