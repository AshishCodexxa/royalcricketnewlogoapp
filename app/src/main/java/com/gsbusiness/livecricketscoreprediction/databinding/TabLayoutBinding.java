package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;

public final class TabLayoutBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextView tabTitle;
    public final View view;

    private TabLayoutBinding(RelativeLayout relativeLayout, TextView textView, View view2) {
        this.rootView = relativeLayout;
        this.tabTitle = textView;
        this.view = view2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static TabLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TabLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.tab_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static TabLayoutBinding bind(View view2) {
        int i = R.id.tab_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, R.id.tab_title);
        if (textView != null) {
            i = R.id.view;
            View findChildViewById = ViewBindings.findChildViewById(view2, R.id.view);
            if (findChildViewById != null) {
                return new TabLayoutBinding((RelativeLayout) view2, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
