package com.gsbusiness.livecricketscoreprediction.Fragments.Scheduled;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.tabs.TabLayout;

import com.gsbusiness.livecricketscoreprediction.R;

public class UpComingFragment extends Fragment {
    private static final String LOG = "LogUpComingFragment";
    private static Activity myActivity;
    TabLayout tabLayout_UpSchedule;
    String type = "upcoming";
    View view;

    public static UpComingFragment newInstance(Activity activity) {
        UpComingFragment upComingFragment = new UpComingFragment();
        myActivity = activity;
        return upComingFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_up_coming, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {
            TabLayout tabLayout = (TabLayout) this.view.findViewById(R.id.tabLayout_UpSchedule);
            this.tabLayout_UpSchedule = tabLayout;
            tabLayout.addTab(tabLayout.newTab().setText(R.string.international));
            TabLayout tabLayout2 = this.tabLayout_UpSchedule;
            tabLayout2.addTab(tabLayout2.newTab().setText(R.string.domestic));
            this.tabLayout_UpSchedule.setTabGravity(0);
            this.tabLayout_UpSchedule.getTabAt(0).select();
            Bundle bundle = new Bundle();
            bundle.putString("Type", this.type);
            InterNationalFragment interNationalFragment = new InterNationalFragment();
            interNationalFragment.setArguments(bundle);
            loadFragment(interNationalFragment);
            this.tabLayout_UpSchedule.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {


                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    int position = tab.getPosition();
                    if (position == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString("Type", UpComingFragment.this.type);
                        InterNationalFragment interNationalFragment = new InterNationalFragment();
                        interNationalFragment.setArguments(bundle);
                        UpComingFragment.this.loadFragment(interNationalFragment);
                    } else if (position == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("Type", UpComingFragment.this.type);
                        DomesticFragment domesticFragment = new DomesticFragment();
                        domesticFragment.setArguments(bundle2);
                        UpComingFragment.this.loadFragment(domesticFragment);
                    }
                }
            });
        }
    }

    
  
    private void loadFragment(Fragment fragment) {
        if (myActivity != null) {
            FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frame_UpSchedule, fragment);
            beginTransaction.addToBackStack(null);
            beginTransaction.commit();
        }
    }

    @Override 
    public void onResume() {
        super.onResume();
    }
}
