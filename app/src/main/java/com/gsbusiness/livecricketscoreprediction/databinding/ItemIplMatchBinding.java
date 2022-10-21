package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemIplMatchBinding implements ViewBinding {
    public final FrameLayout click;
    public final FrameLayout frame;
    public final ImageView imgItemAFlag;
    public final ImageView imgItemHFlag;
    public final LinearLayout llItemFm;
    public final LinearLayout llScore;
    public final LinearLayout llScore1;
    private final CardView rootView;
    public final RecyclerView rvTeam;
    public final TextView txtItemATeam;
    public final TextView txtItemDate;
    public final TextView txtItemHTeam;
    public final TextView txtItemMatchNo;
    public final TextView txtItemMatchStatus;
    public final TextView txtItemStartDate;
    public final TextView txtItemTime;
    public final TextView txtItemVanue;

    private ItemIplMatchBinding(CardView cardView, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = cardView;
        this.click = frameLayout;
        this.frame = frameLayout2;
        this.imgItemAFlag = imageView;
        this.imgItemHFlag = imageView2;
        this.llItemFm = linearLayout;
        this.llScore = linearLayout2;
        this.llScore1 = linearLayout3;
        this.rvTeam = recyclerView;
        this.txtItemATeam = textView;
        this.txtItemDate = textView2;
        this.txtItemHTeam = textView3;
        this.txtItemMatchNo = textView4;
        this.txtItemMatchStatus = textView5;
        this.txtItemStartDate = textView6;
        this.txtItemTime = textView7;
        this.txtItemVanue = textView8;
    }

    @Override
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemIplMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemIplMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_ipl_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemIplMatchBinding bind(View view) {
        int i = R.id.click;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.click);
        if (frameLayout != null) {
            i = R.id.frame;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame);
            if (frameLayout2 != null) {
                i = R.id.img_item_a_flag;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_a_flag);
                if (imageView != null) {
                    i = R.id.img_item_h_flag;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_h_flag);
                    if (imageView2 != null) {
                        i = R.id.ll_item_fm;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_item_fm);
                        if (linearLayout != null) {
                            i = R.id.ll_score;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score);
                            if (linearLayout2 != null) {
                                i = R.id.ll_score_;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_score_);
                                if (linearLayout3 != null) {
                                    i = R.id.rv_team;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_team);
                                    if (recyclerView != null) {
                                        i = R.id.txt_item_a_team;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_a_team);
                                        if (textView != null) {
                                            i = R.id.txt_item_date;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_date);
                                            if (textView2 != null) {
                                                i = R.id.txt_item_h_team;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_h_team);
                                                if (textView3 != null) {
                                                    i = R.id.txt_item_matchNo;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchNo);
                                                    if (textView4 != null) {
                                                        i = R.id.txt_item_matchStatus;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchStatus);
                                                        if (textView5 != null) {
                                                            i = R.id.txt_item_startDate;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_startDate);
                                                            if (textView6 != null) {
                                                                i = R.id.txt_item_time;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_time);
                                                                if (textView7 != null) {
                                                                    i = R.id.txt_item_vanue;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_vanue);
                                                                    if (textView8 != null) {
                                                                        return new ItemIplMatchBinding((CardView) view, frameLayout, frameLayout2, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
