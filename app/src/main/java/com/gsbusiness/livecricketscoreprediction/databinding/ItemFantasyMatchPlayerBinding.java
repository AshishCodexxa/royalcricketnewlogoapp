package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemFantasyMatchPlayerBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final CardView cardPosition;
    public final ImageView imgPlayer;
    public final ImageView imgTeam;
    private final CardView rootView;
    public final TextView txt;
    public final TextView txtPlayer;
    public final TextView txtPoint;
    public final TextView txtPosition;

    private ItemFantasyMatchPlayerBinding(CardView cardView, CardView cardView2, CardView cardView3, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.cardPlayer = cardView2;
        this.cardPosition = cardView3;
        this.imgPlayer = imageView;
        this.imgTeam = imageView2;
        this.txt = textView;
        this.txtPlayer = textView2;
        this.txtPoint = textView3;
        this.txtPosition = textView4;
    }

    @Override
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemFantasyMatchPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFantasyMatchPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fantasy_match_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFantasyMatchPlayerBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.card_position;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_position);
            if (cardView2 != null) {
                i = R.id.img_player;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
                if (imageView != null) {
                    i = R.id.img_team;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team);
                    if (imageView2 != null) {
                        i = R.id.txt;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt);
                        if (textView != null) {
                            i = R.id.txt_player;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player);
                            if (textView2 != null) {
                                i = R.id.txt_point;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_point);
                                if (textView3 != null) {
                                    i = R.id.txt_position;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_position);
                                    if (textView4 != null) {
                                        return new ItemFantasyMatchPlayerBinding((CardView) view, cardView, cardView2, imageView, imageView2, textView, textView2, textView3, textView4);
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
