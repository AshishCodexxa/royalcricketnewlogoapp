package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemBowlerBinding implements ViewBinding {
    public final LinearLayout llItemFm;
    private final LinearLayout rootView;
    public final TextView txtBowlerEco;
    public final TextView txtBowlerMaiden;
    public final TextView txtBowlerName;
    public final TextView txtBowlerOver;
    public final TextView txtBowlerRun;
    public final TextView txtBowlerWickets;

    private ItemBowlerBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.llItemFm = linearLayout2;
        this.txtBowlerEco = textView;
        this.txtBowlerMaiden = textView2;
        this.txtBowlerName = textView3;
        this.txtBowlerOver = textView4;
        this.txtBowlerRun = textView5;
        this.txtBowlerWickets = textView6;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBowlerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBowlerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bowler, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBowlerBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.txt_bowler_eco;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_eco);
        if (textView != null) {
            i = R.id.txt_bowler_maiden;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_maiden);
            if (textView2 != null) {
                i = R.id.txt_bowler_name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_name);
                if (textView3 != null) {
                    i = R.id.txt_bowler_over;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_over);
                    if (textView4 != null) {
                        i = R.id.txt_bowler_run;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_run);
                        if (textView5 != null) {
                            i = R.id.txt_bowler_wickets;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler_wickets);
                            if (textView6 != null) {
                                return new ItemBowlerBinding(linearLayout, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
