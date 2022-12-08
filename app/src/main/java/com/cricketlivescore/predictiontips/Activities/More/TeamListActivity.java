package com.cricketlivescore.predictiontips.Activities.More;

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

import com.cricketlivescore.predictiontips.Activities.MainActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;

import com.cricketlivescore.predictiontips.Fragments.More.Teams.IntTeamsFragment;
import com.cricketlivescore.predictiontips.Fragments.More.Teams.OtherLeaguesFragment;
import com.cricketlivescore.predictiontips.R;

public class TeamListActivity extends AppCompatActivity {
    static final String LOG = "PlayerListActivity";
    TabLayout tabLayout_teams;
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
        setContentView(R.layout.activity_team_list);
        BannerIDCardAds();
        this.where = new Intent().getStringExtra("where");
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                TeamListActivity.this.onBackPressed();
            }
        });
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout_teams);
        this.tabLayout_teams = tabLayout;
        tabLayout.addTab(tabLayout.newTab().setText(R.string.international));
        TabLayout tabLayout2 = this.tabLayout_teams;
        tabLayout2.addTab(tabLayout2.newTab().setText(R.string.otherleagues));
        this.tabLayout_teams.setTabGravity(0);
        this.tabLayout_teams.getTabAt(0).select();
        loadFragment(IntTeamsFragment.newInstance(this));
        this.tabLayout_teams.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

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
                    TeamListActivity.this.loadFragment(IntTeamsFragment.newInstance(TeamListActivity.this));
                } else if (position == 1) {
                    TeamListActivity.this.loadFragment(OtherLeaguesFragment.newInstance(TeamListActivity.this));
                }
            }
        });
    }

    
  
    private void loadFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.frameLayout_teams, fragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }

    @Override 
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("where", this.where);
        setResult(-1, intent);
        finish();
    }
}
