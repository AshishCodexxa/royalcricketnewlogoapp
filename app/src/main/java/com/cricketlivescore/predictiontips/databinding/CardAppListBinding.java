package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.cricketlivescore.predictiontips.R;


public final class CardAppListBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final CardView cardMoreAppItem;
    public final ImageView imgAppListLogo;
    public final LinearLayout llMainAppList;
    private final CardView rootView;
    public final TextView txtAppListTitle;

    private CardAppListBinding(CardView cardView, LottieAnimationView lottieAnimationView, CardView cardView2, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        this.rootView = cardView;
        this.animationView = lottieAnimationView;
        this.cardMoreAppItem = cardView2;
        this.imgAppListLogo = imageView;
        this.llMainAppList = linearLayout;
        this.txtAppListTitle = textView;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static CardAppListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardAppListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_app_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CardAppListBinding bind(View view) {
        int i = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view);
        if (lottieAnimationView != null) {
            CardView cardView = (CardView) view;
            i = R.id.img_app_list_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_app_list_logo);
            if (imageView != null) {
                i = R.id.ll_main_app_list;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_main_app_list);
                if (linearLayout != null) {
                    i = R.id.txt_app_list_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_app_list_title);
                    if (textView != null) {
                        return new CardAppListBinding(cardView, lottieAnimationView, cardView, imageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
