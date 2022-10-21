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

public class PlayerBattingFragment extends Fragment {
    private static final String TAG = "PlayerBattingFragment";
    Activity myActivity;
    String playerID;
    TextView txt_ipl_4s_6s;
    TextView txt_ipl_50_100;
    TextView txt_ipl_average;
    TextView txt_ipl_bsr;
    TextView txt_ipl_innings_count;
    TextView txt_ipl_match_count;
    TextView txt_ipl_runs;
    TextView txt_odi_4s_6s;
    TextView txt_odi_50_100;
    TextView txt_odi_average;
    TextView txt_odi_bsr;
    TextView txt_odi_innings_count;
    TextView txt_odi_match_count;
    TextView txt_odi_runs;
    TextView txt_t20_4s_6s;
    TextView txt_t20_50_100;
    TextView txt_t20_average;
    TextView txt_t20_bsr;
    TextView txt_t20_innings_count;
    TextView txt_t20_match_count;
    TextView txt_t20_runs;
    TextView txt_test_4s_6s;
    TextView txt_test_50_100;
    TextView txt_test_average;
    TextView txt_test_bsr;
    TextView txt_test_innings_count;
    TextView txt_test_match_count;
    TextView txt_test_runs;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_player_batting, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            this.txt_test_match_count = (TextView) this.view.findViewById(R.id.txt_test_match_count);
            this.txt_odi_match_count = (TextView) this.view.findViewById(R.id.txt_odi_match_count);
            this.txt_t20_match_count = (TextView) this.view.findViewById(R.id.txt_t20_match_count);
            this.txt_ipl_match_count = (TextView) this.view.findViewById(R.id.txt_ipl_match_count);
            this.txt_test_innings_count = (TextView) this.view.findViewById(R.id.txt_test_innings_count);
            this.txt_odi_innings_count = (TextView) this.view.findViewById(R.id.txt_odi_innings_count);
            this.txt_t20_innings_count = (TextView) this.view.findViewById(R.id.txt_t20_innings_count);
            this.txt_ipl_innings_count = (TextView) this.view.findViewById(R.id.txt_ipl_innings_count);
            this.txt_test_runs = (TextView) this.view.findViewById(R.id.txt_test_runs);
            this.txt_odi_runs = (TextView) this.view.findViewById(R.id.txt_odi_runs);
            this.txt_t20_runs = (TextView) this.view.findViewById(R.id.txt_t20_runs);
            this.txt_ipl_runs = (TextView) this.view.findViewById(R.id.txt_ipl_runs);
            this.txt_test_bsr = (TextView) this.view.findViewById(R.id.txt_test_bsr);
            this.txt_odi_bsr = (TextView) this.view.findViewById(R.id.txt_odi_bsr);
            this.txt_t20_bsr = (TextView) this.view.findViewById(R.id.txt_t20_bsr);
            this.txt_ipl_bsr = (TextView) this.view.findViewById(R.id.txt_ipl_bsr);
            this.txt_test_average = (TextView) this.view.findViewById(R.id.txt_test_average);
            this.txt_odi_average = (TextView) this.view.findViewById(R.id.txt_odi_average);
            this.txt_t20_average = (TextView) this.view.findViewById(R.id.txt_t20_average);
            this.txt_ipl_average = (TextView) this.view.findViewById(R.id.txt_ipl_average);
            this.txt_test_50_100 = (TextView) this.view.findViewById(R.id.txt_test_50_100);
            this.txt_odi_50_100 = (TextView) this.view.findViewById(R.id.txt_odi_50_100);
            this.txt_t20_50_100 = (TextView) this.view.findViewById(R.id.txt_t20_50_100);
            this.txt_ipl_50_100 = (TextView) this.view.findViewById(R.id.txt_ipl_50_100);
            this.txt_test_4s_6s = (TextView) this.view.findViewById(R.id.txt_test_4s_6s);
            this.txt_odi_4s_6s = (TextView) this.view.findViewById(R.id.txt_odi_4s_6s);
            this.txt_t20_4s_6s = (TextView) this.view.findViewById(R.id.txt_t20_4s_6s);
            this.txt_ipl_4s_6s = (TextView) this.view.findViewById(R.id.txt_ipl_4s_6s);
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
                    if (Test.battingRecord() != null) {
                        this.txt_test_runs.setText(Test.battingRecord().runs());
                        this.txt_test_bsr.setText(Test.battingRecord().strikeRate());
                        this.txt_test_average.setText(Test.battingRecord().average());
                        this.txt_test_50_100.setText(Test.battingRecord().fifties() + "/" + Test.battingRecord().hundreds());
                        this.txt_test_4s_6s.setText(Test.battingRecord().fours() + "/" + Test.battingRecord().sixes());
                    }
                }
                if (Odi != null) {
                    if (Odi.basicdetails() != null) {
                        this.txt_odi_match_count.setText(Odi.basicdetails().matches());
                        this.txt_odi_innings_count.setText(Odi.basicdetails().innings());
                    }
                    if (Odi.battingRecord() != null) {
                        this.txt_odi_runs.setText(Odi.battingRecord().runs());
                        this.txt_odi_bsr.setText(Odi.battingRecord().strikeRate());
                        this.txt_odi_average.setText(Odi.battingRecord().average());
                        this.txt_odi_50_100.setText(Odi.battingRecord().fifties() + "/" + Odi.battingRecord().hundreds());
                        this.txt_odi_4s_6s.setText(Odi.battingRecord().fours() + "/" + Odi.battingRecord().sixes());
                    }
                }
                if (T20 != null) {
                    if (T20.basicdetails() != null) {
                        this.txt_t20_match_count.setText(T20.basicdetails().matches());
                        this.txt_t20_innings_count.setText(T20.basicdetails().innings());
                    }
                    if (T20.battingRecord() != null) {
                        this.txt_t20_runs.setText(T20.battingRecord().runs());
                        this.txt_t20_bsr.setText(T20.battingRecord().strikeRate());
                        this.txt_t20_average.setText(T20.battingRecord().average());
                        this.txt_t20_50_100.setText(T20.battingRecord().fifties() + "/" + T20.battingRecord().hundreds());
                        this.txt_t20_4s_6s.setText(T20.battingRecord().fours() + "/" + T20.battingRecord().sixes());
                    }
                }
                if (Ipl != null) {
                    if (Ipl.basicdetails() != null) {
                        this.txt_ipl_match_count.setText(Ipl.basicdetails().matches());
                        this.txt_ipl_innings_count.setText(Ipl.basicdetails().innings());
                    }
                    if (Ipl.battingRecord() != null) {
                        this.txt_ipl_runs.setText(Ipl.battingRecord().runs());
                        this.txt_ipl_bsr.setText(Ipl.battingRecord().strikeRate());
                        this.txt_ipl_average.setText(Ipl.battingRecord().average());
                        this.txt_ipl_50_100.setText(Ipl.battingRecord().fifties() + "/" + Ipl.battingRecord().hundreds());
                        this.txt_ipl_4s_6s.setText(Ipl.battingRecord().fours() + "/" + Ipl.battingRecord().sixes());
                    }
                }
            }
        }
    }
}
