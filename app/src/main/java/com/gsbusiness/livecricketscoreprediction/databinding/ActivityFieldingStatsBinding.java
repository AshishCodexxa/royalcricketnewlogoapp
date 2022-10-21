package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;

public final class ActivityFieldingStatsBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardMostCatches;
    public final CardView cardToolbar;
    public final ImageView imgBack;
    public final ImageView imgMostCatches;
    public final ImageView imgMostDis;
    public final ImageView imgMostRunOut;
    public final LinearLayout llMostDismissals;
    public final LinearLayout llMostRunout;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;
    public final LinearLayout toolbar;
    public final TextView txtMostCatches;
    public final TextView txtMostCatchesPlayerName;
    public final TextView txtMostCatchesPlayerTeam;
    public final TextView txtMostDis;
    public final TextView txtMostDisPlayerName;
    public final TextView txtMostDisPlayerTeam;
    public final TextView txtMostRunOut;
    public final TextView txtMostRunOutPlayerName;
    public final TextView txtMostRunOutPlayerTeam;
    public final TextView txtTitle;

    private ActivityFieldingStatsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardMostCatches = cardView;
        this.cardToolbar = cardView2;
        this.imgBack = imageView3;
        this.imgMostCatches = imageView4;
        this.imgMostDis = imageView5;
        this.imgMostRunOut = imageView6;
        this.llMostDismissals = linearLayout;
        this.llMostRunout = linearLayout2;
        this.rlAdBottom = relativeLayout2;
        this.toolbar = linearLayout3;
        this.txtMostCatches = textView;
        this.txtMostCatchesPlayerName = textView2;
        this.txtMostCatchesPlayerTeam = textView3;
        this.txtMostDis = textView4;
        this.txtMostDisPlayerName = textView5;
        this.txtMostDisPlayerTeam = textView6;
        this.txtMostRunOut = textView7;
        this.txtMostRunOutPlayerName = textView8;
        this.txtMostRunOutPlayerTeam = textView9;
        this.txtTitle = textView10;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFieldingStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFieldingStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_fielding_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFieldingStatsBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_most_catches;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_most_catches);
                if (cardView != null) {
                    i = R.id.card_toolbar;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_toolbar);
                    if (cardView2 != null) {
                        i = R.id.img_back;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
                        if (imageView3 != null) {
                            i = R.id.img_mostCatches;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mostCatches);
                            if (imageView4 != null) {
                                i = R.id.img_mostDis;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mostDis);
                                if (imageView5 != null) {
                                    i = R.id.img_mostRunOut;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mostRunOut);
                                    if (imageView6 != null) {
                                        i = R.id.ll_most_dismissals;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_dismissals);
                                        if (linearLayout != null) {
                                            i = R.id.ll_most_runout;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_most_runout);
                                            if (linearLayout2 != null) {
                                                i = R.id.rl_ad_bottom;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                if (relativeLayout != null) {
                                                    i = R.id.toolbar;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.txt_mostCatches;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostCatches);
                                                        if (textView != null) {
                                                            i = R.id.txt_mostCatches_playerName;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostCatches_playerName);
                                                            if (textView2 != null) {
                                                                i = R.id.txt_mostCatches_playerTeam;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostCatches_playerTeam);
                                                                if (textView3 != null) {
                                                                    i = R.id.txt_mostDis;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostDis);
                                                                    if (textView4 != null) {
                                                                        i = R.id.txt_mostDis_playerName;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostDis_playerName);
                                                                        if (textView5 != null) {
                                                                            i = R.id.txt_mostDis_playerTeam;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostDis_playerTeam);
                                                                            if (textView6 != null) {
                                                                                i = R.id.txt_mostRunOut;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRunOut);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.txt_mostRunOut_playerName;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRunOut_playerName);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.txt_mostRunOut_playerTeam;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mostRunOut_playerTeam);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.txt_title;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_title);
                                                                                            if (textView10 != null) {
                                                                                                return new ActivityFieldingStatsBinding((RelativeLayout) view, imageView, imageView2, cardView, cardView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, relativeLayout, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
