package com.gsbusiness.livecricketscoreprediction.Activities.Ipl;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.gsbusiness.livecricketscoreprediction.Adapter.Ipl.AdapterIpl;

import com.gsbusiness.livecricketscoreprediction.Fragments.Ipl.IplMatchFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Ipl.IplPointTableFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Ipl.IplSquadsFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Ipl.IplStadiumFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Ipl.StatsFragment;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;

public class IplActivity extends AppCompatActivity {
    private static final String LOG = "<<<IplActivity>>>";
    FrameLayout frameLayout;
    String seriesId = "2220";
    TabLayout tabLayout;
    int tabNumber = 0;
    ArrayList<String> titles;
    TextView txt_title;
    ViewPager2 view_pager;

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
        setContentView(R.layout.activity_ipl);
        BannerIDCardAds();
        Intent intent = getIntent();
        if (intent != null) {
            this.tabNumber = intent.getIntExtra("tabNumber", 0);
        }
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                IplActivity.this.onBackPressed();
            }
        });
        TextView textView = (TextView) findViewById(R.id.txt_title);
        this.txt_title = textView;
        textView.setText("Indian Premier League, 2022");
        this.tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        this.frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        this.view_pager = (ViewPager2) findViewById(R.id.view_pager);
        ArrayList<String> arrayList = new ArrayList<>();
        this.titles = arrayList;
        arrayList.add("Matches");
        this.titles.add("Point Table");
        this.titles.add("Stats");
        this.titles.add("Squads");
        this.titles.add("Stadiums");
        setViewPagerAdapter();
        new TabLayoutMediator(this.tabLayout, this.view_pager, new TabLayoutMediator.TabConfigurationStrategy() {

            @Override
            public void onConfigureTab(TabLayout.Tab tab, int i) {
                tab.setText(IplActivity.this.titles.get(i));
            }
        }).attach();
        this.tabLayout.getTabAt(this.tabNumber).select();
    }

    public void setViewPagerAdapter() {
        AdapterIpl adapterIpl = new AdapterIpl(this);
        ArrayList<Fragment> arrayList = new ArrayList<>();
        Bundle bundle = new Bundle();
        bundle.putString("seriesId", this.seriesId);
        IplMatchFragment iplMatchFragment = new IplMatchFragment();
        iplMatchFragment.setArguments(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("seriesId", this.seriesId);
        IplPointTableFragment iplPointTableFragment = new IplPointTableFragment();
        iplPointTableFragment.setArguments(bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString("seriesId", this.seriesId);
        StatsFragment statsFragment = new StatsFragment();
        statsFragment.setArguments(bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putString("seriesId", this.seriesId);
        IplSquadsFragment iplSquadsFragment = new IplSquadsFragment();
        iplSquadsFragment.setArguments(bundle4);
        Bundle bundle5 = new Bundle();
        bundle5.putString("seriesId", this.seriesId);
        IplStadiumFragment iplStadiumFragment = new IplStadiumFragment();
        iplStadiumFragment.setArguments(bundle5);
        arrayList.add(iplMatchFragment);
        arrayList.add(iplPointTableFragment);
        arrayList.add(statsFragment);
        arrayList.add(iplSquadsFragment);
        arrayList.add(iplStadiumFragment);
        adapterIpl.setData(arrayList);
        this.view_pager.setAdapter(adapterIpl);
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        Glob.goToHome(this);
    }
}
