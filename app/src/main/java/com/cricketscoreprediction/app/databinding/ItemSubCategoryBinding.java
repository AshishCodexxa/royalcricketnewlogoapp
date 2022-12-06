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


public final class ItemSubCategoryBinding implements ViewBinding {
    public final ImageView imgItemSubCategory;
    public final LinearLayout llItemSubCategory;
    private final LinearLayout rootView;
    public final TextView txtItemSubCategory;

    private ItemSubCategoryBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.imgItemSubCategory = imageView;
        this.llItemSubCategory = linearLayout2;
        this.txtItemSubCategory = textView;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSubCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSubCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_sub_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSubCategoryBinding bind(View view) {
        int i = R.id.img_item_sub_category;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_sub_category);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_sub_category);
            if (textView != null) {
                return new ItemSubCategoryBinding(linearLayout, imageView, linearLayout, textView);
            }
            i = R.id.txt_item_sub_category;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
