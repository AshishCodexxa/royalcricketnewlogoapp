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


public final class ItemPointTableBinding implements ViewBinding {
    public final ImageView imgItemFlag;
    private final LinearLayout rootView;
    public final TextView txtMatchLost;
    public final TextView txtMatchNrr;
    public final TextView txtMatchPlayed;
    public final TextView txtMatchPoint;
    public final TextView txtMatchWon;
    public final TextView txtTeamName;
    public final View viewLine;

    private ItemPointTableBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.rootView = linearLayout;
        this.imgItemFlag = imageView;
        this.txtMatchLost = textView;
        this.txtMatchNrr = textView2;
        this.txtMatchPlayed = textView3;
        this.txtMatchPoint = textView4;
        this.txtMatchWon = textView5;
        this.txtTeamName = textView6;
        this.viewLine = view;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemPointTableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPointTableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_point_table, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPointTableBinding bind(View view) {
        int i = R.id.img_item_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_flag);
        if (imageView != null) {
            i = R.id.txt_match_lost;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_lost);
            if (textView != null) {
                i = R.id.txt_match_nrr;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_nrr);
                if (textView2 != null) {
                    i = R.id.txt_match_played;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_played);
                    if (textView3 != null) {
                        i = R.id.txt_match_point;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_point);
                        if (textView4 != null) {
                            i = R.id.txt_match_won;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_won);
                            if (textView5 != null) {
                                i = R.id.txt_team_name;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                if (textView6 != null) {
                                    i = R.id.view_line;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_line);
                                    if (findChildViewById != null) {
                                        return new ItemPointTableBinding((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5, textView6, findChildViewById);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
