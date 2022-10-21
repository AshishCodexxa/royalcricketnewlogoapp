package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.gsbusiness.livecricketscoreprediction.R;
import com.smarteist.autoimageslider.SliderView;

public final class ActivityFirstBinding implements ViewBinding {
    public final CoordinatorLayout CoordinatorLayout;
    public final ImageView adBannerBottom;
    public final ImageView adBannerTop;
    public final ImageView adIconBottom;
    public final ImageView adIconTop;
    public final Button btnStart;
    public final FloatingActionButton fbStart;
    public final FrameLayout frameTbn;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlAdTop;
    public final RelativeLayout rlMain;
    private final CoordinatorLayout rootView;
    public final RecyclerView rvAppList;
    public final SliderView slider;
    public final RelativeLayout toolbar;
    public final RelativeLayout toolbars;
    public final TextView toolbartitle;

    private ActivityFirstBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, Button button, FloatingActionButton floatingActionButton, FrameLayout frameLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, SliderView sliderView, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView) {
        this.rootView = coordinatorLayout;
        this.CoordinatorLayout = coordinatorLayout2;
        this.adBannerBottom = imageView;
        this.adBannerTop = imageView2;
        this.adIconBottom = imageView3;
        this.adIconTop = imageView4;
        this.btnStart = button;
        this.fbStart = floatingActionButton;
        this.frameTbn = frameLayout;
        this.rlAdBottom = relativeLayout;
        this.rlAdTop = relativeLayout2;
        this.rlMain = relativeLayout3;
        this.rvAppList = recyclerView;
        this.slider = sliderView;
        this.toolbar = relativeLayout4;
        this.toolbars = relativeLayout5;
        this.toolbartitle = textView;
    }

    @Override
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_first, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFirstBinding bind(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.ad_banner_bottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner_bottom);
        if (imageView != null) {
            i = R.id.ad_banner_top;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner_top);
            if (imageView2 != null) {
                i = R.id.ad_icon_bottom;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon_bottom);
                if (imageView3 != null) {
                    i = R.id.ad_icon_top;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon_top);
                    if (imageView4 != null) {
                        i = R.id.btn_start;
                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_start);
                        if (button != null) {
                            i = R.id.fb_start;
                            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.fb_start);
                            if (floatingActionButton != null) {
                                i = R.id.frame_tbn;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame_tbn);
                                if (frameLayout != null) {
                                    i = R.id.rl_ad_bottom;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                    if (relativeLayout != null) {
                                        i = R.id.rl_ad_top;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_top);
                                        if (relativeLayout2 != null) {
                                            i = R.id.rl_main;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_main);
                                            if (relativeLayout3 != null) {
                                                i = R.id.rvAppList;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvAppList);
                                                if (recyclerView != null) {
                                                    i = R.id.slider;
                                                    SliderView sliderView = (SliderView) ViewBindings.findChildViewById(view, R.id.slider);
                                                    if (sliderView != null) {
                                                        i = R.id.toolbar;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                        if (relativeLayout4 != null) {
                                                            i = R.id.toolbars;
                                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbars);
                                                            if (relativeLayout5 != null) {
                                                                i = R.id.toolbartitle;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toolbartitle);
                                                                if (textView != null) {
                                                                    return new ActivityFirstBinding(coordinatorLayout, coordinatorLayout, imageView, imageView2, imageView3, imageView4, button, floatingActionButton, frameLayout, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, sliderView, relativeLayout4, relativeLayout5, textView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
