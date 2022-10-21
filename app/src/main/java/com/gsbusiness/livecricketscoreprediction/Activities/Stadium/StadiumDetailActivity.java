package com.gsbusiness.livecricketscoreprediction.Activities.Stadium;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.StadiumQuery;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;

import java.util.Objects;

public class StadiumDetailActivity extends AppCompatActivity {
    public static String TAG = "<<<StadiumDetailActivity>>>";
    ImageView img_back;
    ImageView img_odi;
    ImageView img_stadium;
    ImageView img_t20;
    ImageView img_test;
    LinearLayout ll_odi;
    LinearLayout ll_odi_main;
    LinearLayout ll_stadium;
    LinearLayout ll_t20;
    LinearLayout ll_t20_main;
    LinearLayout ll_test;
    LinearLayout ll_test_main;
    ProgressBar progressBar;
    ProgressBar progressBarOdi;
    ProgressBar progressBart20;
    TextView txt_Odi_avg;
    TextView txt_Odi_winning;
    TextView txt_bowling_ends;
    TextView txt_capacity;
    TextView txt_city;
    TextView txt_firstOdiDate;
    TextView txt_firstOdiResult;
    TextView txt_firstOdiTeam;
    TextView txt_firstTestDate;
    TextView txt_firstTestResult;
    TextView txt_firstTestTeam;
    TextView txt_firstt20Date;
    TextView txt_firstt20Result;
    TextView txt_firstt20Team;
    TextView txt_highOdiDate;
    TextView txt_highOdiResult;
    TextView txt_highOdiTeam;
    TextView txt_highTestDate;
    TextView txt_highTestResult;
    TextView txt_highTestTeam;
    TextView txt_hight20Date;
    TextView txt_hight20Result;
    TextView txt_hight20Team;
    TextView txt_lowOdiDate;
    TextView txt_lowOdiResult;
    TextView txt_lowOdiTeam;
    TextView txt_lowTestDate;
    TextView txt_lowTestResult;
    TextView txt_lowTestTeam;
    TextView txt_lowt20Date;
    TextView txt_lowt20Result;
    TextView txt_lowt20Team;
    TextView txt_player_s_homeground;
    TextView txt_recentOdiDate;
    TextView txt_recentOdiResult;
    TextView txt_recentOdiTeam;
    TextView txt_recentTestDate;
    TextView txt_recentTestResult;
    TextView txt_recentTestTeam;
    TextView txt_recentt20Date;
    TextView txt_recentt20Result;
    TextView txt_recentt20Team;
    TextView txt_t20_avg;
    TextView txt_t20_winning;
    TextView txt_team_s_homeground;
    TextView txt_test_avg;
    TextView txt_test_winning;
    TextView txt_toolbar_title;
    String venueId;
    String venueName;
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
        setContentView(R.layout.activity_stadium_detail);
        BannerIDCardAds();
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.img_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        findViewById(R.id.img_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHome(v);
            }
        });
        Intent intent = getIntent();
        this.venueId = intent.getStringExtra("VenueId");
        this.venueName = intent.getStringExtra("venueName");
        String str = TAG;
        Log.d(str, "venueId:" + this.venueId + " venueName: " + this.venueName);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_stadium);
        this.ll_stadium = linearLayout;
        if (this.venueId != null) {
            new GraphqlApi(this).getStadium(this.venueId, new Interface.GetStadium() {


                @Override
                public void getResponse(StadiumQuery.C6832Stadium stadium) {
                    StadiumDetailActivity.this.getStadiumDetail(stadium);
                }
            });
        } else {
            linearLayout.setVisibility(View.GONE);
            findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
            ;
            findViewById(R.id.progressBar_).setVisibility(View.GONE);
        }
        TextView textView = (TextView) findViewById(R.id.txt_toolbar_title);
        this.txt_toolbar_title = textView;
        textView.setText(this.venueName);
        this.img_stadium = (ImageView) findViewById(R.id.img_stadium);
        ((RequestBuilder) Glide.with((FragmentActivity) this).load(Glob.stadium_start + this.venueId + Glob.stadium_end).placeholder((int) R.drawable.icon_stadium)).into(this.img_stadium);
        this.txt_city = (TextView) findViewById(R.id.txt_city);
        this.txt_capacity = (TextView) findViewById(R.id.txt_capacity);
        this.txt_team_s_homeground = (TextView) findViewById(R.id.txt_team_s_homeground);
        this.txt_player_s_homeground = (TextView) findViewById(R.id.txt_player_s_homeground);
        this.txt_bowling_ends = (TextView) findViewById(R.id.txt_bowling_ends);
        this.ll_test_main = (LinearLayout) findViewById(R.id.ll_test_main);
        this.ll_test = (LinearLayout) findViewById(R.id.ll_test);
        this.img_test = (ImageView) findViewById(R.id.img_test);
        this.ll_test_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickTest(v);

            }
        });
        this.ll_odi_main = (LinearLayout) findViewById(R.id.ll_odi_main);
        this.ll_odi = (LinearLayout) findViewById(R.id.ll_odi);
        this.img_odi = (ImageView) findViewById(R.id.img_odi);
        this.ll_odi_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickOdi(v);

            }
        });
        this.ll_t20_main = (LinearLayout) findViewById(R.id.ll_t20_main);
        this.ll_t20 = (LinearLayout) findViewById(R.id.ll_t20);
        this.img_t20 = (ImageView) findViewById(R.id.img_t20);
        this.ll_t20_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickT20(v);

            }
        });
        this.txt_firstTestDate = (TextView) findViewById(R.id.txt_firstTestDate);
        this.txt_firstTestTeam = (TextView) findViewById(R.id.txt_firstTestTeam);
        this.txt_firstTestResult = (TextView) findViewById(R.id.txt_firstTestResult);
        this.txt_recentTestDate = (TextView) findViewById(R.id.txt_recentTestDate);
        this.txt_recentTestTeam = (TextView) findViewById(R.id.txt_recentTestTeam);
        this.txt_recentTestResult = (TextView) findViewById(R.id.txt_recentTestResult);
        this.txt_test_avg = (TextView) findViewById(R.id.txt_test_avg);
        this.txt_test_winning = (TextView) findViewById(R.id.txt_test_winning);
        this.txt_highTestDate = (TextView) findViewById(R.id.txt_highTestDate);
        this.txt_highTestTeam = (TextView) findViewById(R.id.txt_highTestTeam);
        this.txt_highTestResult = (TextView) findViewById(R.id.txt_highTestResult);
        this.txt_lowTestDate = (TextView) findViewById(R.id.txt_lowTestDate);
        this.txt_lowTestTeam = (TextView) findViewById(R.id.txt_lowTestTeam);
        this.txt_lowTestResult = (TextView) findViewById(R.id.txt_lowTestResult);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.txt_firstOdiDate = (TextView) findViewById(R.id.txt_firstOdiDate);
        this.txt_firstOdiTeam = (TextView) findViewById(R.id.txt_firstOdiTeam);
        this.txt_firstOdiResult = (TextView) findViewById(R.id.txt_firstOdiResult);
        this.txt_recentOdiDate = (TextView) findViewById(R.id.txt_recentOdiDate);
        this.txt_recentOdiTeam = (TextView) findViewById(R.id.txt_recentOdiTeam);
        this.txt_recentOdiResult = (TextView) findViewById(R.id.txt_recentOdiResult);
        this.txt_Odi_avg = (TextView) findViewById(R.id.txt_Odi_avg);
        this.txt_Odi_winning = (TextView) findViewById(R.id.txt_Odi_winning);
        this.txt_highOdiDate = (TextView) findViewById(R.id.txt_highOdiDate);
        this.txt_highOdiTeam = (TextView) findViewById(R.id.txt_highOdiTeam);
        this.txt_highOdiResult = (TextView) findViewById(R.id.txt_highOdiResult);
        this.txt_lowOdiDate = (TextView) findViewById(R.id.txt_lowOdiDate);
        this.txt_lowOdiTeam = (TextView) findViewById(R.id.txt_lowOdiTeam);
        this.txt_lowOdiResult = (TextView) findViewById(R.id.txt_lowOdiResult);
        this.progressBarOdi = (ProgressBar) findViewById(R.id.progressBarOdi);
        this.txt_firstt20Date = (TextView) findViewById(R.id.txt_firstt20Date);
        this.txt_firstt20Team = (TextView) findViewById(R.id.txt_firstt20Team);
        this.txt_firstt20Result = (TextView) findViewById(R.id.txt_firstt20Result);
        this.txt_recentt20Date = (TextView) findViewById(R.id.txt_recentt20Date);
        this.txt_recentt20Team = (TextView) findViewById(R.id.txt_recentt20Team);
        this.txt_recentt20Result = (TextView) findViewById(R.id.txt_recentt20Result);
        this.txt_t20_avg = (TextView) findViewById(R.id.txt_t20_avg);
        this.txt_t20_winning = (TextView) findViewById(R.id.txt_t20_winning);
        this.txt_hight20Date = (TextView) findViewById(R.id.txt_hight20Date);
        this.txt_hight20Team = (TextView) findViewById(R.id.txt_hight20Team);
        this.txt_hight20Result = (TextView) findViewById(R.id.txt_hight20Result);
        this.txt_lowt20Date = (TextView) findViewById(R.id.txt_lowt20Date);
        this.txt_lowt20Team = (TextView) findViewById(R.id.txt_lowt20Team);
        this.txt_lowt20Result = (TextView) findViewById(R.id.txt_lowt20Result);
        this.progressBart20 = (ProgressBar) findViewById(R.id.progressBart20);
    }


    private void getStadiumDetail(final StadiumQuery.C6832Stadium stadium) {
        runOnUiThread(new Runnable() {


            public void run() {
                TextView textView = StadiumDetailActivity.this.txt_city;
                StadiumQuery.C6832Stadium stadium9 = stadium;
                Objects.requireNonNull(stadium9);
                textView.setText(stadium9.city());
                TextView textView2 = StadiumDetailActivity.this.txt_capacity;
                StadiumQuery.C6832Stadium stadium2 = stadium;
                Objects.requireNonNull(stadium2);
                textView2.setText(stadium2.capacity());
                TextView textView3 = StadiumDetailActivity.this.txt_bowling_ends;
                StadiumQuery.C6832Stadium stadium3 = stadium;
                Objects.requireNonNull(stadium3);
                textView3.setText(stadium3.bowlingEnds());
                if (stadium.venueStats() != null) {
                    if (stadium.venueStats().testDetails() != null) {
                        if (stadium.venueStats().testDetails().firstMatch() != null) {
                            TextView textView4 = StadiumDetailActivity.this.txt_firstTestDate;
                            StadiumQuery.FirstMatch1 firstMatch = stadium.venueStats().testDetails().firstMatch();
                            Objects.requireNonNull(firstMatch);
                            textView4.setText(firstMatch.startDate());
                            TextView textView5 = StadiumDetailActivity.this.txt_firstTestTeam;
                            StadiumQuery.FirstMatch1 firstMatch2 = stadium.venueStats().testDetails().firstMatch();
                            Objects.requireNonNull(firstMatch2);
                            textView5.setText(firstMatch2.matchName());
                            TextView textView6 = StadiumDetailActivity.this.txt_firstTestResult;
                            StadiumQuery.FirstMatch1 firstMatch3 = stadium.venueStats().testDetails().firstMatch();
                            Objects.requireNonNull(firstMatch3);
                            textView6.setText(firstMatch3.matchStatusStr());
                        }
                        if (stadium.venueStats().testDetails().lastMatch() != null) {
                            TextView textView7 = StadiumDetailActivity.this.txt_recentTestDate;
                            StadiumQuery.LastMatch1 lastMatch = stadium.venueStats().testDetails().lastMatch();
                            Objects.requireNonNull(lastMatch);
                            textView7.setText(lastMatch.startDate());
                            TextView textView8 = StadiumDetailActivity.this.txt_recentTestTeam;
                            StadiumQuery.LastMatch1 lastMatch2 = stadium.venueStats().testDetails().lastMatch();
                            Objects.requireNonNull(lastMatch2);
                            textView8.setText(lastMatch2.matchName());
                            TextView textView9 = StadiumDetailActivity.this.txt_recentTestResult;
                            StadiumQuery.LastMatch1 lastMatch3 = stadium.venueStats().testDetails().lastMatch();
                            Objects.requireNonNull(lastMatch3);
                            textView9.setText(lastMatch3.matchStatusStr());
                        }
                        TextView textView10 = StadiumDetailActivity.this.txt_test_avg;
                        StadiumQuery.TestDetails testDetails = stadium.venueStats().testDetails();
                        Objects.requireNonNull(testDetails);
                        textView10.setText(testDetails.avgIstInningScore());
                        StadiumQuery.TestDetails testDetails2 = stadium.venueStats().testDetails();
                        Objects.requireNonNull(testDetails2);
                        String format = String.format("%.0f", testDetails2.firstBattingWin());
                        int parseInt = Integer.parseInt(format);
                        StadiumDetailActivity.this.txt_test_winning.setText(String.format("%s%s", format, "%"));
                        StadiumDetailActivity.this.progressBar.setProgress(parseInt);
                        if (stadium.venueStats().testDetails().highestScoreMatch() != null) {
                            TextView textView11 = StadiumDetailActivity.this.txt_highTestDate;
                            StadiumQuery.HighestScoreMatch1 highestScoreMatch = stadium.venueStats().testDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch);
                            textView11.setText(highestScoreMatch.startDate());
                            TextView textView12 = StadiumDetailActivity.this.txt_highTestTeam;
                            StadiumQuery.HighestScoreMatch1 highestScoreMatch2 = stadium.venueStats().testDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch2);
                            textView12.setText(highestScoreMatch2.matchName());
                            TextView textView13 = StadiumDetailActivity.this.txt_highTestResult;
                            StadiumQuery.HighestScoreMatch1 highestScoreMatch3 = stadium.venueStats().testDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch3);
                            textView13.setText(highestScoreMatch3.matchStatusStr());
                        }
                        if (stadium.venueStats().testDetails().lowestScoreMatch() != null) {
                            TextView textView14 = StadiumDetailActivity.this.txt_lowTestDate;
                            StadiumQuery.LowestScoreMatch1 lowestScoreMatch = stadium.venueStats().testDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch);
                            textView14.setText(lowestScoreMatch.startDate());
                            TextView textView15 = StadiumDetailActivity.this.txt_lowTestTeam;
                            StadiumQuery.LowestScoreMatch1 lowestScoreMatch2 = stadium.venueStats().testDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch2);
                            textView15.setText(lowestScoreMatch2.matchName());
                            TextView textView16 = StadiumDetailActivity.this.txt_lowTestResult;
                            StadiumQuery.LowestScoreMatch1 lowestScoreMatch3 = stadium.venueStats().testDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch3);
                            textView16.setText(lowestScoreMatch3.matchStatusStr());
                        }
                    }
                    if (stadium.venueStats().odiDetails() != null) {
                        if (stadium.venueStats().odiDetails().firstMatch() != null) {
                            TextView textView17 = StadiumDetailActivity.this.txt_firstOdiDate;
                            StadiumQuery.FirstMatch firstMatch4 = stadium.venueStats().odiDetails().firstMatch();
                            Objects.requireNonNull(firstMatch4);
                            textView17.setText(firstMatch4.startDate());
                            TextView textView18 = StadiumDetailActivity.this.txt_firstOdiTeam;
                            StadiumQuery.FirstMatch firstMatch5 = stadium.venueStats().odiDetails().firstMatch();
                            Objects.requireNonNull(firstMatch5);
                            textView18.setText(firstMatch5.matchName());
                            TextView textView19 = StadiumDetailActivity.this.txt_firstOdiResult;
                            StadiumQuery.FirstMatch firstMatch6 = stadium.venueStats().odiDetails().firstMatch();
                            Objects.requireNonNull(firstMatch6);
                            textView19.setText(firstMatch6.matchStatusStr());
                        }
                        if (stadium.venueStats().odiDetails().lastMatch() != null) {
                            TextView textView20 = StadiumDetailActivity.this.txt_recentOdiDate;
                            StadiumQuery.LastMatch lastMatch4 = stadium.venueStats().odiDetails().lastMatch();
                            Objects.requireNonNull(lastMatch4);
                            textView20.setText(lastMatch4.startDate());
                            TextView textView21 = StadiumDetailActivity.this.txt_recentOdiTeam;
                            StadiumQuery.LastMatch lastMatch5 = stadium.venueStats().odiDetails().lastMatch();
                            Objects.requireNonNull(lastMatch5);
                            textView21.setText(lastMatch5.matchName());
                            TextView textView22 = StadiumDetailActivity.this.txt_recentOdiResult;
                            StadiumQuery.LastMatch lastMatch6 = stadium.venueStats().odiDetails().lastMatch();
                            Objects.requireNonNull(lastMatch6);
                            textView22.setText(lastMatch6.matchStatusStr());
                        }
                        TextView textView23 = StadiumDetailActivity.this.txt_Odi_avg;
                        StadiumQuery.OdiDetails odiDetails = stadium.venueStats().odiDetails();
                        Objects.requireNonNull(odiDetails);
                        textView23.setText(odiDetails.avgIstInningScore());
                        StadiumQuery.OdiDetails odiDetails2 = stadium.venueStats().odiDetails();
                        Objects.requireNonNull(odiDetails2);
                        String format2 = String.format("%.0f", odiDetails2.firstBattingWin());
                        StadiumDetailActivity.this.progressBarOdi.setProgress(Integer.parseInt(format2));
                        StadiumDetailActivity.this.txt_Odi_winning.setText(String.format("%s%s", format2, "%"));
                        if (stadium.venueStats().odiDetails().highestScoreMatch() != null) {
                            TextView textView24 = StadiumDetailActivity.this.txt_highOdiDate;
                            StadiumQuery.HighestScoreMatch highestScoreMatch4 = stadium.venueStats().odiDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch4);
                            textView24.setText(highestScoreMatch4.startDate());
                            TextView textView25 = StadiumDetailActivity.this.txt_highOdiTeam;
                            StadiumQuery.HighestScoreMatch highestScoreMatch5 = stadium.venueStats().odiDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch5);
                            textView25.setText(highestScoreMatch5.matchName());
                            TextView textView26 = StadiumDetailActivity.this.txt_highOdiResult;
                            StadiumQuery.HighestScoreMatch highestScoreMatch6 = stadium.venueStats().odiDetails().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch6);
                            textView26.setText(highestScoreMatch6.matchStatusStr());
                        }
                        if (stadium.venueStats().odiDetails().lowestScoreMatch() != null) {
                            TextView textView27 = StadiumDetailActivity.this.txt_lowOdiDate;
                            StadiumQuery.LowestScoreMatch lowestScoreMatch4 = stadium.venueStats().odiDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch4);
                            textView27.setText(lowestScoreMatch4.startDate());
                            TextView textView28 = StadiumDetailActivity.this.txt_lowOdiTeam;
                            StadiumQuery.LowestScoreMatch lowestScoreMatch5 = stadium.venueStats().odiDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch5);
                            textView28.setText(lowestScoreMatch5.matchName());
                            TextView textView29 = StadiumDetailActivity.this.txt_lowOdiResult;
                            StadiumQuery.LowestScoreMatch lowestScoreMatch6 = stadium.venueStats().odiDetails().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch6);
                            textView29.setText(lowestScoreMatch6.matchStatusStr());
                        }
                    }
                    if (stadium.venueStats().t20Details() != null) {
                        if (stadium.venueStats().t20Details().firstMatch() != null) {
                            TextView textView30 = StadiumDetailActivity.this.txt_firstt20Date;
                            StadiumQuery.FirstMatch2 firstMatch7 = stadium.venueStats().t20Details().firstMatch();
                            Objects.requireNonNull(firstMatch7);
                            textView30.setText(firstMatch7.startDate());
                            TextView textView31 = StadiumDetailActivity.this.txt_firstt20Team;
                            StadiumQuery.FirstMatch2 firstMatch8 = stadium.venueStats().t20Details().firstMatch();
                            Objects.requireNonNull(firstMatch8);
                            textView31.setText(firstMatch8.matchName());
                            TextView textView32 = StadiumDetailActivity.this.txt_firstt20Result;
                            StadiumQuery.FirstMatch2 firstMatch9 = stadium.venueStats().t20Details().firstMatch();
                            Objects.requireNonNull(firstMatch9);
                            textView32.setText(firstMatch9.matchStatusStr());
                        }
                        if (stadium.venueStats().t20Details().lastMatch() != null) {
                            TextView textView33 = StadiumDetailActivity.this.txt_recentt20Date;
                            StadiumQuery.LastMatch2 lastMatch7 = stadium.venueStats().t20Details().lastMatch();
                            Objects.requireNonNull(lastMatch7);
                            textView33.setText(lastMatch7.startDate());
                            TextView textView34 = StadiumDetailActivity.this.txt_recentt20Team;
                            StadiumQuery.LastMatch2 lastMatch8 = stadium.venueStats().t20Details().lastMatch();
                            Objects.requireNonNull(lastMatch8);
                            textView34.setText(lastMatch8.matchName());
                            TextView textView35 = StadiumDetailActivity.this.txt_recentt20Result;
                            StadiumQuery.LastMatch2 lastMatch9 = stadium.venueStats().t20Details().lastMatch();
                            Objects.requireNonNull(lastMatch9);
                            textView35.setText(lastMatch9.matchStatusStr());
                        }
                        TextView textView36 = StadiumDetailActivity.this.txt_t20_avg;
                        StadiumQuery.T20Details t20Details = stadium.venueStats().t20Details();
                        Objects.requireNonNull(t20Details);
                        textView36.setText(t20Details.avgIstInningScore());
                        StadiumQuery.T20Details t20Details2 = stadium.venueStats().t20Details();
                        Objects.requireNonNull(t20Details2);
                        String format3 = String.format("%.0f", t20Details2.firstBattingWin());
                        StadiumDetailActivity.this.progressBart20.setProgress(Integer.parseInt(format3));
                        StadiumDetailActivity.this.txt_t20_winning.setText(String.format("%s%s", format3, "%"));
                        if (stadium.venueStats().t20Details().highestScoreMatch() != null) {
                            TextView textView37 = StadiumDetailActivity.this.txt_hight20Date;
                            StadiumQuery.HighestScoreMatch2 highestScoreMatch7 = stadium.venueStats().t20Details().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch7);
                            textView37.setText(highestScoreMatch7.startDate());
                            TextView textView38 = StadiumDetailActivity.this.txt_hight20Team;
                            StadiumQuery.HighestScoreMatch2 highestScoreMatch8 = stadium.venueStats().t20Details().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch8);
                            textView38.setText(highestScoreMatch8.matchName());
                            TextView textView39 = StadiumDetailActivity.this.txt_hight20Result;
                            StadiumQuery.HighestScoreMatch2 highestScoreMatch9 = stadium.venueStats().t20Details().highestScoreMatch();
                            Objects.requireNonNull(highestScoreMatch9);
                            textView39.setText(highestScoreMatch9.matchStatusStr());
                        }
                        if (stadium.venueStats().t20Details().lowestScoreMatch() != null) {
                            TextView textView40 = StadiumDetailActivity.this.txt_lowt20Date;
                            StadiumQuery.LowestScoreMatch2 lowestScoreMatch7 = stadium.venueStats().t20Details().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch7);
                            textView40.setText(lowestScoreMatch7.startDate());
                            TextView textView41 = StadiumDetailActivity.this.txt_lowt20Team;
                            StadiumQuery.LowestScoreMatch2 lowestScoreMatch8 = stadium.venueStats().t20Details().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch8);
                            textView41.setText(lowestScoreMatch8.matchName());
                            TextView textView42 = StadiumDetailActivity.this.txt_lowt20Result;
                            StadiumQuery.LowestScoreMatch2 lowestScoreMatch9 = stadium.venueStats().t20Details().lowestScoreMatch();
                            Objects.requireNonNull(lowestScoreMatch9);
                            textView42.setText(lowestScoreMatch9.matchStatusStr());
                        }
                    }
                    StadiumDetailActivity.this.ll_stadium.setVisibility(View.VISIBLE);
                    ;
                    StadiumDetailActivity.this.findViewById(R.id.progressBar_).setVisibility(View.GONE);
                    return;
                }
                StadiumDetailActivity.this.ll_stadium.setVisibility(View.GONE);
                StadiumDetailActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                ;
                StadiumDetailActivity.this.findViewById(R.id.progressBar_).setVisibility(View.GONE);
            }
        });
    }


    public void onBack(View view) {
        onBackPressed();
    }


    public void onHome(View view) {
        Glob.goToHome(this);
    }


    public void onClickTest(View view) {
        if (this.ll_test.getVisibility() == View.VISIBLE) {
            this.ll_test.setVisibility(View.GONE);
            this.img_test.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_down, getTheme()));
            this.ll_test_main.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, getTheme()));
            return;
        }
        this.ll_test.setVisibility(View.VISIBLE);
        ;
        this.ll_test_main.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.border_green, getTheme()));
        this.img_test.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_up, getTheme()));
    }


    public void onClickOdi(View view) {
        if (this.ll_odi.getVisibility() == View.VISIBLE) {
            this.ll_odi.setVisibility(View.GONE);
            this.img_odi.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_down, getTheme()));
            this.ll_odi_main.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, getTheme()));
            return;
        }
        this.ll_odi.setVisibility(View.VISIBLE);
        ;
        this.ll_odi_main.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.border_green, getTheme()));
        this.img_odi.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_up, getTheme()));
    }


    public void onClickT20(View view) {
        if (this.ll_t20.getVisibility() == View.VISIBLE) {
            this.ll_t20.setVisibility(View.GONE);
            this.img_t20.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_down, getTheme()));
            this.ll_t20_main.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, getTheme()));
            return;
        }
        this.ll_t20.setVisibility(View.VISIBLE);
        ;
        this.ll_t20_main.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.border_green, getTheme()));
        this.img_t20.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_up, getTheme()));
    }
}
