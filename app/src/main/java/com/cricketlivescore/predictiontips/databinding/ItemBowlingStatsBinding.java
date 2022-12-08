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


public final class ItemBowlingStatsBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgPlayerImage;
    private final LinearLayout rootView;
    public final TextView txtOne;
    public final TextView txtPlayerName;
    public final TextView txtTeamName;
    public final TextView txtThree;
    public final TextView txtTwo;

    private ItemBowlingStatsBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgPlayerImage = imageView;
        this.txtOne = textView;
        this.txtPlayerName = textView2;
        this.txtTeamName = textView3;
        this.txtThree = textView4;
        this.txtTwo = textView5;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBowlingStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBowlingStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bowling_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBowlingStatsBinding bind(View view) {
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
                            i = R.id.txt_three;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_three);
                            if (textView4 != null) {
                                i = R.id.txt_two;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_two);
                                if (textView5 != null) {
                                    return new ItemBowlingStatsBinding((LinearLayout) view, cardView, imageView, textView, textView2, textView3, textView4, textView5);
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
