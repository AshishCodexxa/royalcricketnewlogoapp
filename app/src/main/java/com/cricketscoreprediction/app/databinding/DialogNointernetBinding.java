package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class DialogNointernetBinding implements ViewBinding {
    public final Button btnRetry;
    public final ImageView imgIcon;
    public final CardView mainContainer;
    private final CardView rootView;
    public final TextView tvMessage;
    public final TextView tvPleaseTurnOn;
    public final TextView tvTitle;

    private DialogNointernetBinding(CardView cardView, Button button, ImageView imageView, CardView cardView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.btnRetry = button;
        this.imgIcon = imageView;
        this.mainContainer = cardView2;
        this.tvMessage = textView;
        this.tvPleaseTurnOn = textView2;
        this.tvTitle = textView3;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogNointernetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogNointernetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_nointernet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogNointernetBinding bind(View view) {
        int i = R.id.btn_retry;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_retry);
        if (button != null) {
            i = R.id.img_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_icon);
            if (imageView != null) {
                CardView cardView = (CardView) view;
                i = R.id.tv_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_message);
                if (textView != null) {
                    i = R.id.tv_please_turn_on;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_please_turn_on);
                    if (textView2 != null) {
                        i = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView3 != null) {
                            return new DialogNointernetBinding(cardView, button, imageView, cardView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
