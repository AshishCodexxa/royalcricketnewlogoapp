package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentPlayerInfoBinding implements ViewBinding {
    public final LinearLayout llPlayerBio;
    private final ScrollView rootView;
    public final TextView txtPlayerBPlace;
    public final TextView txtPlayerBatStyle;
    public final TextView txtPlayerBorn;
    public final TextView txtPlayerBowlStyle;
    public final TextView txtPlayerFullName;
    public final TextView txtPlayerProfile;
    public final TextView txtPlayerRole;

    private FragmentPlayerInfoBinding(ScrollView scrollView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = scrollView;
        this.llPlayerBio = linearLayout;
        this.txtPlayerBPlace = textView;
        this.txtPlayerBatStyle = textView2;
        this.txtPlayerBorn = textView3;
        this.txtPlayerBowlStyle = textView4;
        this.txtPlayerFullName = textView5;
        this.txtPlayerProfile = textView6;
        this.txtPlayerRole = textView7;
    }

    @Override
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerInfoBinding bind(View view) {
        int i = R.id.ll_playerBio;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_playerBio);
        if (linearLayout != null) {
            i = R.id.txt_player_bPlace;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bPlace);
            if (textView != null) {
                i = R.id.txt_player_batStyle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_batStyle);
                if (textView2 != null) {
                    i = R.id.txt_player_born;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_born);
                    if (textView3 != null) {
                        i = R.id.txt_player_bowlStyle;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_bowlStyle);
                        if (textView4 != null) {
                            i = R.id.txt_player_fullName;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_fullName);
                            if (textView5 != null) {
                                i = R.id.txt_player_profile;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_profile);
                                if (textView6 != null) {
                                    i = R.id.txt_player_role;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_role);
                                    if (textView7 != null) {
                                        return new FragmentPlayerInfoBinding((ScrollView) view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
