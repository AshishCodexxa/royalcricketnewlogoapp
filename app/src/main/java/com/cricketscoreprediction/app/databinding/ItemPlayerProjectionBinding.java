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


public final class ItemPlayerProjectionBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgPlayerImage;
    public final LinearLayout llPlayerState;
    private final LinearLayout rootView;
    public final TextView txtPlayerBol;
    public final TextView txtPlayerName;
    public final TextView txtPlayerRun;
    public final TextView txtProjection;
    public final TextView txtTeamName;

    private ItemPlayerProjectionBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgPlayerImage = imageView;
        this.llPlayerState = linearLayout2;
        this.txtPlayerBol = textView;
        this.txtPlayerName = textView2;
        this.txtPlayerRun = textView3;
        this.txtProjection = textView4;
        this.txtTeamName = textView5;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPlayerProjectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPlayerProjectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_player_projection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPlayerProjectionBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.img_playerImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
            if (imageView != null) {
                i = R.id.ll_player_state;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_state);
                if (linearLayout != null) {
                    i = R.id.txt_player_bol;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bol);
                    if (textView != null) {
                        i = R.id.txt_player_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                        if (textView2 != null) {
                            i = R.id.txt_player_run;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_run);
                            if (textView3 != null) {
                                i = R.id.txt_projection;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection);
                                if (textView4 != null) {
                                    i = R.id.txt_team_name;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                    if (textView5 != null) {
                                        return new ItemPlayerProjectionBinding((LinearLayout) view, cardView, imageView, linearLayout, textView, textView2, textView3, textView4, textView5);
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
