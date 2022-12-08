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


public final class FragmentPlayerScoreProjectionBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final CardView cardPlayer;
    public final ImageView imgInfo;
    public final ImageView imgPlayerImage;
    public final LinearLayout llNoData;
    public final LinearLayout llPlayerLiveScorePro;
    public final LinearLayout llPlayerState;
    public final LinearLayout llProBowler;
    public final ProgressBar progressBar;
    public final RelativeLayout rlAdBottom;
    public final RelativeLayout rlInfo;
    private final RelativeLayout rootView;
    public final RecyclerView rvPlayerProjection;
    public final ScrollView scrollView;
    public final TextView txtPlayerBol;
    public final TextView txtPlayerName;
    public final TextView txtPlayerRun;
    public final TextView txtProjection;
    public final TextView txtTeamName;

    private FragmentPlayerScoreProjectionBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.cardPlayer = cardView;
        this.imgInfo = imageView3;
        this.imgPlayerImage = imageView4;
        this.llNoData = linearLayout;
        this.llPlayerLiveScorePro = linearLayout2;
        this.llPlayerState = linearLayout3;
        this.llProBowler = linearLayout4;
        this.progressBar = progressBar2;
        this.rlAdBottom = relativeLayout2;
        this.rlInfo = relativeLayout3;
        this.rvPlayerProjection = recyclerView;
        this.scrollView = scrollView2;
        this.txtPlayerBol = textView;
        this.txtPlayerName = textView2;
        this.txtPlayerRun = textView3;
        this.txtProjection = textView4;
        this.txtTeamName = textView5;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerScoreProjectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerScoreProjectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_score_projection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerScoreProjectionBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.card_player;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_player);
                if (cardView != null) {
                    i = R.id.img_info;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_info);
                    if (imageView3 != null) {
                        i = R.id.img_playerImage;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_playerImage);
                        if (imageView4 != null) {
                            i = R.id.ll_no_data;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                            if (linearLayout != null) {
                                i = R.id.ll_player_live_score_pro;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_live_score_pro);
                                if (linearLayout2 != null) {
                                    i = R.id.ll_player_state;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_player_state);
                                    if (linearLayout3 != null) {
                                        i = R.id.ll_pro_bowler;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_pro_bowler);
                                        if (linearLayout4 != null) {
                                            i = R.id.progressBar;
                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                            if (progressBar2 != null) {
                                                i = R.id.rl_ad_bottom;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ad_bottom);
                                                if (relativeLayout != null) {
                                                    i = R.id.rl_info;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info);
                                                    if (relativeLayout2 != null) {
                                                        i = R.id.rv_player_projection;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_player_projection);
                                                        if (recyclerView != null) {
                                                            i = R.id.scrollView;
                                                            ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                            if (scrollView2 != null) {
                                                                i = R.id.txt_player_bol;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bol);
                                                                if (textView != null) {
                                                                    i = R.id.txt_player_name;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_name);
                                                                    if (textView2 != null) {
                                                                        i = R.id.txt_player_run;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_run);
                                                                        if (textView3 != null) {
                                                                            i = R.id.txt_projection;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_projection);
                                                                            if (textView4 != null) {
                                                                                i = R.id.txt_team_name;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                                                                if (textView5 != null) {
                                                                                    return new FragmentPlayerScoreProjectionBinding((RelativeLayout) view, imageView, imageView2, cardView, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar2, relativeLayout, relativeLayout2, recyclerView, scrollView2, textView, textView2, textView3, textView4, textView5);
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
