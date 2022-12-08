package com.cricketlivescore.predictiontips.Ads;

import android.app.Activity;
import android.widget.RelativeLayout;

import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;

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
