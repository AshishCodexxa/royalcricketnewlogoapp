package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentCommentaryBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ProgressBar commentaryProgress;
    public final ImageView imgFlag;
    public final LinearLayout llCompleteSummary;
    public final LinearLayout llErrorNoData;
    public final LinearLayout llNoData;
    public final NestedScrollView nestedScrollView;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rvCommentary;
    public final RecyclerView rvStats;
    public final TextView txtScore;
    public final TextView txtTeam;
    public final TextView txtTeamAway;
    public final TextView txtTeamAwayXi;
    public final TextView txtTeamHome;
    public final TextView txtTeamHomeXi;

    private FragmentCommentaryBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, NestedScrollView nestedScrollView2, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.commentaryProgress = progressBar;
        this.imgFlag = imageView3;
        this.llCompleteSummary = linearLayout;
        this.llErrorNoData = linearLayout2;
        this.llNoData = linearLayout3;
        this.nestedScrollView = nestedScrollView2;
        this.rlAdViewBottom = relativeLayout2;
        this.rvCommentary = recyclerView;
        this.rvStats = recyclerView2;
        this.txtScore = textView;
        this.txtTeam = textView2;
        this.txtTeamAway = textView3;
        this.txtTeamAwayXi = textView4;
        this.txtTeamHome = textView5;
        this.txtTeamHomeXi = textView6;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCommentaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCommentaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_commentary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCommentaryBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.commentary_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.commentary_progress);
                if (progressBar != null) {
                    i = R.id.img_flag;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_flag);
                    if (imageView3 != null) {
                        i = R.id.ll_complete_summary;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_complete_summary);
                        if (linearLayout != null) {
                            i = R.id.ll_error_no_data;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_error_no_data);
                            if (linearLayout2 != null) {
                                i = R.id.ll_no_data;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_no_data);
                                if (linearLayout3 != null) {
                                    i = R.id.nestedScrollView;
                                    NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nestedScrollView);
                                    if (nestedScrollView2 != null) {
                                        i = R.id.rl_adView_bottom;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                                        if (relativeLayout != null) {
                                            i = R.id.rv_commentary;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_commentary);
                                            if (recyclerView != null) {
                                                i = R.id.rv_stats;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_stats);
                                                if (recyclerView2 != null) {
                                                    i = R.id.txt_score;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_score);
                                                    if (textView != null) {
                                                        i = R.id.txt_team;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                                                        if (textView2 != null) {
                                                            i = R.id.txt_team_away;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away);
                                                            if (textView3 != null) {
                                                                i = R.id.txt_team_away_xi;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_away_xi);
                                                                if (textView4 != null) {
                                                                    i = R.id.txt_team_home;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home);
                                                                    if (textView5 != null) {
                                                                        i = R.id.txt_team_home_xi;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_home_xi);
                                                                        if (textView6 != null) {
                                                                            return new FragmentCommentaryBinding((RelativeLayout) view, imageView, imageView2, progressBar, imageView3, linearLayout, linearLayout2, linearLayout3, nestedScrollView2, relativeLayout, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6);
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
