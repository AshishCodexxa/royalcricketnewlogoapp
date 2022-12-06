package com.cricketscoreprediction.app.Activities.Criclytics;

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
import com.cricketscoreprediction.app.Activities.TestAdActivity;

import com.cricketscoreprediction.app.Fragments.Criclytics.GameChangeFragment;
import com.cricketscoreprediction.app.Fragments.Criclytics.MatchStatesFragment;
import com.cricketscoreprediction.app.Fragments.Criclytics.ReportCardFragment;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;

public class CriclyticsCompleteActivity extends AppCompatActivity {
    public static String LOG = "<<<CriclyticsCompleteActivity>>>";
    String currentInnings = "";
    FrameLayout frameLayout;
    ImageView img_back;
    ImageView img_game_change;
    ImageView img_match_state;
    ImageView img_report_card;
    ImageView img_share;
    LinearLayout ll_game_change;
    LinearLayout ll_match_state;
    LinearLayout ll_report_card;
    String matchId = "";
    String matchStatus = "";
    String matchType = "";
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                CriclyticsCompleteActivity criclyticsCompleteActivity = CriclyticsCompleteActivity.this;
                criclyticsCompleteActivity.onNext(criclyticsCompleteActivity.whereLocal);
                return;
            }
            CriclyticsCompleteActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    String selectedTab = "";
    TextView toobarTitle;
    TextView txt_game_change;
    TextView txt_match_state;
    TextView txt_report_card;
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
        setContentView(R.layout.activity_criclytics_complete);
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
        this.selectedTab = "matchState";
        this.ll_match_state = (LinearLayout) findViewById(R.id.ll_match_state);
        this.img_match_state = (ImageView) findViewById(R.id.img_match_state);
        this.txt_match_state = (TextView) findViewById(R.id.txt_match_state);
        this.ll_match_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMatchState(v);
            }
        });
        this.ll_report_card = (LinearLayout) findViewById(R.id.ll_report_card);
        this.img_report_card = (ImageView) findViewById(R.id.img_report_card);
        this.txt_report_card = (TextView) findViewById(R.id.txt_report_card);
        this.ll_report_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickReportCard(v);
            }
        });
        this.ll_game_change = (LinearLayout) findViewById(R.id.ll_game_change);
        this.img_game_change = (ImageView) findViewById(R.id.img_game_change);
        this.txt_game_change = (TextView) findViewById(R.id.txt_game_change);
        this.ll_game_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGameChange(v);
            }
        });
        MatchStatesFragment matchStatesFragment = new MatchStatesFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Glob.MATCH_ID, this.matchId);
        bundle.putString(Glob.INNINGS, this.currentInnings);
        bundle.putString(Glob.TYPES, this.matchType);
        matchStatesFragment.setArguments(bundle);
        loadFragment(matchStatesFragment);
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


    public void onClickMatchState(View view) {
        if (!this.selectedTab.equals("matchState")) {
            this.selectedTab = "matchState";
            onShowInterstitialAd("matchState");
        }
    }


    public void onClickReportCard(View view) {
        if (!this.selectedTab.equals("reportCard")) {
            this.selectedTab = "reportCard";
            onShowInterstitialAd("reportCard");
        }
    }


    public void onClickGameChange(View view) {
        if (!this.selectedTab.equals("gameChange")) {
            this.selectedTab = "gameChange";
            onShowInterstitialAd("gameChange");
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
            case 158076482:
                if (str.equals("gameChange")) {
                    c = 0;
                    break;
                }
                break;
            case 1854164428:
                if (str.equals("matchState")) {
                    c = 1;
                    break;
                }
                break;
            case 1930857060:
                if (str.equals("reportCard")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.ll_game_change.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_game_change.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_match_state.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_match_state.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_report_card.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_report_card.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_game_change.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_match_state.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_report_card.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                GameChangeFragment gameChangeFragment = new GameChangeFragment();
                Bundle bundle = new Bundle();
                bundle.putString(Glob.MATCH_ID, this.matchId);
                bundle.putString(Glob.INNINGS, this.currentInnings);
                bundle.putString(Glob.TYPES, this.matchType);
                gameChangeFragment.setArguments(bundle);
                loadFragment(gameChangeFragment);
                return;
            case 1:
                this.ll_match_state.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_match_state.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_report_card.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_report_card.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_game_change.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_game_change.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_match_state.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_report_card.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_game_change.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                MatchStatesFragment matchStatesFragment = new MatchStatesFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString(Glob.MATCH_ID, this.matchId);
                bundle2.putString(Glob.INNINGS, this.currentInnings);
                bundle2.putString(Glob.TYPES, this.matchType);
                matchStatesFragment.setArguments(bundle2);
                loadFragment(matchStatesFragment);
                return;
            case 2:
                this.ll_report_card.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_top_toolbar, getTheme()));
                this.txt_report_card.setTextColor(ResourcesCompat.getColor(getResources(), R.color.textWhite, getTheme()));
                this.ll_match_state.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_match_state.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                this.ll_game_change.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.back_criclytics, getTheme()));
                this.txt_game_change.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorTextBlack, getTheme()));
                if (Build.VERSION.SDK_INT >= 21) {
                    this.img_report_card.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.white, getTheme())));
                    this.img_match_state.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                    this.img_game_change.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(), R.color.gray_ad_border, getTheme())));
                }
                ReportCardFragment reportCardFragment = new ReportCardFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putString(Glob.MATCH_ID, this.matchId);
                bundle3.putString(Glob.INNINGS, this.currentInnings);
                bundle3.putString(Glob.TYPES, this.matchType);
                reportCardFragment.setArguments(bundle3);
                loadFragment(reportCardFragment);
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
}
