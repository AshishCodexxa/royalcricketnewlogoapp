package com.cricketlivescore.predictiontips.Adapter.Ipl;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;

public class AdapterIpl extends FragmentStateAdapter {
    private ArrayList<Fragment> fragments;

    public AdapterIpl(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int i) {
        return this.fragments.get(i);
    }

    @Override 
    public int getItemCount() {
        return this.fragments.size();
    }

    public void setData(ArrayList<Fragment> arrayList) {
        this.fragments = arrayList;
    }
}
