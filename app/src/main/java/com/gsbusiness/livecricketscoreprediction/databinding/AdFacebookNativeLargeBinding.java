package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;
import com.facebook.ads.MediaView;


public final class AdFacebookNativeLargeBinding implements ViewBinding {
    public final LinearLayout adChoicesContainer;
    public final LinearLayout adOne;
    public final TextView nativeAdBody;
    public final Button nativeAdCallToAction;
    public final MediaView nativeAdIcon;
    public final MediaView nativeAdMedia;
    public final TextView nativeAdSocialContext;
    public final TextView nativeAdSponsoredLabel;
    public final TextView nativeAdTitle;
    public final RelativeLayout rlTop;
    private final RelativeLayout rootView;

    private AdFacebookNativeLargeBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, Button button, MediaView mediaView, MediaView mediaView2, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.adChoicesContainer = linearLayout;
        this.adOne = linearLayout2;
        this.nativeAdBody = textView;
        this.nativeAdCallToAction = button;
        this.nativeAdIcon = mediaView;
        this.nativeAdMedia = mediaView2;
        this.nativeAdSocialContext = textView2;
        this.nativeAdSponsoredLabel = textView3;
        this.nativeAdTitle = textView4;
        this.rlTop = relativeLayout2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AdFacebookNativeLargeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdFacebookNativeLargeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ad_facebook_native_large, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdFacebookNativeLargeBinding bind(View view) {
        int i = R.id.ad_choices_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ad_choices_container);
        if (linearLayout != null) {
            i = R.id.ad_one;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ad_one);
            if (linearLayout2 != null) {
                i = R.id.native_ad_body;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_body);
                if (textView != null) {
                    i = R.id.native_ad_call_to_action;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.native_ad_call_to_action);
                    if (button != null) {
                        i = R.id.native_ad_icon;
                        MediaView mediaView = (MediaView) ViewBindings.findChildViewById(view, R.id.native_ad_icon);
                        if (mediaView != null) {
                            i = R.id.native_ad_media;
                            MediaView mediaView2 = (MediaView) ViewBindings.findChildViewById(view, R.id.native_ad_media);
                            if (mediaView2 != null) {
                                i = R.id.native_ad_social_context;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_social_context);
                                if (textView2 != null) {
                                    i = R.id.native_ad_sponsored_label;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_sponsored_label);
                                    if (textView3 != null) {
                                        i = R.id.native_ad_title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.native_ad_title);
                                        if (textView4 != null) {
                                            i = R.id.rl_top;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top);
                                            if (relativeLayout != null) {
                                                return new AdFacebookNativeLargeBinding((RelativeLayout) view, linearLayout, linearLayout2, textView, button, mediaView, mediaView2, textView2, textView3, textView4, relativeLayout);
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
