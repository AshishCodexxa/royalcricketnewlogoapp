package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentMoreBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardToolbar;
    public final ImageView imgBack;
    public final LinearLayout llIpl;
    public final LinearLayout llPlayers;
    public final LinearLayout llSchedules;
    public final LinearLayout llStadiums;
    public final LinearLayout llTeams;
    public final RelativeLayout rlAdBottom;
    private final RelativeLayout rootView;

    private FragmentMoreBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardToolbar = cardView;
        this.imgBack = imageView3;
        this.llIpl = linearLayout;
        this.llPlayers = linearLayout2;
        this.llSchedules = linearLayout3;
        this.llStadiums = linearLayout4;
        this.llTeams = linearLayout5;
        this.rlAdBottom = relativeLayout2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_more, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMoreBinding bind(View view) {
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
                        i = R.id.ll_ipl;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_ipl);
                        if (linearLayout != null) {
                            i = R.id.ll_players;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_players);
                            if (linearLayout2 != null) {
                                i = R.id.ll_schedules;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_schedules);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_stadiums;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stadiums);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_teams;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_teams);
                                        if (linearLayout5 != null) {
                                            i = R.id.rl_ad_bottom;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                            if (relativeLayout != null) {
                                                return new FragmentMoreBinding((RelativeLayout) view, imageView, imageView2, cardView, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout);
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
