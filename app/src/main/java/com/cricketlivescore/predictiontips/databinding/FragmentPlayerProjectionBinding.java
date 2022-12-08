package com.cricketlivescore.predictiontips.databinding;

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
import com.google.android.material.tabs.TabLayout;
import com.cricketlivescore.predictiontips.R;


public final class FragmentPlayerProjectionBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardAllRounder;
    public final ImageView imgBall;
    public final ImageView imgBat;
    public final ImageView imgInfo;
    public final ImageView imgPlayer;
    public final ImageView imgRole;
    public final LinearLayout llNoData;
    public final LinearLayout llPlayerProjection;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvPlayer;
    public final TabLayout tabLayoutTeam;
    public final TextView txtPlayer;
    public final TextView txtPlayerProjected;

    private FragmentPlayerProjectionBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, TabLayout tabLayout, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.ProgressBar = progressBar;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardAllRounder = cardView;
        this.imgBall = imageView3;
        this.imgBat = imageView4;
        this.imgInfo = imageView5;
        this.imgPlayer = imageView6;
        this.imgRole = imageView7;
        this.llNoData = linearLayout;
        this.llPlayerProjection = linearLayout2;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rvPlayer = recyclerView;
        this.tabLayoutTeam = tabLayout;
        this.txtPlayer = textView;
        this.txtPlayerProjected = textView2;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerProjectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerProjectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_projection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerProjectionBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.ad_banner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
            if (imageView != null) {
                i = R.id.ad_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
                if (imageView2 != null) {
                    i = R.id.card_allRounder;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_allRounder);
                    if (cardView != null) {
                        i = R.id.img_ball;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_ball);
                        if (imageView3 != null) {
                            i = R.id.img_bat;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_bat);
                            if (imageView4 != null) {
                                i = R.id.img_info;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                                if (imageView5 != null) {
                                    i = R.id.img_player;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player);
                                    if (imageView6 != null) {
                                        i = R.id.img_role;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_role);
                                        if (imageView7 != null) {
                                            i = R.id.ll_no_data;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                            if (linearLayout != null) {
                                                i = R.id.ll_player_projection;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_projection);
                                                if (linearLayout2 != null) {
                                                    i = R.id.rl_ad_bottom;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                    if (relativeLayout != null) {
                                                        i = R.id.rl_info;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                        if (relativeLayout2 != null) {
                                                            i = R.id.rv_player;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_player);
                                                            if (recyclerView != null) {
                                                                i = R.id.tabLayout_team;
                                                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_team);
                                                                if (tabLayout != null) {
                                                                    i = R.id.txt_player;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player);
                                                                    if (textView != null) {
                                                                        i = R.id.txt_player_projected;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_projected);
                                                                        if (textView2 != null) {
                                                                            return new FragmentPlayerProjectionBinding((RelativeLayout) view, progressBar, imageView, imageView2, cardView, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, relativeLayout, relativeLayout2, recyclerView, tabLayout, textView, textView2);
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
