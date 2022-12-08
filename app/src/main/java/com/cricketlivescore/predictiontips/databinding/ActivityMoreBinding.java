package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class ActivityMoreBinding implements ViewBinding {
    public final ImageView imgBack;
    public final LinearLayout layoutHeader;
    public final RelativeLayout rlMain;
    private final RelativeLayout rootView;
    public final RecyclerView rvAppList;
    public final TextView textTitle;

    private ActivityMoreBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = relativeLayout;
        this.imgBack = imageView;
        this.layoutHeader = linearLayout;
        this.rlMain = relativeLayout2;
        this.rvAppList = recyclerView;
        this.textTitle = textView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_more, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMoreBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.layoutHeader;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutHeader);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.rvAppList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvAppList);
                if (recyclerView != null) {
                    i = R.id.textTitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textTitle);
                    if (textView != null) {
                        return new ActivityMoreBinding(relativeLayout, imageView, linearLayout, relativeLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
