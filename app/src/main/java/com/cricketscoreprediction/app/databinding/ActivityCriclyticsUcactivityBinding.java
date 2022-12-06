package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;

public final class ActivityCriclyticsUcactivityBinding implements ViewBinding {
    public final FrameLayout container;
    public final ImageView imgBack;
    public final ImageView imgKeyStat;
    public final ImageView imgPlayerMatchUps;
    public final ImageView imgPlayerProjection;
    public final ImageView imgShare;
    public final LinearLayout llKeyStat;
    public final LinearLayout llPlayerMatchUps;
    public final LinearLayout llPlayerProjection;
    private final RelativeLayout rootView;
    public final RelativeLayout rvToolbar;
    public final TextView toobarTitle;
    public final TextView txtKeyStat;
    public final TextView txtPlayerMatchUps;
    public final TextView txtPlayerProjection;

    private ActivityCriclyticsUcactivityBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.imgBack = imageView;
        this.imgKeyStat = imageView2;
        this.imgPlayerMatchUps = imageView3;
        this.imgPlayerProjection = imageView4;
        this.imgShare = imageView5;
        this.llKeyStat = linearLayout;
        this.llPlayerMatchUps = linearLayout2;
        this.llPlayerProjection = linearLayout3;
        this.rvToolbar = relativeLayout2;
        this.toobarTitle = textView;
        this.txtKeyStat = textView2;
        this.txtPlayerMatchUps = textView3;
        this.txtPlayerProjection = textView4;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCriclyticsUcactivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCriclyticsUcactivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_criclytics_ucactivity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCriclyticsUcactivityBinding bind(View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.container);
        if (frameLayout != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.img_key_stat;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_key_stat);
                if (imageView2 != null) {
                    i = R.id.img_player_match_ups;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_match_ups);
                    if (imageView3 != null) {
                        i = R.id.img_player_projection;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_projection);
                        if (imageView4 != null) {
                            i = R.id.img_share;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_share);
                            if (imageView5 != null) {
                                i = R.id.ll_key_stat;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_key_stat);
                                if (linearLayout != null) {
                                    i = R.id.ll_player_match_ups;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_match_ups);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_player_projection;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_projection);
                                        if (linearLayout3 != null) {
                                            i = R.id.rv_toolbar;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rv_toolbar);
                                            if (relativeLayout != null) {
                                                i = R.id.toobarTitle;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toobarTitle);
                                                if (textView != null) {
                                                    i = R.id.txt_key_stat;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_key_stat);
                                                    if (textView2 != null) {
                                                        i = R.id.txt_player_match_ups;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_match_ups);
                                                        if (textView3 != null) {
                                                            i = R.id.txt_player_projection;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_projection);
                                                            if (textView4 != null) {
                                                                return new ActivityCriclyticsUcactivityBinding((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3, textView4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
