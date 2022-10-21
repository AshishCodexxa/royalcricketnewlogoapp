package com.gsbusiness.livecricketscoreprediction.Fragments.Player;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.gsbusiness.livecricketscoreprediction.PlayersDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

public class PlayerBowlingFragment extends Fragment {
    private static final String TAG = "PlayerBowlingFragment";
    Activity myActivity;
    TextView txt_ipl_5w;
    TextView txt_ipl_average;
    TextView txt_ipl_balls;
    TextView txt_ipl_bsr;
    TextView txt_ipl_economy;
    TextView txt_ipl_innings_count;
    TextView txt_ipl_match_count;
    TextView txt_ipl_wickets;
    TextView txt_odi_5w;
    TextView txt_odi_average;
    TextView txt_odi_balls;
    TextView txt_odi_bsr;
    TextView txt_odi_economy;
    TextView txt_odi_innings_count;
    TextView txt_odi_match_count;
    TextView txt_odi_wickets;
    TextView txt_t20_5w;
    TextView txt_t20_average;
    TextView txt_t20_balls;
    TextView txt_t20_bsr;
    TextView txt_t20_economy;
    TextView txt_t20_innings_count;
    TextView txt_t20_match_count;
    TextView txt_t20_wickets;
    TextView txt_test_5w;
    TextView txt_test_average;
    TextView txt_test_balls;
    TextView txt_test_bsr;
    TextView txt_test_economy;
    TextView txt_test_innings_count;
    TextView txt_test_match_count;
    TextView txt_test_wickets;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_player_bowling, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        this.txt_test_match_count = (TextView) this.view.findViewById(R.id.txt_test_match_count);
        this.txt_odi_match_count = (TextView) this.view.findViewById(R.id.txt_odi_match_count);
        this.txt_t20_match_count = (TextView) this.view.findViewById(R.id.txt_t20_match_count);
        this.txt_ipl_match_count = (TextView) this.view.findViewById(R.id.txt_ipl_match_count);
        this.txt_test_innings_count = (TextView) this.view.findViewById(R.id.txt_test_innings_count);
        this.txt_odi_innings_count = (TextView) this.view.findViewById(R.id.txt_odi_innings_count);
        this.txt_t20_innings_count = (TextView) this.view.findViewById(R.id.txt_t20_innings_count);
        this.txt_ipl_innings_count = (TextView) this.view.findViewById(R.id.txt_ipl_innings_count);
        this.txt_test_balls = (TextView) this.view.findViewById(R.id.txt_test_balls);
        this.txt_odi_balls = (TextView) this.view.findViewById(R.id.txt_odi_balls);
        this.txt_t20_balls = (TextView) this.view.findViewById(R.id.txt_t20_balls);
        this.txt_ipl_balls = (TextView) this.view.findViewById(R.id.txt_ipl_balls);
        this.txt_test_wickets = (TextView) this.view.findViewById(R.id.txt_test_wickets);
        this.txt_odi_wickets = (TextView) this.view.findViewById(R.id.txt_odi_wickets);
        this.txt_t20_wickets = (TextView) this.view.findViewById(R.id.txt_t20_wickets);
        this.txt_ipl_wickets = (TextView) this.view.findViewById(R.id.txt_ipl_wickets);
        this.txt_test_economy = (TextView) this.view.findViewById(R.id.txt_test_economy);
        this.txt_odi_economy = (TextView) this.view.findViewById(R.id.txt_odi_economy);
        this.txt_t20_economy = (TextView) this.view.findViewById(R.id.txt_t20_economy);
        this.txt_ipl_economy = (TextView) this.view.findViewById(R.id.txt_ipl_economy);
        this.txt_test_bsr = (TextView) this.view.findViewById(R.id.txt_test_bsr);
        this.txt_odi_bsr = (TextView) this.view.findViewById(R.id.txt_odi_bsr);
        this.txt_t20_bsr = (TextView) this.view.findViewById(R.id.txt_t20_bsr);
        this.txt_ipl_bsr = (TextView) this.view.findViewById(R.id.txt_ipl_bsr);
        this.txt_test_average = (TextView) this.view.findViewById(R.id.txt_test_average);
        this.txt_odi_average = (TextView) this.view.findViewById(R.id.txt_odi_average);
        this.txt_t20_average = (TextView) this.view.findViewById(R.id.txt_t20_average);
        this.txt_ipl_average = (TextView) this.view.findViewById(R.id.txt_ipl_average);
        this.txt_test_5w = (TextView) this.view.findViewById(R.id.txt_test_5w);
        this.txt_odi_5w = (TextView) this.view.findViewById(R.id.txt_odi_5w);
        this.txt_t20_5w = (TextView) this.view.findViewById(R.id.txt_t20_5w);
        this.txt_ipl_5w = (TextView) this.view.findViewById(R.id.txt_ipl_5w);
        if (Glob.playersDetail != null) {
            PlayersDetailsQuery.Test Test = Glob.playersDetail.international().Test();
            PlayersDetailsQuery.Odi Odi = Glob.playersDetail.international().Odi();
            PlayersDetailsQuery.T20 T20 = Glob.playersDetail.international().T20();
            PlayersDetailsQuery.C6692Ipl Ipl = Glob.playersDetail.Ipl();
            if (Test != null) {
                if (Test.basicdetails() != null) {
                    this.txt_test_match_count.setText(Test.basicdetails().matches());
                    this.txt_test_innings_count.setText(Test.basicdetails().innings());
                }
                if (Test.bowlingRecord() != null) {
                    this.txt_test_wickets.setText(Test.bowlingRecord().wickets());
                    this.txt_test_economy.setText(Test.bowlingRecord().economyRate());
                    this.txt_test_balls.setText(Test.bowlingRecord().ballsBowled());
                    this.txt_test_bsr.setText(Test.bowlingRecord().strikeRate());
                    this.txt_test_average.setText(Test.bowlingRecord().average());
                    this.txt_test_5w.setText(Test.bowlingRecord().fiveWicketHauls());
                }
            }
            if (Odi != null) {
                if (Odi.basicdetails() != null) {
                    this.txt_odi_match_count.setText(Odi.basicdetails().matches());
                    this.txt_odi_innings_count.setText(Odi.basicdetails().innings());
                }
                if (Odi.bowlingRecord() != null) {
                    this.txt_odi_wickets.setText(Odi.bowlingRecord().wickets());
                    this.txt_odi_economy.setText(Odi.bowlingRecord().economyRate());
                    this.txt_odi_balls.setText(Odi.bowlingRecord().ballsBowled());
                    this.txt_odi_bsr.setText(Odi.bowlingRecord().strikeRate());
                    this.txt_odi_average.setText(Odi.bowlingRecord().average());
                    this.txt_odi_5w.setText(Odi.bowlingRecord().fiveWicketHauls());
                }
            }
            if (T20 != null) {
                if (T20.basicdetails() != null) {
                    this.txt_t20_match_count.setText(T20.basicdetails().matches());
                    this.txt_t20_innings_count.setText(T20.basicdetails().innings());
                }
                if (T20.bowlingRecord() != null) {
                    this.txt_t20_wickets.setText(T20.bowlingRecord().wickets());
                    this.txt_t20_economy.setText(T20.bowlingRecord().economyRate());
                    this.txt_t20_balls.setText(T20.bowlingRecord().ballsBowled());
                    this.txt_t20_bsr.setText(T20.bowlingRecord().strikeRate());
                    this.txt_t20_average.setText(T20.bowlingRecord().average());
                    this.txt_t20_5w.setText(T20.bowlingRecord().fiveWicketHauls());
                }
            }
            if (Ipl != null) {
                if (Ipl.basicdetails() != null) {
                    this.txt_ipl_match_count.setText(Ipl.basicdetails().matches());
                    this.txt_ipl_innings_count.setText(Ipl.basicdetails().innings());
                }
                if (Ipl.bowlingRecord() != null) {
                    this.txt_ipl_wickets.setText(Ipl.bowlingRecord().wickets());
                    this.txt_ipl_economy.setText(Ipl.bowlingRecord().economyRate());
                    this.txt_ipl_balls.setText(Ipl.bowlingRecord().ballsBowled());
                    this.txt_ipl_bsr.setText(Ipl.bowlingRecord().strikeRate());
                    this.txt_ipl_average.setText(Ipl.bowlingRecord().average());
                    this.txt_ipl_5w.setText(Ipl.bowlingRecord().fiveWicketHauls());
                }
            }
        }
    }
}
