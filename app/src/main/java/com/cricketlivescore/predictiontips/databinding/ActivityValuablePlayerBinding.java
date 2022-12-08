package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.cricketlivescore.predictiontips.R;
import androidx.viewbinding.ViewBindings;


public final class ActivityValuablePlayerBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardToolbar;
    public final ImageView imgBack;
    public final ImageView imgHome;
    public final ImageView imgInfo;
    public final LinearLayout llData;
    public final LinearLayout llNoData;
    public final LinearLayout llPlayer;
    public final LinearLayout llPredictor;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvPlayer;
    public final RecyclerView rvPredictor;
    public final RelativeLayout rvToolbar;
    public final TextView toobarTitle;
    public final TextView txtInfo;
    public final TextView txtMatch;
    public final TextView txtTitle;

    private ActivityValuablePlayerBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RelativeLayout relativeLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardToolbar = cardView;
        this.imgBack = imageView3;
        this.imgHome = imageView4;
        this.imgInfo = imageView5;
        this.llData = linearLayout;
        this.llNoData = linearLayout2;
        this.llPlayer = linearLayout3;
        this.llPredictor = linearLayout4;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rvPlayer = recyclerView;
        this.rvPredictor = recyclerView2;
        this.rvToolbar = relativeLayout4;
        this.toobarTitle = textView;
        this.txtInfo = textView2;
        this.txtMatch = textView3;
        this.txtTitle = textView4;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityValuablePlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityValuablePlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_valuable_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityValuablePlayerBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_toolbar;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_toolbar);
                if (cardView != null) {
                    i = R.id.img_back;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                    if (imageView3 != null) {
                        i = R.id.img_home;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_home);
                        if (imageView4 != null) {
                            i = R.id.img_info;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                            if (imageView5 != null) {
                                i = R.id.ll_data;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_data);
                                if (linearLayout != null) {
                                    i = R.id.ll_no_data;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_player;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player);
                                        if (linearLayout3 != null) {
                                            i = R.id.ll_predictor;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_predictor);
                                            if (linearLayout4 != null) {
                                                i = R.id.rl_ad_bottom;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                if (relativeLayout != null) {
                                                    i = R.id.rl_info;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                    if (relativeLayout2 != null) {
                                                        i = R.id.rv_player;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_player);
                                                        if (recyclerView != null) {
                                                            i = R.id.rv_predictor;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_predictor);
                                                            if (recyclerView2 != null) {
                                                                i = R.id.rv_toolbar;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rv_toolbar);
                                                                if (relativeLayout3 != null) {
                                                                    i = R.id.toobarTitle;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toobarTitle);
                                                                    if (textView != null) {
                                                                        i = R.id.txt_info;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_info);
                                                                        if (textView2 != null) {
                                                                            i = R.id.txt_match;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_match);
                                                                            if (textView3 != null) {
                                                                                i = R.id.txt_title;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                                if (textView4 != null) {
                                                                                    return new ActivityValuablePlayerBinding((RelativeLayout) view, imageView, imageView2, cardView, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, relativeLayout2, recyclerView, recyclerView2, relativeLayout3, textView, textView2, textView3, textView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
