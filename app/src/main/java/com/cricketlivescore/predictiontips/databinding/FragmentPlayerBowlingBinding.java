package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentPlayerBowlingBinding implements ViewBinding {
    private final ScrollView rootView;
    public final TextView txtIpl5w;
    public final TextView txtIplAverage;
    public final TextView txtIplBalls;
    public final TextView txtIplBsr;
    public final TextView txtIplEconomy;
    public final TextView txtIplInningsCount;
    public final TextView txtIplMatchCount;
    public final TextView txtIplWickets;
    public final TextView txtOdi5w;
    public final TextView txtOdiAverage;
    public final TextView txtOdiBalls;
    public final TextView txtOdiBsr;
    public final TextView txtOdiEconomy;
    public final TextView txtOdiInningsCount;
    public final TextView txtOdiMatchCount;
    public final TextView txtOdiWickets;
    public final TextView txtT205w;
    public final TextView txtT20Average;
    public final TextView txtT20Balls;
    public final TextView txtT20Bsr;
    public final TextView txtT20Economy;
    public final TextView txtT20InningsCount;
    public final TextView txtT20MatchCount;
    public final TextView txtT20Wickets;
    public final TextView txtTest5w;
    public final TextView txtTestAverage;
    public final TextView txtTestBalls;
    public final TextView txtTestBsr;
    public final TextView txtTestEconomy;
    public final TextView txtTestInningsCount;
    public final TextView txtTestMatchCount;
    public final TextView txtTestWickets;

    private FragmentPlayerBowlingBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32) {
        this.rootView = scrollView;
        this.txtIpl5w = textView;
        this.txtIplAverage = textView2;
        this.txtIplBalls = textView3;
        this.txtIplBsr = textView4;
        this.txtIplEconomy = textView5;
        this.txtIplInningsCount = textView6;
        this.txtIplMatchCount = textView7;
        this.txtIplWickets = textView8;
        this.txtOdi5w = textView9;
        this.txtOdiAverage = textView10;
        this.txtOdiBalls = textView11;
        this.txtOdiBsr = textView12;
        this.txtOdiEconomy = textView13;
        this.txtOdiInningsCount = textView14;
        this.txtOdiMatchCount = textView15;
        this.txtOdiWickets = textView16;
        this.txtT205w = textView17;
        this.txtT20Average = textView18;
        this.txtT20Balls = textView19;
        this.txtT20Bsr = textView20;
        this.txtT20Economy = textView21;
        this.txtT20InningsCount = textView22;
        this.txtT20MatchCount = textView23;
        this.txtT20Wickets = textView24;
        this.txtTest5w = textView25;
        this.txtTestAverage = textView26;
        this.txtTestBalls = textView27;
        this.txtTestBsr = textView28;
        this.txtTestEconomy = textView29;
        this.txtTestInningsCount = textView30;
        this.txtTestMatchCount = textView31;
        this.txtTestWickets = textView32;
    }

    @Override
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerBowlingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerBowlingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_bowling, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerBowlingBinding bind(View view) {
        int i = R.id.txt_ipl_5w;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_5w);
        if (textView != null) {
            i = R.id.txt_ipl_average;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_average);
            if (textView2 != null) {
                i = R.id.txt_ipl_balls;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_balls);
                if (textView3 != null) {
                    i = R.id.txt_ipl_bsr;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_bsr);
                    if (textView4 != null) {
                        i = R.id.txt_ipl_economy;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_economy);
                        if (textView5 != null) {
                            i = R.id.txt_ipl_innings_count;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_innings_count);
                            if (textView6 != null) {
                                i = R.id.txt_ipl_match_count;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_match_count);
                                if (textView7 != null) {
                                    i = R.id.txt_ipl_wickets;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_wickets);
                                    if (textView8 != null) {
                                        i = R.id.txt_odi_5w;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_5w);
                                        if (textView9 != null) {
                                            i = R.id.txt_odi_average;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_average);
                                            if (textView10 != null) {
                                                i = R.id.txt_odi_balls;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_balls);
                                                if (textView11 != null) {
                                                    i = R.id.txt_odi_bsr;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_bsr);
                                                    if (textView12 != null) {
                                                        i = R.id.txt_odi_economy;
                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_economy);
                                                        if (textView13 != null) {
                                                            i = R.id.txt_odi_innings_count;
                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_innings_count);
                                                            if (textView14 != null) {
                                                                i = R.id.txt_odi_match_count;
                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_match_count);
                                                                if (textView15 != null) {
                                                                    i = R.id.txt_odi_wickets;
                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_wickets);
                                                                    if (textView16 != null) {
                                                                        i = R.id.txt_t20_5w;
                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_5w);
                                                                        if (textView17 != null) {
                                                                            i = R.id.txt_t20_average;
                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_average);
                                                                            if (textView18 != null) {
                                                                                i = R.id.txt_t20_balls;
                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_balls);
                                                                                if (textView19 != null) {
                                                                                    i = R.id.txt_t20_bsr;
                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_bsr);
                                                                                    if (textView20 != null) {
                                                                                        i = R.id.txt_t20_economy;
                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_economy);
                                                                                        if (textView21 != null) {
                                                                                            i = R.id.txt_t20_innings_count;
                                                                                            TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_innings_count);
                                                                                            if (textView22 != null) {
                                                                                                i = R.id.txt_t20_match_count;
                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_match_count);
                                                                                                if (textView23 != null) {
                                                                                                    i = R.id.txt_t20_wickets;
                                                                                                    TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_wickets);
                                                                                                    if (textView24 != null) {
                                                                                                        i = R.id.txt_test_5w;
                                                                                                        TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_5w);
                                                                                                        if (textView25 != null) {
                                                                                                            i = R.id.txt_test_average;
                                                                                                            TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_average);
                                                                                                            if (textView26 != null) {
                                                                                                                i = R.id.txt_test_balls;
                                                                                                                TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_balls);
                                                                                                                if (textView27 != null) {
                                                                                                                    i = R.id.txt_test_bsr;
                                                                                                                    TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_bsr);
                                                                                                                    if (textView28 != null) {
                                                                                                                        i = R.id.txt_test_economy;
                                                                                                                        TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_economy);
                                                                                                                        if (textView29 != null) {
                                                                                                                            i = R.id.txt_test_innings_count;
                                                                                                                            TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_innings_count);
                                                                                                                            if (textView30 != null) {
                                                                                                                                i = R.id.txt_test_match_count;
                                                                                                                                TextView textView31 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_match_count);
                                                                                                                                if (textView31 != null) {
                                                                                                                                    i = R.id.txt_test_wickets;
                                                                                                                                    TextView textView32 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_wickets);
                                                                                                                                    if (textView32 != null) {
                                                                                                                                        return new FragmentPlayerBowlingBinding((ScrollView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
