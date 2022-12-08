package com.cricketlivescore.predictiontips.databinding;

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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentMatchUpsBinding implements ViewBinding {
    public final ProgressBar ProgressBar;
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardOtherMatchup;
    public final ImageView imgBall;
    public final ImageView imgBat;
    public final ImageView imgInfo;
    public final ImageView imgPlayerBatter;
    public final ImageView imgPlayerBowler;
    public final LinearLayout llNoData;
    public final LinearLayout llPlayer;
    public final LinearLayout llPlayerMatchUps;
    public final LinearLayout llStates;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvPlayerBatter;
    public final RecyclerView rvPlayerBowler;
    public final ScrollView scrollView;
    public final TextView txtBalFaced;
    public final TextView txtBatter;
    public final TextView txtBattingSR;
    public final TextView txtBowler;
    public final TextView txtBowlingSR;
    public final TextView txtDismissals;
    public final TextView txtRuns;

    private FragmentMatchUpsBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = relativeLayout;
        this.ProgressBar = progressBar;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardOtherMatchup = cardView;
        this.imgBall = imageView3;
        this.imgBat = imageView4;
        this.imgInfo = imageView5;
        this.imgPlayerBatter = imageView6;
        this.imgPlayerBowler = imageView7;
        this.llNoData = linearLayout;
        this.llPlayer = linearLayout2;
        this.llPlayerMatchUps = linearLayout3;
        this.llStates = linearLayout4;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rvPlayerBatter = recyclerView;
        this.rvPlayerBowler = recyclerView2;
        this.scrollView = scrollView2;
        this.txtBalFaced = textView;
        this.txtBatter = textView2;
        this.txtBattingSR = textView3;
        this.txtBowler = textView4;
        this.txtBowlingSR = textView5;
        this.txtDismissals = textView6;
        this.txtRuns = textView7;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchUpsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchUpsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_match_ups, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchUpsBinding bind(View view) {
        int i = R.id.ProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ProgressBar);
        if (progressBar != null) {
            i = R.id.ad_banner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
            if (imageView != null) {
                i = R.id.ad_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
                if (imageView2 != null) {
                    i = R.id.card_otherMatchup;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_otherMatchup);
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
                                    i = R.id.img_player_batter;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_batter);
                                    if (imageView6 != null) {
                                        i = R.id.img_player_bowler;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_player_bowler);
                                        if (imageView7 != null) {
                                            i = R.id.ll_no_data;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                            if (linearLayout != null) {
                                                i = R.id.ll_player;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player);
                                                if (linearLayout2 != null) {
                                                    i = R.id.ll_player_match_ups;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_match_ups);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.ll_states;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_states);
                                                        if (linearLayout4 != null) {
                                                            i = R.id.rl_ad_bottom;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                            if (relativeLayout != null) {
                                                                i = R.id.rl_info;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                                if (relativeLayout2 != null) {
                                                                    i = R.id.rv_player_batter;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_player_batter);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.rv_player_bowler;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_player_bowler);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.scrollView;
                                                                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                            if (scrollView2 != null) {
                                                                                i = R.id.txt_balFaced;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_balFaced);
                                                                                if (textView != null) {
                                                                                    i = R.id.txt_batter;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_batter);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.txt_battingSR;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_battingSR);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.txt_bowler;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowler);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.txt_bowlingSR;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_bowlingSR);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.txt_dismissals;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_dismissals);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.txt_runs;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_runs);
                                                                                                        if (textView7 != null) {
                                                                                                            return new FragmentMatchUpsBinding((RelativeLayout) view, progressBar, imageView, imageView2, cardView, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, relativeLayout2, recyclerView, recyclerView2, scrollView2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
