package com.cricketlivescore.predictiontips.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cricketlivescore.predictiontips.Ads.AESUtils;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.cricketlivescore.predictiontips.Activities.Starts.FirstActivity;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;


public class SplashActivity extends AppCompatActivity {

    AppPreference appPreference;

    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {


        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                SplashActivity.this.init();
            }
        }
    });

    InterstitialAd mMobInterstitialAds;

    public void InterstitialLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RequestConfiguration configuration = new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("1ADAD30F02CD84CDE72190C2ABE5EB5E")).build();
        MobileAds.setRequestConfiguration(configuration);
        InterstitialAd.load(getApplicationContext(), getString(R.string.AdMob_Interstitial), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                SplashActivity.this.mMobInterstitialAds = interstitialAd;
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
            this.mMobInterstitialAds.show(SplashActivity.this);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_splash);
        InterstitialLoad();
        Glob.ralewayfont = Typeface.createFromAsset(getAssets(), "ralewayfont.ttf");
        Glob.boldralway = Typeface.createFromAsset(getAssets(), "ralewaybold.ttf");
        Glob.montserrat_medium = Typeface.createFromAsset(getAssets(), "montserrat_medium.ttf");
        Glob.montserrat_extra_bold = Typeface.createFromAsset(getAssets(), "montserrat_extra_bold.ttf");
        Glob.oswald_medium = Typeface.createFromAsset(getAssets(), "oswald_medium.ttf");
        if (Glob.isOnline(this)) {
            this.appPreference = new AppPreference(getApplicationContext());
            SplashActivity.this.getSplashData();
            return;
        }
        Glob.noInternetDialogShowActivity(this);
    }


    private void getSplashData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, Glob._Start, new Response.Listener<String>() {

            public void onResponse(String str) {
                if (str != null || !str.equals("")) {
                    try {
                        String decrypt = AESUtils.decrypt(new JSONObject(str).getString("data"));
                        Log.d("", decrypt);
                        SplashActivity.this.onValueToVariable(decrypt);
                    } catch (JSONException e) {
                        Glob.log("getSplashData" + " JSONException:", e.getMessage());
                        SplashActivity.this.onValueToVariableLocal();
                        new Handler().postDelayed(new Runnable() {

                            public void run() {
                                SplashActivity.this.openImageBanner();
                            }
                        }, 1000);
                    }
                } else {
                    Glob.log("getSplashData" + " response is empty:", "");
                    SplashActivity.this.onValueToVariableLocal();
                    new Handler().postDelayed(new Runnable() {

                        public void run() {
                            SplashActivity.this.openImageBanner();
                        }
                    }, 1000);
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Glob.log("getSplashData" + " GetError:", volleyError + "");
                SplashActivity.this.onValueToVariableLocal();
                new Handler().postDelayed(new Runnable() {

                    public void run() {
                        SplashActivity.this.openImageBanner();
                    }
                }, 1000);
            }
        }));
    }


    private void onValueToVariableLocal() {
        JSONArray jSONArray = new JSONArray();

        Glob.adCountInCategory = 0;
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("imgbanner");
        this.appPreference.setString("app_title", "");
        this.appPreference.setString("isYoutubeEnable", "n");
        this.appPreference.setString("isActivitySkip", "y");
        this.appPreference.setString("moreapp_json", "");
        Glob.log("GLOBS_onValueToVariable", "---End----");
        this.appPreference.setJsonArray("img_url_splash", jSONArray);
        this.appPreference.setString("weblink", "");
        this.appPreference.setString("package_name", "");
        this.appPreference.setString("is_image_playstore", "n");
        this.appPreference.setString("is_slider_one_url", "");
        this.appPreference.setString("is_slider_two_url", "");
        this.appPreference.setString("is_more_app", "n");
        this.appPreference.setString("is_slider_one", "n");
        this.appPreference.setString("is_slider_two", "n");
    }


    private void onValueToVariable(String str) throws JSONException {

        try {
            JSONArray jSONArray = new JSONArray(str);
            String str24 = "native_priority_";
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.appPreference.setString("app_title", jSONObject.getString("app_title"));
                this.appPreference.setString("isActivitySkip", jSONObject.getString("isActivitySkip"));
                init();

                i++;
            }
        } catch (JSONException e) {
            Glob.log("onValueToVariable", e + "");
            onValueToVariableLocal();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    SplashActivity.this.openImageBanner();
                }
            }, 1000);
        }
    }


    private void init() {
        if (Glob.checkPermission(this)) {
            String string = this.appPreference.getString("isActivitySkip");
            if (string == null || !string.equalsIgnoreCase("y")) {
                Intent intent = new Intent(this, FirstActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return;
            }
            Glob.goToHome(this);
            ShowFunUAds();
            return;
        }
        Intent intent2 = new Intent(this, PermissionActivity.class);
        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent2);
        finish();
    }

    public void openImageBanner() {
        String banner = Glob.getBanner(this.appPreference.getJsonArray("img_url_splash"));
        if (banner == null || banner.matches("")) {
            Glob.logFirebase(this, "SplashActivity", "openImageBanner", "Image Banner Blank");
            init();
            return;
        }
        Intent intent = new Intent(this, SplashImageActivity.class);
        intent.putExtra("where", "splash");
        this.someActivityResultLauncher.launch(intent);
    }


    @Override
    public void onBackPressed() {
        init();
    }
}
