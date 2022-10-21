package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemTeamsBinding implements ViewBinding {
    public final CardView cardItemFm;
    public final ImageView imgTeam;
    public final LinearLayout llRankings;
    private final CardView rootView;
    public final TextView txtOdiRanking;
    public final TextView txtT20Ranking;
    public final TextView txtTeam;
    public final TextView txtTestRanking;

    private ItemTeamsBinding(CardView cardView, CardView cardView2, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.cardItemFm = cardView2;
        this.imgTeam = imageView;
        this.llRankings = linearLayout;
        this.txtOdiRanking = textView;
        this.txtT20Ranking = textView2;
        this.txtTeam = textView3;
        this.txtTestRanking = textView4;
    }

    @Override 
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_teams, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTeamsBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.img_team;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team);
        if (imageView != null) {
            i = R.id.ll_rankings;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_rankings);
            if (linearLayout != null) {
                i = R.id.txt_odi_ranking;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_ranking);
                if (textView != null) {
                    i = R.id.txt_t20_ranking;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_ranking);
                    if (textView2 != null) {
                        i = R.id.txt_team;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team);
                        if (textView3 != null) {
                            i = R.id.txt_test_ranking;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_ranking);
                            if (textView4 != null) {
                                return new ItemTeamsBinding(cardView, cardView, imageView, linearLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
