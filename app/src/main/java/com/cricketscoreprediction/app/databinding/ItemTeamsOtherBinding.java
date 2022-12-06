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


public final class ItemTeamsOtherBinding implements ViewBinding {
    public final CardView cardItemFm;
    public final ImageView img;
    public final ImageView imgTeam;
    private final CardView rootView;
    public final TextView txtTeam;
    public final TextView txtTitle;

    private ItemTeamsOtherBinding(CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.cardItemFm = cardView2;
        this.img = imageView;
        this.imgTeam = imageView2;
        this.txtTeam = textView;
        this.txtTitle = textView2;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemTeamsOtherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTeamsOtherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_teams_other, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTeamsOtherBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
        if (imageView != null) {
            i = R.id.img_team;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team);
            if (imageView2 != null) {
                i = R.id.txt_team;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                if (textView != null) {
                    i = R.id.txt_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                    if (textView2 != null) {
                        return new ItemTeamsOtherBinding(cardView, cardView, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
