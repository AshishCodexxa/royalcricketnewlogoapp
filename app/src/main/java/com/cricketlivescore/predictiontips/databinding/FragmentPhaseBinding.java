package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentPhaseBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView imgInfo;
    public final LinearLayout llNoData;
    public final LinearLayout llPhase;
    public final RelativeLayout rlInfo;
    private final ScrollView rootView;

    private FragmentPhaseBinding(ScrollView scrollView, ProgressBar progressBar, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout) {
        this.rootView = scrollView;
        this.ProgressBar = progressBar;
        this.imgInfo = imageView;
        this.llNoData = linearLayout;
        this.llPhase = linearLayout2;
        this.rlInfo = relativeLayout;
    }

    @Override 
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPhaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPhaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_phase, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPhaseBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.img_info;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
            if (imageView != null) {
                i = R.id.ll_no_data;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                if (linearLayout != null) {
                    i = R.id.ll_phase;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_phase);
                    if (linearLayout2 != null) {
                        i = R.id.rl_info;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                        if (relativeLayout != null) {
                            return new FragmentPhaseBinding((ScrollView) view, progressBar, imageView, linearLayout, linearLayout2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
