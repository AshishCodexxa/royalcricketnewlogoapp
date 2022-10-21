package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ActivityMatchUpComingBinding implements ViewBinding {
    public final ImageView imgBack;
    public final ImageView imgMifAFlag;
    public final ImageView imgMifHFlag;
    public final ImageView imgMucaAFlag;
    public final ImageView imgMucaHFlag;
    public final LinearLayout llCricklytics;
    public final LinearLayout llFantacy;
    public final LinearLayout llPrediction;
    private final LinearLayout rootView;
    public final TabLayout tabLayoutUpComing;
    public final TextView txtMifATeam;
    public final TextView txtMifDateTime;
    public final TextView txtMifHTeam;
    public final TextView txtMifMReferee;
    public final TextView txtMifMatchNo;
    public final TextView txtMifSeriesName;
    public final TextView txtMifTUmpire;
    public final TextView txtMifToss;
    public final TextView txtMifUmpires;
    public final TextView txtMifVenue;
    public final TextView txtMucaAScore;
    public final TextView txtMucaATeam;
    public final TextView txtMucaHScore;
    public final TextView txtMucaHTeam;
    public final TextView txtMucaMatchStatus;
    public final TextView txtToolbarTitle;
    public final ViewPager viewPagerUpComing;

    private ActivityMatchUpComingBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, ViewPager viewPager) {
        this.rootView = linearLayout;
        this.imgBack = imageView;
        this.imgMifAFlag = imageView2;
        this.imgMifHFlag = imageView3;
        this.imgMucaAFlag = imageView4;
        this.imgMucaHFlag = imageView5;
        this.llCricklytics = linearLayout2;
        this.llFantacy = linearLayout3;
        this.llPrediction = linearLayout4;
        this.tabLayoutUpComing = tabLayout;
        this.txtMifATeam = textView;
        this.txtMifDateTime = textView2;
        this.txtMifHTeam = textView3;
        this.txtMifMReferee = textView4;
        this.txtMifMatchNo = textView5;
        this.txtMifSeriesName = textView6;
        this.txtMifTUmpire = textView7;
        this.txtMifToss = textView8;
        this.txtMifUmpires = textView9;
        this.txtMifVenue = textView10;
        this.txtMucaAScore = textView11;
        this.txtMucaATeam = textView12;
        this.txtMucaHScore = textView13;
        this.txtMucaHTeam = textView14;
        this.txtMucaMatchStatus = textView15;
        this.txtToolbarTitle = textView16;
        this.viewPagerUpComing = viewPager;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMatchUpComingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMatchUpComingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_match_up_coming, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMatchUpComingBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.img_mif_a_flag;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mif_a_flag);
            if (imageView2 != null) {
                i = R.id.img_mif_h_flag;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mif_h_flag);
                if (imageView3 != null) {
                    i = R.id.img_muca_a_flag;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_muca_a_flag);
                    if (imageView4 != null) {
                        i = R.id.img_muca_h_flag;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_muca_h_flag);
                        if (imageView5 != null) {
                            i = R.id.ll_cricklytics;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_cricklytics);
                            if (linearLayout != null) {
                                i = R.id.ll_fantacy;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fantacy);
                                if (linearLayout2 != null) {
                                    i = R.id.ll_prediction;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_prediction);
                                    if (linearLayout3 != null) {
                                        i = R.id.tabLayout_upComing;
                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout_upComing);
                                        if (tabLayout != null) {
                                            i = R.id.txt_mif_a_team;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_a_team);
                                            if (textView != null) {
                                                i = R.id.txt_mif_dateTime;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_dateTime);
                                                if (textView2 != null) {
                                                    i = R.id.txt_mif_h_team;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_h_team);
                                                    if (textView3 != null) {
                                                        i = R.id.txt_mif_mReferee;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_mReferee);
                                                        if (textView4 != null) {
                                                            i = R.id.txt_mif_matchNo;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_matchNo);
                                                            if (textView5 != null) {
                                                                i = R.id.txt_mif_seriesName;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_seriesName);
                                                                if (textView6 != null) {
                                                                    i = R.id.txt_mif_tUmpire;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_tUmpire);
                                                                    if (textView7 != null) {
                                                                        i = R.id.txt_mif_toss;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_toss);
                                                                        if (textView8 != null) {
                                                                            i = R.id.txt_mif_umpires;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_umpires);
                                                                            if (textView9 != null) {
                                                                                i = R.id.txt_mif_venue;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_mif_venue);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.txt_muca_a_score;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_muca_a_score);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.txt_muca_a_team;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_muca_a_team);
                                                                                        if (textView12 != null) {
                                                                                            i = R.id.txt_muca_h_score;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_muca_h_score);
                                                                                            if (textView13 != null) {
                                                                                                i = R.id.txt_muca_h_team;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_muca_h_team);
                                                                                                if (textView14 != null) {
                                                                                                    i = R.id.txt_muca_matchStatus;
                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_muca_matchStatus);
                                                                                                    if (textView15 != null) {
                                                                                                        i = R.id.txt_toolbar_title;
                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_title);
                                                                                                        if (textView16 != null) {
                                                                                                            i = R.id.viewPager_upComing;
                                                                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager_upComing);
                                                                                                            if (viewPager != null) {
                                                                                                                return new ActivityMatchUpComingBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, viewPager);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
