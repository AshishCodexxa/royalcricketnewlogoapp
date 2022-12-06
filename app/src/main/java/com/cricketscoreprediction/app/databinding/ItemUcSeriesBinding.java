package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketscoreprediction.app.R;


public final class ItemUcSeriesBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvItemUcMatch;

    private ItemUcSeriesBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.rvItemUcMatch = recyclerView;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemUcSeriesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemUcSeriesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_uc_series, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemUcSeriesBinding bind(View view) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_item_uc_match);
        if (recyclerView != null) {
            return new ItemUcSeriesBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rv_item_uc_match)));
    }
}
