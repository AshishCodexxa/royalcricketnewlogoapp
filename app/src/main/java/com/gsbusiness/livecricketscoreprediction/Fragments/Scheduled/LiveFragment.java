package com.gsbusiness.livecricketscoreprediction.Fragments.Scheduled;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.tabs.TabLayout;

import com.gsbusiness.livecricketscoreprediction.R;

public class LiveFragment extends Fragment {
    private static Activity myActivity;
    TabLayout tabLayout_LiveSchedule;
    String type = "live";
    View view;

    public static LiveFragment newInstance(Activity activity) {
        LiveFragment liveFragment = new LiveFragment();
        myActivity = activity;
        return liveFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_live, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {
            TabLayout tabLayout = (TabLayout) this.view.findViewById(R.id.tabLayout_LiveSchedule);
            this.tabLayout_LiveSchedule = tabLayout;
            tabLayout.addTab(tabLayout.newTab().setText(R.string.international));
            TabLayout tabLayout2 = this.tabLayout_LiveSchedule;
            tabLayout2.addTab(tabLayout2.newTab().setText(R.string.domestic));
            this.tabLayout_LiveSchedule.setTabGravity(0);
            this.tabLayout_LiveSchedule.getTabAt(0).select();
            Bundle bundle = new Bundle();
            bundle.putString("Type", this.type);
            InterNationalLiveFragment interNationalLiveFragment = new InterNationalLiveFragment();
            interNationalLiveFragment.setArguments(bundle);
            loadFragment(interNationalLiveFragment);
            this.tabLayout_LiveSchedule.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

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
                        bundle.putString("Type", LiveFragment.this.type);
                        InterNationalLiveFragment interNationalLiveFragment = new InterNationalLiveFragment();
                        interNationalLiveFragment.setArguments(bundle);
                        LiveFragment.this.loadFragment(interNationalLiveFragment);
                    } else if (position == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("Type", LiveFragment.this.type);
                        DomesticScoreFragment domesticScoreFragment = new DomesticScoreFragment();
                        domesticScoreFragment.setArguments(bundle2);
                        LiveFragment.this.loadFragment(domesticScoreFragment);
                    }
                }
            });
        }
    }

    
  
    private void loadFragment(Fragment fragment) {
        if (myActivity != null) {
            FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frame_liveSchedule, fragment);
            beginTransaction.addToBackStack(null);
            beginTransaction.commit();
        }
    }

    @Override 
    public void onResume() {
        super.onResume();
    }

    @Override 
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
