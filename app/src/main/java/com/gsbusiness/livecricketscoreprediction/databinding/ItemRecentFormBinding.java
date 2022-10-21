package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemRecentFormBinding implements ViewBinding {
    public final LinearLayout llResult;
    private final LinearLayout rootView;
    public final TextView txtResult;

    private ItemRecentFormBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.llResult = linearLayout2;
        this.txtResult = textView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemRecentFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemRecentFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_recent_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemRecentFormBinding bind(View view) {
        int i = R.id.ll_result;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_result);
        if (linearLayout != null) {
            i = R.id.txt_result;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_result);
            if (textView != null) {
                return new ItemRecentFormBinding((LinearLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
