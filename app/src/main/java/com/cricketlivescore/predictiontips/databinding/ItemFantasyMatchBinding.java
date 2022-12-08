package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class ItemFantasyMatchBinding implements ViewBinding {
    public final ImageView imgComTeam;
    public final ImageView imgTeam1;
    public final ImageView imgTeam2;
    public final ImageView imgUCTeam1;
    public final ImageView imgUCTeam2;
    public final LinearLayout llCompleted;
    public final LinearLayout llLive;
    public final LinearLayout llUpcoming;
    private final CardView rootView;
    public final TextView txtComSeriesName;
    public final TextView txtComStatus;
    public final TextView txtComTeam1;
    public final TextView txtComTeam2;
    public final TextView txtSeriesName;
    public final TextView txtStatus;
    public final TextView txtTeam1;
    public final TextView txtTeam2;
    public final TextView txtUCDate;
    public final TextView txtUCSeriesName;
    public final TextView txtUCTeam1;
    public final TextView txtUCTeam2;
    public final TextView txtUCTime;
    public final TextView txtUCVanue;

    private ItemFantasyMatchBinding(CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = cardView;
        this.imgComTeam = imageView;
        this.imgTeam1 = imageView2;
        this.imgTeam2 = imageView3;
        this.imgUCTeam1 = imageView4;
        this.imgUCTeam2 = imageView5;
        this.llCompleted = linearLayout;
        this.llLive = linearLayout2;
        this.llUpcoming = linearLayout3;
        this.txtComSeriesName = textView;
        this.txtComStatus = textView2;
        this.txtComTeam1 = textView3;
        this.txtComTeam2 = textView4;
        this.txtSeriesName = textView5;
        this.txtStatus = textView6;
        this.txtTeam1 = textView7;
        this.txtTeam2 = textView8;
        this.txtUCDate = textView9;
        this.txtUCSeriesName = textView10;
        this.txtUCTeam1 = textView11;
        this.txtUCTeam2 = textView12;
        this.txtUCTime = textView13;
        this.txtUCVanue = textView14;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemFantasyMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFantasyMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fantasy_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFantasyMatchBinding bind(View view) {
        int i = R.id.imgCom_team;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCom_team);
        if (imageView != null) {
            i = R.id.img_team1;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team1);
            if (imageView2 != null) {
                i = R.id.img_team2;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team2);
                if (imageView3 != null) {
                    i = R.id.imgUC_team1;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUC_team1);
                    if (imageView4 != null) {
                        i = R.id.imgUC_team2;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUC_team2);
                        if (imageView5 != null) {
                            i = R.id.ll_completed;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_completed);
                            if (linearLayout != null) {
                                i = R.id.ll_live;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_live);
                                if (linearLayout2 != null) {
                                    i = R.id.ll_upcoming;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_upcoming);
                                    if (linearLayout3 != null) {
                                        i = R.id.txtCom_seriesName;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txtCom_seriesName);
                                        if (textView != null) {
                                            i = R.id.txtCom_status;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txtCom_status);
                                            if (textView2 != null) {
                                                i = R.id.txtCom_team1;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txtCom_team1);
                                                if (textView3 != null) {
                                                    i = R.id.txtCom_team2;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txtCom_team2);
                                                    if (textView4 != null) {
                                                        i = R.id.txt_seriesName;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_seriesName);
                                                        if (textView5 != null) {
                                                            i = R.id.txt_status;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_status);
                                                            if (textView6 != null) {
                                                                i = R.id.txt_team1;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team1);
                                                                if (textView7 != null) {
                                                                    i = R.id.txt_team2;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team2);
                                                                    if (textView8 != null) {
                                                                        i = R.id.txtUC_date;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_date);
                                                                        if (textView9 != null) {
                                                                            i = R.id.txtUC_seriesName;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_seriesName);
                                                                            if (textView10 != null) {
                                                                                i = R.id.txtUC_team1;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_team1);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.txtUC_team2;
                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_team2);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.txtUC_time;
                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_time);
                                                                                        if (textView13 != null) {
                                                                                            i = R.id.txtUC_vanue;
                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txtUC_vanue);
                                                                                            if (textView14 != null) {
                                                                                                return new ItemFantasyMatchBinding((CardView) view, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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
