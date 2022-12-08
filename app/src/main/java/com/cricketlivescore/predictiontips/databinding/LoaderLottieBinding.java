package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

import com.cricketlivescore.predictiontips.R;

import java.util.Objects;

public final class LoaderLottieBinding implements ViewBinding {
    private final RelativeLayout rootView;

    private LoaderLottieBinding(RelativeLayout relativeLayout) {
        this.rootView = relativeLayout;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LoaderLottieBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LoaderLottieBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.loader_lottie, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LoaderLottieBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new LoaderLottieBinding((RelativeLayout) view);
    }
}
