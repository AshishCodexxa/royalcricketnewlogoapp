package com.cricketlivescore.predictiontips.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cricketlivescore.predictiontips.R;


public final class FragmentPlayerBattingBinding implements ViewBinding {
    private final ScrollView rootView;
    public final TextView txtIpl4s6s;
    public final TextView txtIpl50100;
    public final TextView txtIplAverage;
    public final TextView txtIplBsr;
    public final TextView txtIplInningsCount;
    public final TextView txtIplMatchCount;
    public final TextView txtIplRuns;
    public final TextView txtOdi4s6s;
    public final TextView txtOdi50100;
    public final TextView txtOdiAverage;
    public final TextView txtOdiBsr;
    public final TextView txtOdiInningsCount;
    public final TextView txtOdiMatchCount;
    public final TextView txtOdiRuns;
    public final TextView txtT204s6s;
    public final TextView txtT2050100;
    public final TextView txtT20Average;
    public final TextView txtT20Bsr;
    public final TextView txtT20InningsCount;
    public final TextView txtT20MatchCount;
    public final TextView txtT20Runs;
    public final TextView txtTest4s6s;
    public final TextView txtTest50100;
    public final TextView txtTestAverage;
    public final TextView txtTestBsr;
    public final TextView txtTestInningsCount;
    public final TextView txtTestMatchCount;
    public final TextView txtTestRuns;

    private FragmentPlayerBattingBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28) {
        this.rootView = scrollView;
        this.txtIpl4s6s = textView;
        this.txtIpl50100 = textView2;
        this.txtIplAverage = textView3;
        this.txtIplBsr = textView4;
        this.txtIplInningsCount = textView5;
        this.txtIplMatchCount = textView6;
        this.txtIplRuns = textView7;
        this.txtOdi4s6s = textView8;
        this.txtOdi50100 = textView9;
        this.txtOdiAverage = textView10;
        this.txtOdiBsr = textView11;
        this.txtOdiInningsCount = textView12;
        this.txtOdiMatchCount = textView13;
        this.txtOdiRuns = textView14;
        this.txtT204s6s = textView15;
        this.txtT2050100 = textView16;
        this.txtT20Average = textView17;
        this.txtT20Bsr = textView18;
        this.txtT20InningsCount = textView19;
        this.txtT20MatchCount = textView20;
        this.txtT20Runs = textView21;
        this.txtTest4s6s = textView22;
        this.txtTest50100 = textView23;
        this.txtTestAverage = textView24;
        this.txtTestBsr = textView25;
        this.txtTestInningsCount = textView26;
        this.txtTestMatchCount = textView27;
        this.txtTestRuns = textView28;
    }

    @Override 
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPlayerBattingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlayerBattingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_player_batting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPlayerBattingBinding bind(View view) {
        int i = R.id.txt_ipl_4s_6s;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_4s_6s);
        if (textView != null) {
            i = R.id.txt_ipl_50_100;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_50_100);
            if (textView2 != null) {
                i = R.id.txt_ipl_average;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_average);
                if (textView3 != null) {
                    i = R.id.txt_ipl_bsr;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_bsr);
                    if (textView4 != null) {
                        i = R.id.txt_ipl_innings_count;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_innings_count);
                        if (textView5 != null) {
                            i = R.id.txt_ipl_match_count;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_match_count);
                            if (textView6 != null) {
                                i = R.id.txt_ipl_runs;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_ipl_runs);
                                if (textView7 != null) {
                                    i = R.id.txt_odi_4s_6s;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_4s_6s);
                                    if (textView8 != null) {
                                        i = R.id.txt_odi_50_100;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_50_100);
                                        if (textView9 != null) {
                                            i = R.id.txt_odi_average;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_average);
                                            if (textView10 != null) {
                                                i = R.id.txt_odi_bsr;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_bsr);
                                                if (textView11 != null) {
                                                    i = R.id.txt_odi_innings_count;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_innings_count);
                                                    if (textView12 != null) {
                                                        i = R.id.txt_odi_match_count;
                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_match_count);
                                                        if (textView13 != null) {
                                                            i = R.id.txt_odi_runs;
                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_odi_runs);
                                                            if (textView14 != null) {
                                                                i = R.id.txt_t20_4s_6s;
                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_4s_6s);
                                                                if (textView15 != null) {
                                                                    i = R.id.txt_t20_50_100;
                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_50_100);
                                                                    if (textView16 != null) {
                                                                        i = R.id.txt_t20_average;
                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_average);
                                                                        if (textView17 != null) {
                                                                            i = R.id.txt_t20_bsr;
                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_bsr);
                                                                            if (textView18 != null) {
                                                                                i = R.id.txt_t20_innings_count;
                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_innings_count);
                                                                                if (textView19 != null) {
                                                                                    i = R.id.txt_t20_match_count;
                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_match_count);
                                                                                    if (textView20 != null) {
                                                                                        i = R.id.txt_t20_runs;
                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_t20_runs);
                                                                                        if (textView21 != null) {
                                                                                            i = R.id.txt_test_4s_6s;
                                                                                            TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_4s_6s);
                                                                                            if (textView22 != null) {
                                                                                                i = R.id.txt_test_50_100;
                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_50_100);
                                                                                                if (textView23 != null) {
                                                                                                    i = R.id.txt_test_average;
                                                                                                    TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_average);
                                                                                                    if (textView24 != null) {
                                                                                                        i = R.id.txt_test_bsr;
                                                                                                        TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_bsr);
                                                                                                        if (textView25 != null) {
                                                                                                            i = R.id.txt_test_innings_count;
                                                                                                            TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_innings_count);
                                                                                                            if (textView26 != null) {
                                                                                                                i = R.id.txt_test_match_count;
                                                                                                                TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_match_count);
                                                                                                                if (textView27 != null) {
                                                                                                                    i = R.id.txt_test_runs;
                                                                                                                    TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_test_runs);
                                                                                                                    if (textView28 != null) {
                                                                                                                        return new FragmentPlayerBattingBinding((ScrollView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28);
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
