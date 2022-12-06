package com.cricketscoreprediction.app.Activities.Ipl;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterBestAvg;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterBestSR;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterHighestRuns;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterMost4s;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterMost50s;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterMost6s;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterMostRuns;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;

public class BattingActivity extends AppCompatActivity {
    String statsType = "";
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
        setContentView(R.layout.activity_batting);
        BannerIDCardAds();
        this.statsType = getIntent().getStringExtra("statsType");
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                BattingActivity.this.onBackPressed();
            }
        });
        if (this.statsType.equals("mostRuns")) {
            findViewById(R.id.ll_most_runs).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_most_runs);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView.setAdapter(new AdapterMostRuns(this, Glob.battingStatsList.Most_Runs(), new AdapterMostRuns.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("highestScore")) {
            findViewById(R.id.ll_highest_score).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_highest_score);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView2.setAdapter(new AdapterHighestRuns(this, Glob.battingStatsList.Highest_Score(), new AdapterHighestRuns.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("most50")) {
            findViewById(R.id.ll_most_50).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rv_most_50);
            recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView3.setAdapter(new AdapterMost50s(this, Glob.battingStatsList.Most_Fifties(), new AdapterMost50s.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("most4s")) {
            findViewById(R.id.ll_most_4s).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_most_4s);
            recyclerView4.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView4.setAdapter(new AdapterMost4s(this, Glob.battingStatsList.Most_4s(), new AdapterMost4s.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("most6s")) {
            findViewById(R.id.ll_most_6s).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.rv_most_6s);
            recyclerView5.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView5.setAdapter(new AdapterMost6s(this, Glob.battingStatsList.Most_6s(), new AdapterMost6s.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestAvg")) {
            findViewById(R.id.ll_best_avg).setVisibility(View.VISIBLE);
            ;
            RecyclerView recyclerView6 = (RecyclerView) findViewById(R.id.rv_best_avg);
            recyclerView6.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView6.setAdapter(new AdapterBestAvg(this, Glob.battingStatsList.Best_Batting_Average(), new AdapterBestAvg.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestSR")) {
            findViewById(R.id.ll_best_sr).setVisibility(View.VISIBLE);

            RecyclerView recyclerView7 = (RecyclerView) findViewById(R.id.rv_best_sr);
            recyclerView7.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView7.setAdapter(new AdapterBestSR(this, Glob.battingStatsList.Best_Strike_Rate(), new AdapterBestSR.OnItemClickListener() {
                @Override

                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BattingActivity.this, str);
                }
            }));
        }
    }

}
