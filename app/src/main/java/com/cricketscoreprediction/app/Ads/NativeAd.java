package com.cricketscoreprediction.app.Ads;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.cricketscoreprediction.app.Utils.AppPreference;

public class NativeAd {

    AppPreference appPreference;
    Context context;

    LayoutInflater layoutInflater;

    public NativeAd(Context context2) {
        this.context = context2;
        this.layoutInflater = LayoutInflater.from(context2);
        this.appPreference = new AppPreference(context2);
    }


    public void show_google_native_large(RelativeLayout relativeLayout) {

    }

    public void show_facebook_native_large(RelativeLayout relativeLayout) {

    }


}
