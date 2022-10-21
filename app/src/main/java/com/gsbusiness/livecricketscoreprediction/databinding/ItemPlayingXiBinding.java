package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemPlayingXiBinding implements ViewBinding {
    public final ImageView imgItemPlayerImage;
    public final ImageView imgItemPlayerType;
    private final LinearLayout rootView;
    public final TextView txtItemPlayer;

    private ItemPlayingXiBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = linearLayout;
        this.imgItemPlayerImage = imageView;
        this.imgItemPlayerType = imageView2;
        this.txtItemPlayer = textView;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPlayingXiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPlayingXiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_playing_xi, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPlayingXiBinding bind(View view) {
        int i = R.id.img_item_playerImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_playerImage);
        if (imageView != null) {
            i = R.id.img_item_player_type;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_player_type);
            if (imageView2 != null) {
                i = R.id.txt_item_player;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_player);
                if (textView != null) {
                    return new ItemPlayingXiBinding((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
