package com.gsbusiness.livecricketscoreprediction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gsbusiness.livecricketscoreprediction.R;


public final class ItemFantasyTeamsBinding implements ViewBinding {
    public final LinearLayout llTeam;
    private final LinearLayout rootView;
    public final RecyclerView rvFantasyTeam;
    public final TextView txtPoint;
    public final TextView txtTeamNo;

    private ItemFantasyTeamsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.llTeam = linearLayout2;
        this.rvFantasyTeam = recyclerView;
        this.txtPoint = textView;
        this.txtTeamNo = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemFantasyTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFantasyTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fantasy_teams, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFantasyTeamsBinding bind(View view) {
        int i = R.id.ll_team;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_team);
        if (linearLayout != null) {
            i = R.id.rv_fantasy_team;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_fantasy_team);
            if (recyclerView != null) {
                i = R.id.txt_point;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_point);
                if (textView != null) {
                    i = R.id.txt_team_no;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_no);
                    if (textView2 != null) {
                        return new ItemFantasyTeamsBinding((LinearLayout) view, linearLayout, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
