package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemMatchUcBinding implements ViewBinding {
    public final ImageView imgFlagAway;
    public final ImageView imgFlagHome;
    public final LinearLayout llReportCard;
    private final LinearLayout rootView;
    public final TextView txtDate;
    public final TextView txtMonth;
    public final TextView txtTeamAway;
    public final TextView txtTeamHome;
    public final TextView txtTime;
    public final TextView txtVenue;
    public final View viewLine;

    private ItemMatchUcBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.rootView = linearLayout;
        this.imgFlagAway = imageView;
        this.imgFlagHome = imageView2;
        this.llReportCard = linearLayout2;
        this.txtDate = textView;
        this.txtMonth = textView2;
        this.txtTeamAway = textView3;
        this.txtTeamHome = textView4;
        this.txtTime = textView5;
        this.txtVenue = textView6;
        this.viewLine = view;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMatchUcBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMatchUcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_match_uc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMatchUcBinding bind(View view) {
        int i = R.id.img_flag_away;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_away);
        if (imageView != null) {
            i = R.id.img_flag_home;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_home);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.txt_date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_date);
                if (textView != null) {
                    i = R.id.txt_month;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_month);
                    if (textView2 != null) {
                        i = R.id.txt_team_away;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away);
                        if (textView3 != null) {
                            i = R.id.txt_team_home;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home);
                            if (textView4 != null) {
                                i = R.id.txt_time;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_time);
                                if (textView5 != null) {
                                    i = R.id.txt_venue;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_venue);
                                    if (textView6 != null) {
                                        i = R.id.view_line;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_line);
                                        if (findChildViewById != null) {
                                            return new ItemMatchUcBinding(linearLayout, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, findChildViewById);
                                        }
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
