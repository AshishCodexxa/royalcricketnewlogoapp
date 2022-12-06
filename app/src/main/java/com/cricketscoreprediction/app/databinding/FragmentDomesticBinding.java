package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentDomesticBinding implements ViewBinding {
    public final LinearLayout llNoData;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvDomScheduleLive;
    public final RecyclerView rvDomScheduleResult;
    public final RecyclerView rvDomScheduleUp;

    private FragmentDomesticBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ProgressBar progressBar2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.rootView = relativeLayout;
        this.llNoData = linearLayout;
        this.progressBar = progressBar2;
        this.rvDomScheduleLive = recyclerView;
        this.rvDomScheduleResult = recyclerView2;
        this.rvDomScheduleUp = recyclerView3;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDomesticBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDomesticBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_domestic, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDomesticBinding bind(View view) {
        int i = R.id.ll_no_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
        if (linearLayout != null) {
            i = R.id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
            if (progressBar2 != null) {
                i = R.id.rv_domScheduleLive;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_domScheduleLive);
                if (recyclerView != null) {
                    i = R.id.rv_domScheduleResult;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_domScheduleResult);
                    if (recyclerView2 != null) {
                        i = R.id.rv_domScheduleUp;
                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_domScheduleUp);
                        if (recyclerView3 != null) {
                            return new FragmentDomesticBinding((RelativeLayout) view, linearLayout, progressBar2, recyclerView, recyclerView2, recyclerView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
