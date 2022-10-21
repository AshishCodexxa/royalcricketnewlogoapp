package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;
import com.smarteist.autoimageslider.SliderView;

public final class ActivityThirdBinding implements ViewBinding {
    public final ImageView adBannerBottom;
    public final ImageView adBannerTop;
    public final ImageView adIconBottom;
    public final ImageView adIconTop;
    public final Button btnStart;
    public final LinearLayout llSliderViewActivityMain;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlAdTop;
    public final RelativeLayout rlSlider1;
    public final RelativeLayout rlSlider2;
    private final LinearLayout rootView;
    public final SliderView sliderBottom;
    public final SliderView sliderTop;
    public final RelativeLayout toolbar;
    public final RelativeLayout toolbars;
    public final TextView toolbartitle;

    private ActivityThirdBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, Button button, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, SliderView sliderView, SliderView sliderView2, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, TextView textView) {
        this.rootView = linearLayout;
        this.adBannerBottom = imageView;
        this.adBannerTop = imageView2;
        this.adIconBottom = imageView3;
        this.adIconTop = imageView4;
        this.btnStart = button;
        this.llSliderViewActivityMain = linearLayout2;
        this.rlAdBottom = relativeLayout;
        this.rlAdTop = relativeLayout2;
        this.rlSlider1 = relativeLayout3;
        this.rlSlider2 = relativeLayout4;
        this.sliderBottom = sliderView;
        this.sliderTop = sliderView2;
        this.toolbar = relativeLayout5;
        this.toolbars = relativeLayout6;
        this.toolbartitle = textView;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityThirdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityThirdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_third, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityThirdBinding bind(View view) {
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
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = R.id.rl_ad_bottom;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                            if (relativeLayout != null) {
                                i = R.id.rl_ad_top;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_top);
                                if (relativeLayout2 != null) {
                                    i = R.id.rl_slider1;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_slider1);
                                    if (relativeLayout3 != null) {
                                        i = R.id.rl_slider2;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_slider2);
                                        if (relativeLayout4 != null) {
                                            i = R.id.slider_bottom;
                                            SliderView sliderView = (SliderView) ViewBindings.findChildViewById(view, R.id.slider_bottom);
                                            if (sliderView != null) {
                                                i = R.id.slider_top;
                                                SliderView sliderView2 = (SliderView) ViewBindings.findChildViewById(view, R.id.slider_top);
                                                if (sliderView2 != null) {
                                                    i = R.id.toolbar;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                    if (relativeLayout5 != null) {
                                                        i = R.id.toolbars;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbars);
                                                        if (relativeLayout6 != null) {
                                                            i = R.id.toolbartitle;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toolbartitle);
                                                            if (textView != null) {
                                                                return new ActivityThirdBinding(linearLayout, imageView, imageView2, imageView3, imageView4, button, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, sliderView, sliderView2, relativeLayout5, relativeLayout6, textView);
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
