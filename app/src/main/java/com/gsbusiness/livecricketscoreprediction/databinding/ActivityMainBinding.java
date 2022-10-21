package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public final class ActivityMainBinding implements ViewBinding {
    public final CoordinatorLayout CoordinatorLayout;
    public final BottomNavigationView bottomNavigationView;

    public final FrameLayout frameContainer;
    public final ImageView imgAboutApp;
    public final ImageView imgAppList;
    public final ImageView imgMenu;
    public final ImageView imgPrivacy;
    public final ImageView imgRate;
    public final ImageView imgRemoveAd;
    public final ImageView imgShare;
    public final LinearLayout llDrawer;
    public final LinearLayout llMain;
    private final CoordinatorLayout rootView;
    public final RelativeLayout rvToolbar;
    public final TextView toobarTitle;
    public final TextView txtAboutApp;
    public final TextView txtAppList;
    public final TextView txtPrivacy;
    public final TextView txtRateUs;
    public final TextView txtShareApp;

    private ActivityMainBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, BottomNavigationView bottomNavigationView2, DrawerLayout drawerLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout6, LinearLayout linearLayout7, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = coordinatorLayout;
        this.CoordinatorLayout = coordinatorLayout2;
        this.bottomNavigationView = bottomNavigationView2;

        this.frameContainer = frameLayout;
        this.imgAboutApp = imageView;
        this.imgAppList = imageView2;
        this.imgMenu = imageView3;
        this.imgPrivacy = imageView4;
        this.imgRate = imageView5;
        this.imgRemoveAd = imageView6;
        this.imgShare = imageView7;
        this.llDrawer = linearLayout6;
        this.llMain = linearLayout7;
        this.rvToolbar = relativeLayout;
        this.toobarTitle = textView;
        this.txtAboutApp = textView2;
        this.txtAppList = textView3;
        this.txtPrivacy = textView4;
        this.txtRateUs = textView5;
        this.txtShareApp = textView6;
    }

    @Override 
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.bottomNavigationView;
        BottomNavigationView bottomNavigationView2 = (BottomNavigationView) ViewBindings.findChildViewById(view, R.id.bottomNavigationView);
        if (bottomNavigationView2 != null) {
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
