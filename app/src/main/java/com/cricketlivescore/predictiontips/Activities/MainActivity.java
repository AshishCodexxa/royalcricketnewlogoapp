package com.cricketlivescore.predictiontips.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.cricketlivescore.predictiontips.Activities.Criclytics.CriclyticsActivity;
import com.cricketlivescore.predictiontips.Fragments.ScoreFragment;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.cricketlivescore.predictiontips.Activities.Ipl.IplActivity;
import com.cricketlivescore.predictiontips.Activities.More.SchedulesActivity;
import com.cricketlivescore.predictiontips.Activities.More.TeamListActivity;
import com.cricketlivescore.predictiontips.Activities.News.NewsActivity;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    static final String TAG = "LogMainActivity";
    AppPreference appPreference;
    String app_title = "";
    BottomNavigationView navigation;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.onNext(mainActivity.whereLocal);
                return;
            }
            MainActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RelativeLayout rv_toolbar;
    String whereLocal;
    String whichFragment;

    InterstitialAd mMobInterstitialAds;

    public void InterstitialLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RequestConfiguration configuration = new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("1ADAD30F02CD84CDE72190C2ABE5EB5E")).build();
        MobileAds.setRequestConfiguration(configuration);
        InterstitialAd.load(getApplicationContext(), getString(R.string.AdMob_Interstitial), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                MainActivity.this.mMobInterstitialAds = interstitialAd;
                interstitialAd.setFullScreenContentCallback(
                        new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {

                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {

                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                            }
                        });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            }
        });
    }

    private void ShowFunUAds() {
        if (this.mMobInterstitialAds != null) {
            this.mMobInterstitialAds.show(MainActivity.this);
        }
    }

    TextView toobarTitle;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        InterstitialLoad();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        onInitView();
        Glob.showInappReview(this);
    }

    private void onInitView() {
        this.navigation = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        AppPreference appPreference2 = new AppPreference(this);
        this.appPreference = appPreference2;
        this.app_title = this.appPreference.getString("app_title");
//        toobarTitle = findViewById(R.id.toobarTitle);
//        toobarTitle.setText(app_title);

        this.rv_toolbar = (RelativeLayout) findViewById(R.id.rv_toolbar);

        ScoreFragment newInstance = ScoreFragment.newInstance(this);
        this.whichFragment = "nav_score";
        loadFragment(newInstance);
        this.navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.news:
                        if (!MainActivity.this.whichFragment.equals("onPrivacy")) {
                            MainActivity.this.onShowInterstitialAd("onPrivacy");
                        }
                        return true;
                    case R.id.nav_fantasy:
                        if (!MainActivity.this.whichFragment.equals("nav_fantasy")) {
                            MainActivity.this.onShowInterstitialAd("nav_fantasy");
                        }
                        return true;
                    case R.id.nav_more:
                        if (!MainActivity.this.whichFragment.equals("nav_more")) {
                            MainActivity.this.onShowInterstitialAd("nav_more");
                        }
                        return true;
                    case R.id.nav_schedule:
                        if (!MainActivity.this.whichFragment.equals("nav_schedule")) {
                            MainActivity.this.onShowInterstitialAd("nav_schedule");
                        }
                        return true;
                    case R.id.nav_score:
                        if (!MainActivity.this.whichFragment.equals("nav_score")) {
                            MainActivity.this.onShowInterstitialAd("nav_score");
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.frame_container, fragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }


    @Override
    public void onBackPressed() {
        if (this.navigation.getSelectedItemId() != R.id.nav_score) {
            this.navigation.setSelectedItemId(R.id.nav_score);
        } else {
            if (doubleBackToExitPressedOnce) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "double tap to exit!", Toast.LENGTH_SHORT).show();
            new Handler(Looper.getMainLooper()).postDelayed(() -> doubleBackToExitPressedOnce = false, 2000);

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
            case -2011039657:
                if (str.equals("nav_criclytics")) {
                    c = 0;
                    break;
                }
                break;
            case 477668470:
                if (str.equals("nav_score")) {
                    c = 1;
                    break;
                }
                break;
            case 542091136:
                if (str.equals("onAppList")) {
                    c = 2;
                    break;
                }
                break;
            case 767130634:
                if (str.equals("nav_fantasy")) {
                    c = 3;
                    break;
                }
                break;
            case 782414387:
                if (str.equals("nav_schedule")) {
                    c = 4;
                    break;
                }
                break;
            case 1021781161:
                if (str.equals("onPrivacy")) {
                    c = 5;
                    break;
                }
                break;
            case 1730094857:
                if (str.equals("nav_ipl")) {
                    c = 6;
                    break;
                }
                break;
            case 2093451505:
                if (str.equals("nav_more")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this, CriclyticsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                ShowFunUAds();
                return;
            case 1:
                loadFragment(ScoreFragment.newInstance(this));
                if (this.rv_toolbar.getVisibility() == View.GONE) {
                    this.rv_toolbar.setVisibility(View.VISIBLE);
                }
                this.whichFragment = str;
                return;
            case 2:

                return;
            case 3:
                Intent intent5 = new Intent(this, IplActivity.class);
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent5);
                ShowFunUAds();

                return;
            case 4:
                Intent intent3 = new Intent(this, SchedulesActivity.class);
                intent3.putExtra("where", "nav_score");
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.resultLauncher.launch(intent3);
                this.navigation.setSelectedItemId(R.id.nav_score);
                return;
            case 5:
                startActivity(new Intent(MainActivity.this, NewsActivity.class));
                this.navigation.setSelectedItemId(R.id.nav_score);
                return;
            case 6:

                return;
            case 7:
                Intent intent1 = new Intent(this, TeamListActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
                ShowFunUAds();
                this.navigation.setSelectedItemId(R.id.nav_score);


                return;
            default:
                return;
        }
    }


}
