package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;

public final class ActivityCriclyticsCompleteBinding implements ViewBinding {
    public final FrameLayout container;
    public final ImageView imgBack;
    public final ImageView imgGameChange;
    public final ImageView imgMatchState;
    public final ImageView imgReportCard;
    public final ImageView imgShare;
    public final LinearLayout llGameChange;
    public final LinearLayout llMatchState;
    public final LinearLayout llReportCard;
    private final RelativeLayout rootView;
    public final RelativeLayout rvToolbar;
    public final TextView toobarTitle;
    public final TextView txtGameChange;
    public final TextView txtMatchState;
    public final TextView txtReportCard;

    private ActivityCriclyticsCompleteBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.imgBack = imageView;
        this.imgGameChange = imageView2;
        this.imgMatchState = imageView3;
        this.imgReportCard = imageView4;
        this.imgShare = imageView5;
        this.llGameChange = linearLayout;
        this.llMatchState = linearLayout2;
        this.llReportCard = linearLayout3;
        this.rvToolbar = relativeLayout2;
        this.toobarTitle = textView;
        this.txtGameChange = textView2;
        this.txtMatchState = textView3;
        this.txtReportCard = textView4;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCriclyticsCompleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCriclyticsCompleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_criclytics_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCriclyticsCompleteBinding bind(View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.container);
        if (frameLayout != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.img_game_change;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_game_change);
                if (imageView2 != null) {
                    i = R.id.img_match_state;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_match_state);
                    if (imageView3 != null) {
                        i = R.id.img_report_card;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_report_card);
                        if (imageView4 != null) {
                            i = R.id.img_share;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_share);
                            if (imageView5 != null) {
                                i = R.id.ll_game_change;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_game_change);
                                if (linearLayout != null) {
                                    i = R.id.ll_match_state;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_match_state);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_report_card;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_report_card);
                                        if (linearLayout3 != null) {
                                            i = R.id.rv_toolbar;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rv_toolbar);
                                            if (relativeLayout != null) {
                                                i = R.id.toobarTitle;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toobarTitle);
                                                if (textView != null) {
                                                    i = R.id.txt_game_change;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_game_change);
                                                    if (textView2 != null) {
                                                        i = R.id.txt_match_state;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match_state);
                                                        if (textView3 != null) {
                                                            i = R.id.txt_report_card;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_report_card);
                                                            if (textView4 != null) {
                                                                return new ActivityCriclyticsCompleteBinding((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3, textView4);
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
