package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;

public final class ActivityCriclyticsBinding implements ViewBinding {
    public final CardView cardToolbar;
    public final ImageView img;
    public final ImageView imgBack;
    public final ImageView imgShare;
    public final LinearLayout llCompleted;
    public final LinearLayout llLive;
    public final LinearLayout llNoData;
    public final LinearLayout llPrediction;
    public final LinearLayout llUpcoming;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView sliderCriclyticsCompleted;
    public final RecyclerView sliderCriclyticsLive;
    public final RecyclerView sliderCriclyticsUpcoming;
    public final RelativeLayout toolbar;
    public final TextView txtTitle;

    private ActivityCriclyticsBinding(RelativeLayout relativeLayout, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ProgressBar progressBar2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.cardToolbar = cardView;
        this.img = imageView;
        this.imgBack = imageView2;
        this.imgShare = imageView3;
        this.llCompleted = linearLayout;
        this.llLive = linearLayout2;
        this.llNoData = linearLayout3;
        this.llPrediction = linearLayout4;
        this.llUpcoming = linearLayout5;
        this.progressBar = progressBar2;
        this.sliderCriclyticsCompleted = recyclerView;
        this.sliderCriclyticsLive = recyclerView2;
        this.sliderCriclyticsUpcoming = recyclerView3;
        this.toolbar = relativeLayout2;
        this.txtTitle = textView;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCriclyticsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCriclyticsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_criclytics, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCriclyticsBinding bind(View view) {
        int i = R.id.card_toolbar;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_toolbar);
        if (cardView != null) {
            i = R.id.img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
            if (imageView != null) {
                i = R.id.img_back;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                if (imageView2 != null) {
                    i = R.id.img_share;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_share);
                    if (imageView3 != null) {
                        i = R.id.ll_completed;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_completed);
                        if (linearLayout != null) {
                            i = R.id.ll_live;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_live);
                            if (linearLayout2 != null) {
                                i = R.id.ll_no_data;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_prediction;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_upcoming;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_upcoming);
                                        if (linearLayout5 != null) {
                                            i = R.id.progressBar;
                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                            if (progressBar2 != null) {
                                                i = R.id.slider_criclytics_completed;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.slider_criclytics_completed);
                                                if (recyclerView != null) {
                                                    i = R.id.slider_criclytics_live;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.slider_criclytics_live);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.slider_criclytics_upcoming;
                                                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.slider_criclytics_upcoming);
                                                        if (recyclerView3 != null) {
                                                            i = R.id.toolbar;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                            if (relativeLayout != null) {
                                                                i = R.id.txt_title;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                if (textView != null) {
                                                                    return new ActivityCriclyticsBinding((RelativeLayout) view, cardView, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, progressBar2, recyclerView, recyclerView2, recyclerView3, relativeLayout, textView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
