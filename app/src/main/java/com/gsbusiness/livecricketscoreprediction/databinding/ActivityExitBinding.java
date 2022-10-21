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
import com.hsalf.smilerating.SmileRating;


public final class ActivityExitBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final TextView btnExit;
    public final TextView btnFreeCoin;
    public final TextView btnRate;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlExit;
    public final RelativeLayout rlExitActivity;
    public final RelativeLayout rlLayoutEnd;
    private final RelativeLayout rootView;
    public final SmileRating smileRating;

    private ActivityExitBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, SmileRating smileRating2) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.btnExit = textView;
        this.btnFreeCoin = textView2;
        this.btnRate = textView3;
        this.rlAdBottom = relativeLayout2;
        this.rlExit = relativeLayout3;
        this.rlExitActivity = relativeLayout4;
        this.rlLayoutEnd = relativeLayout5;
        this.smileRating = smileRating2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityExitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityExitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_exit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityExitBinding bind(View view) {
        return null;
    }
}
