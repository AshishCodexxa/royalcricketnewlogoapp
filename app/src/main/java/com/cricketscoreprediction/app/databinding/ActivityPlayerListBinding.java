package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class ActivityPlayerListBinding implements ViewBinding {
    public final ImageView imgBack;
    private final LinearLayout rootView;

    private ActivityPlayerListBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.imgBack = imageView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPlayerListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPlayerListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_player_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPlayerListBinding bind(View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            return new ActivityPlayerListBinding((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.img_back)));
    }
}
