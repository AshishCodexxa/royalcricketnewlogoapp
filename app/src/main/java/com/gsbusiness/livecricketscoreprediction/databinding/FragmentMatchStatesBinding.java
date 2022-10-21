package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentMatchStatesBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardF1;
    public final CardView cardF2;
    public final ImageView imgFlag1;
    public final ImageView imgFlag2;
    public final ImageView imgInfo;
    public final LinearLayout llNoData;
    public final ProgressBar progressBar;
    public final ProgressBar progressBarA4s;
    public final ProgressBar progressBarA6s;
    public final ProgressBar progressBarABestBowling;
    public final ProgressBar progressBarADotBall;
    public final ProgressBar progressBarAExtra;
    public final ProgressBar progressBarAHighPartner;
    public final ProgressBar progressBarAHighScore;
    public final ProgressBar progressBarARunBoundaries;
    public final ProgressBar progressBarARunRate;
    public final ProgressBar progressBarARunRateDeath;
    public final ProgressBar progressBarARunRateMid;
    public final ProgressBar progressBarARunRatePowerPlay;
    public final ProgressBar progressBarH4s;
    public final ProgressBar progressBarH6s;
    public final ProgressBar progressBarHBestBowling;
    public final ProgressBar progressBarHDotBall;
    public final ProgressBar progressBarHExtra;
    public final ProgressBar progressBarHHighPartner;
    public final ProgressBar progressBarHHighScore;
    public final ProgressBar progressBarHRunBoundaries;
    public final ProgressBar progressBarHRunRate;
    public final ProgressBar progressBarHRunRateDeath;
    public final ProgressBar progressBarHRunRateMid;
    public final ProgressBar progressBarHRunRatePowerPlay;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    public final RelativeLayout rlRunRateDeath;
    public final RelativeLayout rlRunRateMid;
    public final RelativeLayout rlRunRatePowerPlay;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextView txtA4s;
    public final TextView txtA6s;
    public final TextView txtABestBowling;
    public final TextView txtADotBall;
    public final TextView txtAExtra;
    public final TextView txtAHighPartner;
    public final TextView txtAHighScore;
    public final TextView txtARunBoundaries;
    public final TextView txtARunRate;
    public final TextView txtARunRateDeath;
    public final TextView txtARunRateMid;
    public final TextView txtARunRatePowerPlay;
    public final TextView txtH4s;
    public final TextView txtH6s;
    public final TextView txtHBestBowling;
    public final TextView txtHDotBall;
    public final TextView txtHExtra;
    public final TextView txtHHighPartner;
    public final TextView txtHHighScore;
    public final TextView txtHRunBoundaries;
    public final TextView txtHRunRate;
    public final TextView txtHRunRateDeath;
    public final TextView txtHRunRateMid;
    public final TextView txtHRunRatePowerPlay;
    public final TextView txtTeam1;
    public final TextView txtTeam2;

    private FragmentMatchStatesBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, CardView cardView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, ProgressBar progressBar6, ProgressBar progressBar7, ProgressBar progressBar8, ProgressBar progressBar9, ProgressBar progressBar10, ProgressBar progressBar11, ProgressBar progressBar12, ProgressBar progressBar13, ProgressBar progressBar14, ProgressBar progressBar15, ProgressBar progressBar16, ProgressBar progressBar17, ProgressBar progressBar18, ProgressBar progressBar19, ProgressBar progressBar20, ProgressBar progressBar21, ProgressBar progressBar22, ProgressBar progressBar23, ProgressBar progressBar24, ProgressBar progressBar25, ProgressBar progressBar26, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardF1 = cardView;
        this.cardF2 = cardView2;
        this.imgFlag1 = imageView3;
        this.imgFlag2 = imageView4;
        this.imgInfo = imageView5;
        this.llNoData = linearLayout;
        this.progressBar = progressBar2;
        this.progressBarA4s = progressBar3;
        this.progressBarA6s = progressBar4;
        this.progressBarABestBowling = progressBar5;
        this.progressBarADotBall = progressBar6;
        this.progressBarAExtra = progressBar7;
        this.progressBarAHighPartner = progressBar8;
        this.progressBarAHighScore = progressBar9;
        this.progressBarARunBoundaries = progressBar10;
        this.progressBarARunRate = progressBar11;
        this.progressBarARunRateDeath = progressBar12;
        this.progressBarARunRateMid = progressBar13;
        this.progressBarARunRatePowerPlay = progressBar14;
        this.progressBarH4s = progressBar15;
        this.progressBarH6s = progressBar16;
        this.progressBarHBestBowling = progressBar17;
        this.progressBarHDotBall = progressBar18;
        this.progressBarHExtra = progressBar19;
        this.progressBarHHighPartner = progressBar20;
        this.progressBarHHighScore = progressBar21;
        this.progressBarHRunBoundaries = progressBar22;
        this.progressBarHRunRate = progressBar23;
        this.progressBarHRunRateDeath = progressBar24;
        this.progressBarHRunRateMid = progressBar25;
        this.progressBarHRunRatePowerPlay = progressBar26;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rlRunRateDeath = relativeLayout4;
        this.rlRunRateMid = relativeLayout5;
        this.rlRunRatePowerPlay = relativeLayout6;
        this.scrollView = scrollView2;
        this.txtA4s = textView;
        this.txtA6s = textView2;
        this.txtABestBowling = textView3;
        this.txtADotBall = textView4;
        this.txtAExtra = textView5;
        this.txtAHighPartner = textView6;
        this.txtAHighScore = textView7;
        this.txtARunBoundaries = textView8;
        this.txtARunRate = textView9;
        this.txtARunRateDeath = textView10;
        this.txtARunRateMid = textView11;
        this.txtARunRatePowerPlay = textView12;
        this.txtH4s = textView13;
        this.txtH6s = textView14;
        this.txtHBestBowling = textView15;
        this.txtHDotBall = textView16;
        this.txtHExtra = textView17;
        this.txtHHighPartner = textView18;
        this.txtHHighScore = textView19;
        this.txtHRunBoundaries = textView20;
        this.txtHRunRate = textView21;
        this.txtHRunRateDeath = textView22;
        this.txtHRunRateMid = textView23;
        this.txtHRunRatePowerPlay = textView24;
        this.txtTeam1 = textView25;
        this.txtTeam2 = textView26;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchStatesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchStatesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_match_states, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchStatesBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_f1;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_f1);
                if (cardView != null) {
                    i = R.id.card_f2;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_f2);
                    if (cardView2 != null) {
                        i = R.id.img_flag_1;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_1);
                        if (imageView3 != null) {
                            i = R.id.img_flag_2;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag_2);
                            if (imageView4 != null) {
                                i = R.id.img_info;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                                if (imageView5 != null) {
                                    i = R.id.ll_no_data;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                    if (linearLayout != null) {
                                        i = R.id.progressBar;
                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                        if (progressBar2 != null) {
                                            i = R.id.progressBar_a_4s;
                                            ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_4s);
                                            if (progressBar3 != null) {
                                                i = R.id.progressBar_a_6s;
                                                ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_6s);
                                                if (progressBar4 != null) {
                                                    i = R.id.progressBar_a_bestBowling;
                                                    ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_bestBowling);
                                                    if (progressBar5 != null) {
                                                        i = R.id.progressBar_a_dotBall;
                                                        ProgressBar progressBar6 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_dotBall);
                                                        if (progressBar6 != null) {
                                                            i = R.id.progressBar_a_extra;
                                                            ProgressBar progressBar7 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_extra);
                                                            if (progressBar7 != null) {
                                                                i = R.id.progressBar_a_highPartner;
                                                                ProgressBar progressBar8 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_highPartner);
                                                                if (progressBar8 != null) {
                                                                    i = R.id.progressBar_a_highScore;
                                                                    ProgressBar progressBar9 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_highScore);
                                                                    if (progressBar9 != null) {
                                                                        i = R.id.progressBar_a_runBoundaries;
                                                                        ProgressBar progressBar10 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_runBoundaries);
                                                                        if (progressBar10 != null) {
                                                                            i = R.id.progressBar_a_runRate;
                                                                            ProgressBar progressBar11 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_runRate);
                                                                            if (progressBar11 != null) {
                                                                                i = R.id.progressBar_a_runRateDeath;
                                                                                ProgressBar progressBar12 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_runRateDeath);
                                                                                if (progressBar12 != null) {
                                                                                    i = R.id.progressBar_a_runRateMid;
                                                                                    ProgressBar progressBar13 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_runRateMid);
                                                                                    if (progressBar13 != null) {
                                                                                        i = R.id.progressBar_a_runRatePowerPlay;
                                                                                        ProgressBar progressBar14 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_a_runRatePowerPlay);
                                                                                        if (progressBar14 != null) {
                                                                                            i = R.id.progressBar_h_4s;
                                                                                            ProgressBar progressBar15 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_4s);
                                                                                            if (progressBar15 != null) {
                                                                                                i = R.id.progressBar_h_6s;
                                                                                                ProgressBar progressBar16 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_6s);
                                                                                                if (progressBar16 != null) {
                                                                                                    i = R.id.progressBar_h_bestBowling;
                                                                                                    ProgressBar progressBar17 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_bestBowling);
                                                                                                    if (progressBar17 != null) {
                                                                                                        i = R.id.progressBar_h_dotBall;
                                                                                                        ProgressBar progressBar18 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_dotBall);
                                                                                                        if (progressBar18 != null) {
                                                                                                            i = R.id.progressBar_h_extra;
                                                                                                            ProgressBar progressBar19 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_extra);
                                                                                                            if (progressBar19 != null) {
                                                                                                                i = R.id.progressBar_h_highPartner;
                                                                                                                ProgressBar progressBar20 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_highPartner);
                                                                                                                if (progressBar20 != null) {
                                                                                                                    i = R.id.progressBar_h_highScore;
                                                                                                                    ProgressBar progressBar21 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_highScore);
                                                                                                                    if (progressBar21 != null) {
                                                                                                                        i = R.id.progressBar_h_runBoundaries;
                                                                                                                        ProgressBar progressBar22 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_runBoundaries);
                                                                                                                        if (progressBar22 != null) {
                                                                                                                            i = R.id.progressBar_h_runRate;
                                                                                                                            ProgressBar progressBar23 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_runRate);
                                                                                                                            if (progressBar23 != null) {
                                                                                                                                i = R.id.progressBar_h_runRateDeath;
                                                                                                                                ProgressBar progressBar24 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_runRateDeath);
                                                                                                                                if (progressBar24 != null) {
                                                                                                                                    i = R.id.progressBar_h_runRateMid;
                                                                                                                                    ProgressBar progressBar25 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_runRateMid);
                                                                                                                                    if (progressBar25 != null) {
                                                                                                                                        i = R.id.progressBar_h_runRatePowerPlay;
                                                                                                                                        ProgressBar progressBar26 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar_h_runRatePowerPlay);
                                                                                                                                        if (progressBar26 != null) {
                                                                                                                                            i = R.id.rl_ad_bottom;
                                                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                                                                                                            if (relativeLayout != null) {
                                                                                                                                                i = R.id.rl_info;
                                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                                    i = R.id.rl_runRateDeath;
                                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_runRateDeath);
                                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                                        i = R.id.rl_runRateMid;
                                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_runRateMid);
                                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                                            i = R.id.rl_runRatePowerPlay;
                                                                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_runRatePowerPlay);
                                                                                                                                                            if (relativeLayout5 != null) {
                                                                                                                                                                i = R.id.scrollView;
                                                                                                                                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                                                                                if (scrollView2 != null) {
                                                                                                                                                                    i = R.id.txt_a_4s;
                                                                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_4s);
                                                                                                                                                                    if (textView != null) {
                                                                                                                                                                        i = R.id.txt_a_6s;
                                                                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_6s);
                                                                                                                                                                        if (textView2 != null) {
                                                                                                                                                                            i = R.id.txt_a_bestBowling;
                                                                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_bestBowling);
                                                                                                                                                                            if (textView3 != null) {
                                                                                                                                                                                i = R.id.txt_a_dotBall;
                                                                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_dotBall);
                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                    i = R.id.txt_a_extra;
                                                                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_extra);
                                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                                        i = R.id.txt_a_highPartner;
                                                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_highPartner);
                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                            i = R.id.txt_a_highScore;
                                                                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_highScore);
                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                i = R.id.txt_a_runBoundaries;
                                                                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_runBoundaries);
                                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                                    i = R.id.txt_a_runRate;
                                                                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_runRate);
                                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                                        i = R.id.txt_a_runRateDeath;
                                                                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_runRateDeath);
                                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                                            i = R.id.txt_a_runRateMid;
                                                                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_runRateMid);
                                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                                i = R.id.txt_a_runRatePowerPlay;
                                                                                                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_a_runRatePowerPlay);
                                                                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                                                                    i = R.id.txt_h_4s;
                                                                                                                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_4s);
                                                                                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                                                                                        i = R.id.txt_h_6s;
                                                                                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_6s);
                                                                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                                                                            i = R.id.txt_h_bestBowling;
                                                                                                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_bestBowling);
                                                                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                                                                i = R.id.txt_h_dotBall;
                                                                                                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_dotBall);
                                                                                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                                                                                    i = R.id.txt_h_extra;
                                                                                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_extra);
                                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                                        i = R.id.txt_h_highPartner;
                                                                                                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_highPartner);
                                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                                            i = R.id.txt_h_highScore;
                                                                                                                                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_highScore);
                                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                                i = R.id.txt_h_runBoundaries;
                                                                                                                                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_runBoundaries);
                                                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                                                    i = R.id.txt_h_runRate;
                                                                                                                                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_runRate);
                                                                                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                                                                                        i = R.id.txt_h_runRateDeath;
                                                                                                                                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_runRateDeath);
                                                                                                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                                                                                                            i = R.id.txt_h_runRateMid;
                                                                                                                                                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_runRateMid);
                                                                                                                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                                                                                                                i = R.id.txt_h_runRatePowerPlay;
                                                                                                                                                                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_h_runRatePowerPlay);
                                                                                                                                                                                                                                                                if (textView24 != null) {
                                                                                                                                                                                                                                                                    i = R.id.txt_team1;
                                                                                                                                                                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1);
                                                                                                                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                                                                                                                        i = R.id.txt_team2;
                                                                                                                                                                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2);
                                                                                                                                                                                                                                                                        if (textView26 != null) {
                                                                                                                                                                                                                                                                            return new FragmentMatchStatesBinding((RelativeLayout) view, imageView, imageView2, cardView, cardView2, imageView3, imageView4, imageView5, linearLayout, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6, progressBar7, progressBar8, progressBar9, progressBar10, progressBar11, progressBar12, progressBar13, progressBar14, progressBar15, progressBar16, progressBar17, progressBar18, progressBar19, progressBar20, progressBar21, progressBar22, progressBar23, progressBar24, progressBar25, progressBar26, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, scrollView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
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
