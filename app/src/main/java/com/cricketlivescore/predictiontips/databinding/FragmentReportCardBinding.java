package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentReportCardBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView imgInfo;
    public final LinearLayout llNoData;
    public final LinearLayout llReportCard;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvReportCard;

    private FragmentReportCardBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.ProgressBar = progressBar;
        this.imgInfo = imageView;
        this.llNoData = linearLayout;
        this.llReportCard = linearLayout2;
        this.rlInfo = relativeLayout2;
        this.rvReportCard = recyclerView;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentReportCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentReportCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_report_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentReportCardBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.img_info;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
            if (imageView != null) {
                i = R.id.ll_no_data;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                if (linearLayout != null) {
                    i = R.id.ll_report_card;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_report_card);
                    if (linearLayout2 != null) {
                        i = R.id.rl_info;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                        if (relativeLayout != null) {
                            i = R.id.rv_report_card;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_report_card);
                            if (recyclerView != null) {
                                return new FragmentReportCardBinding((RelativeLayout) view, progressBar, imageView, linearLayout, linearLayout2, relativeLayout, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
