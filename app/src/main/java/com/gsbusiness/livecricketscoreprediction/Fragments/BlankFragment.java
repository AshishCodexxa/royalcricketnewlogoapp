package com.gsbusiness.livecricketscoreprediction.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.gsbusiness.livecricketscoreprediction.R;

public class BlankFragment extends Fragment {
    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_blank, viewGroup, false);
    }
}
