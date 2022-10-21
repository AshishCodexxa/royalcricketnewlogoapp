package com.gsbusiness.livecricketscoreprediction.Fragments.Player;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

public class PlayerCareerFragment extends Fragment {
    private static final String TAG = "PlayerCareerFragment";
    Activity myActivity;
    TextView txt_player_ipl_debut;
    TextView txt_player_ipl_lastPlay;
    TextView txt_player_odis_debut;
    TextView txt_player_odis_lastPlay;
    TextView txt_player_t20s_debut;
    TextView txt_player_t20s_lastPlay;
    TextView txt_player_test_debut;
    TextView txt_player_test_lastPlay;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_player_career, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        this.txt_player_test_debut = (TextView) this.view.findViewById(R.id.txt_player_test_debut);
        this.txt_player_test_lastPlay = (TextView) this.view.findViewById(R.id.txt_player_test_lastPlay);
        this.txt_player_odis_debut = (TextView) this.view.findViewById(R.id.txt_player_odis_debut);
        this.txt_player_odis_lastPlay = (TextView) this.view.findViewById(R.id.txt_player_odis_lastPlay);
        this.txt_player_t20s_debut = (TextView) this.view.findViewById(R.id.txt_player_t20s_debut);
        this.txt_player_t20s_lastPlay = (TextView) this.view.findViewById(R.id.txt_player_t20s_lastPlay);
        this.txt_player_ipl_debut = (TextView) this.view.findViewById(R.id.txt_player_ipl_debut);
        this.txt_player_ipl_lastPlay = (TextView) this.view.findViewById(R.id.txt_player_ipl_lastPlay);
        if (Glob.playersDetail != null) {
            String format = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().Test().debutMatch().against(), ",", dateFormatter(Glob.playersDetail.international().Test().debutMatch().date()));
            String format2 = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().Test().lastMatch().against(), ",", dateFormatter(Glob.playersDetail.international().Test().lastMatch().date()));
            String format3 = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().Odi().debutMatch().against(), ",", dateFormatter(Glob.playersDetail.international().Odi().debutMatch().date()));
            String format4 = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().Odi().lastMatch().against(), ",", dateFormatter(Glob.playersDetail.international().Odi().lastMatch().date()));
            String format5 = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().T20().debutMatch().against(), ",", dateFormatter(Glob.playersDetail.international().T20().debutMatch().date()));
            String format6 = String.format("%s %s%s %s", "vs", Glob.playersDetail.international().T20().lastMatch().against(), ",", dateFormatter(Glob.playersDetail.international().T20().lastMatch().date()));
            if (Glob.playersDetail.Ipl().debutMatch() != null) {
                this.txt_player_ipl_debut.setText(String.format("%s %s%s %s", "vs", Glob.playersDetail.Ipl().debutMatch().against(), ",", dateFormatter(Glob.playersDetail.Ipl().debutMatch().date())));
            }
            if (Glob.playersDetail.Ipl().lastMatch() != null) {
                this.txt_player_ipl_lastPlay.setText(String.format("%s %s%s %s", "vs", Glob.playersDetail.Ipl().lastMatch().against(), ",", dateFormatter(Glob.playersDetail.Ipl().lastMatch().date())));
            }
            this.txt_player_test_lastPlay.setText(format2);
            this.txt_player_test_debut.setText(format);
            this.txt_player_odis_debut.setText(format3);
            this.txt_player_odis_lastPlay.setText(format4);
            this.txt_player_t20s_debut.setText(format5);
            this.txt_player_t20s_lastPlay.setText(format6);
        }
    }

    private String dateFormatter(String str) {
        return (str == null || str.equals("")) ? "" : str;
    }
}
