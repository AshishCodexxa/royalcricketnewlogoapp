package com.cricketscoreprediction.app.Fragments.Player;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;

public class PlayerInfoFragment extends Fragment {
    private static final String TAG = "PlayerInfoFragment";
    TextView txt_player_bPlace;
    TextView txt_player_batStyle;
    TextView txt_player_born;
    TextView txt_player_bowlStyle;
    TextView txt_player_fullName;
    TextView txt_player_profile;
    TextView txt_player_role;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_player_info, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        this.txt_player_born = (TextView) this.view.findViewById(R.id.txt_player_born);
        this.txt_player_bPlace = (TextView) this.view.findViewById(R.id.txt_player_bPlace);
        this.txt_player_fullName = (TextView) this.view.findViewById(R.id.txt_player_fullName);
        this.txt_player_role = (TextView) this.view.findViewById(R.id.txt_player_role);
        this.txt_player_batStyle = (TextView) this.view.findViewById(R.id.txt_player_batStyle);
        this.txt_player_bowlStyle = (TextView) this.view.findViewById(R.id.txt_player_bowlStyle);
        this.txt_player_profile = (TextView) this.view.findViewById(R.id.txt_player_profile);
        if (Glob.playersDetail != null) {
            this.txt_player_born.setText(Glob.playersDetail.dob());
            this.txt_player_bPlace.setText(Glob.playersDetail.birthPlace());
            this.txt_player_fullName.setText(Glob.playersDetail.fullName());
            this.txt_player_role.setText(Glob.playersDetail.role());
            this.txt_player_batStyle.setText(Glob.playersDetail.battingStyle());
            this.txt_player_bowlStyle.setText(Glob.playersDetail.bowlingStyle());
            if (Glob.playersDetail.description() != null) {
                this.txt_player_profile.setText(Glob.playersDetail.description().replaceAll("<p>|</p>|<br />", ""));
            } else {
                this.view.findViewById(R.id.ll_playerBio).setVisibility(View.GONE);
            }
        }
    }
}
