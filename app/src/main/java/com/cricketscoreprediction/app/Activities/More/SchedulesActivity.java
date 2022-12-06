package com.cricketscoreprediction.app.Activities.More;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;
import com.cricketscoreprediction.app.Activities.MainActivity;

import com.cricketscoreprediction.app.Fragments.Scheduled.LiveFragment;
import com.cricketscoreprediction.app.Fragments.Scheduled.ResultsFragment;
import com.cricketscoreprediction.app.Fragments.Scheduled.UpComingFragment;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;

public class SchedulesActivity extends AppCompatActivity {
    static final String LOG = "SchedulesActivity";
    TabLayout tabLayout_schedule;
    String where = "";
    LinearLayout adContainerView;
    AdView adViewone;

    public void BannerIDCardAds() {
        adContainerView = findViewById(R.id.adsmultyViews);
        adViewone = new AdView(getApplicationContext());
        adViewone.setAdUnitId(getString(R.string.AdMob_Banner));
        adContainerView.addView(adViewone);
        BannerLoad();
        adViewone.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

            }
        });
    }

    private void BannerLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        AdSize adSize = BannerGetSize();
        adViewone.setAdSize(adSize);
        adViewone.loadAd(adRequest);
    }

    private AdSize BannerGetSize() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }
    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_schedules);
        BannerIDCardAds();
        this.where = new Intent().getStringExtra("where");
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                SchedulesActivity.this.onBackPressed();
            }
        });
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout_schedule);
        this.tabLayout_schedule = tabLayout;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.upcoming));
        TabLayout tabLayout2 = this.tabLayout_schedule;
        tabLayout2.addTab(tabLayout2.newTab().setText(R.string.live));
        TabLayout tabLayout3 = this.tabLayout_schedule;
        tabLayout3.addTab(tabLayout3.newTab().setText(R.string.results));
        this.tabLayout_schedule.setTabGravity(0);
        this.tabLayout_schedule.getTabAt(0).select();
        loadFragment(UpComingFragment.newInstance(this));
        this.tabLayout_schedule.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

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
                    SchedulesActivity.this.loadFragment(UpComingFragment.newInstance(SchedulesActivity.this));
                } else if (position == 1) {
                    SchedulesActivity.this.loadFragment(LiveFragment.newInstance(SchedulesActivity.this));
                } else if (position == 2) {
                    SchedulesActivity.this.loadFragment(ResultsFragment.newInstance(SchedulesActivity.this));
                }
            }
        });
    }

    
  
    private void loadFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.frame_schedule, fragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("where", this.where);
        setResult(-1, intent);
        finish();
    }
}
