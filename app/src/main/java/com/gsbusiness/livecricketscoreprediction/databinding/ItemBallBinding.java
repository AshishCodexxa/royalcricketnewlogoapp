package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemBallBinding implements ViewBinding {
    public final LinearLayout llOver;
    private final LinearLayout rootView;
    public final TextView txtBall;
    public final TextView txtBallResult;

    private ItemBallBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.llOver = linearLayout2;
        this.txtBall = textView;
        this.txtBallResult = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ball, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemBallBinding bind(View view) {
        int i = R.id.ll_over;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_over);
        if (linearLayout != null) {
            i = R.id.txt_ball;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ball);
            if (textView != null) {
                i = R.id.txt_ball_result;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ball_result);
                if (textView2 != null) {
                    return new ItemBallBinding((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
