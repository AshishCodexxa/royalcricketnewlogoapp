package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemTopBinding implements ViewBinding {
    public final ImageView imgCap;
    public final ImageView imgPlayer;
    private final LinearLayout rootView;
    public final TextView txtNumber;
    public final TextView txtNumberType;
    public final TextView txtPlayer;
    public final TextView txtPlayerTeam;

    private ItemTopBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.imgCap = imageView;
        this.imgPlayer = imageView2;
        this.txtNumber = textView;
        this.txtNumberType = textView2;
        this.txtPlayer = textView3;
        this.txtPlayerTeam = textView4;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemTopBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_top, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTopBinding bind(View view) {
        int i = R.id.img_cap;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_cap);
        if (imageView != null) {
            i = R.id.img_player;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
            if (imageView2 != null) {
                i = R.id.txt_number;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number);
                if (textView != null) {
                    i = R.id.txt_number_type;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_number_type);
                    if (textView2 != null) {
                        i = R.id.txt_player;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player);
                        if (textView3 != null) {
                            i = R.id.txt_player_team;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_team);
                            if (textView4 != null) {
                                return new ItemTopBinding((LinearLayout) view, imageView, imageView2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
