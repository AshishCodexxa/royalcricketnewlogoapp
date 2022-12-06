package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

import com.cricketscoreprediction.app.R;
import androidx.viewbinding.ViewBindings;


public final class ItemProjectionPlayerBinding implements ViewBinding {
    public final ImageView imgPlayer;
    private final CardView rootView;

    private ItemProjectionPlayerBinding(CardView cardView, ImageView imageView) {
        this.rootView = cardView;
        this.imgPlayer = imageView;
    }

    @Override
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemProjectionPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemProjectionPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_projection_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemProjectionPlayerBinding bind(View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
        if (imageView != null) {
            return new ItemProjectionPlayerBinding((CardView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.img_player)));
    }
}
