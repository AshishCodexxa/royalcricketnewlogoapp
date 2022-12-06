package com.cricketscoreprediction.app.Fragments.Scheduled;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.tabs.TabLayout;

import com.cricketscoreprediction.app.R;

public class ResultsFragment extends Fragment {
    private static Activity myActivity;
    TabLayout tabLayout_ResultSchedule;
    String type = "completed";
    View view;

    public static ResultsFragment newInstance(Activity activity) {
        ResultsFragment resultsFragment = new ResultsFragment();
        myActivity = activity;
        return resultsFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_results, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {
            TabLayout tabLayout = (TabLayout) this.view.findViewById(R.id.tabLayout_ResultSchedule);
            this.tabLayout_ResultSchedule = tabLayout;
            tabLayout.addTab(tabLayout.newTab().setText(R.string.international));
            TabLayout tabLayout2 = this.tabLayout_ResultSchedule;
            tabLayout2.addTab(tabLayout2.newTab().setText(R.string.domestic));
            this.tabLayout_ResultSchedule.setTabGravity(0);
            this.tabLayout_ResultSchedule.getTabAt(0).select();
            Bundle bundle = new Bundle();
            bundle.putString("Type", this.type);
            InterNationalLiveFragment interNationalLiveFragment = new InterNationalLiveFragment();
            interNationalLiveFragment.setArguments(bundle);
            loadFragment(interNationalLiveFragment);
            this.tabLayout_ResultSchedule.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

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
                        bundle.putString("Type", ResultsFragment.this.type);
                        InterNationalLiveFragment interNationalLiveFragment = new InterNationalLiveFragment();
                        interNationalLiveFragment.setArguments(bundle);
                        ResultsFragment.this.loadFragment(interNationalLiveFragment);
                    } else if (position == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("Type", ResultsFragment.this.type);
                        DomesticScoreFragment domesticScoreFragment = new DomesticScoreFragment();
                        domesticScoreFragment.setArguments(bundle2);
                        ResultsFragment.this.loadFragment(domesticScoreFragment);
                    }
                }
            });
        }
    }

    
  
    private void loadFragment(Fragment fragment) {
        if (myActivity != null) {
            FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frame_resultSchedule, fragment);
            beginTransaction.addToBackStack(null);
            beginTransaction.commit();
        }
    }

    @Override 
    public void onResume() {
        super.onResume();
    }
}
