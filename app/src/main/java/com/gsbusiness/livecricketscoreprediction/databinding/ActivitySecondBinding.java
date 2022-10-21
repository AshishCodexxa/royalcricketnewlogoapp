package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ActivitySecondBinding implements ViewBinding {
    public final ImageView adBannerBottom;
    public final ImageView adBannerTop;
    public final ImageView adIconBottom;
    public final ImageView adIconTop;
    public final Button btnShare;
    public final Button btnStart;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlAdTop;
    public final RelativeLayout rlAppServiceMain;
    public final RelativeLayout rlImages;
    private final RelativeLayout rootView;
    public final RecyclerView rvImageList;
    public final RelativeLayout toolbar;
    public final RelativeLayout toolbars;
    public final TextView toolbartitle;

    private ActivitySecondBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, Button button, Button button2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RecyclerView recyclerView, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, TextView textView) {
        this.rootView = relativeLayout;
        this.adBannerBottom = imageView;
        this.adBannerTop = imageView2;
        this.adIconBottom = imageView3;
        this.adIconTop = imageView4;
        this.btnShare = button;
        this.btnStart = button2;
        this.rlAdBottom = relativeLayout2;
        this.rlAdTop = relativeLayout3;
        this.rlAppServiceMain = relativeLayout4;
        this.rlImages = relativeLayout5;
        this.rvImageList = recyclerView;
        this.toolbar = relativeLayout6;
        this.toolbars = relativeLayout7;
        this.toolbartitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySecondBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_second, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySecondBinding bind(View view) {
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
                        i = R.id.btn_share;
                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_share);
                        if (button != null) {
                            i = R.id.btn_start;
                            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_start);
                            if (button2 != null) {
                                i = R.id.rl_ad_bottom;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                if (relativeLayout != null) {
                                    i = R.id.rl_ad_top;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_top);
                                    if (relativeLayout2 != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                        i = R.id.rl_images;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_images);
                                        if (relativeLayout4 != null) {
                                            i = R.id.rvImageList;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvImageList);
                                            if (recyclerView != null) {
                                                i = R.id.toolbar;
                                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                if (relativeLayout5 != null) {
                                                    i = R.id.toolbars;
                                                    RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbars);
                                                    if (relativeLayout6 != null) {
                                                        i = R.id.toolbartitle;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toolbartitle);
                                                        if (textView != null) {
                                                            return new ActivitySecondBinding(relativeLayout3, imageView, imageView2, imageView3, imageView4, button, button2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, recyclerView, relativeLayout5, relativeLayout6, textView);
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
