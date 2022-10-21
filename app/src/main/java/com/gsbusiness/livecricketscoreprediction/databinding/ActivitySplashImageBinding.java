package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ActivitySplashImageBinding implements ViewBinding {
    public final CardView cardSplashBanner;
    public final ImageView imgSplash;
    public final ImageView imgSplashClose;
    public final LinearLayout llSaved;
    private final LinearLayout rootView;

    private ActivitySplashImageBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.cardSplashBanner = cardView;
        this.imgSplash = imageView;
        this.imgSplashClose = imageView2;
        this.llSaved = linearLayout2;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySplashImageBinding bind(View view) {
        int i = R.id.card_splash_banner;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_splash_banner);
        if (cardView != null) {
            i = R.id.img_splash;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_splash);
            if (imageView != null) {
                i = R.id.img_splash_close;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_splash_close);
                if (imageView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new ActivitySplashImageBinding(linearLayout, cardView, imageView, imageView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
