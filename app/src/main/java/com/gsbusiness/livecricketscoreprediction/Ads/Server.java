package com.gsbusiness.livecricketscoreprediction.Ads;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.exifinterface.media.ExifInterface;

import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.json.JSONArray;

public class Server {
    AppPreference appPreference;
    Activity context;

    public Server(Activity activity) {
        this.context = activity;
        this.appPreference = new AppPreference(activity);
    }


    public void nativeSmallAd(RelativeLayout relativeLayout) {
        Boolean bool = this.appPreference.getBoolean(Glob.isPurchased);
        if (!Glob.isOnline(this.context)) {
            return;
        }
        if (bool.booleanValue()) {
            relativeLayout.removeAllViews();
            return;
        }
        try {
            JSONArray jsonArray = this.appPreference.getJsonArray("native_banner_priority");
            JSONArray jsonArray2 = this.appPreference.getJsonArray("common_native_banner");
            int i = Glob.native_banner_priority_count;
            if (i <= jsonArray.length()) {
                if (jsonArray.getString(i).matches(Glob.native_priority_google)) {
                    google_native_small(relativeLayout, jsonArray2.get(i).toString());
                } else if (jsonArray.getString(i).matches(Glob.native_priority_facebook)) {
                    facebook_native_small(relativeLayout, jsonArray2.get(i).toString());
                }
                if (jsonArray.length() == Glob.native_banner_priority_count + 1) {
                    Glob.native_banner_priority_count = 0;
                } else {
                    Glob.native_banner_priority_count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void google_native_small(final RelativeLayout relativeLayout, String str) {
    }


    private void facebook_native_small(final RelativeLayout relativeLayout, String str) {
    }


    public void nativeLargeAdPreLoad(RelativeLayout relativeLayout) {
        Boolean bool = this.appPreference.getBoolean(Glob.isPurchased);
        if (!Glob.isOnline(this.context)) {
            return;
        }
        if (bool.booleanValue()) {
            relativeLayout.removeAllViews();
            return;
        }
        try {
            JSONArray jsonArray = this.appPreference.getJsonArray("native_priority");
            this.appPreference.getJsonArray("common_native");
            int i = Glob.native_priority_count;
            if (i <= jsonArray.length()) {
                if (jsonArray.getString(i).matches(Glob.native_priority_google)) {
                    Glob.nativeAd.show_google_native_large(relativeLayout);
                } else if (jsonArray.getString(i).matches(Glob.native_priority_facebook)) {
                    Glob.nativeAd.show_facebook_native_large(relativeLayout);
                }
                if (jsonArray.length() == Glob.native_priority_count + 1) {
                    Glob.native_priority_count = 0;
                } else {
                    Glob.native_priority_count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nativeLargeAd(RelativeLayout relativeLayout) {
        Boolean bool = this.appPreference.getBoolean(Glob.isPurchased);
        if (!Glob.isOnline(this.context)) {
            return;
        }
        if (bool.booleanValue()) {
            relativeLayout.removeAllViews();
            return;
        }
        try {
            JSONArray jsonArray = this.appPreference.getJsonArray("native_priority");
            JSONArray jsonArray2 = this.appPreference.getJsonArray("common_native");
            int i = Glob.native_priority_count;
            if (i <= jsonArray.length()) {
                if (jsonArray.getString(i).matches(Glob.native_priority_google)) {
                    google_native_large(relativeLayout, jsonArray2.get(i).toString());
                } else if (jsonArray.getString(i).matches(Glob.native_priority_facebook)) {
                    facebook_native_large(relativeLayout, jsonArray2.get(i).toString());
                }
                if (jsonArray.length() == Glob.native_priority_count + 1) {
                    Glob.native_priority_count = 0;
                } else {
                    Glob.native_priority_count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void google_native_large(final RelativeLayout relativeLayout, String str) {
    }


    private void facebook_native_large(final RelativeLayout relativeLayout, String str) {

    }


}
