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


public final class DialogAppUpdateBinding implements ViewBinding {
    public final Button btnCancel;
    public final Button btnUpdate;
    public final ImageView imgIcon;
    public final CardView mainContainer;
    private final CardView rootView;
    public final TextView tvMessage;
    public final TextView tvTitle;

    private DialogAppUpdateBinding(CardView cardView, Button button, Button button2, ImageView imageView, CardView cardView2, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.btnCancel = button;
        this.btnUpdate = button2;
        this.imgIcon = imageView;
        this.mainContainer = cardView2;
        this.tvMessage = textView;
        this.tvTitle = textView2;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogAppUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAppUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_app_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogAppUpdateBinding bind(View view) {
        int i = R.id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (button != null) {
            i = R.id.btn_update;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_update);
            if (button2 != null) {
                i = R.id.img_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_icon);
                if (imageView != null) {
                    CardView cardView = (CardView) view;
                    i = R.id.tv_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_message);
                    if (textView != null) {
                        i = R.id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView2 != null) {
                            return new DialogAppUpdateBinding(cardView, button, button2, imageView, cardView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
