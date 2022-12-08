package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class ItemBatterBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView txtPsBatter4s;
    public final TextView txtPsBatter6s;
    public final TextView txtPsBatterBall;
    public final TextView txtPsBatterName;
    public final TextView txtPsBatterRun;
    public final TextView txtPsBatterSr;
    public final TextView txtPsBatterStatus;

    private ItemBatterBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.txtPsBatter4s = textView;
        this.txtPsBatter6s = textView2;
        this.txtPsBatterBall = textView3;
        this.txtPsBatterName = textView4;
        this.txtPsBatterRun = textView5;
        this.txtPsBatterSr = textView6;
        this.txtPsBatterStatus = textView7;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBatterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBatterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_batter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBatterBinding bind(View view) {
        int i = R.id.txt_ps_batter_4s;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_4s);
        if (textView != null) {
            i = R.id.txt_ps_batter_6s;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_6s);
            if (textView2 != null) {
                i = R.id.txt_ps_batter_ball;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_ball);
                if (textView3 != null) {
                    i = R.id.txt_ps_batter_name;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_name);
                    if (textView4 != null) {
                        i = R.id.txt_ps_batter_run;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_run);
                        if (textView5 != null) {
                            i = R.id.txt_ps_batter_sr;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_sr);
                            if (textView6 != null) {
                                i = R.id.txt_ps_batter_status;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ps_batter_status);
                                if (textView7 != null) {
                                    return new ItemBatterBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
