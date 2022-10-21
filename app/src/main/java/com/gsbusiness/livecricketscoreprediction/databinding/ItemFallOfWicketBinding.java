package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemFallOfWicketBinding implements ViewBinding {
    public final LinearLayout llItemFm;
    private final LinearLayout rootView;
    public final TextView txtFowOver;
    public final TextView txtFowPlayer;
    public final TextView txtFowScore;

    private ItemFallOfWicketBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.llItemFm = linearLayout2;
        this.txtFowOver = textView;
        this.txtFowPlayer = textView2;
        this.txtFowScore = textView3;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFallOfWicketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFallOfWicketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fall_of_wicket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFallOfWicketBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.txt_fow_over;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_fow_over);
        if (textView != null) {
            i = R.id.txt_fow_player;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_fow_player);
            if (textView2 != null) {
                i = R.id.txt_fow_score;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_fow_score);
                if (textView3 != null) {
                    return new ItemFallOfWicketBinding(linearLayout, linearLayout, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
