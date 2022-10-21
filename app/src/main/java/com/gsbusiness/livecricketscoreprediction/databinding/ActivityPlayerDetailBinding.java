package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ActivityPlayerDetailBinding implements ViewBinding {
    public final ImageView imgBack;
    public final ImageView imgBackground;
    public final ImageView imgHome;
    public final ImageView imgPlayerCountry;
    public final ImageView imgPlayerProfile;
    public final ImageView imgPlayerType;
    public final LinearLayout llPlayerBattingStyle;
    public final LinearLayout llPlayerBowlingStyle;
    public final LinearLayout llPlayerCountry;
    public final LinearLayout llPlayerType;
    public final LinearLayout llTab;
    public final RelativeLayout rlHeader;
    private final RelativeLayout rootView;
    public final TabLayout tabPlayerState;
    public final TextView txtPlayerAge;
    public final TextView txtPlayerBattingStyle;
    public final TextView txtPlayerBowlingStyle;
    public final TextView txtPlayerCountry;
    public final TextView txtPlayerName;
    public final ViewPager viewPagePlayerState;

    private ActivityPlayerDetailBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout2, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ViewPager viewPager) {
        this.rootView = relativeLayout;
        this.imgBack = imageView;
        this.imgBackground = imageView2;
        this.imgHome = imageView3;
        this.imgPlayerCountry = imageView4;
        this.imgPlayerProfile = imageView5;
        this.imgPlayerType = imageView6;
        this.llPlayerBattingStyle = linearLayout;
        this.llPlayerBowlingStyle = linearLayout2;
        this.llPlayerCountry = linearLayout3;
        this.llPlayerType = linearLayout4;
        this.llTab = linearLayout5;
        this.rlHeader = relativeLayout2;
        this.tabPlayerState = tabLayout;
        this.txtPlayerAge = textView;
        this.txtPlayerBattingStyle = textView2;
        this.txtPlayerBowlingStyle = textView3;
        this.txtPlayerCountry = textView4;
        this.txtPlayerName = textView5;
        this.viewPagePlayerState = viewPager;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPlayerDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPlayerDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_player_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPlayerDetailBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.img_background;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_background);
            if (imageView2 != null) {
                i = R.id.img_home;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_home);
                if (imageView3 != null) {
                    i = R.id.img_player_country;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_country);
                    if (imageView4 != null) {
                        i = R.id.img_player_profile;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_profile);
                        if (imageView5 != null) {
                            i = R.id.img_player_type;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_type);
                            if (imageView6 != null) {
                                i = R.id.ll_player_battingStyle;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_battingStyle);
                                if (linearLayout != null) {
                                    i = R.id.ll_player_bowlingStyle;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_bowlingStyle);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_player_country;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_country);
                                        if (linearLayout3 != null) {
                                            i = R.id.ll_player_type;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_type);
                                            if (linearLayout4 != null) {
                                                i = R.id.ll_tab;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab);
                                                if (linearLayout5 != null) {
                                                    i = R.id.rl_header;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header);
                                                    if (relativeLayout != null) {
                                                        i = R.id.tab_player_state;
                                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_player_state);
                                                        if (tabLayout != null) {
                                                            i = R.id.txt_player_age;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_age);
                                                            if (textView != null) {
                                                                i = R.id.txt_player_battingStyle;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_battingStyle);
                                                                if (textView2 != null) {
                                                                    i = R.id.txt_player_bowlingStyle;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bowlingStyle);
                                                                    if (textView3 != null) {
                                                                        i = R.id.txt_player_country;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_country);
                                                                        if (textView4 != null) {
                                                                            i = R.id.txt_player_name;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                                                                            if (textView5 != null) {
                                                                                i = R.id.viewPage_player_state;
                                                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPage_player_state);
                                                                                if (viewPager != null) {
                                                                                    return new ActivityPlayerDetailBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, tabLayout, textView, textView2, textView3, textView4, textView5, viewPager);
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
