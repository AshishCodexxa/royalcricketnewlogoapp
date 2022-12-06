package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.cricketscoreprediction.app.R;


public final class ActivityMatchCompleteBinding implements ViewBinding {
    public final CardView cardPlayer;
    public final ImageView imgBack;
    public final ImageView imgPlayerOfTheMatchImage;
    public final LinearLayout llCricklytics;
    public final LinearLayout llFantacy;
    public final LinearLayout llPrediction;
    public final LinearLayout rlPlayerOfTheMatch;
    private final LinearLayout rootView;
    public final RecyclerView rvMatchDetail;
    public final TabLayout tlMatchCompleteActivity;
    public final TextView txtMcaMatchStatus;
    public final TextView txtPlayerOfTheMatchName;
    public final TextView txtToolbarTitle;
    public final ViewPager vpMatchCompleteActivity;

    private ActivityMatchCompleteBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, ViewPager viewPager) {
        this.rootView = linearLayout;
        this.cardPlayer = cardView;
        this.imgBack = imageView;
        this.imgPlayerOfTheMatchImage = imageView2;
        this.llCricklytics = linearLayout2;
        this.llFantacy = linearLayout3;
        this.llPrediction = linearLayout4;
        this.rlPlayerOfTheMatch = linearLayout5;
        this.rvMatchDetail = recyclerView;
        this.tlMatchCompleteActivity = tabLayout;
        this.txtMcaMatchStatus = textView;
        this.txtPlayerOfTheMatchName = textView2;
        this.txtToolbarTitle = textView3;
        this.vpMatchCompleteActivity = viewPager;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMatchCompleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMatchCompleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_match_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMatchCompleteBinding bind(View view) {
        int i = R.id.card_player;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
        if (cardView != null) {
            i = R.id.img_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
            if (imageView != null) {
                i = R.id.img_playerOfTheMatchImage;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerOfTheMatchImage);
                if (imageView2 != null) {
                    i = R.id.ll_cricklytics;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_cricklytics);
                    if (linearLayout != null) {
                        i = R.id.ll_fantacy;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fantacy);
                        if (linearLayout2 != null) {
                            i = R.id.ll_prediction;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                            if (linearLayout3 != null) {
                                i = R.id.rl_player_of_the_match;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_player_of_the_match);
                                if (linearLayout4 != null) {
                                    i = R.id.rv_match_detail;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_match_detail);
                                    if (recyclerView != null) {
                                        i = R.id.tl_matchCompleteActivity;
                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_matchCompleteActivity);
                                        if (tabLayout != null) {
                                            i = R.id.txt_mca_matchStatus;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mca_matchStatus);
                                            if (textView != null) {
                                                i = R.id.txt_playerOfTheMatchName;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_playerOfTheMatchName);
                                                if (textView2 != null) {
                                                    i = R.id.txt_toolbar_title;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_title);
                                                    if (textView3 != null) {
                                                        i = R.id.vp_matchCompleteActivity;
                                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vp_matchCompleteActivity);
                                                        if (viewPager != null) {
                                                            return new ActivityMatchCompleteBinding((LinearLayout) view, cardView, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView, tabLayout, textView, textView2, textView3, viewPager);
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
