package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class DialogAboutAppBinding implements ViewBinding {
    public final TextView btnAboutAppOk;
    public final ImageView imgAboutAppLogo;
    public final LinearLayout llAboutApp;
    private final LinearLayout rootView;
    public final TextView txtAboutAppDetail;
    public final TextView txtAboutAppDetail1;
    public final TextView txtAboutAppDetail2;
    public final TextView txtAboutAppTitle;

    private DialogAboutAppBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnAboutAppOk = textView;
        this.imgAboutAppLogo = imageView;
        this.llAboutApp = linearLayout2;
        this.txtAboutAppDetail = textView2;
        this.txtAboutAppDetail1 = textView3;
        this.txtAboutAppDetail2 = textView4;
        this.txtAboutAppTitle = textView5;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogAboutAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAboutAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_about_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAboutAppBinding bind(View view) {
        int i = R.id.btn_aboutApp_ok;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_aboutApp_ok);
        if (textView != null) {
            i = R.id.img_aboutApp_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_aboutApp_logo);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.txt_aboutApp_detail;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_aboutApp_detail);
                if (textView2 != null) {
                    i = R.id.txt_aboutApp_detail_;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_aboutApp_detail_);
                    if (textView3 != null) {
                        i = R.id.txt_aboutApp_detail__;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_aboutApp_detail__);
                        if (textView4 != null) {
                            i = R.id.txt_aboutApp_title;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_aboutApp_title);
                            if (textView5 != null) {
                                return new DialogAboutAppBinding(linearLayout, textView, imageView, linearLayout, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
