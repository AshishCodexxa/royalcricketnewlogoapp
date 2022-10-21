package com.gsbusiness.livecricketscoreprediction.Activities.Criclytics;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;

import com.gsbusiness.livecricketscoreprediction.Fragments.Criclytics.KeyStatsFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Criclytics.MatchUpsFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.Criclytics.PlayerProjectionFragment;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

public class CriclyticsUCActivity extends AppCompatActivity {
    public static String LOG = "<<<CriclyticsUCActivity>>>";
    String currentInnings = "";
    FrameLayout frameLayout;
    ImageView img_back;
    ImageView img_key_stat;
    ImageView img_player_match_ups;
    ImageView img_player_projection;
    ImageView img_share;
    LinearLayout ll_key_stat;
    LinearLayout ll_player_match_ups;
    LinearLayout ll_player_projection;
    String matchId = "";
    String matchStatus = "";
    String matchType = "";
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                CriclyticsUCActivity criclyticsUCActivity = CriclyticsUCActivity.this;
                criclyticsUCActivity.onNext(criclyticsUCActivity.whereLocal);
                return;
            }
            CriclyticsUCActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    String selectedTab = "";
    TextView toobarTitle;
    TextView txt_key_stat;
    TextView txt_player_match_ups;
    TextView txt_player_projection;
    String whereLocal = "";

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
        setContentView(R.layout.activity_criclytics_ucactivity);
        BannerIDCardAds();
        Intent intent = getIntent();
        this.matchId = intent.getStringExtra(Glob.MATCH_ID);
        this.currentInnings = intent.getStringExtra(Glob.INNINGS);
        this.matchType = intent.getStringExtra(Glob.TYPES);
        this.matchStatus = intent.getStringExtra(Glob.MATCH_STATUS);
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        String str = LOG;
        Glob.log(str, this.matchId + " : " + this.currentInnings + " : " + this.matchType + " : " + this.matchStatus);
        initView();
    }

    private void initView() {
        this.frameLayout = (FrameLayout) findViewById(R.id.container);
        this.selectedTab = "key";
        this.ll_key_stat = (LinearLayout) findViewById(R.id.ll_key_stat);
        this.img_key_stat = (ImageView) findViewById(R.id.img_key_stat);
        this.txt_key_stat = (TextView) findViewById(R.id.txt_key_stat);
        this.ll_key_stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickKeyStats(v);
            }
        });
        this.ll_player_projection = (LinearLayout) findViewById(R.id.ll_player_projection);
        this.img_player_projection = (ImageView) findViewById(R.id.img_player_projection);
        this.txt_player_projection = (TextView) findViewById(R.id.txt_player_projection);
        this.ll_player_projection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickPlayerProjection(v);
            }
        });
        this.ll_player_match_ups = (LinearLayout) findViewById(R.id.ll_player_match_ups);
        this.img_player_match_ups = (ImageView) findViewById(R.id.img_player_match_ups);
        this.txt_player_match_ups = (TextView) findViewById(R.id.txt_player_match_ups);
        this.ll_player_match_ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickPlayerMatchUps(v);
            }
        });
        KeyStatsFragment keyStatsFragment = new KeyStatsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Glob.MATCH_ID, this.matchId);
        bundle.putString(Glob.INNINGS, this.currentInnings);
        bundle.putString(Glob.TYPES, this.matchType);
        keyStatsFragment.setArguments(bundle);
        loadFragment(keyStatsFragment);
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.img_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.img_share);
        this.img_share = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onShareApp(v);
            }
        });
        this.toobarTitle = (TextView) findViewById(R.id.toobarTitle);
    }

    
    public void onClickKeyStats(View view) {
        if (!this.selectedTab.equals("key")) {
            this.selectedTab = "key";
            onShowInterstitialAd("key");
        }
    }

    
    public void onClickPlayerProjection(View view) {
        if (!this.selectedTab.equals("playerP")) {
            this.selectedTab = "playerP";
            onShowInterstitialAd("playerP");
        }
    }

    
    public void onClickPlayerMatchUps(View view) {
        if (!this.selectedTab.equals("playerMatchUp")) {
            this.selectedTab = "playerMatchUp";
            onShowInterstitialAd("playerMatchUp");
        }
    }

    private void loadFragment(Fragment fragment) {
        Glob.freeMemory();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container, fragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }

    
    public void onShareApp(View view) {
        String string = new AppPreference(this).getString("app_title");
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            intent.putExtra("android.intent.extra.SUBJECT", string);
            intent.putExtra("android.intent.extra.TEXT", Glob.share_app_text + Glob.front_link_playstore + getPackageName());
            startActivity(Intent.createChooser(intent, "choose one"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
            return;
        }
        this.whereLocal = str;
        Intent intent = new Intent(this, TestAdActivity.class);
        intent.putExtra("where", str);
        this.resultLauncher.launch(intent);
    }

    
  
    private void onNext(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -801131233:
                if (str.equals("playerMatchUp")) {
                    c = 0;
                    break;
                }
                break;
            case -493567601:
                if (str.equals("playerP")) {
                    c = 1;
                    break;
                }
                break;
            case 106079:
                if (str.equals("key")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.ll_player_match_ups.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_player_match_ups.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_key_stat.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_key_stat.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_player_projection.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_player_projection.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_player_match_ups.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_key_stat.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_player_projection.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                MatchUpsFragment matchUpsFragment = new MatchUpsFragment();
                Bundle bundle = new Bundle();
                bundle.putString(Glob.MATCH_ID, this.matchId);
                bundle.putString(Glob.INNINGS, this.currentInnings);
                bundle.putString(Glob.TYPES, this.matchType);
                matchUpsFragment.setArguments(bundle);
                loadFragment(matchUpsFragment);
                return;
            case 1:
                this.txt_player_projection.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_player_projection.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_key_stat.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_key_stat.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_player_match_ups.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_player_match_ups.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_player_projection.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_key_stat.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_player_match_ups.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                PlayerProjectionFragment playerProjectionFragment = new PlayerProjectionFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString(Glob.MATCH_ID, this.matchId);
                bundle2.putString(Glob.INNINGS, this.currentInnings);
                bundle2.putString(Glob.TYPES, this.matchType);
                playerProjectionFragment.setArguments(bundle2);
                loadFragment(playerProjectionFragment);
                return;
            case 2:
                this.txt_key_stat.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_key_stat.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_player_projection.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_player_projection.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_player_match_ups.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_player_match_ups.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_key_stat.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_player_projection.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_player_match_ups.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                KeyStatsFragment keyStatsFragment = new KeyStatsFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putString(Glob.MATCH_ID, this.matchId);
                bundle3.putString(Glob.INNINGS, this.currentInnings);
                bundle3.putString(Glob.TYPES, this.matchType);
                keyStatsFragment.setArguments(bundle3);
                loadFragment(keyStatsFragment);
                return;
            default:
                return;
        }
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        this.frameLayout.removeAllViewsInLayout();
        finish();
    }

    public void freeMemory() {
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }
}
