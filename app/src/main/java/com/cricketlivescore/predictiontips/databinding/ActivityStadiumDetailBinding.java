package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class ActivityStadiumDetailBinding implements ViewBinding {
    public final ImageView imgBack;
    public final ImageView imgHome;
    public final ImageView imgOdi;
    public final ImageView imgStadium;
    public final ImageView imgT20;
    public final ImageView imgTest;
    public final LinearLayout llNoData;
    public final LinearLayout llOdi;
    public final LinearLayout llOdiMain;
    public final LinearLayout llStadium;
    public final LinearLayout llT20;
    public final LinearLayout llT20Main;
    public final LinearLayout llTest;
    public final LinearLayout llTestMain;
    public final ProgressBar progressBar;
    public final ProgressBar progressBar1;
    public final ProgressBar progressBarOdi;
    public final ProgressBar progressBart20;
    private final LinearLayout rootView;
    public final TextView txtBowlingEnds;
    public final TextView txtCapacity;
    public final TextView txtCity;
    public final TextView txtFirstOdiDate;
    public final TextView txtFirstOdiResult;
    public final TextView txtFirstOdiTeam;
    public final TextView txtFirstTestDate;
    public final TextView txtFirstTestResult;
    public final TextView txtFirstTestTeam;
    public final TextView txtFirstt20Date;
    public final TextView txtFirstt20Result;
    public final TextView txtFirstt20Team;
    public final TextView txtHighOdiDate;
    public final TextView txtHighOdiResult;
    public final TextView txtHighOdiTeam;
    public final TextView txtHighTestDate;
    public final TextView txtHighTestResult;
    public final TextView txtHighTestTeam;
    public final TextView txtHight20Date;
    public final TextView txtHight20Result;
    public final TextView txtHight20Team;
    public final TextView txtLowOdiDate;
    public final TextView txtLowOdiResult;
    public final TextView txtLowOdiTeam;
    public final TextView txtLowTestDate;
    public final TextView txtLowTestResult;
    public final TextView txtLowTestTeam;
    public final TextView txtLowt20Date;
    public final TextView txtLowt20Result;
    public final TextView txtLowt20Team;
    public final TextView txtOdiAvg;
    public final TextView txtOdiWinning;
    public final TextView txtPlayerSHomeground;
    public final TextView txtRecentOdiDate;
    public final TextView txtRecentOdiResult;
    public final TextView txtRecentOdiTeam;
    public final TextView txtRecentTestDate;
    public final TextView txtRecentTestResult;
    public final TextView txtRecentTestTeam;
    public final TextView txtRecentt20Date;
    public final TextView txtRecentt20Result;
    public final TextView txtRecentt20Team;
    public final TextView txtT20Avg;
    public final TextView txtT20Winning;
    public final TextView txtTeamSHomeground;
    public final TextView txtTestAvg;
    public final TextView txtTestWinning;
    public final TextView txtToolbarTitle;

    private ActivityStadiumDetailBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView43, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48) {
        this.rootView = linearLayout;
        this.imgBack = imageView;
        this.imgHome = imageView2;
        this.imgOdi = imageView3;
        this.imgStadium = imageView4;
        this.imgT20 = imageView5;
        this.imgTest = imageView6;
        this.llNoData = linearLayout2;
        this.llOdi = linearLayout3;
        this.llOdiMain = linearLayout4;
        this.llStadium = linearLayout5;
        this.llT20 = linearLayout6;
        this.llT20Main = linearLayout7;
        this.llTest = linearLayout8;
        this.llTestMain = linearLayout9;
        this.progressBar = progressBar2;
        this.progressBar1 = progressBar3;
        this.progressBarOdi = progressBar4;
        this.progressBart20 = progressBar5;
        this.txtBowlingEnds = textView;
        this.txtCapacity = textView2;
        this.txtCity = textView3;
        this.txtFirstOdiDate = textView4;
        this.txtFirstOdiResult = textView5;
        this.txtFirstOdiTeam = textView6;
        this.txtFirstTestDate = textView7;
        this.txtFirstTestResult = textView8;
        this.txtFirstTestTeam = textView9;
        this.txtFirstt20Date = textView10;
        this.txtFirstt20Result = textView11;
        this.txtFirstt20Team = textView12;
        this.txtHighOdiDate = textView13;
        this.txtHighOdiResult = textView14;
        this.txtHighOdiTeam = textView15;
        this.txtHighTestDate = textView16;
        this.txtHighTestResult = textView17;
        this.txtHighTestTeam = textView18;
        this.txtHight20Date = textView19;
        this.txtHight20Result = textView20;
        this.txtHight20Team = textView21;
        this.txtLowOdiDate = textView22;
        this.txtLowOdiResult = textView23;
        this.txtLowOdiTeam = textView24;
        this.txtLowTestDate = textView25;
        this.txtLowTestResult = textView26;
        this.txtLowTestTeam = textView27;
        this.txtLowt20Date = textView28;
        this.txtLowt20Result = textView29;
        this.txtLowt20Team = textView30;
        this.txtOdiAvg = textView31;
        this.txtOdiWinning = textView32;
        this.txtPlayerSHomeground = textView33;
        this.txtRecentOdiDate = textView34;
        this.txtRecentOdiResult = textView35;
        this.txtRecentOdiTeam = textView36;
        this.txtRecentTestDate = textView37;
        this.txtRecentTestResult = textView38;
        this.txtRecentTestTeam = textView39;
        this.txtRecentt20Date = textView40;
        this.txtRecentt20Result = textView41;
        this.txtRecentt20Team = textView42;
        this.txtT20Avg = textView43;
        this.txtT20Winning = textView44;
        this.txtTeamSHomeground = textView45;
        this.txtTestAvg = textView46;
        this.txtTestWinning = textView47;
        this.txtToolbarTitle = textView48;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityStadiumDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityStadiumDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_stadium_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityStadiumDetailBinding bind(View view) {
        int i = R.id.img_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_back);
        if (imageView != null) {
            i = R.id.img_home;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_home);
            if (imageView2 != null) {
                i = R.id.img_odi;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_odi);
                if (imageView3 != null) {
                    i = R.id.img_stadium;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_stadium);
                    if (imageView4 != null) {
                        i = R.id.img_t20;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_t20);
                        if (imageView5 != null) {
                            i = R.id.img_test;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_test);
                            if (imageView6 != null) {
                                i = R.id.ll_no_data;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                if (linearLayout != null) {
                                    i = R.id.ll_odi;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_odi);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_odi_main;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_odi_main);
                                        if (linearLayout3 != null) {
                                            i = R.id.ll_stadium;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stadium);
                                            if (linearLayout4 != null) {
                                                i = R.id.ll_t20;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_t20);
                                                if (linearLayout5 != null) {
                                                    i = R.id.ll_t20_main;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_t20_main);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.ll_test;
                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_test);
                                                        if (linearLayout7 != null) {
                                                            i = R.id.ll_test_main;
                                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_test_main);
                                                            if (linearLayout8 != null) {
                                                                i = R.id.progressBar;
                                                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                                if (progressBar2 != null) {
                                                                    i = R.id.progressBar_;
                                                                    ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_);
                                                                    if (progressBar3 != null) {
                                                                        i = R.id.progressBarOdi;
                                                                        ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarOdi);
                                                                        if (progressBar4 != null) {
                                                                            i = R.id.progressBart20;
                                                                            ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBart20);
                                                                            if (progressBar5 != null) {
                                                                                i = R.id.txt_bowling_ends;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowling_ends);
                                                                                if (textView != null) {
                                                                                    i = R.id.txt_capacity;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_capacity);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.txt_city;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_city);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.txt_firstOdiDate;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstOdiDate);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.txt_firstOdiResult;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstOdiResult);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.txt_firstOdiTeam;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstOdiTeam);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.txt_firstTestDate;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstTestDate);
                                                                                                        if (textView7 != null) {
                                                                                                            i = R.id.txt_firstTestResult;
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstTestResult);
                                                                                                            if (textView8 != null) {
                                                                                                                i = R.id.txt_firstTestTeam;
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstTestTeam);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = R.id.txt_firstt20Date;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstt20Date);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = R.id.txt_firstt20Result;
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstt20Result);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i = R.id.txt_firstt20Team;
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_firstt20Team);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i = R.id.txt_highOdiDate;
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highOdiDate);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i = R.id.txt_highOdiResult;
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highOdiResult);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = R.id.txt_highOdiTeam;
                                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highOdiTeam);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i = R.id.txt_highTestDate;
                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highTestDate);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i = R.id.txt_highTestResult;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highTestResult);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i = R.id.txt_highTestTeam;
                                                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_highTestTeam);
                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                        i = R.id.txt_hight20Date;
                                                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_hight20Date);
                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                            i = R.id.txt_hight20Result;
                                                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_hight20Result);
                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                i = R.id.txt_hight20Team;
                                                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_hight20Team);
                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                    i = R.id.txt_lowOdiDate;
                                                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowOdiDate);
                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                        i = R.id.txt_lowOdiResult;
                                                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowOdiResult);
                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                            i = R.id.txt_lowOdiTeam;
                                                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowOdiTeam);
                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                i = R.id.txt_lowTestDate;
                                                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowTestDate);
                                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                                    i = R.id.txt_lowTestResult;
                                                                                                                                                                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowTestResult);
                                                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                                                        i = R.id.txt_lowTestTeam;
                                                                                                                                                                                        TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowTestTeam);
                                                                                                                                                                                        if (textView27 != null) {
                                                                                                                                                                                            i = R.id.txt_lowt20Date;
                                                                                                                                                                                            TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowt20Date);
                                                                                                                                                                                            if (textView28 != null) {
                                                                                                                                                                                                i = R.id.txt_lowt20Result;
                                                                                                                                                                                                TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowt20Result);
                                                                                                                                                                                                if (textView29 != null) {
                                                                                                                                                                                                    i = R.id.txt_lowt20Team;
                                                                                                                                                                                                    TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_lowt20Team);
                                                                                                                                                                                                    if (textView30 != null) {
                                                                                                                                                                                                        i = R.id.txt_Odi_avg;
                                                                                                                                                                                                        TextView textView31 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_Odi_avg);
                                                                                                                                                                                                        if (textView31 != null) {
                                                                                                                                                                                                            i = R.id.txt_Odi_winning;
                                                                                                                                                                                                            TextView textView32 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_Odi_winning);
                                                                                                                                                                                                            if (textView32 != null) {
                                                                                                                                                                                                                i = R.id.txt_player_s_homeground;
                                                                                                                                                                                                                TextView textView33 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_s_homeground);
                                                                                                                                                                                                                if (textView33 != null) {
                                                                                                                                                                                                                    i = R.id.txt_recentOdiDate;
                                                                                                                                                                                                                    TextView textView34 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentOdiDate);
                                                                                                                                                                                                                    if (textView34 != null) {
                                                                                                                                                                                                                        i = R.id.txt_recentOdiResult;
                                                                                                                                                                                                                        TextView textView35 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentOdiResult);
                                                                                                                                                                                                                        if (textView35 != null) {
                                                                                                                                                                                                                            i = R.id.txt_recentOdiTeam;
                                                                                                                                                                                                                            TextView textView36 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentOdiTeam);
                                                                                                                                                                                                                            if (textView36 != null) {
                                                                                                                                                                                                                                i = R.id.txt_recentTestDate;
                                                                                                                                                                                                                                TextView textView37 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentTestDate);
                                                                                                                                                                                                                                if (textView37 != null) {
                                                                                                                                                                                                                                    i = R.id.txt_recentTestResult;
                                                                                                                                                                                                                                    TextView textView38 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentTestResult);
                                                                                                                                                                                                                                    if (textView38 != null) {
                                                                                                                                                                                                                                        i = R.id.txt_recentTestTeam;
                                                                                                                                                                                                                                        TextView textView39 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentTestTeam);
                                                                                                                                                                                                                                        if (textView39 != null) {
                                                                                                                                                                                                                                            i = R.id.txt_recentt20Date;
                                                                                                                                                                                                                                            TextView textView40 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentt20Date);
                                                                                                                                                                                                                                            if (textView40 != null) {
                                                                                                                                                                                                                                                i = R.id.txt_recentt20Result;
                                                                                                                                                                                                                                                TextView textView41 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentt20Result);
                                                                                                                                                                                                                                                if (textView41 != null) {
                                                                                                                                                                                                                                                    i = R.id.txt_recentt20Team;
                                                                                                                                                                                                                                                    TextView textView42 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_recentt20Team);
                                                                                                                                                                                                                                                    if (textView42 != null) {
                                                                                                                                                                                                                                                        i = R.id.txt_t20_avg;
                                                                                                                                                                                                                                                        TextView textView43 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_avg);
                                                                                                                                                                                                                                                        if (textView43 != null) {
                                                                                                                                                                                                                                                            i = R.id.txt_t20_winning;
                                                                                                                                                                                                                                                            TextView textView44 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_winning);
                                                                                                                                                                                                                                                            if (textView44 != null) {
                                                                                                                                                                                                                                                                i = R.id.txt_team_s_homeground;
                                                                                                                                                                                                                                                                TextView textView45 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_s_homeground);
                                                                                                                                                                                                                                                                if (textView45 != null) {
                                                                                                                                                                                                                                                                    i = R.id.txt_test_avg;
                                                                                                                                                                                                                                                                    TextView textView46 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_avg);
                                                                                                                                                                                                                                                                    if (textView46 != null) {
                                                                                                                                                                                                                                                                        i = R.id.txt_test_winning;
                                                                                                                                                                                                                                                                        TextView textView47 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_winning);
                                                                                                                                                                                                                                                                        if (textView47 != null) {
                                                                                                                                                                                                                                                                            i = R.id.txt_toolbar_title;
                                                                                                                                                                                                                                                                            TextView textView48 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_toolbar_title);
                                                                                                                                                                                                                                                                            if (textView48 != null) {
                                                                                                                                                                                                                                                                                return new ActivityStadiumDetailBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, progressBar2, progressBar3, progressBar4, progressBar5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48);
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
