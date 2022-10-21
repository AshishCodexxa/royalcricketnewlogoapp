package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ActivityTestAdBinding implements ViewBinding {
    public final FrameLayout adContainer;
    public final CardView cardSplashBanner;
    public final ImageView imgSplash;
    public final ImageView imgSplashClose;
    public final RelativeLayout rlTestAd;
    private final RelativeLayout rootView;

    private ActivityTestAdBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, CardView cardView, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.adContainer = frameLayout;
        this.cardSplashBanner = cardView;
        this.imgSplash = imageView;
        this.imgSplashClose = imageView2;
        this.rlTestAd = relativeLayout2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTestAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTestAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_test_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTestAdBinding bind(View view) {
        int i = R.id.ad_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.ad_container);
        if (frameLayout != null) {
            i = R.id.card_splash_banner;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_splash_banner);
            if (cardView != null) {
                i = R.id.img_splash;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_splash);
                if (imageView != null) {
                    i = R.id.img_splash_close;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_splash_close);
                    if (imageView2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new ActivityTestAdBinding(relativeLayout, frameLayout, cardView, imageView, imageView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
