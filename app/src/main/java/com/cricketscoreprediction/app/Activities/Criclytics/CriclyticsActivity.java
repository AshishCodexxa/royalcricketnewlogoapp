package com.cricketscoreprediction.app.Activities.Criclytics;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.Criclytics.AdapterCriclyticsMatch;
import com.cricketscoreprediction.app.FeaturematchQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;

public class CriclyticsActivity extends AppCompatActivity {
    private static final String LOG = "<<<CriclyticsFragment>>>";
    AdapterCriclyticsMatch adapterCriclyticsMatchCompleted;
    AdapterCriclyticsMatch adapterCriclyticsMatchLive;
    AdapterCriclyticsMatch adapterCriclyticsMatchUpComing;
    ArrayList<FeaturematchQuery.Featurematch> completedMatchs;
    String currentInnings;
    Handler handler = new Handler();
    ArrayList<FeaturematchQuery.Featurematch> liveMatchs;
    LinearLayout ll_completed;
    LinearLayout ll_live;
    LinearLayout ll_prediction;
    LinearLayout ll_upcoming;
    ImageButton fabs;
    String matchId;
    String matchType;
    ProgressBar progressBar;
    Runnable refresh;
    ImageView whats;

    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                CriclyticsActivity criclyticsActivity = CriclyticsActivity.this;
                criclyticsActivity.onNext(criclyticsActivity.whereLocal);
                return;
            }
            CriclyticsActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    private RecyclerView slider_criclytics_completed;
    private RecyclerView slider_criclytics_live;
    private RecyclerView slider_criclytics_upcoming;
    ArrayList<FeaturematchQuery.Featurematch> upComingMatchs;
    String whereLocal;

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
        setContentView(R.layout.activity_criclytics);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();

    }

    private void initView() {


        this.fabs = findViewById(R.id.fab);
        this.whats = findViewById(R.id.clickWhatsApp);


        fabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "wa.link/reddyannaofficial";

                try{
                    PackageManager pm = getApplicationContext().getPackageManager();
                    pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);

                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }

            }
        });

        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "wa.link/reddyannaofficial";

                try{
                    PackageManager pm = getApplicationContext().getPackageManager();
                    pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);

                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }

            }
        });

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        findViewById(R.id.img_share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = new AppPreference(getApplicationContext()).getString("app_title");
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
        });
        this.ll_prediction = (LinearLayout) findViewById(R.id.ll_prediction);
        this.ll_upcoming = (LinearLayout) findViewById(R.id.ll_upcoming);
        this.ll_live = (LinearLayout) findViewById(R.id.ll_live);
        this.ll_completed = (LinearLayout) findViewById(R.id.ll_completed);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.liveMatchs = new ArrayList<>();
        this.completedMatchs = new ArrayList<>();
        this.upComingMatchs = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.slider_criclytics_live);
        this.slider_criclytics_live = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        AdapterCriclyticsMatch adapterCriclyticsMatch = new AdapterCriclyticsMatch(this, this.liveMatchs, "live", new AdapterCriclyticsMatch.OnItemClickListener() {

            @Override
            public void onItemClick(String str, String str2, String str3) {
                CriclyticsActivity.this.matchId = str;
                CriclyticsActivity.this.currentInnings = str2;
                CriclyticsActivity.this.matchType = str3;
                CriclyticsActivity.this.onShowInterstitialAd("criclyticsLive");
            }

            @Override
            public void onClickBanner() {
                Glob.openCustomTab(CriclyticsActivity.this);
            }
        });
        this.adapterCriclyticsMatchLive = adapterCriclyticsMatch;
        this.slider_criclytics_live.setAdapter(adapterCriclyticsMatch);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.slider_criclytics_completed);
        this.slider_criclytics_completed = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        AdapterCriclyticsMatch adapterCriclyticsMatch2 = new AdapterCriclyticsMatch(this, this.completedMatchs, "completed", new AdapterCriclyticsMatch.OnItemClickListener() {

            @Override
            public void onItemClick(String str, String str2, String str3) {
                CriclyticsActivity.this.matchId = str;
                CriclyticsActivity.this.currentInnings = str2;
                CriclyticsActivity.this.matchType = str3;
                CriclyticsActivity.this.onShowInterstitialAd("criclyticsCompleted");
            }

            @Override
            public void onClickBanner() {
                Glob.openCustomTab(CriclyticsActivity.this);
            }
        });
        this.adapterCriclyticsMatchCompleted = adapterCriclyticsMatch2;
        this.slider_criclytics_completed.setAdapter(adapterCriclyticsMatch2);
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.slider_criclytics_upcoming);
        this.slider_criclytics_upcoming = recyclerView3;
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        AdapterCriclyticsMatch adapterCriclyticsMatch3 = new AdapterCriclyticsMatch(this, this.upComingMatchs, "upcoming", new AdapterCriclyticsMatch.OnItemClickListener() {

            @Override
            public void onItemClick(String str, String str2, String str3) {
                CriclyticsActivity.this.matchId = str;
                CriclyticsActivity.this.currentInnings = str2;
                CriclyticsActivity.this.matchType = str3;
                CriclyticsActivity.this.onShowInterstitialAd("criclyticsUpcoming");
            }

            @Override
            public void onClickBanner() {
                Glob.openCustomTab(CriclyticsActivity.this);
            }
        });
        this.adapterCriclyticsMatchUpComing = adapterCriclyticsMatch3;
        this.slider_criclytics_upcoming.setAdapter(adapterCriclyticsMatch3);
        final GraphqlApi graphqlApi = new GraphqlApi(this);
        Runnable r1 = new Runnable() {

            public void run() {
                graphqlApi.getFeaturematchQuery(new Interface.GetFeaturematchQuery() {

                    @Override
                    public void getResponse(ArrayList<FeaturematchQuery.Featurematch> arrayList) {
                        CriclyticsActivity.this.getMatchDetail(arrayList);
                    }
                });
                CriclyticsActivity.this.handler.postDelayed(CriclyticsActivity.this.refresh, 20000);
            }
        };
        this.refresh = r1;
        this.handler.post(r1);
    }


  
    private void getMatchDetail(final ArrayList<FeaturematchQuery.Featurematch> arrayList) {

        runOnUiThread(new Runnable() {

            public void run() {
                ArrayList arrayList5 = arrayList;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    CriclyticsActivity.this.ll_prediction.setVisibility(View.GONE);
                    CriclyticsActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                    CriclyticsActivity.this.progressBar.setVisibility(View.GONE);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                CriclyticsActivity.this.liveMatchs.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((FeaturematchQuery.Featurematch) arrayList.get(i)).matchStatus().equals("live") && ((FeaturematchQuery.Featurematch) arrayList.get(i)).isCricklyticsAvailable() != null && ((FeaturematchQuery.Featurematch) arrayList.get(i)).isLiveCriclyticsAvailable().booleanValue()) {
                        arrayList2.add((FeaturematchQuery.Featurematch) arrayList.get(i));
                    }
                }
                if (Glob.adCountInCategory == 0) {
                    CriclyticsActivity.this.liveMatchs.addAll(arrayList2);
                } else {
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        int i3 = i2 + 1;
                        if (i3 % Glob.adCountInCategory == 0) {
                            CriclyticsActivity.this.liveMatchs.add((FeaturematchQuery.Featurematch) arrayList2.get(i2));
                            CriclyticsActivity.this.liveMatchs.add(null);
                        } else {
                            CriclyticsActivity.this.liveMatchs.add((FeaturematchQuery.Featurematch) arrayList2.get(i2));
                        }
                        i2 = i3;
                    }
                }
                if (CriclyticsActivity.this.liveMatchs.isEmpty()) {
                    CriclyticsActivity.this.ll_live.setVisibility(View.GONE);
                } else {
                    CriclyticsActivity.this.adapterCriclyticsMatchLive.notifyDataSetChanged();
                }
                ArrayList arrayList3 = new ArrayList();
                CriclyticsActivity.this.completedMatchs.clear();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (((FeaturematchQuery.Featurematch) arrayList.get(i4)).matchStatus().equals("completed") && ((FeaturematchQuery.Featurematch) arrayList.get(i4)).isCricklyticsAvailable() != null && ((FeaturematchQuery.Featurematch) arrayList.get(i4)).isCricklyticsAvailable().booleanValue()) {
                        arrayList3.add((FeaturematchQuery.Featurematch) arrayList.get(i4));
                    }
                }
                if (Glob.adCountInCategory == 0) {
                    CriclyticsActivity.this.completedMatchs.addAll(arrayList3);
                } else {
                    int i5 = 0;
                    while (i5 < arrayList3.size()) {
                        int i6 = i5 + 1;
                        if (i6 % Glob.adCountInCategory == 0) {
                            CriclyticsActivity.this.completedMatchs.add((FeaturematchQuery.Featurematch) arrayList3.get(i5));
                            CriclyticsActivity.this.completedMatchs.add(null);
                        } else {
                            CriclyticsActivity.this.completedMatchs.add((FeaturematchQuery.Featurematch) arrayList3.get(i5));
                        }
                        i5 = i6;
                    }
                }
                if (CriclyticsActivity.this.completedMatchs.isEmpty()) {
                    CriclyticsActivity.this.ll_completed.setVisibility(View.GONE);
                } else {
                    CriclyticsActivity.this.adapterCriclyticsMatchCompleted.notifyDataSetChanged();
                }
                ArrayList arrayList4 = new ArrayList();
                CriclyticsActivity.this.upComingMatchs.clear();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (((FeaturematchQuery.Featurematch) arrayList.get(i7)).matchStatus().equals("upcoming") && ((FeaturematchQuery.Featurematch) arrayList.get(i7)).isCricklyticsAvailable() != null && ((FeaturematchQuery.Featurematch) arrayList.get(i7)).isCricklyticsAvailable().booleanValue()) {
                        arrayList4.add((FeaturematchQuery.Featurematch) arrayList.get(i7));
                    }
                }
                if (Glob.adCountInCategory == 0) {
                    CriclyticsActivity.this.upComingMatchs.addAll(arrayList4);
                } else {
                    int i8 = 0;
                    while (i8 < arrayList4.size()) {
                        int i9 = i8 + 1;
                        if (i9 % Glob.adCountInCategory == 0) {
                            CriclyticsActivity.this.upComingMatchs.add((FeaturematchQuery.Featurematch) arrayList4.get(i8));
                            CriclyticsActivity.this.upComingMatchs.add(null);
                        } else {
                            CriclyticsActivity.this.upComingMatchs.add((FeaturematchQuery.Featurematch) arrayList4.get(i8));
                        }
                        i8 = i9;
                    }
                }
                if (CriclyticsActivity.this.upComingMatchs.isEmpty()) {
                    CriclyticsActivity.this.ll_upcoming.setVisibility(View.GONE);
                } else {
                    CriclyticsActivity.this.adapterCriclyticsMatchUpComing.notifyDataSetChanged();
                }
                CriclyticsActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.GONE);
                CriclyticsActivity.this.ll_prediction.setVisibility(View.VISIBLE);;
                CriclyticsActivity.this.progressBar.setVisibility(View.GONE);
            }
        });
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    
    public void onShare(View view) {
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
            case -1110292272:
                if (str.equals("criclyticsCompleted")) {
                    c = 0;
                    break;
                }
                break;
            case -492888249:
                if (str.equals("criclyticsLive")) {
                    c = 1;
                    break;
                }
                break;
            case 761942519:
                if (str.equals("criclyticsUpcoming")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this, CriclyticsCompleteActivity.class);
                intent.putExtra(Glob.MATCH_ID, this.matchId);
                intent.putExtra(Glob.INNINGS, this.currentInnings);
                intent.putExtra(Glob.TYPES, this.matchType);
                intent.putExtra(Glob.MATCH_STATUS, "criclyticsCompleted");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this, CriclyticsLiveActivity.class);
                intent2.putExtra(Glob.MATCH_ID, this.matchId);
                intent2.putExtra(Glob.INNINGS, this.currentInnings);
                intent2.putExtra(Glob.TYPES, this.matchType);
                intent2.putExtra(Glob.MATCH_STATUS, "criclyticsLive");
                intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this, CriclyticsUCActivity.class);
                intent3.putExtra(Glob.MATCH_ID, this.matchId);
                intent3.putExtra(Glob.INNINGS, this.currentInnings);
                intent3.putExtra(Glob.TYPES, this.matchType);
                intent3.putExtra(Glob.MATCH_STATUS, "criclyticsUpcoming");
                intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                return;
            default:
                return;
        }
    }

    @Override 
    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override
    public void onStop() {
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override 
    public void onResume() {
        super.onResume();
    }

    @Override 
    public void onBackPressed() {
        Glob.showInappReview(this);
        Glob.goToHome(this);
    }
}
