package com.gsbusiness.livecricketscoreprediction.Fragments.Player;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.gsbusiness.livecricketscoreprediction.R;

public class PlayerKeepingFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    Activity myActivity;
    View view;

    private void initView() {
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_player_keepimg, viewGroup, false);
        initView();
        return this.view;
    }
}
