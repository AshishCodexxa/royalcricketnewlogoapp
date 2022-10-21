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


public final class ItemMostRunsBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgPlayerImage;
    private final LinearLayout rootView;
    public final TextView txtInnings;
    public final TextView txtMatch;
    public final TextView txtPlayerName;
    public final TextView txtRuns;
    public final TextView txtTeamName;

    private ItemMostRunsBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgPlayerImage = imageView;
        this.txtInnings = textView;
        this.txtMatch = textView2;
        this.txtPlayerName = textView3;
        this.txtRuns = textView4;
        this.txtTeamName = textView5;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMostRunsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMostRunsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_most_runs, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMostRunsBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.img_playerImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
            if (imageView != null) {
                i = R.id.txt_innings;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_innings);
                if (textView != null) {
                    i = R.id.txt_match;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match);
                    if (textView2 != null) {
                        i = R.id.txt_player_name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                        if (textView3 != null) {
                            i = R.id.txt_runs;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_runs);
                            if (textView4 != null) {
                                i = R.id.txt_team_name;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                if (textView5 != null) {
                                    return new ItemMostRunsBinding((LinearLayout) view, cardView, imageView, textView, textView2, textView3, textView4, textView5);
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
