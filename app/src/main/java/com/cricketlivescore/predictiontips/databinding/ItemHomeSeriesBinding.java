package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemHomeSeriesBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvMatches;
    public final TextView txtSeriesName;

    private ItemHomeSeriesBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.rvMatches = recyclerView;
        this.txtSeriesName = textView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeSeriesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHomeSeriesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_home_series, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeSeriesBinding bind(View view) {
        int i = R.id.rv_matches;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_matches);
        if (recyclerView != null) {
            i = R.id.txt_seriesName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_seriesName);
            if (textView != null) {
                return new ItemHomeSeriesBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
