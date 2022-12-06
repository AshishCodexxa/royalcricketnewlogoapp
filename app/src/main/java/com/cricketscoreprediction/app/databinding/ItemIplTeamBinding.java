package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;


public final class ItemIplTeamBinding implements ViewBinding {
    public final ImageView imgItemFlag;
    private final LinearLayout rootView;
    public final RecyclerView rvItemScore;
    public final TextView txtItemTeam;

    private ItemIplTeamBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.imgItemFlag = imageView;
        this.rvItemScore = recyclerView;
        this.txtItemTeam = textView;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemIplTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemIplTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ipl_team, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemIplTeamBinding bind(View view) {
        int i = R.id.img_item_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_flag);
        if (imageView != null) {
            i = R.id.rv_item_score;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_item_score);
            if (recyclerView != null) {
                i = R.id.txt_item_team;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_team);
                if (textView != null) {
                    return new ItemIplTeamBinding((LinearLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
