package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;

public final class SliderLayoutBinding implements ViewBinding {
    public final ImageView myimage;
    public final RelativeLayout rlSliderItem;
    private final RelativeLayout rootView;

    private SliderLayoutBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.myimage = imageView;
        this.rlSliderItem = relativeLayout2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static SliderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SliderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.slider_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SliderLayoutBinding bind(View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.myimage);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new SliderLayoutBinding(relativeLayout, imageView, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.myimage)));
    }
}
