package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemValuablePlayerBinding implements ViewBinding {
    public final CardView cardItemUps;
    public final ImageView imgPlayer;
    private final CardView rootView;
    public final TextView txtPlayerCountry;
    public final TextView txtPlayerName;
    public final TextView txtPoint;
    public final View viewColor;

    private ItemValuablePlayerBinding(CardView cardView, CardView cardView2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = cardView;
        this.cardItemUps = cardView2;
        this.imgPlayer = imageView;
        this.txtPlayerCountry = textView;
        this.txtPlayerName = textView2;
        this.txtPoint = textView3;
        this.viewColor = view;
    }

    @Override
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemValuablePlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemValuablePlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_valuable_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemValuablePlayerBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.img_player;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
        if (imageView != null) {
            i = R.id.txt_player_country;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_country);
            if (textView != null) {
                i = R.id.txt_player_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                if (textView2 != null) {
                    i = R.id.txt_point;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_point);
                    if (textView3 != null) {
                        i = R.id.view_color;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_color);
                        if (findChildViewById != null) {
                            return new ItemValuablePlayerBinding(cardView, cardView, imageView, textView, textView2, textView3, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
