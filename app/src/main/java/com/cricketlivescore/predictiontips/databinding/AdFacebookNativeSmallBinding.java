package com.cricketlivescore.predictiontips.databinding;

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
import com.cricketlivescore.predictiontips.R;


public final class AdFacebookNativeSmallBinding implements ViewBinding {
    public final LinearLayout adChoicesContainer;
    public final TextView nativeAdBody;
    public final Button nativeAdCallToAction;
    public final ImageView nativeAdIcon;
    public final TextView nativeAdSponsoredLabel;
    public final TextView nativeAdTitle;
    private final RelativeLayout rootView;

    private AdFacebookNativeSmallBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, Button button, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.adChoicesContainer = linearLayout;
        this.nativeAdBody = textView;
        this.nativeAdCallToAction = button;
        this.nativeAdIcon = imageView;
        this.nativeAdSponsoredLabel = textView2;
        this.nativeAdTitle = textView3;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AdFacebookNativeSmallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdFacebookNativeSmallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_facebook_native_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdFacebookNativeSmallBinding bind(View view) {
        int i = R.id.ad_choices_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ad_choices_container);
        if (linearLayout != null) {
            i = R.id.native_ad_body;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_body);
            if (textView != null) {
                i = R.id.native_ad_call_to_action;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.native_ad_call_to_action);
                if (button != null) {
                    i = R.id.native_ad_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.native_ad_icon);
                    if (imageView != null) {
                        i = R.id.native_ad_sponsored_label;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_sponsored_label);
                        if (textView2 != null) {
                            i = R.id.native_ad_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_title);
                            if (textView3 != null) {
                                return new AdFacebookNativeSmallBinding((RelativeLayout) view, linearLayout, textView, button, imageView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
