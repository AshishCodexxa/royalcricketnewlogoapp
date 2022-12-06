package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class ItemFantasyPlayerBinding implements ViewBinding {
    public final CardView cardItemFm;
    public final CardView cardPlayer;
    public final CardView cardPosition;
    public final ImageView imgPlayer;
    public final ImageView imgTeam;
    private final CardView rootView;
    public final TextView txtPlayer;
    public final TextView txtPlayerType;
    public final TextView txtPosition;

    private ItemFantasyPlayerBinding(CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.cardItemFm = cardView2;
        this.cardPlayer = cardView3;
        this.cardPosition = cardView4;
        this.imgPlayer = imageView;
        this.imgTeam = imageView2;
        this.txtPlayer = textView;
        this.txtPlayerType = textView2;
        this.txtPosition = textView3;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemFantasyPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFantasyPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fantasy_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFantasyPlayerBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.card_player;
        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView2 != null) {
            i = R.id.card_position;
            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.card_position);
            if (cardView3 != null) {
                i = R.id.img_player;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
                if (imageView != null) {
                    i = R.id.img_team;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team);
                    if (imageView2 != null) {
                        i = R.id.txt_player;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player);
                        if (textView != null) {
                            i = R.id.txt_player_type;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_type);
                            if (textView2 != null) {
                                i = R.id.txt_position;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_position);
                                if (textView3 != null) {
                                    return new ItemFantasyPlayerBinding(cardView, cardView, cardView2, cardView3, imageView, imageView2, textView, textView2, textView3);
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
