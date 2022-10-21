package com.gsbusiness.livecricketscoreprediction.Activities.Ipl;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

public class FieldingStatsActivity extends AppCompatActivity {
    public static String LOG = "<<<FieldingStatsActivity>>>";
    ImageView img_mostCatches;
    ImageView img_mostDis;
    ImageView img_mostRunOut;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                FieldingStatsActivity fieldingStatsActivity = FieldingStatsActivity.this;
                fieldingStatsActivity.onNext(fieldingStatsActivity.whereLocal);
                return;
            }
            FieldingStatsActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    TextView txt_mostCatches;
    TextView txt_mostCatches_playerName;
    TextView txt_mostCatches_playerTeam;
    TextView txt_mostDis;
    TextView txt_mostDis_playerName;
    TextView txt_mostDis_playerTeam;
    TextView txt_mostRunOut;
    TextView txt_mostRunOut_playerName;
    TextView txt_mostRunOut_playerTeam;
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
        setContentView(R.layout.activity_fielding_stats);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                FieldingStatsActivity.this.onBackPressed();
            }
        });
        this.img_mostCatches = (ImageView) findViewById(R.id.img_mostCatches);
        this.txt_mostCatches = (TextView) findViewById(R.id.txt_mostCatches);
        this.txt_mostCatches_playerName = (TextView) findViewById(R.id.txt_mostCatches_playerName);
        this.txt_mostCatches_playerTeam = (TextView) findViewById(R.id.txt_mostCatches_playerTeam);
        this.img_mostRunOut = (ImageView) findViewById(R.id.img_mostRunOut);
        this.txt_mostRunOut = (TextView) findViewById(R.id.txt_mostRunOut);
        this.txt_mostRunOut_playerName = (TextView) findViewById(R.id.txt_mostRunOut_playerName);
        this.txt_mostRunOut_playerTeam = (TextView) findViewById(R.id.txt_mostRunOut_playerTeam);
        this.img_mostDis = (ImageView) findViewById(R.id.img_mostDis);
        this.txt_mostDis = (TextView) findViewById(R.id.txt_mostDis);
        this.txt_mostDis_playerName = (TextView) findViewById(R.id.txt_mostDis_playerName);
        this.txt_mostDis_playerTeam = (TextView) findViewById(R.id.txt_mostDis_playerTeam);
        setStats();
        findViewById(R.id.card_most_catches).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMostCatches(v);

            }
        });
        findViewById(R.id.ll_most_runout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMostRunout(v);

            }
        });
        findViewById(R.id.ll_most_dismissals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMostDismissal(v);

            }
        });
    }

    private void setStats() {
        if (Glob.fieldingStatsList != null) {
            if (Glob.fieldingStatsList.Most_Catches() != null) {
                RequestManager with = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + Glob.fieldingStatsList.Most_Catches().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_mostCatches);
                this.txt_mostCatches.setText(Glob.fieldingStatsList.Most_Catches().get(0).most_catches());
                this.txt_mostCatches_playerName.setText(Glob.fieldingStatsList.Most_Catches().get(0).player_name());
                this.txt_mostCatches_playerTeam.setText(Glob.fieldingStatsList.Most_Catches().get(0).team_short_name());
            }
            if (Glob.fieldingStatsList.Most_Run_Outs() != null) {
                RequestManager with2 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with2.load(Glob.player_start + Glob.fieldingStatsList.Most_Run_Outs().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_mostRunOut);
                this.txt_mostRunOut.setText(Glob.fieldingStatsList.Most_Run_Outs().get(0).most_run_outs());
                this.txt_mostRunOut_playerName.setText(Glob.fieldingStatsList.Most_Run_Outs().get(0).player_name());
                this.txt_mostRunOut_playerTeam.setText(Glob.fieldingStatsList.Most_Run_Outs().get(0).team_short_name());
            }
            if (Glob.fieldingStatsList.Most_Dismissals() != null) {
                RequestManager with3 = Glide.with((FragmentActivity) this);
                ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + Glob.fieldingStatsList.Most_Dismissals().get(0).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_mostDis);
                this.txt_mostDis.setText(Glob.fieldingStatsList.Most_Dismissals().get(0).most_dismissals());
                this.txt_mostDis_playerName.setText(Glob.fieldingStatsList.Most_Dismissals().get(0).player_name());
                this.txt_mostDis_playerTeam.setText(Glob.fieldingStatsList.Most_Dismissals().get(0).team_short_name());
            }
        }
    }

    
    public void OnClickMostDismissal(View view) {
        onShowInterstitialAd("OnClickMostDismissal");
    }

    
    public void OnClickMostRunout(View view) {
        onShowInterstitialAd("OnClickMostRunout");
    }

    
    public void OnClickMostCatches(View view) {
        onShowInterstitialAd("OnClickMostCatches");
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
            case -1595079185:
                if (str.equals("OnClickMostRunout")) {
                    c = 0;
                    break;
                }
                break;
            case 684128169:
                if (str.equals("OnClickMostDismissal")) {
                    c = 1;
                    break;
                }
                break;
            case 1097087261:
                if (str.equals("OnClickMostCatches")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this, FieldingActivity.class);
                intent.putExtra("statsType", "mostRunOut");
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this, FieldingActivity.class);
                intent2.putExtra("statsType", "mostDismissals");
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this, FieldingActivity.class);
                intent3.putExtra("statsType", "mostCatch");
                startActivity(intent3);
                return;
            default:
                return;
        }
    }

}
