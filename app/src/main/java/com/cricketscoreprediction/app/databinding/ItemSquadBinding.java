package com.cricketscoreprediction.app.databinding;

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

import com.cricketscoreprediction.app.R;


public final class ItemSquadBinding implements ViewBinding {
    public final ImageView imgArrow;
    public final ImageView imgTeamFlag;
    public final LinearLayout llTeam;
    public final RelativeLayout rlTeam;
    private final LinearLayout rootView;
    public final RecyclerView rvTeam;
    public final TextView txtNoDataOne;
    public final TextView txtTeamName;

    private ItemSquadBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imgArrow = imageView;
        this.imgTeamFlag = imageView2;
        this.llTeam = linearLayout2;
        this.rlTeam = relativeLayout;
        this.rvTeam = recyclerView;
        this.txtNoDataOne = textView;
        this.txtTeamName = textView2;
    }

    @Override 
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSquadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSquadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_squad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSquadBinding bind(View view) {
        int i = R.id.img_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_arrow);
        if (imageView != null) {
            i = R.id.img_team_flag;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_team_flag);
            if (imageView2 != null) {
                i = R.id.ll_team;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_team);
                if (linearLayout != null) {
                    i = R.id.rl_team;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_team);
                    if (relativeLayout != null) {
                        i = R.id.rv_team;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_team);
                        if (recyclerView != null) {
                            i = R.id.txt_no_data_one;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_no_data_one);
                            if (textView != null) {
                                i = R.id.txt_team_name;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_team_name);
                                if (textView2 != null) {
                                    return new ItemSquadBinding((LinearLayout) view, imageView, imageView2, linearLayout, relativeLayout, recyclerView, textView, textView2);
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
