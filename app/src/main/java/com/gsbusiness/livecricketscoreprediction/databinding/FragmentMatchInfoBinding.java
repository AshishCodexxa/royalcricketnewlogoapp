package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class FragmentMatchInfoBinding implements ViewBinding {
    public final ImageView adBanner;
    public final ImageView adIcon;
    public final ImageView img11One;
    public final ImageView img11Two;
    public final ImageView imgMifAFlag;
    public final ImageView imgMifHFlag;
    public final LinearLayout ll11TopOne;
    public final LinearLayout ll11TopTwo;
    public final LinearLayout llStadium;
    public final RelativeLayout rl11One;
    public final RelativeLayout rl11Two;
    public final RelativeLayout rlAdViewBottom;
    private final RelativeLayout rootView;
    public final RecyclerView rv11One;
    public final RecyclerView rv11Two;
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
    public final TextView txtNoDataOne;
    public final TextView txtNoDataTwo;

    private FragmentMatchInfoBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = relativeLayout;
        this.adBanner = imageView;
        this.adIcon = imageView2;
        this.img11One = imageView3;
        this.img11Two = imageView4;
        this.imgMifAFlag = imageView5;
        this.imgMifHFlag = imageView6;
        this.ll11TopOne = linearLayout;
        this.ll11TopTwo = linearLayout2;
        this.llStadium = linearLayout3;
        this.rl11One = relativeLayout2;
        this.rl11Two = relativeLayout3;
        this.rlAdViewBottom = relativeLayout4;
        this.rv11One = recyclerView;
        this.rv11Two = recyclerView2;
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
        this.txtNoDataOne = textView11;
        this.txtNoDataTwo = textView12;
    }

    @Override 
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_match_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchInfoBinding bind(View view) {
        int i = R.id.ad_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_banner);
        if (imageView != null) {
            i = R.id.ad_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ad_icon);
            if (imageView2 != null) {
                i = R.id.img_11_one;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_11_one);
                if (imageView3 != null) {
                    i = R.id.img_11_two;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_11_two);
                    if (imageView4 != null) {
                        i = R.id.img_mif_a_flag;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mif_a_flag);
                        if (imageView5 != null) {
                            i = R.id.img_mif_h_flag;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_mif_h_flag);
                            if (imageView6 != null) {
                                i = R.id.ll_11_top_one;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_11_top_one);
                                if (linearLayout != null) {
                                    i = R.id.ll_11_top_two;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_11_top_two);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_stadium;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stadium);
                                        if (linearLayout3 != null) {
                                            i = R.id.rl_11_one;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_11_one);
                                            if (relativeLayout != null) {
                                                i = R.id.rl_11_two;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_11_two);
                                                if (relativeLayout2 != null) {
                                                    i = R.id.rl_adView_bottom;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_adView_bottom);
                                                    if (relativeLayout3 != null) {
                                                        i = R.id.rv_11_one;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_11_one);
                                                        if (recyclerView != null) {
                                                            i = R.id.rv_11_two;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_11_two);
                                                            if (recyclerView2 != null) {
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
                                                                                                        i = R.id.txt_no_data_one;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_no_data_one);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.txt_no_data_two;
                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_no_data_two);
                                                                                                            if (textView12 != null) {
                                                                                                                return new FragmentMatchInfoBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
