package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemStadiumBinding implements ViewBinding {
    public final ImageView imgItemPlayerType;
    private final RelativeLayout rootView;
    public final TextView txtName;

    private ItemStadiumBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.rootView = relativeLayout;
        this.imgItemPlayerType = imageView;
        this.txtName = textView;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemStadiumBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStadiumBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_stadium, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemStadiumBinding bind(View view) {
        int i = R.id.img_item_player_type;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_player_type);
        if (imageView != null) {
            i = R.id.txt_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_name);
            if (textView != null) {
                return new ItemStadiumBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
