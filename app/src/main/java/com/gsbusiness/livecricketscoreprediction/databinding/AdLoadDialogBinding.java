package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.gsbusiness.livecricketscoreprediction.R;


public final class AdLoadDialogBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    private final RelativeLayout rootView;

    private AdLoadDialogBinding(RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView) {
        this.rootView = relativeLayout;
        this.animationView = lottieAnimationView;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AdLoadDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdLoadDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_load_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdLoadDialogBinding bind(View view) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animation_view);
        if (lottieAnimationView != null) {
            return new AdLoadDialogBinding((RelativeLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.animation_view)));
    }
}
