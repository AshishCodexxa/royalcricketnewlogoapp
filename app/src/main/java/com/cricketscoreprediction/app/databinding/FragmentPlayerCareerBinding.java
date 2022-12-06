package com.cricketscoreprediction.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketscoreprediction.app.R;


public final class FragmentPlayerCareerBinding implements ViewBinding {
    private final ScrollView rootView;
    public final TextView txtPlayerIplDebut;
    public final TextView txtPlayerIplLastPlay;
    public final TextView txtPlayerOdisDebut;
    public final TextView txtPlayerOdisLastPlay;
    public final TextView txtPlayerT20sDebut;
    public final TextView txtPlayerT20sLastPlay;
    public final TextView txtPlayerTestDebut;
    public final TextView txtPlayerTestLastPlay;

    private FragmentPlayerCareerBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = scrollView;
        this.txtPlayerIplDebut = textView;
        this.txtPlayerIplLastPlay = textView2;
        this.txtPlayerOdisDebut = textView3;
        this.txtPlayerOdisLastPlay = textView4;
        this.txtPlayerT20sDebut = textView5;
        this.txtPlayerT20sLastPlay = textView6;
        this.txtPlayerTestDebut = textView7;
        this.txtPlayerTestLastPlay = textView8;
    }

    @Override 
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerCareerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerCareerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_career, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerCareerBinding bind(View view) {
        int i = R.id.txt_player_ipl_debut;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_ipl_debut);
        if (textView != null) {
            i = R.id.txt_player_ipl_lastPlay;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_ipl_lastPlay);
            if (textView2 != null) {
                i = R.id.txt_player_odis_debut;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_odis_debut);
                if (textView3 != null) {
                    i = R.id.txt_player_odis_lastPlay;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_odis_lastPlay);
                    if (textView4 != null) {
                        i = R.id.txt_player_t20s_debut;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_t20s_debut);
                        if (textView5 != null) {
                            i = R.id.txt_player_t20s_lastPlay;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_t20s_lastPlay);
                            if (textView6 != null) {
                                i = R.id.txt_player_test_debut;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_test_debut);
                                if (textView7 != null) {
                                    i = R.id.txt_player_test_lastPlay;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_player_test_lastPlay);
                                    if (textView8 != null) {
                                        return new FragmentPlayerCareerBinding((ScrollView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
