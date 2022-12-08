package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.cricketlivescore.predictiontips.R;


public final class ItemScheduleLiveMatchBinding implements ViewBinding {
    public final FrameLayout click;
    public final FrameLayout frame;
    public final LinearLayout llItemFm;
    private final CardView rootView;
    public final RecyclerView rvTeam;
    public final TextView txtItemMatchNumber;
    public final TextView txtItemMatchStatus;
    public final TextView txtItemMatchType;
    public final TextView txtVenue;

    private ItemScheduleLiveMatchBinding(CardView cardView, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.click = frameLayout;
        this.frame = frameLayout2;
        this.llItemFm = linearLayout;
        this.rvTeam = recyclerView;
        this.txtItemMatchNumber = textView;
        this.txtItemMatchStatus = textView2;
        this.txtItemMatchType = textView3;
        this.txtVenue = textView4;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemScheduleLiveMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScheduleLiveMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_schedule_live_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemScheduleLiveMatchBinding bind(View view) {
        int i = R.id.click;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.click);
        if (frameLayout != null) {
            i = R.id.frame;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frame);
            if (frameLayout2 != null) {
                i = R.id.ll_item_fm;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_item_fm);
                if (linearLayout != null) {
                    i = R.id.rv_team;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_team);
                    if (recyclerView != null) {
                        i = R.id.txt_item_matchNumber;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchNumber);
                        if (textView != null) {
                            i = R.id.txt_item_matchStatus;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchStatus);
                            if (textView2 != null) {
                                i = R.id.txt_item_matchType;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_item_matchType);
                                if (textView3 != null) {
                                    i = R.id.txt_venue;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_venue);
                                    if (textView4 != null) {
                                        return new ItemScheduleLiveMatchBinding((CardView) view, frameLayout, frameLayout2, linearLayout, recyclerView, textView, textView2, textView3, textView4);
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
