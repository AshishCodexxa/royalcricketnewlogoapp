package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.cricketscoreprediction.app.R;


public final class AdGoogleNativeMediumBinding implements ViewBinding {
    public final TextView adAdvertiser;
    public final ImageView adAppIcon;
    public final TextView adBody;
    public final Button adCallToAction;
    public final TextView adHeadline;
    public final MediaView adMedia;
    public final RatingBar adStars;
    public final RelativeLayout nativePrivacyInformationIconLayout;
    private final NativeAdView rootView;
    public final TextView txtAds;

    private AdGoogleNativeMediumBinding(NativeAdView nativeAdView, TextView textView, ImageView imageView, TextView textView2, Button button, TextView textView3, MediaView mediaView, RatingBar ratingBar, RelativeLayout relativeLayout, TextView textView4) {
        this.rootView = nativeAdView;
        this.adAdvertiser = textView;
        this.adAppIcon = imageView;
        this.adBody = textView2;
        this.adCallToAction = button;
        this.adHeadline = textView3;
        this.adMedia = mediaView;
        this.adStars = ratingBar;
        this.nativePrivacyInformationIconLayout = relativeLayout;
        this.txtAds = textView4;
    }

    @Override 
    public NativeAdView getRoot() {
        return this.rootView;
    }

    public static AdGoogleNativeMediumBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdGoogleNativeMediumBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_google_native_medium, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdGoogleNativeMediumBinding bind(View view) {
        int i = R.id.ad_advertiser;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ad_advertiser);
        if (textView != null) {
            i = R.id.ad_app_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_app_icon);
            if (imageView != null) {
                i = R.id.ad_body;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ad_body);
                if (textView2 != null) {
                    i = R.id.ad_call_to_action;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.ad_call_to_action);
                    if (button != null) {
                        i = R.id.ad_headline;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.ad_headline);
                        if (textView3 != null) {
                            i = R.id.ad_media;
                            MediaView mediaView = (MediaView) ViewBindings.findChildViewById(view, R.id.ad_media);
                            if (mediaView != null) {
                                i = R.id.ad_stars;
                                RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(view, R.id.ad_stars);
                                if (ratingBar != null) {
                                    i = R.id.native_privacy_information_icon_layout;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.native_privacy_information_icon_layout);
                                    if (relativeLayout != null) {
                                        i = R.id.txt_ads;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ads);
                                        if (textView4 != null) {
                                            return new AdGoogleNativeMediumBinding((NativeAdView) view, textView, imageView, textView2, button, textView3, mediaView, ratingBar, relativeLayout, textView4);
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
