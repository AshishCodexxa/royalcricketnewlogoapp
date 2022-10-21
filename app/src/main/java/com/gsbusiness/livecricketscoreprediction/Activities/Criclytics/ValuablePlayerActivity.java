package com.gsbusiness.livecricketscoreprediction.Activities.Criclytics;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.gsbusiness.livecricketscoreprediction.Activities.Player.PlayerDetailActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics.AdapterPredictor;
import com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics.AdapterValuablePlayer;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetQualificationProbabilityQuery;
import com.gsbusiness.livecricketscoreprediction.Models.ModelProbability;
import com.gsbusiness.livecricketscoreprediction.PlayerIndexQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.ArrayList;

public class ValuablePlayerActivity extends AppCompatActivity {
    public static String LOG = "<<<ValuablePlayerActivity>>>";
    ImageView img_info;
    LinearLayout ll_data;
    LinearLayout ll_player;
    LinearLayout ll_predictor;
    String name = "";
    String playerId;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                ValuablePlayerActivity valuablePlayerActivity = ValuablePlayerActivity.this;
                valuablePlayerActivity.onNext(valuablePlayerActivity.whereLocal);
                return;
            }
            ValuablePlayerActivity.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RelativeLayout rl_info;
    RecyclerView rv_player;
    RecyclerView rv_predictor;
    TextView txt_info;
    TextView txt_match;
    TextView txt_title;
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
        setContentView(R.layout.activity_valuable_player);
        BannerIDCardAds();
        this.name = getIntent().getStringExtra(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
        if (this.name.equalsIgnoreCase("Predictor")) {
            initViewPredictor();

            findViewById(R.id.rl_ad_bottom).setVisibility(View.VISIBLE);;
        } else if (this.name.equalsIgnoreCase("ValuablePlayer")) {
            initViewPlayer();
        }
    }

    private void initView() {
        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
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
        this.img_info = (ImageView) findViewById(R.id.img_info);
        this.rl_info = (RelativeLayout) findViewById(R.id.rl_info);
        this.img_info.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                ValuablePlayerActivity.this.rl_info.setVisibility(View.VISIBLE);;
                new Handler().postDelayed(new Runnable() {


                    public void run() {
                        ValuablePlayerActivity.this.rl_info.setVisibility(View.GONE);
                    }
                }, 5000);
            }
        });
        this.ll_data = (LinearLayout) findViewById(R.id.ll_data);
        this.txt_info = (TextView) findViewById(R.id.txt_info);
        this.txt_title = (TextView) findViewById(R.id.txt_title);
        this.rv_player = (RecyclerView) findViewById(R.id.rv_player);
        this.rv_predictor = (RecyclerView) findViewById(R.id.rv_predictor);
        this.ll_player = (LinearLayout) findViewById(R.id.ll_player);
        this.ll_predictor = (LinearLayout) findViewById(R.id.ll_predictor);
    }

    private void initViewPredictor() {
        this.txt_title.setText("QUALIFICATION PROBABILITY");
        this.txt_info.setText("The changes in qualification fortunes, across the tenure of the tournament, presented as a snapshot.");
        this.ll_predictor.setVisibility(View.VISIBLE);;
        this.ll_player.setVisibility(View.GONE);
        this.txt_match = (TextView) findViewById(R.id.txt_match);
        this.rv_predictor.setLayoutManager(new LinearLayoutManager(this));
        new GraphqlApi(this).getQualificationProbability(new Interface.GetQualificationProbability() {


            @Override
            public void getResponse(GetQualificationProbabilityQuery.GetQualificationProbability getQualificationProbability) {
                ValuablePlayerActivity.this.getPredictor(getQualificationProbability);
            }
        });
    }

    private void initViewPlayer() {
        this.txt_title.setText("MOST VALUABLE PLAYERS");
        this.txt_info.setText("The batsmen who made short work of the huge target, the bowlers who acted as partnership-breakers - here's a list of players whose consistent performances lit up the series.");
        this.ll_predictor.setVisibility(View.GONE);
        this.ll_player.setVisibility(View.VISIBLE);;
        this.rv_player.setLayoutManager(new LinearLayoutManager(this));
        new GraphqlApi(this).getPlayerIndex(new Interface.GetPlayerIndex() {


            @Override
            public void getResponse(PlayerIndexQuery.PlayerIndex playerIndex) {
                ValuablePlayerActivity.this.getPlayerIndex(playerIndex);
            }
        });
    }

    
  
    private void getPlayerIndex(final PlayerIndexQuery.PlayerIndex playerIndex) {
        runOnUiThread(new Runnable() {


            public void run() {
                PlayerIndexQuery.PlayerIndex playerIndex2 = playerIndex;
                int i = 0;
                if (playerIndex2 == null || playerIndex2.playerObject() == null || playerIndex.playerObject().isEmpty()) {
                    ValuablePlayerActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                    ValuablePlayerActivity.this.ll_data.setVisibility(View.GONE);
                    return;
                }
                ValuablePlayerActivity.this.ll_data.setVisibility(View.VISIBLE);;
                ArrayList arrayList = new ArrayList();
                if (Glob.adCountInCategory == 0) {
                    arrayList.addAll(playerIndex.playerObject());
                } else {
                    while (i < playerIndex.playerObject().size()) {
                        int i2 = i + 1;
                        if (i2 % Glob.adCountInCategory == 0) {
                            arrayList.add(playerIndex.playerObject().get(i));
                            arrayList.add(null);
                        } else {
                            arrayList.add(playerIndex.playerObject().get(i));
                        }
                        i = i2;
                    }
                }
                ValuablePlayerActivity.this.rv_player.setAdapter(new AdapterValuablePlayer(ValuablePlayerActivity.this, arrayList, new AdapterValuablePlayer.OnItemClickListener() {


                    @Override
                    public void onItemClick(String str) {
                        ValuablePlayerActivity.this.playerId = str;
                        ValuablePlayerActivity.this.onShowInterstitialAd("player");
                    }

                    @Override
                    public void onClickBanner() {
                        Glob.openCustomTab(ValuablePlayerActivity.this);
                    }
                }));
            }
        });
    }

    
  
    private void getPredictor(final GetQualificationProbabilityQuery.GetQualificationProbability getQualificationProbability) {
        runOnUiThread(new Runnable() {


            public void run() {
                if (getQualificationProbability != null) {
                    ValuablePlayerActivity.this.ll_data.setVisibility(View.VISIBLE);;
                    ArrayList arrayList = new ArrayList();
                    int size = getQualificationProbability.probabilityArray().get(0).size() - 1;
                    ValuablePlayerActivity.this.txt_match.setText(size + "");
                    for (int i = 0; i < getQualificationProbability.qpTeamList().get(0).size(); i++) {
                        arrayList.add(new ModelProbability(getQualificationProbability.qpTeamList().get(0).get(i).teamName(), getQualificationProbability.qpTeamList().get(0).get(i).teamColor(), getQualificationProbability.probabilityArray().get(0).get(size).get(i)));
                    }
                    ValuablePlayerActivity.this.rv_predictor.setAdapter(new AdapterPredictor(ValuablePlayerActivity.this, arrayList, new AdapterPredictor.OnItemClickListener() {


                        @Override
                        public void onItemClick(String str) {
                            ValuablePlayerActivity.this.playerId = str;
                            ValuablePlayerActivity.this.onShowInterstitialAd("player");
                        }

                        @Override //Criclytics.AdapterPredictor.OnItemClickListener
                        public void onClickBanner() {
                            Glob.openCustomTab(ValuablePlayerActivity.this);
                        }
                    }));
                    return;
                }
                ValuablePlayerActivity.this.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                ValuablePlayerActivity.this.ll_data.setVisibility(View.GONE);
            }
        });
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    @Override 
    public void onBackPressed() {
        super.onBackPressed();
        Glob.showInappReview(this);
    }

    
    public void onHome(View view) {
        Glob.goToHome(this);
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
        if (str.equals("player")) {
            Intent intent = new Intent(this, PlayerDetailActivity.class);
            intent.putExtra(Glob.PLAYER_ID, this.playerId);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

}
