package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class ItemAdBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardView;
    public final RelativeLayout itemRlAd;
    private final CardView rootView;

    private ItemAdBinding(CardView cardView2, ImageView imageView, ImageView imageView2, CardView cardView3, RelativeLayout relativeLayout) {
        this.rootView = cardView2;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardView = cardView3;
        this.itemRlAd = relativeLayout;
    }

    @Override
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAdBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                CardView cardView2 = (CardView) view;
                i = R.id.item_rl_ad;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.item_rl_ad);
                if (relativeLayout != null) {
                    return new ItemAdBinding(cardView2, imageView, imageView2, cardView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
