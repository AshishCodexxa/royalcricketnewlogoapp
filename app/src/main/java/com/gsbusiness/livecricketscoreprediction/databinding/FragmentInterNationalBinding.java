package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentInterNationalBinding implements ViewBinding {
    public final LinearLayout llNoData;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvIntScheduleLive;
    public final RecyclerView rvIntScheduleResult;
    public final RecyclerView rvIntScheduleUp;

    private FragmentInterNationalBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ProgressBar progressBar2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.rootView = relativeLayout;
        this.llNoData = linearLayout;
        this.progressBar = progressBar2;
        this.rvIntScheduleLive = recyclerView;
        this.rvIntScheduleResult = recyclerView2;
        this.rvIntScheduleUp = recyclerView3;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInterNationalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInterNationalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_inter_national, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentInterNationalBinding bind(View view) {
        int i = R.id.ll_no_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
        if (linearLayout != null) {
            i = R.id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
            if (progressBar2 != null) {
                i = R.id.rv_intScheduleLive;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_intScheduleLive);
                if (recyclerView != null) {
                    i = R.id.rv_intScheduleResult;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_intScheduleResult);
                    if (recyclerView2 != null) {
                        i = R.id.rv_intScheduleUp;
                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_intScheduleUp);
                        if (recyclerView3 != null) {
                            return new FragmentInterNationalBinding((RelativeLayout) view, linearLayout, progressBar2, recyclerView, recyclerView2, recyclerView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
