package com.cricketscoreprediction.app.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.cricketscoreprediction.app.Activities.Criclytics.CriclyticsActivity;
import com.cricketscoreprediction.app.Activities.Criclytics.CriclyticsLiveActivity;
import com.cricketscoreprediction.app.Activities.Criclytics.CriclyticsUCActivity;
import com.cricketscoreprediction.app.Activities.Fantasy.FantasyActivity;
import com.cricketscoreprediction.app.Activities.Match.MatchActivity;
import com.cricketscoreprediction.app.Activities.Match.MatchCompleteActivity;
import com.cricketscoreprediction.app.Activities.Match.MatchUpComingActivity;
import com.cricketscoreprediction.app.Activities.More.SchedulesActivity;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.AdapterFeatureMatch;
import com.cricketscoreprediction.app.Adapter.AdapterSchedules;
import com.cricketscoreprediction.app.Adapter.Criclytics.AdapterBatsmanProjection;

import com.cricketscoreprediction.app.FeaturematchQuery;
import com.cricketscoreprediction.app.GetKeyStatsQuery;
import com.cricketscoreprediction.app.GetLivePlayerProjectionDetailsQuery;
import com.cricketscoreprediction.app.GetcriclyticsCommonApiQuery;
import com.cricketscoreprediction.app.HomepageRecentFormQuery;
import com.cricketscoreprediction.app.MatchSummaryQuery;
import com.cricketscoreprediction.app.NewScheduleQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ScoreFragment extends Fragment {
    static final String LOG = "<<<ScoreFragment>>>";
    private static Activity myActivity;
    AdapterFeatureMatch adapterFeatureMatch;
    AdapterSchedules adapterSchedules;
    CardView card_fantasy;
    CardView card_prediction;
    String currentInnings;
    ArrayList<FeaturematchQuery.Featurematch> featurematchAd;
    GraphqlApi graphqlApi;
    Handler handler = new Handler();
    boolean isFirst = true;
    LinearLayout ll_match_summary;
    LinearLayout ll_prediction;
    LinearLayout ll_prediction_uc;
    String matchId;
    String matchTypes;
    ArrayList<NewScheduleQuery.NewSchedule> newSchedules;
    ProgressBar progress_featureMatch;
    Runnable refresh;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                ScoreFragment scoreFragment = ScoreFragment.this;
                scoreFragment.onNext(scoreFragment.whereLocal);
                return;
            }
            ScoreFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RelativeLayout rl_schedules;
    RecyclerView rv_up_series;
    int selectedPosition = 0;
    int seriesPage = 0;
    private RecyclerView slider_feature_match;
    SnapHelper snapHelper;
    View view;
    String whereLocal;

    interface OnItemClickListener {
        void onClick();
    }

    public static ScoreFragment newInstance(Activity activity) {
        ScoreFragment scoreFragment = new ScoreFragment();
        myActivity = activity;
        return scoreFragment;
    }

    private NativeAd mobNativeView;

    private void NativeBinding(NativeAd nativeAd, NativeAdView adView) {
        MediaView mediaView = adView.findViewById(R.id.ad_media);
        adView.setMediaView(mediaView);
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);
    }

    public void NativeShow(final FrameLayout frameLayout) {
        AdLoader.Builder builder = new AdLoader.Builder(getContext(), getString(R.string.AdMob_Native));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {

                boolean isDestroyed = false;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {

                }
                if (isDestroyed) {
                    nativeAd.destroy();
                    return;
                }
                if (mobNativeView != null) {
                    mobNativeView.destroy();
                }
                mobNativeView = nativeAd;
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.mobnative, null);
                NativeBinding(nativeAd, adView);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);
            }
        });
        VideoOptions videoOptions = new VideoOptions.Builder().build();
        com.google.android.gms.ads.nativead.NativeAdOptions adOptions = new com.google.android.gms.ads.nativead.NativeAdOptions.Builder().setVideoOptions(videoOptions).build();
        builder.withNativeAdOptions(adOptions);
        AdLoader adLoader = builder.withAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {


            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());


    }

    public void NativeLoad(View view) {
        NativeShow((FrameLayout) view.findViewById(R.id.mobadslayout));
    }

    InterstitialAd mMobInterstitialAds;

    public void InterstitialLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RequestConfiguration configuration = new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("1ADAD30F02CD84CDE72190C2ABE5EB5E")).build();
        MobileAds.setRequestConfiguration(configuration);
        InterstitialAd.load(getActivity(), getString(R.string.AdMob_Interstitial), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mMobInterstitialAds = interstitialAd;
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
            this.mMobInterstitialAds.show(getActivity());
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_score, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        NativeLoad(view);
        InterstitialLoad();
        if (myActivity != null && isAdded()) {
            this.progress_featureMatch = (ProgressBar) this.view.findViewById(R.id.progress_featureMatch);
            this.ll_match_summary = (LinearLayout) this.view.findViewById(R.id.ll_match_summary);
            this.ll_prediction = (LinearLayout) this.view.findViewById(R.id.ll_prediction);
            this.ll_prediction_uc = (LinearLayout) this.view.findViewById(R.id.ll_prediction_uc);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.slider_feature_match);
            this.slider_feature_match = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(myActivity, RecyclerView.HORIZONTAL, false));
            PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
            this.snapHelper = pagerSnapHelper;
            pagerSnapHelper.attachToRecyclerView(this.slider_feature_match);
            this.card_prediction = (CardView) this.view.findViewById(R.id.card_prediction);
            this.card_fantasy = (CardView) this.view.findViewById(R.id.card_fantasy);
            this.card_prediction.setOnClickListener(new ScoreFragment$$ExternalSyntheticLambda0(this));
            this.card_fantasy.setOnClickListener(new ScoreFragment$$ExternalSyntheticLambda2(this));
            RelativeLayout relativeLayout = (RelativeLayout) this.view.findViewById(R.id.rl_schedules);
            this.rl_schedules = relativeLayout;
            relativeLayout.setOnClickListener(new ScoreFragment$$ExternalSyntheticLambda1(this));
            this.featurematchAd = new ArrayList<>();
            AdapterFeatureMatch adapterFeatureMatch2 = new AdapterFeatureMatch(myActivity, this.featurematchAd, new AdapterFeatureMatch.OnItemClickListener() {

                @Override
                public void onItemClick(String str, String str2, String str3) {
                    ScoreFragment.this.matchId = str;
                    ScoreFragment.this.currentInnings = str2;
                    ScoreFragment.this.onShowInterstitialAd(str3);
                }

                @Override
                public void onClickBanner() {
                    Glob.openCustomTab(ScoreFragment.myActivity);
                }
            });
            this.adapterFeatureMatch = adapterFeatureMatch2;
            this.slider_feature_match.setAdapter(adapterFeatureMatch2);
            this.graphqlApi = new GraphqlApi(myActivity);
            Runnable r0 = new Runnable() {

                public void run() {
                    ScoreFragment.this.graphqlApi.getFeaturematchQuery(new Interface.GetFeaturematchQuery() {

                        @Override
                        public void getResponse(ArrayList<FeaturematchQuery.Featurematch> arrayList) {
                            ScoreFragment.this.getMatchDetail(arrayList);
                        }
                    });
                    ScoreFragment.this.handler.postDelayed(ScoreFragment.this.refresh, 15000);
                }
            };
            this.refresh = r0;
            this.handler.post(r0);
            RecyclerView recyclerView2 = (RecyclerView) this.view.findViewById(R.id.rv_up_series);
            this.rv_up_series = recyclerView2;
            recyclerView2.setLayoutManager(new LinearLayoutManager(myActivity, RecyclerView.VERTICAL, false));
            this.newSchedules = new ArrayList<>();
            AdapterSchedules adapterSchedules2 = new AdapterSchedules(myActivity, this.newSchedules, new AdapterSchedules.OnItemClickListener() {

                @Override
                public void onItemClick(String str, String str2, String str3) {
                    ScoreFragment.this.matchId = str;
                    ScoreFragment.this.currentInnings = str2;
                    ScoreFragment.this.onShowInterstitialAd(str3);
                }

                @Override
                public void onClickBanner() {
                    Glob.openCustomTab(ScoreFragment.myActivity);
                }
            });
            this.adapterSchedules = adapterSchedules2;
            this.rv_up_series.setAdapter(adapterSchedules2);
            this.graphqlApi.getNewSchedules("international", "upcoming", this.seriesPage, new Interface.getNewSchedules() {

                @Override
                public void getResponse(List<NewScheduleQuery.NewSchedule> list) {
                    ScoreFragment.this.getNewSchedules(list);
                }
            });
            final ScrollView scrollView = (ScrollView) this.view.findViewById(R.id.scrollView_score);
            if (Build.VERSION.SDK_INT >= 23) {
                scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {

                    public void onScrollChanged() {
                        ScrollView scrollView = new ScrollView(getContext());
//                        if (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (scrollView.getHeight() + scrollView.getScrollY()) == 0) {
                        ScoreFragment.this.graphqlApi.getNewSchedules("international", "upcoming", ScoreFragment.this.seriesPage, new Interface.getNewSchedules() {

                            @Override
                            public void getResponse(List<NewScheduleQuery.NewSchedule> list) {
                                ScoreFragment.this.getNewSchedules(list);
                            }
                        });
                    }
//                    }
                });
            }
        }
    }


    private void getNewSchedules(final List<NewScheduleQuery.NewSchedule> list) {
        Activity activity = myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {

                public void run() {
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        int size = ScoreFragment.this.newSchedules.size();
                        if (Glob.adCountInCategory == 0) {
                            ScoreFragment.this.newSchedules.addAll(list);
                        } else {
                            int i = 0;
                            while (i < list.size()) {
                                int i2 = i + 1;
                                if (i2 % Glob.adCountInCategory == 0) {
                                    ScoreFragment.this.newSchedules.add((NewScheduleQuery.NewSchedule) list.get(i));
                                    ScoreFragment.this.newSchedules.add(null);
                                } else {
                                    ScoreFragment.this.newSchedules.add((NewScheduleQuery.NewSchedule) list.get(i));
                                }
                                i = i2;
                            }
                        }
                        ScoreFragment.this.adapterSchedules.notifyItemChanged(size, ScoreFragment.this.newSchedules);
                        if (ScoreFragment.this.view.findViewById(R.id.ll_schedules).getVisibility() == View.GONE) {
                            ScoreFragment.this.view.findViewById(R.id.ll_schedules).setVisibility(View.VISIBLE);
                        }
                        ScoreFragment.this.seriesPage++;
                    }
                }
            });
        }
    }

    public class ModelTeams {
        String awayTeamID;
        String awayTeamShortName;
        String homeTeamID;
        String homeTeamShortName;

        public ModelTeams(String str, String str2, String str3, String str4) {
            this.homeTeamID = str;
            this.awayTeamID = str2;
            this.homeTeamShortName = str3;
            this.awayTeamShortName = str4;
        }

        public String getHomeTeamID() {
            return this.homeTeamID;
        }

        public String getAwayTeamID() {
            return this.awayTeamID;
        }

        public String getHomeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String getAwayTeamShortName() {
            return this.awayTeamShortName;
        }
    }

    private void getMatchDetail(final ArrayList<FeaturematchQuery.Featurematch> arrayList) {
        Activity activity = myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {

                public void run() {
                    ArrayList arrayList = new ArrayList();
                    if (arrayList == null || arrayList.isEmpty()) {
                        ScoreFragment.this.progress_featureMatch.setVisibility(View.GONE);
                        return;
                    }
                    ScoreFragment.this.featurematchAd.clear();
                    if (Glob.adCountInCategory == 0) {
                        ScoreFragment.this.featurematchAd.addAll(arrayList);
                    } else {
                        int i = 0;
                        while (i < arrayList.size()) {
                            int i2 = i + 1;
                            if (i2 % Glob.adCountInCategory == 0) {
                                ScoreFragment.this.featurematchAd.add((FeaturematchQuery.Featurematch) arrayList.get(i));
                                ScoreFragment.this.featurematchAd.add(null);
                            } else {
                                ScoreFragment.this.featurematchAd.add((FeaturematchQuery.Featurematch) arrayList.get(i));
                            }
                            i = i2;
                        }
                    }
                    if (ScoreFragment.this.isFirst) {
                        ScoreFragment.this.adapterFeatureMatch.notifyDataSetChanged();
                        if (ScoreFragment.this.featurematchAd.get(0) == null) {
                            ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                            ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                            ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                        } else if (ScoreFragment.this.featurematchAd.get(0).matchStatus().equals("completed")) {
                            ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                            ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                            ScoreFragment.this.ll_match_summary.setVisibility(View.VISIBLE);
                            ;
                            ScoreFragment scoreFragment = ScoreFragment.this;
                            scoreFragment.setMatchSummary(scoreFragment.featurematchAd.get(0).matchID(), ScoreFragment.this.featurematchAd.get(0).currentinningsNo(), ScoreFragment.this.featurematchAd.get(0).matchStatus());
                        } else if (ScoreFragment.this.featurematchAd.get(0).matchStatus().equals("live")) {
                            ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                            ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                            ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                            if (((FeaturematchQuery.Featurematch) arrayList.get(0)).isCricklyticsAvailable() != null && ((FeaturematchQuery.Featurematch) arrayList.get(0)).isCricklyticsAvailable().booleanValue()) {
                                ScoreFragment.this.ll_prediction.setVisibility(View.VISIBLE);
                                ;
                                ScoreFragment scoreFragment2 = ScoreFragment.this;
                                scoreFragment2.setMatchCricklytics(scoreFragment2.featurematchAd.get(0).matchID(), ScoreFragment.this.featurematchAd.get(0).matchType(), ScoreFragment.this.featurematchAd.get(0).matchStatus(), ScoreFragment.this.featurematchAd.get(0).currentinningsNo());
                            }
                        } else if (ScoreFragment.this.featurematchAd.get(0).matchStatus().equals("upcoming")) {
                            ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                            ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                            ScoreFragment.this.ll_prediction_uc.setVisibility(View.VISIBLE);
                            ;
                            ScoreFragment scoreFragment3 = ScoreFragment.this;
                            ModelTeams modelTeams = new ModelTeams(scoreFragment3.featurematchAd.get(0).homeTeamID(), ScoreFragment.this.featurematchAd.get(0).awayTeamID(), ScoreFragment.this.featurematchAd.get(0).homeTeamName(), ScoreFragment.this.featurematchAd.get(0).awayTeamName());
                            ScoreFragment scoreFragment4 = ScoreFragment.this;
                            scoreFragment4.setMatchCricklyticsUc(scoreFragment4.featurematchAd.get(0).matchID(), ScoreFragment.this.featurematchAd.get(0).matchType(), ScoreFragment.this.featurematchAd.get(0).matchStatus(), ScoreFragment.this.featurematchAd.get(0).currentinningsNo(), modelTeams);
                        }
                        ScoreFragment.this.isFirst = false;
                    } else {
                        ScoreFragment.this.adapterFeatureMatch.notifyItemChanged(ScoreFragment.this.selectedPosition);
                        if (ScoreFragment.this.selectedPosition == 0) {
                            ScoreFragment.this.adapterFeatureMatch.notifyItemRangeChanged(0, ScoreFragment.this.featurematchAd.size(), ScoreFragment.this.featurematchAd);
                        }
                    }
                    ScoreFragment.this.slider_feature_match.addOnScrollListener(new RecyclerView.OnScrollListener() {


                        @Override
                        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                            super.onScrollStateChanged(recyclerView, i);
                            if (i == 0) {
                                int findFirstVisibleItemPosition = ((LinearLayoutManager) ScoreFragment.this.slider_feature_match.getLayoutManager()).findFirstVisibleItemPosition();
                                if (ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition) == null) {
                                    ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                                } else if (ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus().equals("completed")) {
                                    ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_match_summary.setVisibility(View.VISIBLE);
                                    ;
                                    ScoreFragment.this.setMatchSummary(ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchID(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).currentinningsNo(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus());
                                } else if (ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus().equals("live")) {
                                    ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                                    if (((FeaturematchQuery.Featurematch) arrayList.get(findFirstVisibleItemPosition)).isCricklyticsAvailable() != null && ((FeaturematchQuery.Featurematch) arrayList.get(findFirstVisibleItemPosition)).isCricklyticsAvailable().booleanValue()) {
                                        ScoreFragment.this.ll_prediction.setVisibility(View.VISIBLE);
                                        ;
                                        ScoreFragment.this.setMatchCricklytics(ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchID(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchType(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).currentinningsNo());
                                    }
                                } else if (ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus().equals("upcoming")) {
                                    ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                                    ScoreFragment.this.ll_prediction_uc.setVisibility(View.VISIBLE);
                                    ;
                                    ScoreFragment.this.setMatchCricklyticsUc(ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchID(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchType(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).matchStatus(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).currentinningsNo(), new ModelTeams(ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).homeTeamID(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).awayTeamID(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).homeTeamName(), ScoreFragment.this.featurematchAd.get(findFirstVisibleItemPosition).awayTeamName()));
                                }
                                ScoreFragment.this.selectedPosition = findFirstVisibleItemPosition;
                            }
                        }
                    });
                    ScoreFragment.this.progress_featureMatch.setVisibility(View.GONE);
                }
            });
        }
    }


    private void setMatchSummary(final String str, final String str2, final String str3) {
        if (myActivity != null) {
            this.graphqlApi.getMatchSummary(str, str3, new Interface.GetMatchSummary() {

                @Override
                public void getResponse(final MatchSummaryQuery.MatchSummary matchSummary) {
                    if (ScoreFragment.myActivity != null) {
                        ScoreFragment.myActivity.runOnUiThread(new Runnable() {


                            public void run() {
                                if (matchSummary != null) {
                                    ((RelativeLayout) ScoreFragment.this.view.findViewById(R.id.rl_next)).setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
                                            ScoreFragment.this.matchId = str;
                                            ScoreFragment.this.currentInnings = str2;
                                            ScoreFragment.this.onShowInterstitialAd(str3);
                                        }
                                    });
                                    ((LinearLayout) ScoreFragment.this.view.findViewById(R.id.ll_match_summary)).setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
                                            ScoreFragment.this.matchId = str;
                                            ScoreFragment.this.currentInnings = str2;
                                            ScoreFragment.this.onShowInterstitialAd(str3);
                                        }
                                    });
                                    RequestManager with = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + matchSummary.bestBatsman().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_player));
                                    RequestManager with2 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with2.load(Glob.teams_start + matchSummary.bestBatsman().playerTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_name)).setText(matchSummary.bestBatsman().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_score)).setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).runs().toString()));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_ball)).setText("(" + matchSummary.bestBatsman().battingStatsList().get(0).balls() + ")");
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_6s)).setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).sixes().toString()));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_4s)).setText(Glob.getString(matchSummary.bestBatsman().battingStatsList().get(0).fours().toString()));
                                    RequestManager with3 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + matchSummary.bestBowler().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_player_bowler));
                                    RequestManager with4 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with4.load(Glob.teams_start + matchSummary.bestBowler().playerTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_bowler));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_name_bowler)).setText(matchSummary.bestBowler().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_b_wicket)).setText(matchSummary.bestBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.bestBowler().bowlingStatsList().get(0).runsConceded());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_b_over)).setText("(" + matchSummary.bestBowler().bowlingStatsList().get(0).overs() + ")");
                                    TextView textView = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_batterRunner_score);
                                    TextView textView2 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_bowlerRunner);
                                    TextView textView3 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_bowlerRunner_wicket);
                                    RequestManager with5 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with5.load(Glob.teams_start + matchSummary.homeTeamData().teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_home));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home)).setText(matchSummary.homeTeamData().teamName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_score)).setText(matchSummary.homeTeamData().runs().get(0) + "/" + matchSummary.homeTeamData().wickets().get(0));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_over)).setText("(" + matchSummary.homeTeamData().overs().get(0) + ")");
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_batterTop)).setText(matchSummary.homeTeamData().batsmanSummary1().topBatsman().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_batterTop_score)).setText("" + matchSummary.homeTeamData().batsmanSummary1().topBatsman().battingStatsList().get(0).runs());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_bowlerTop)).setText(matchSummary.awayTeamData().bowlerSummary1().topBowler().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_bowlerTop_wicket)).setText(matchSummary.awayTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.awayTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).runsConceded());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_home_batterRunner)).setText(matchSummary.homeTeamData().batsmanSummary1().runnerBatsman().playerName());
                                    textView.setText("" + matchSummary.homeTeamData().batsmanSummary1().runnerBatsman().battingStatsList().get(0).runs());
                                    textView2.setText(matchSummary.awayTeamData().bowlerSummary1().runnerBowler().playerName());
                                    textView3.setText(matchSummary.awayTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.awayTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).runsConceded());
                                    TextView textView4 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_batterRunner);
                                    TextView textView5 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_batterRunner_score);
                                    TextView textView6 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_bowlerRunner);
                                    TextView textView7 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_bowlerRunner_wicket);
                                    RequestManager with6 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with6.load(Glob.teams_start + matchSummary.awayTeamData().teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into((ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_away));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away)).setText(matchSummary.awayTeamData().teamName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_score)).setText(matchSummary.awayTeamData().runs().get(0) + "/" + matchSummary.awayTeamData().wickets().get(0));
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_over)).setText("(" + matchSummary.awayTeamData().overs().get(0) + ")");
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_batterTop)).setText(matchSummary.awayTeamData().batsmanSummary1().topBatsman().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_batterTop_score)).setText("" + matchSummary.awayTeamData().batsmanSummary1().topBatsman().battingStatsList().get(0).runs());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_bowlerTop)).setText(matchSummary.homeTeamData().bowlerSummary1().topBowler().playerName());
                                    ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_away_bowlerTop_wicket)).setText(matchSummary.homeTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.homeTeamData().bowlerSummary1().topBowler().bowlingStatsList().get(0).runsConceded());
                                    textView4.setText(matchSummary.awayTeamData().batsmanSummary1().runnerBatsman().playerName());
                                    textView5.setText("" + matchSummary.awayTeamData().batsmanSummary1().runnerBatsman().battingStatsList().get(0).runs());
                                    textView6.setText(matchSummary.homeTeamData().bowlerSummary1().runnerBowler().playerName());
                                    textView7.setText(matchSummary.homeTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).wickets() + "/" + matchSummary.homeTeamData().bowlerSummary1().runnerBowler().bowlingStatsList().get(0).runsConceded());
                                    return;
                                }
                                ScoreFragment.this.ll_match_summary.setVisibility(View.GONE);
                            }
                        });
                    }
                }
            });
        }
    }

    public class ModelTeam {
        String teamId;
        String teamName;

        public ModelTeam() {
        }

        public void ModelTeam(String str, String str2) {
            this.teamId = str;
            this.teamName = str2;
        }

        public String getTeamId() {
            return this.teamId;
        }

        public String getTeamName() {
            return this.teamName;
        }
    }


    private void setMatchCricklytics(final String str, final String str2, String str3, final String str4) {
        final String val$matchIds;
        final String val$matchType;

        if (myActivity != null) {
            val$matchIds = str;
            val$matchType = str3;

            this.graphqlApi.getCriclyticsCommonApi(str, new Interface.GetcriclyticsCommonApi() {

                @Override
                public void getResponse(final GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi) {
                    if (ScoreFragment.myActivity != null) {
                        ScoreFragment.myActivity.runOnUiThread(new Runnable() {


                            public void run() {
                                String str;
                                int i;
                                LinearLayout linearLayout;
                                String str2;
                                int i2;
                                GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi2 = getcriclyticsCommonApi;
                                if (getcriclyticsCommonApi2 == null || getcriclyticsCommonApi2.TeamProjections() == null || getcriclyticsCommonApi.TeamProjections().get(0) == null) {
                                    ScoreFragment.this.ll_prediction.setVisibility(View.GONE);
                                    return;
                                }
                                ScoreFragment.this.getPlayerProjection(val$matchIds);
                                ((RelativeLayout) ScoreFragment.this.view.findViewById(R.id.rl_next_)).setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View view) {
                                        ScoreFragment.this.matchId = val$matchIds;
                                        ScoreFragment.this.currentInnings = str4;
                                        ScoreFragment.this.matchTypes = val$matchType;
                                        ScoreFragment.this.onShowInterstitialAd("criclyticsLive");
                                    }
                                });
                                ((LinearLayout) ScoreFragment.this.view.findViewById(R.id.ll_prediction)).setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View view) {
                                        ScoreFragment.this.matchId = val$matchIds;
                                        ScoreFragment.this.currentInnings = str4;
                                        ScoreFragment.this.matchTypes = val$matchType;
                                        ScoreFragment.this.onShowInterstitialAd("criclyticsLive");
                                    }
                                });
                                LinearLayout linearLayout2 = (LinearLayout) ScoreFragment.this.view.findViewById(R.id.ll_two_innings);
                                TextView textView = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_one);
                                TextView textView2 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_one);
                                TextView textView3 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_one);
                                TextView textView4 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_one);
                                TextView textView5 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_one);
                                ImageView imageView = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_one);
                                TextView textView6 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_two);
                                TextView textView7 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_two);
                                TextView textView8 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_two);
                                TextView textView9 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_two);
                                TextView textView10 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_two);
                                ImageView imageView2 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_two);
                                LinearLayout linearLayout3 = (LinearLayout) ScoreFragment.this.view.findViewById(R.id.ll_test);
                                ImageView imageView3 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_inning1);
                                TextView textView11 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_inning1);
                                TextView textView12 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_inning1);
                                TextView textView13 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_inning1);
                                TextView textView14 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_inning1);
                                TextView textView15 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_inning1);
                                ImageView imageView4 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_inning2);
                                TextView textView16 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_inning2);
                                TextView textView17 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_inning2);
                                TextView textView18 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_inning2);
                                TextView textView19 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_inning2);
                                TextView textView20 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_inning2);
                                ImageView imageView5 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_inning3);
                                TextView textView21 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_inning3);
                                TextView textView22 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_inning3);
                                TextView textView23 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_inning3);
                                TextView textView24 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_inning3);
                                TextView textView25 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_inning3);
                                ImageView imageView6 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_flag_inning4);
                                TextView textView26 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_inning4);
                                TextView textView27 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_score_inning4);
                                TextView textView28 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_over_inning4);
                                TextView textView29 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_score_inning4);
                                TextView textView30 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection_over_inning4);
                                TextView textView31 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_winner_prediction);
                                ArrayList<ModelTeam> arrayList = new ArrayList<>();
                                ModelTeam modelTeam = new ModelTeam();
                                modelTeam.ModelTeam(getcriclyticsCommonApi.TeamProjections().get(0).team1Id(), getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                                arrayList.add(modelTeam);
                                ModelTeam modelTeam2 = new ModelTeam();
                                modelTeam2.ModelTeam(getcriclyticsCommonApi.TeamProjections().get(0).team2Id(), getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                                arrayList.add(modelTeam2);
                                String format = String.format("%s%s%s", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).currentScore()), "/", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).currentWickets()));
                                String format2 = String.format("%s%s%s", "(", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).currentOvers()), ")");
                                String format3 = String.format("%s%s%s", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).predictedScore()), "/", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).predictedWicket()));
                                String format4 = String.format("%s%s%s", "(", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).predictedOver()), ")");
                                if (val$matchType.equalsIgnoreCase("ODI") || val$matchType.equalsIgnoreCase("T20")) {
                                    linearLayout3.setVisibility(View.GONE);
                                    str = Glob.getInt(getcriclyticsCommonApi.TeamProjections().get(0).tiePercentage());
                                    textView3.setText(getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                                    textView8.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                                    RequestManager with = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView);
                                    RequestManager with2 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with2.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView2);
                                    if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("1")) {
                                        textView.setText(format);
                                        textView2.setText(format2);
                                        textView4.setText(format3);
                                        textView5.setText(format4);
                                    } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                                        textView6.setText(format);
                                        textView7.setText(format2);
                                        textView.setText(format3);
                                        textView2.setText(format4);
                                    }
                                    i = 0;
                                    str2 = "%s%s%s";
                                    textView9.setText(String.format(str2, Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedScore()), "/", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedWicket())));
                                    textView10.setText(String.format(str2, "(", Glob.getString(getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedOVer()), ")"));
                                    linearLayout = linearLayout2;
                                    linearLayout.setVisibility(View.VISIBLE);
                                    ;
                                } else {
                                    str = "0";
                                    linearLayout = linearLayout2;
                                    str2 = "%s%s%s";
                                    i = 0;
                                }
                                if (str2.equalsIgnoreCase("Test")) {
                                    linearLayout.setVisibility(View.GONE);
                                    str = Glob.getInt(getcriclyticsCommonApi.TeamProjections().get(i).tiePercentage());
                                    textView11.setText(getcriclyticsCommonApi.TeamProjections().get(i).team1ShortName());
                                    RequestManager with3 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with3.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView3);
                                    textView16.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                                    RequestManager with4 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with4.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView4);
                                    textView21.setText(getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                                    RequestManager with5 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with5.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView5);
                                    textView26.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                                    RequestManager with6 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) with6.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(imageView6);
                                    String format5 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedScore(), "/", getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedWicket());
                                    String format6 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedOVer(), ")");
                                    String format7 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedScore(), "/", getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedWicket());
                                    String format8 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedOver(), ")");
                                    String format9 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedScore(), "/", getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedWicket());
                                    String format10 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedOver(), ")");
                                    if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("1")) {
                                        textView12.setText(format);
                                        textView13.setText(format2);
                                        textView14.setText(format3);
                                        textView15.setText(format3);
                                        textView19.setText(format5);
                                        textView20.setText(format6);
                                        textView24.setText(format7);
                                        textView25.setText(format8);
                                        textView29.setText(format9);
                                        textView30.setText(format10);
                                    } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                                        textView12.setText(format3);
                                        textView13.setText(format4);
                                        textView17.setText(format);
                                        textView18.setText(format2);
                                        textView19.setText(format5);
                                        textView20.setText(format6);
                                        textView24.setText(format7);
                                        textView25.setText(format8);
                                        textView29.setText(format9);
                                        textView30.setText(format10);
                                    } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                        textView12.setText(format3);
                                        textView13.setText(format4);
                                        textView17.setText(format5);
                                        textView18.setText(format6);
                                        textView22.setText(format);
                                        textView23.setText(format2);
                                        textView24.setText(format7);
                                        textView25.setText(format8);
                                        textView29.setText(format9);
                                        textView30.setText(format10);
                                    } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("4")) {
                                        textView12.setText(format3);
                                        textView13.setText(format4);
                                        textView17.setText(format5);
                                        textView18.setText(format6);
                                        textView22.setText(format7);
                                        textView23.setText(format8);
                                        textView27.setText(format);
                                        textView28.setText(format2);
                                        textView29.setText(format9);
                                        textView30.setText(format10);
                                    }
                                    i2 = 0;
                                    linearLayout3.setVisibility(View.VISIBLE);
                                    ;
                                } else {
                                    i2 = 0;
                                }
                                String teamName = ScoreFragment.this.getTeamName(arrayList, getcriclyticsCommonApi.TeamProjections().get(i2).predictvizMarginView().winnerTeamId());
                                Object[] objArr = new Object[3];
                                objArr[i2] = teamName;
                                objArr[1] = " to win by " + getcriclyticsCommonApi.TeamProjections().get(i2).predictvizMarginView().wickets();
                                objArr[2] = " Wickets";
                                String format11 = String.format("%s %s %s", objArr);
                                if (Integer.parseInt(str) > 50) {
                                    format11 = "Match to end in Draw";
                                } else if (getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().wickets().equals("")) {
                                    format11 = String.format("%s %s %s", teamName, " to win by " + getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().runs(), " Runs");
                                }
                                textView31.setText(format11);
                            }
                        });
                    }
                }
            });
        }
    }


    private void getPlayerProjection(String str) {
        if (myActivity != null) {
            this.graphqlApi.getLivePlayerProjectionDetails(str, new Interface.GetLivePlayerProjectionDetails() {


                @Override
                public void getResponse(final GetLivePlayerProjectionDetailsQuery.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails) {
                    if (ScoreFragment.myActivity != null) {
                        ScoreFragment.myActivity.runOnUiThread(new Runnable() {


                            public void run() {
                                if (getLivePlayerProjectionDetails != null) {
                                    RecyclerView recyclerView = (RecyclerView) ScoreFragment.this.view.findViewById(R.id.rv_player_projection);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(ScoreFragment.myActivity));
                                    ImageView imageView = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_playerImage);
                                    TextView textView = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_player_name);
                                    TextView textView2 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team_name);
                                    TextView textView3 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_player_run);
                                    TextView textView4 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_player_bol);
                                    TextView textView5 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_projection);
                                    if (getLivePlayerProjectionDetails.batsman() == null || getLivePlayerProjectionDetails.batsman().isEmpty()) {
                                        recyclerView.setVisibility(View.GONE);
                                        ScoreFragment.this.view.findViewById(R.id.ll_player_projection).setVisibility(View.GONE);
                                        return;
                                    }
                                    AdapterBatsmanProjection adapterBatsmanProjection = new AdapterBatsmanProjection();
                                    adapterBatsmanProjection.AdapterBatsmanProjection(ScoreFragment.myActivity, getLivePlayerProjectionDetails.batsman());
                                    recyclerView.setAdapter(adapterBatsmanProjection);
                                    if (getLivePlayerProjectionDetails.bowler() != null) {
                                        ((RequestBuilder) ((RequestBuilder) Glide.with(ScoreFragment.myActivity).load(Glob.player_start + getLivePlayerProjectionDetails.bowler().bowlerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(imageView);
                                        String bowlerName = getLivePlayerProjectionDetails.bowler().bowlerName();
                                        textView.setText(bowlerName);
                                        textView2.setText(getLivePlayerProjectionDetails.bowler().teamName());
                                        if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().wicketsTakenTillNow() + "")) {
                                            if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().bowlerRuns() + "")) {
                                                textView3.setText(String.format("%s%s%s", getLivePlayerProjectionDetails.bowler().wicketsTakenTillNow(), "/", getLivePlayerProjectionDetails.bowler().bowlerRuns()));
                                            }
                                        }
                                        String str = getLivePlayerProjectionDetails.bowler().oversBowledSoFar() + "";
                                        if (!Glob.isNull(str)) {
                                            textView4.setText(String.format("%s%s%s", "(", str, ")"));
                                        }
                                        if (getLivePlayerProjectionDetails.bowler().bounds() != null && !getLivePlayerProjectionDetails.bowler().bounds().isEmpty()) {
                                            if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().bounds() + "")) {
                                                ScoreFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.VISIBLE);
                                                ;
                                                String str2 = getLivePlayerProjectionDetails.bowler().bounds().get(0);
                                                if (getLivePlayerProjectionDetails.bowler().bounds().size() > 1) {
                                                    str2 = getLivePlayerProjectionDetails.bowler().bounds().get(1);
                                                }
                                                textView5.setText(String.format("%s %s %s %s %s", "Criclytics predicts ", bowlerName, " to pick ", str2, " wickets"));
                                                ScoreFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.VISIBLE);
                                                ;
                                            }
                                        }
                                        ScoreFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.GONE);
                                    } else {
                                        ScoreFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.GONE);
                                    }
                                    recyclerView.setVisibility(View.VISIBLE);
                                    ;
                                    return;
                                }
                                ScoreFragment.this.view.findViewById(R.id.ll_player_projection).setVisibility(View.GONE);
                            }
                        });
                    }
                }
            });
        }
    }

    public String getTeamName(ArrayList<ModelTeam> arrayList, String str) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        Iterator<ModelTeam> it = arrayList.iterator();
        while (it.hasNext()) {
            ModelTeam next = it.next();
            if (next.getTeamId().equals(str)) {
                return next.getTeamName();
            }
        }
        return "";
    }


    private void setMatchCricklyticsUc(final String str, final String str2, String str3, final String str4, ModelTeams modelTeams) {
        if (myActivity != null) {
            this.graphqlApi.GetHomepageRecentForm(modelTeams.getHomeTeamID(), modelTeams.getAwayTeamID(), modelTeams.getHomeTeamShortName(), modelTeams.getAwayTeamShortName(), new Interface.GetHomepageRecentForm() {

                @Override
                public void getResponse(final HomepageRecentFormQuery.HomepageRecentForm homepageRecentForm) {
                    if (ScoreFragment.myActivity != null) {
                        ScoreFragment.myActivity.runOnUiThread(new Runnable() {

                            public void run() {
                                HomepageRecentFormQuery.HomepageRecentForm homepageRecentForm2 = homepageRecentForm;
                                if (homepageRecentForm2 == null || homepageRecentForm2.homeTeamData() == null || homepageRecentForm.awayTeamData() == null || homepageRecentForm.homeTeamData().isEmpty() || homepageRecentForm.awayTeamData().isEmpty()) {
                                    ScoreFragment.this.view.findViewById(R.id.ll_recentForm).setVisibility(View.GONE);
                                    return;
                                }
                                ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_home_team)).setText(Glob.getString(homepageRecentForm.homeTeamName()));
                                ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_away_team)).setText(Glob.getString(homepageRecentForm.awayTeamName()));
                                RecyclerView recyclerView = (RecyclerView) ScoreFragment.this.view.findViewById(R.id.rv_home);
                                recyclerView.setLayoutManager(new LinearLayoutManager(ScoreFragment.myActivity, RecyclerView.HORIZONTAL, false));
                                RecyclerView recyclerView2 = (RecyclerView) ScoreFragment.this.view.findViewById(R.id.rv_away);
                                recyclerView2.setLayoutManager(new LinearLayoutManager(ScoreFragment.myActivity, RecyclerView.HORIZONTAL, false));
                                recyclerView.setAdapter(new AdapterRecetFormHome(homepageRecentForm.homeTeamData(), new OnItemClickListener() {

                                    @Override
                                    public void onClick() {
                                        ScoreFragment.this.matchId = str;
                                        ScoreFragment.this.currentInnings = str4;
                                        ScoreFragment.this.matchTypes = str2;
                                        ScoreFragment.this.onShowInterstitialAd("criclyticsUc");
                                    }
                                }));
                                recyclerView2.setAdapter(new AdapterRecetFormAway(homepageRecentForm.awayTeamData(), new OnItemClickListener() {

                                    @Override
                                    public void onClick() {
                                        ScoreFragment.this.matchId = str;
                                        ScoreFragment.this.currentInnings = str4;
                                        ScoreFragment.this.matchTypes = str2;
                                        ScoreFragment.this.onShowInterstitialAd("criclyticsUc");
                                    }
                                }));
                                ScoreFragment.this.view.findViewById(R.id.ll_recentForm).setVisibility(View.VISIBLE);
                                ;
                            }
                        });
                    }
                }
            });
            this.graphqlApi.getKeyStates(str, new Interface.GetKeyStats() {

                @Override
                public void getResponse(final GetKeyStatsQuery.GetKeyStats getKeyStats) {
                    if (ScoreFragment.myActivity != null) {
                        ScoreFragment.myActivity.runOnUiThread(new Runnable() {


                            public void run() {
                                TextView textView;
                                TextView textView2;
                                TextView textView3;
                                TextView textView4;
                                ImageView imageView;
                                TextView textView5;
                                TextView textView6;
                                TextView textView7;
                                TextView textView8;
                                TextView textView9;
                                if (getKeyStats != null) {
                                    ((RelativeLayout) ScoreFragment.this.view.findViewById(R.id.rl_next_uc)).setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
                                            ScoreFragment.this.matchId = str;
                                            ScoreFragment.this.currentInnings = str4;
                                            ScoreFragment.this.matchTypes = str2;
                                            ScoreFragment.this.onShowInterstitialAd("criclyticsUc");
                                        }
                                    });
                                    ((LinearLayout) ScoreFragment.this.view.findViewById(R.id.ll_prediction_uc)).setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
                                            ScoreFragment.this.matchId = str;
                                            ScoreFragment.this.currentInnings = str4;
                                            ScoreFragment.this.matchTypes = str2;
                                            ScoreFragment.this.onShowInterstitialAd("criclyticsUc");
                                        }
                                    });
                                    TextView textView10 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_stadium);
                                    TextView textView11 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_1st_batting_avg);
                                    TextView textView12 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_1st_batting_win);
                                    TextView textView13 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_highest_score_chased);
                                    TextView textView14 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_pace);
                                    TextView textView15 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_spin);
                                    TextView textView16 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_scorer);
                                    TextView textView17 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_scorer);
                                    TextView textView18 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_scorer);
                                    TextView textView19 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_scorer);
                                    TextView textView20 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_scorer_run);
                                    TextView textView21 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_scorer_run);
                                    TextView textView22 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_scorer_avg);
                                    TextView textView23 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_scorer_avg);
                                    ImageView imageView2 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_team1_top_scorer);
                                    ImageView imageView3 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_team2_top_scorer);
                                    TextView textView24 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_taker);
                                    TextView textView25 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_taker);
                                    TextView textView26 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_taker);
                                    TextView textView27 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_taker);
                                    TextView textView28 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_taker_wicket);
                                    TextView textView29 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_taker_wicket);
                                    TextView textView30 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team1_top_taker_avg);
                                    TextView textView31 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_team2_top_taker_avg);
                                    ImageView imageView4 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_team1_top_taker);
                                    ImageView imageView5 = (ImageView) ScoreFragment.this.view.findViewById(R.id.img_team2_top_taker);
                                    if (getKeyStats.head2headStats() != null) {
                                        Integer num = getKeyStats.head2headStats().head2Head().totalMatches();
                                        if (num == null || num.intValue() == 0) {
                                            imageView = imageView2;
                                            textView7 = textView13;
                                            textView8 = textView14;
                                            textView9 = textView15;
                                            textView = textView16;
                                            textView5 = textView17;
                                            textView2 = textView18;
                                            textView6 = textView19;
                                            textView3 = textView20;
                                            textView4 = textView22;
                                            ScoreFragment.this.view.findViewById(R.id.ll_headToHead).setVisibility(View.GONE);
                                        } else {
                                            textView6 = textView19;
                                            textView5 = textView17;
                                            imageView = imageView2;
                                            ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_last)).setText(String.format("%s %s %s", "*last", num, "matches"));
                                            int intValue = getKeyStats.head2headStats().head2Head().teamA().intValue();
                                            int intValue2 = getKeyStats.head2headStats().head2Head().teamB().intValue();
                                            int intValue3 = getKeyStats.head2headStats().head2Head().noResult().intValue();
                                            textView4 = textView22;
                                            textView3 = textView20;
                                            TextView textView32 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_matches);
                                            textView2 = textView18;
                                            textView = textView16;
                                            TextView textView33 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_team1_win);
                                            textView9 = textView15;
                                            textView8 = textView14;
                                            TextView textView34 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_team2_win);
                                            textView7 = textView13;
                                            TextView textView35 = (TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_tie);
                                            textView32.setTypeface(Glob.oswald_medium);
                                            textView33.setTypeface(Glob.oswald_medium);
                                            textView34.setTypeface(Glob.oswald_medium);
                                            textView35.setTypeface(Glob.oswald_medium);
                                            textView32.setText(Glob.getString(num + ""));
                                            ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_team1)).setText(getKeyStats.head2headStats().teamA().teamShortName());
                                            textView33.setText(Glob.getString(intValue + ""));
                                            ((TextView) ScoreFragment.this.view.findViewById(R.id.txt_hth_team2)).setText(getKeyStats.head2headStats().teamB().teamShortName());
                                            textView34.setText(Glob.getString(intValue2 + ""));
                                            textView35.setText(Glob.getString(intValue3 + ""));
                                            ScoreFragment.this.view.findViewById(R.id.ll_headToHead).setVisibility(View.VISIBLE);
                                            ;
                                        }
                                        if (getKeyStats.head2headStats().venueStatsData() == null || getKeyStats.head2headStats().venueStatsData().avgFirstInningScore() == null) {
                                            ScoreFragment.this.view.findViewById(R.id.ll_stadium).setVisibility(View.GONE);
                                        } else {
                                            textView10.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().venueName()));
                                            textView11.setTypeface(Glob.oswald_medium);
                                            textView11.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().avgFirstInningScore()));
                                            textView12.setTypeface(Glob.oswald_medium);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().firstBattingWinPercent() + ""));
                                            sb.append("%");
                                            textView12.setText(sb.toString());
                                            textView7.setTypeface(Glob.oswald_medium);
                                            textView7.setText(Glob.getString(getKeyStats.head2headStats().venueStatsData().highestScoreChased()));
                                            textView8.setTypeface(Glob.oswald_medium);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().paceWicketPercent() + ""));
                                            sb2.append("%");
                                            textView8.setText(sb2.toString());
                                            textView9.setTypeface(Glob.oswald_medium);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(Glob.getString(getKeyStats.head2headStats().venueStatsData().spinWicketPercent() + ""));
                                            sb3.append("%");
                                            textView9.setText(sb3.toString());
                                            ScoreFragment.this.view.findViewById(R.id.ll_stadium).setVisibility(View.VISIBLE);
                                            ;
                                        }
                                    } else {
                                        imageView = imageView2;
                                        textView = textView16;
                                        textView5 = textView17;
                                        textView2 = textView18;
                                        textView6 = textView19;
                                        textView3 = textView20;
                                        textView4 = textView22;
                                        ScoreFragment.this.view.findViewById(R.id.ll_stadium).setVisibility(View.GONE);
                                        ScoreFragment.this.view.findViewById(R.id.ll_headToHead).setVisibility(View.GONE);
                                    }
                                    if (getKeyStats.topRunScorer1() == null || getKeyStats.topRunScorer1().fullName() == null || getKeyStats.topRunScorer2() == null || getKeyStats.topRunScorer2().fullName() == null) {
                                        ScoreFragment.this.view.findViewById(R.id.ll_top_run).setVisibility(View.GONE);
                                    } else {
                                        textView.setText(getKeyStats.topRunScorer1().fullName());
                                        textView2.setText(getKeyStats.topRunScorer1().playerName());
                                        textView3.setTypeface(Glob.oswald_medium);
                                        textView4.setTypeface(Glob.oswald_medium);
                                        textView3.setText(getKeyStats.topRunScorer1().playerRuns() + "");
                                        textView4.setText(getKeyStats.topRunScorer1().average() + "");
                                        RequestManager with = Glide.with(ScoreFragment.myActivity);
                                        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + getKeyStats.topRunScorer1().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(imageView);
                                        textView5.setText(getKeyStats.topRunScorer2().fullName());
                                        textView6.setText(getKeyStats.topRunScorer2().playerName());
                                        textView21.setTypeface(Glob.oswald_medium);
                                        textView23.setTypeface(Glob.oswald_medium);
                                        textView21.setText(getKeyStats.topRunScorer2().playerRuns() + "");
                                        textView23.setText(getKeyStats.topRunScorer2().average() + "");
                                        RequestManager with2 = Glide.with(ScoreFragment.myActivity);
                                        ((RequestBuilder) ((RequestBuilder) with2.load(Glob.player_start + getKeyStats.topRunScorer2().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(imageView3);
                                        ScoreFragment.this.view.findViewById(R.id.ll_top_run).setVisibility(View.VISIBLE);
                                        ;
                                    }
                                    if (getKeyStats.topWicketTaker1() == null || getKeyStats.topWicketTaker1().fullName() == null || getKeyStats.topWicketTaker2() == null || getKeyStats.topWicketTaker2().fullName() == null) {
                                        ScoreFragment.this.view.findViewById(R.id.ll_top_wicket).setVisibility(View.GONE);
                                        return;
                                    }
                                    textView24.setText(getKeyStats.topWicketTaker1().fullName());
                                    textView26.setText(getKeyStats.topWicketTaker1().playerName());
                                    textView28.setTypeface(Glob.oswald_medium);
                                    textView30.setTypeface(Glob.oswald_medium);
                                    textView28.setText(getKeyStats.topWicketTaker1().totalWickets() + "");
                                    textView30.setText(getKeyStats.topWicketTaker1().average() + "");
                                    RequestManager with3 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) ((RequestBuilder) with3.load(Glob.player_start + getKeyStats.topWicketTaker1().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(imageView4);
                                    textView25.setText(getKeyStats.topWicketTaker2().fullName());
                                    textView27.setText(getKeyStats.topWicketTaker2().playerName());
                                    textView29.setTypeface(Glob.oswald_medium);
                                    textView31.setTypeface(Glob.oswald_medium);
                                    textView29.setText(getKeyStats.topWicketTaker2().totalWickets() + "");
                                    textView31.setText(getKeyStats.topWicketTaker2().average() + "");
                                    RequestManager with4 = Glide.with(ScoreFragment.myActivity);
                                    ((RequestBuilder) ((RequestBuilder) with4.load(Glob.player_start + getKeyStats.topWicketTaker2().playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(imageView5);
                                    ScoreFragment.this.view.findViewById(R.id.ll_top_wicket).setVisibility(View.VISIBLE);
                                    ;
                                    return;
                                }
                                ScoreFragment.this.ll_prediction_uc.setVisibility(View.GONE);
                            }
                        });
                    }
                }
            });
        }
    }


    public void onClickPrediction(View view2) {
        onShowInterstitialAd("prediction");
    }


    public void onClickFantasy(View view2) {
        onShowInterstitialAd("fantasy");
    }


    public void onClickSchedules(View view2) {
        onShowInterstitialAd("onClickSchedules");
    }


    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(myActivity)) {
            Glob.noInternetDialogShowFragment(myActivity);
            return;
        }
        this.whereLocal = str;
        Intent intent = new Intent(myActivity, TestAdActivity.class);
        intent.putExtra("where", str);
        this.resultLauncher.launch(intent);
        ShowFunUAds();

    }


    private void onNext(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1402931637:
                if (str.equals("completed")) {
                    c = 0;
                    break;
                }
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 1;
                    break;
                }
                break;
            case -492888249:
                if (str.equals("criclyticsLive")) {
                    c = 2;
                    break;
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                    c = 3;
                    break;
                }
                break;
            case 1161234575:
                if (str.equals("prediction")) {
                    c = 4;
                    break;
                }
                break;
            case 1306691868:
                if (str.equals("upcoming")) {
                    c = 5;
                    break;
                }
                break;
            case 1807186899:
                if (str.equals("onClickSchedules")) {
                    c = 6;
                    break;
                }
                break;
            case 1876580265:
                if (str.equals("criclyticsUc")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(myActivity, MatchCompleteActivity.class);
                intent.putExtra(Glob.MATCH_ID, this.matchId);
                intent.putExtra(Glob.INNINGS, this.currentInnings);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(myActivity, FantasyActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(myActivity, CriclyticsLiveActivity.class);
                intent3.putExtra(Glob.MATCH_ID, this.matchId);
                intent3.putExtra(Glob.INNINGS, this.currentInnings);
                intent3.putExtra(Glob.TYPES, this.matchTypes);
                intent3.putExtra(Glob.MATCH_STATUS, "criclyticsLive");
                intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                return;
            case 3:
                Intent intent4 = new Intent(myActivity, MatchActivity.class);
                intent4.putExtra(Glob.MATCH_ID, this.matchId);
                intent4.putExtra(Glob.INNINGS, this.currentInnings);
                intent4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent4);
                return;
            case 4:
                Intent intent5 = new Intent(myActivity, CriclyticsActivity.class);
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent5);
                return;
            case 5:
                Intent intent6 = new Intent(myActivity, MatchUpComingActivity.class);
                intent6.putExtra(Glob.MATCH_ID, this.matchId);
                intent6.putExtra(Glob.INNINGS, this.currentInnings);
                intent6.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent6);
                return;
            case 6:
                Intent intent7 = new Intent(myActivity, SchedulesActivity.class);
                intent7.putExtra("where", "");
                intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent7);
                return;
            case 7:
                Intent intent8 = new Intent(myActivity, CriclyticsUCActivity.class);
                intent8.putExtra(Glob.MATCH_ID, this.matchId);
                intent8.putExtra(Glob.INNINGS, this.currentInnings);
                intent8.putExtra(Glob.TYPES, this.matchTypes);
                intent8.putExtra(Glob.MATCH_STATUS, "criclyticsLive");
                intent8.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent8);
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
        Glob.freeMemory();
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public class AdapterRecetFormHome extends RecyclerView.Adapter<AdapterRecetFormHome.ViewHolder> {
        List<HomepageRecentFormQuery.HomeTeamDatum> homeTeamData;
        OnItemClickListener onItemClickListener;

        public AdapterRecetFormHome(List<HomepageRecentFormQuery.HomeTeamDatum> list, OnItemClickListener onItemClickListener2) {
            this.onItemClickListener = onItemClickListener2;
            this.homeTeamData = list;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recent_form, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            viewHolder.txt_result.setText(this.homeTeamData.get(i).type());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterRecetFormHome.this.onItemClickListener.onClick();
                }
            });
            if (this.homeTeamData.get(i).type().equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.colorPrimaryVariant, ScoreFragment.myActivity.getTheme()));
            } else if (this.homeTeamData.get(i).type().equalsIgnoreCase("L")) {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.redLight, ScoreFragment.myActivity.getTheme()));
            } else {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.gray_ad_border, ScoreFragment.myActivity.getTheme()));
            }
        }

        @Override
        public int getItemCount() {
            return this.homeTeamData.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            LinearLayout ll_result;
            TextView txt_result;

            public ViewHolder(View view) {
                super(view);
                this.ll_result = (LinearLayout) view.findViewById(R.id.ll_result);
                this.txt_result = (TextView) view.findViewById(R.id.txt_result);
            }
        }
    }

    public class AdapterRecetFormAway extends RecyclerView.Adapter<AdapterRecetFormAway.ViewHolder> {
        List<HomepageRecentFormQuery.AwayTeamDatum> awayTeamData;
        OnItemClickListener onItemClickListener;

        public AdapterRecetFormAway(List<HomepageRecentFormQuery.AwayTeamDatum> list, OnItemClickListener onItemClickListener2) {
            this.onItemClickListener = onItemClickListener2;
            this.awayTeamData = list;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recent_form, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            viewHolder.txt_result.setText(this.awayTeamData.get(i).type());
            if (this.awayTeamData.get(i).type().equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.colorPrimaryVariant, ScoreFragment.myActivity.getTheme()));
            } else if (this.awayTeamData.get(i).type().equalsIgnoreCase("L")) {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.redLight, ScoreFragment.myActivity.getTheme()));
            } else {
                viewHolder.ll_result.setBackgroundColor(ResourcesCompat.getColor(ScoreFragment.this.getResources(), R.color.gray_ad_border, ScoreFragment.myActivity.getTheme()));
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterRecetFormAway.this.onItemClickListener.onClick();
                }
            });
        }

        @Override
        public int getItemCount() {
            return this.awayTeamData.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            LinearLayout ll_result;
            TextView txt_result;

            public ViewHolder(View view) {
                super(view);
                this.ll_result = (LinearLayout) view.findViewById(R.id.ll_result);
                this.txt_result = (TextView) view.findViewById(R.id.txt_result);
            }
        }
    }
}
