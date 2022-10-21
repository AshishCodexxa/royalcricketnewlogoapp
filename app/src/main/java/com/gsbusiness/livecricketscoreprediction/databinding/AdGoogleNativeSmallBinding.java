package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.gsbusiness.livecricketscoreprediction.R;


public final class AdGoogleNativeSmallBinding implements ViewBinding {
    public final TextView adBody;
    public final Button adCallToAction;
    public final TextView adHeadline;
    public final MediaView adMedia;
    public final RelativeLayout nativePrivacyInformationIconLayout;
    private final NativeAdView rootView;
    public final TextView txtAd;

    private AdGoogleNativeSmallBinding(NativeAdView nativeAdView, TextView textView, Button button, TextView textView2, MediaView mediaView, RelativeLayout relativeLayout, TextView textView3) {
        this.rootView = nativeAdView;
        this.adBody = textView;
        this.adCallToAction = button;
        this.adHeadline = textView2;
        this.adMedia = mediaView;
        this.nativePrivacyInformationIconLayout = relativeLayout;
        this.txtAd = textView3;
    }

    @Override
    public NativeAdView getRoot() {
        return this.rootView;
    }

    public static AdGoogleNativeSmallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdGoogleNativeSmallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_google_native_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdGoogleNativeSmallBinding bind(View view) {
        int i = R.id.ad_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ad_body);
        if (textView != null) {
            i = R.id.ad_call_to_action;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.ad_call_to_action);
            if (button != null) {
                i = R.id.ad_headline;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ad_headline);
                if (textView2 != null) {
                    i = R.id.ad_media;
                    MediaView mediaView = (MediaView) ViewBindings.findChildViewById(view, R.id.ad_media);
                    if (mediaView != null) {
                        i = R.id.native_privacy_information_icon_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.native_privacy_information_icon_layout);
                        if (relativeLayout != null) {
                            i = R.id.txt_ad;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ad);
                            if (textView3 != null) {
                                return new AdGoogleNativeSmallBinding((NativeAdView) view, textView, button, textView2, mediaView, relativeLayout, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
