package com.gsbusiness.livecricketscoreprediction.Activities.Fantasy;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
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
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.Task;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy.AdapterFantasyMatchCompleted;
import com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy.AdapterFantasyMatchLive;
import com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy.AdapterFantasyMatchUpcoming;

import com.gsbusiness.livecricketscoreprediction.GetFRCHomePageQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.Utils.InAppReview;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.ArrayList;

public class FantasyActivity extends AppCompatActivity {
    public static String LOG = "<<<FantasyActivity>>>";
    LinearLayout ll_completed;
    LinearLayout ll_live;
    LinearLayout ll_upcoming;
    String matchId = "";
    String matchStatus = "";
    ProgressBar progressBar;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
  

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                FantasyActivity fantasyActivity = FantasyActivity.this;
                fantasyActivity.onNext(fantasyActivity.whereLocal);
                return;
            }
            FantasyActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_completed;
    RecyclerView rv_live;
    RecyclerView rv_upcoming;
    ScrollView scrollView;
    String whereLocal = "";

    static  void lambda$showInappReview$0(Task task) {
    }
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
        setContentView(R.layout.activity_fantasy);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
        Glob.showInappReview(this);
    }

    private void initView() {
        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.scrollView = (ScrollView) findViewById(R.id.scrollView);
        this.ll_upcoming = (LinearLayout) findViewById(R.id.ll_upcoming);
        this.ll_live = (LinearLayout) findViewById(R.id.ll_live);
        this.ll_completed = (LinearLayout) findViewById(R.id.ll_completed);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_upcoming);
        this.rv_upcoming = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_live);
        this.rv_live = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rv_completed);
        this.rv_completed = recyclerView3;
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        new GraphqlApi(this).getFRCHomePage(new Interface.GetFRCHomePage() {


            @Override
            public void getResponse(GetFRCHomePageQuery.GetFRCHomePage getFRCHomePage) {
                FantasyActivity.this.getLiveFantasy(getFRCHomePage);
            }
        });
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    public void getLiveFantasy(final GetFRCHomePageQuery.GetFRCHomePage getFRCHomePage) {
        runOnUiThread(new Runnable() {
            

            public void run() {
                int i = 0;
                if (getFRCHomePage != null) {
                    FantasyActivity.this.scrollView.setVisibility(View.VISIBLE);;
                    FantasyActivity.this.progressBar.setVisibility(View.GONE);
                    if (!getFRCHomePage.upcomingmatches().isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList.addAll(getFRCHomePage.upcomingmatches());
                        } else {
                            int i2 = 0;
                            while (i2 < getFRCHomePage.upcomingmatches().size()) {
                                int i3 = i2 + 1;
                                if (i3 % Glob.adCountInCategory == 0) {
                                    arrayList.add(getFRCHomePage.upcomingmatches().get(i2));
                                    arrayList.add(null);
                                } else {
                                    arrayList.add(getFRCHomePage.upcomingmatches().get(i2));
                                }
                                i2 = i3;
                            }
                        }
                        FantasyActivity.this.rv_upcoming.setAdapter(new AdapterFantasyMatchUpcoming(FantasyActivity.this, arrayList, new AdapterFantasyMatchUpcoming.OnItemClickListener() {
                       

                            @Override
                            public void onItemClick(String str) {
                                FantasyActivity.this.matchId = str;
                                FantasyActivity.this.matchStatus = "Upcomingmatch";
                                FantasyActivity.this.onShowInterstitialAd("FantasyTeamActivity");
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(FantasyActivity.this);
                            }
                        }));
                        String str = FantasyActivity.LOG;
                        Glob.log(str, "upcomingmatches " + arrayList + "");
                    } else {
                        FantasyActivity.this.rv_upcoming.setVisibility(View.GONE);
                    }
                    if (!getFRCHomePage.livematches().isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList2.addAll(getFRCHomePage.livematches());
                        } else {
                            int i4 = 0;
                            while (i4 < getFRCHomePage.livematches().size()) {
                                int i5 = i4 + 1;
                                if (i5 % Glob.adCountInCategory == 0) {
                                    arrayList2.add(getFRCHomePage.livematches().get(i4));
                                    arrayList2.add(null);
                                } else {
                                    arrayList2.add(getFRCHomePage.livematches().get(i4));
                                }
                                i4 = i5;
                            }
                        }
                        FantasyActivity.this.rv_live.setAdapter(new AdapterFantasyMatchLive(FantasyActivity.this, arrayList2, new AdapterFantasyMatchLive.OnItemClickListener() {


                            @Override
                            public void onItemClick(String str) {
                                FantasyActivity.this.matchId = str;
                                FantasyActivity.this.matchStatus = "Livematch";
                                FantasyActivity.this.onShowInterstitialAd("FantasyTeamActivity");
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(FantasyActivity.this);
                            }
                        }));
                        String str2 = FantasyActivity.LOG;
                        Glob.log(str2, "livematches " + arrayList2 + "");
                    } else {
                        FantasyActivity.this.ll_live.setVisibility(View.GONE);
                    }
                    if (!getFRCHomePage.completedmatches().isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList3.addAll(getFRCHomePage.completedmatches());
                        } else {
                            while (i < getFRCHomePage.completedmatches().size()) {
                                int i6 = i + 1;
                                if (i6 % Glob.adCountInCategory == 0) {
                                    arrayList3.add(getFRCHomePage.completedmatches().get(i));
                                    arrayList3.add(null);
                                } else {
                                    arrayList3.add(getFRCHomePage.completedmatches().get(i));
                                }
                                i = i6;
                            }
                        }
                        FantasyActivity.this.rv_completed.setAdapter(new AdapterFantasyMatchCompleted(FantasyActivity.this, arrayList3, new AdapterFantasyMatchCompleted.OnItemClickListener() {


                            @Override
                            public void onItemClick(String str) {
                                FantasyActivity.this.matchId = str;
                                FantasyActivity.this.matchStatus = "Completedmatch";
                                FantasyActivity.this.onShowInterstitialAd("FantasyTeamActivity");
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(FantasyActivity.this);
                            }
                        }));
                        String str3 = FantasyActivity.LOG;
                        Glob.log(str3, arrayList3.size() + " completedmatches " + arrayList3 + "");
                        return;
                    }
                    FantasyActivity.this.ll_completed.setVisibility(View.GONE);
                    return;
                }
                FantasyActivity.this.progressBar.setVisibility(View.GONE);
                FantasyActivity.this.scrollView.setVisibility(View.GONE);
                FantasyActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
            }
        });
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
        if (str.equals("FantasyTeamActivity")) {
            Intent intent = new Intent(this, FantasyTeamActivity.class);
            intent.putExtra(Glob.MATCH_ID, this.matchId);
            intent.putExtra(Glob.MATCH_STATUS, this.matchStatus);
            startActivity(intent);
        }
    }

    @Override 
    public void onBackPressed() {
        showInappReview();
        Glob.goToHome(this);
    }

    public void showInappReview() {
        ReviewManager create = ReviewManagerFactory.create(this);
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        requestReviewFlow.addOnCompleteListener(new FantasyActivity$$ExternalSyntheticLambda1(this, create));
        requestReviewFlow.addOnFailureListener(new OnFailureListener() {

            @Override
            public void onFailure(Exception exc) {
                FantasyActivity fantasyActivity = FantasyActivity.this;
                InAppReview.onOpenReview(fantasyActivity, fantasyActivity.getPackageName());
            }
        });
    }

   public  void mo49898x89bc3d02(ReviewManager reviewManager, Task task) {
        if (task.isSuccessful()) {
            Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(this, (ReviewInfo) task.getResult());
            launchReviewFlow.addOnCompleteListener(FantasyActivity$$ExternalSyntheticLambda2.INSTANCE);
            launchReviewFlow.addOnFailureListener(new OnFailureListener() {

                @Override
                public void onFailure(Exception exc) {
                    FantasyActivity fantasyActivity = FantasyActivity.this;
                    InAppReview.onOpenReview(fantasyActivity, fantasyActivity.getPackageName());
                }
            });
            return;
        }
        InAppReview.onOpenReview(this, getPackageName());
    }
}
