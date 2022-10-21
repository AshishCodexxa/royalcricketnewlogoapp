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

public final class ActivityCriclyticsLiveBinding implements ViewBinding {
    public final FrameLayout container;
    public final ImageView imgBack;
    public final ImageView imgPhase;
    public final ImageView imgPlayerMatchUps;
    public final ImageView imgPlayerPrediction;
    public final ImageView imgShare;
    public final ImageView imgTeamPrediction;
    public final LinearLayout llPhase;
    public final LinearLayout llPlayerMatchUps;
    public final LinearLayout llPlayerPrediction;
    public final LinearLayout llTeamPrediction;
    private final RelativeLayout rootView;
    public final RelativeLayout rvToolbar;
    public final TextView toobarTitle;
    public final TextView txtPhase;
    public final TextView txtPlayerMatchUps;
    public final TextView txtPlayerPrediction;
    public final TextView txtTeamPrediction;

    private ActivityCriclyticsLiveBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.imgBack = imageView;
        this.imgPhase = imageView2;
        this.imgPlayerMatchUps = imageView3;
        this.imgPlayerPrediction = imageView4;
        this.imgShare = imageView5;
        this.imgTeamPrediction = imageView6;
        this.llPhase = linearLayout;
        this.llPlayerMatchUps = linearLayout2;
        this.llPlayerPrediction = linearLayout3;
        this.llTeamPrediction = linearLayout4;
        this.rvToolbar = relativeLayout2;
        this.toobarTitle = textView;
        this.txtPhase = textView2;
        this.txtPlayerMatchUps = textView3;
        this.txtPlayerPrediction = textView4;
        this.txtTeamPrediction = textView5;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCriclyticsLiveBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCriclyticsLiveBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_criclytics_live, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCriclyticsLiveBinding bind(View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.container);
        if (frameLayout != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.img_phase;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_phase);
                if (imageView2 != null) {
                    i = R.id.img_player_match_ups;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_match_ups);
                    if (imageView3 != null) {
                        i = R.id.img_player_prediction;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_prediction);
                        if (imageView4 != null) {
                            i = R.id.img_share;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_share);
                            if (imageView5 != null) {
                                i = R.id.img_team_prediction;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team_prediction);
                                if (imageView6 != null) {
                                    i = R.id.ll_phase;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_phase);
                                    if (linearLayout != null) {
                                        i = R.id.ll_player_match_ups;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_match_ups);
                                        if (linearLayout2 != null) {
                                            i = R.id.ll_player_prediction;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_prediction);
                                            if (linearLayout3 != null) {
                                                i = R.id.ll_team_prediction;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_team_prediction);
                                                if (linearLayout4 != null) {
                                                    i = R.id.rv_toolbar;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rv_toolbar);
                                                    if (relativeLayout != null) {
                                                        i = R.id.toobarTitle;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toobarTitle);
                                                        if (textView != null) {
                                                            i = R.id.txt_phase;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_phase);
                                                            if (textView2 != null) {
                                                                i = R.id.txt_player_match_ups;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_match_ups);
                                                                if (textView3 != null) {
                                                                    i = R.id.txt_player_prediction;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_prediction);
                                                                    if (textView4 != null) {
                                                                        i = R.id.txt_team_prediction;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_prediction);
                                                                        if (textView5 != null) {
                                                                            return new ActivityCriclyticsLiveBinding((RelativeLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, textView, textView2, textView3, textView4, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
