package com.gsbusiness.livecricketscoreprediction.Activities.Player;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.material.tabs.TabLayout;
import com.gsbusiness.livecricketscoreprediction.Adapter.AdapterPlayerStateTab;

import com.gsbusiness.livecricketscoreprediction.PlayersDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.Calendar;
import java.util.Objects;

public class PlayerDetailActivity extends AppCompatActivity {
    public static String TAG = "<<<PlayerDetailActivity>>>";
    ImageView img_back;
    ImageView img_player_country;
    ImageView img_player_profile;
    ImageView img_player_type;
    String playerID;
    TabLayout tab_player_state;
    TextView txt_player_age;
    TextView txt_player_battingStyle;
    TextView txt_player_bowlingStyle;
    TextView txt_player_country;
    TextView txt_player_name;
    ViewPager viewPage_player_state;
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
        setContentView(R.layout.activity_player_detail);
        BannerIDCardAds();
        this.playerID = getIntent().getStringExtra(Glob.PLAYER_ID);
        Log.d(TAG + "playerID: ", this.playerID);
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
        new GraphqlApi(this).getPlayerDetail(this.playerID, new Interface.GetPlayersDetail() {


            @Override
            public void getResponse(PlayersDetailsQuery.PlayersDetails playersDetails) {
                PlayerDetailActivity.this.getPlayerDetail(playersDetails);
            }
        });
    }

    public void initView() {
        Glob.isKeepingTab = false;
        this.img_player_country = (ImageView) findViewById(R.id.img_player_country);
        Glide.with((FragmentActivity) this).load(Glob.flag_empty).into(this.img_player_country);
        this.img_player_profile = (ImageView) findViewById(R.id.img_player_profile);
        RequestManager with = Glide.with((FragmentActivity) this);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.playerID + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(this.img_player_profile);
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.img_back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBack(v);
            }
        });
        ((ImageView) findViewById(R.id.img_home)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHome(v);
            }
        });
        this.txt_player_name = (TextView) findViewById(R.id.txt_player_name);
        this.img_player_type = (ImageView) findViewById(R.id.img_player_type);
        this.txt_player_age = (TextView) findViewById(R.id.txt_player_age);
        this.txt_player_country = (TextView) findViewById(R.id.txt_player_country);
        this.txt_player_battingStyle = (TextView) findViewById(R.id.txt_player_battingStyle);
        this.txt_player_bowlingStyle = (TextView) findViewById(R.id.txt_player_bowlingStyle);
        this.tab_player_state = (TabLayout) findViewById(R.id.tab_player_state);
        this.viewPage_player_state = (ViewPager) findViewById(R.id.viewPage_player_state);
    }

    public void getPlayerDetail(final PlayersDetailsQuery.PlayersDetails playersDetails) {
        runOnUiThread(new Runnable() {

            public void run() {
                PlayersDetailsQuery.PlayersDetails playersDetails9 = playersDetails;
                if (playersDetails9 != null) {
                    Objects.requireNonNull(playersDetails9);
                    if (playersDetails9.role().matches("Wicket Keeper")) {
                        PlayerDetailActivity.this.tab_player_state.getTabAt(2).setText(PlayerDetailActivity.this.getString(R.string.keeping_state));
                        Glob.isKeepingTab = true;
                    }
                    FragmentManager supportFragmentManager = PlayerDetailActivity.this.getSupportFragmentManager();
                    PlayerDetailActivity playerDetailActivity = PlayerDetailActivity.this;
                    PlayerDetailActivity.this.viewPage_player_state.setAdapter(new AdapterPlayerStateTab(supportFragmentManager, playerDetailActivity, playerDetailActivity.tab_player_state.getTabCount(), PlayerDetailActivity.this.playerID, playersDetails));
                    PlayerDetailActivity.this.viewPage_player_state.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(PlayerDetailActivity.this.tab_player_state));
                    PlayerDetailActivity.this.tab_player_state.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {

                        @Override
                        public void onTabReselected(TabLayout.Tab tab) {
                        }

                        @Override
                        public void onTabUnselected(TabLayout.Tab tab) {
                        }

                        @Override 
                        public void onTabSelected(TabLayout.Tab tab) {
                            PlayerDetailActivity.this.viewPage_player_state.setCurrentItem(tab.getPosition());
                        }
                    });
                    TextView textView = PlayerDetailActivity.this.txt_player_name;
                    PlayersDetailsQuery.PlayersDetails playersDetails2 = playersDetails;
                    Objects.requireNonNull(playersDetails2);
                    textView.setText(playersDetails2.name());
                    if (playersDetails.dob() != null && !playersDetails.dob().isEmpty()) {
                        String dob = playersDetails.dob();
                        if (dob.split("/").length == 3) {
                            int parseInt = Integer.parseInt(dob.split("/")[0]);
                            int parseInt2 = Integer.parseInt(dob.split("/")[1]);
                            int parseInt3 = Integer.parseInt(dob.split("/")[2]);
                            PlayerDetailActivity.this.txt_player_age.setText(String.format("%s %s", Integer.valueOf(PlayerDetailActivity.this.getAge(parseInt3, parseInt2, parseInt)), " Years"));
                        }
                    }
                    TextView textView2 = PlayerDetailActivity.this.txt_player_country;
                    PlayersDetailsQuery.PlayersDetails playersDetails3 = playersDetails;
                    Objects.requireNonNull(playersDetails3);
                    textView2.setText(playersDetails3.birthPlace());
                    if (playersDetails.role().equalsIgnoreCase("All Rounder")) {
                        Glide.with((FragmentActivity) PlayerDetailActivity.this).load(Integer.valueOf((int) R.drawable.all_rounder)).into(PlayerDetailActivity.this.img_player_type);
                    } else if (playersDetails.role().equalsIgnoreCase("Batsman")) {
                        Glide.with((FragmentActivity) PlayerDetailActivity.this).load(Integer.valueOf((int) R.drawable.bat)).into(PlayerDetailActivity.this.img_player_type);
                    } else if (playersDetails.role().equalsIgnoreCase("Bowler")) {
                        Glide.with((FragmentActivity) PlayerDetailActivity.this).load(Integer.valueOf((int) R.drawable.ball)).into(PlayerDetailActivity.this.img_player_type);
                    } else if (playersDetails.role().equalsIgnoreCase("Wicket Keeper")) {
                        Glide.with((FragmentActivity) PlayerDetailActivity.this).load(Integer.valueOf((int) R.drawable.keeper)).into(PlayerDetailActivity.this.img_player_type);
                    }
                    PlayerDetailActivity.this.txt_player_battingStyle.setText(playersDetails.battingStyle());
                    PlayerDetailActivity.this.txt_player_bowlingStyle.setText(playersDetails.bowlingStyle());
                }
            }
        });
    }

    public int getAge(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.set(i, i2, i3);
        int i4 = instance2.get(1) - instance.get(1);
        if (instance2.get(6) < instance.get(6)) {
            i4--;
        }
        return i4 + 1;
    }

    
    public void onBack(View view) {
        onBackPressed();
    }

    
    public void onHome(View view) {
        Glob.goToHome(this);
    }
}
