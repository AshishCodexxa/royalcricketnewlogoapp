package com.cricketscoreprediction.app.Activities.Starts;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.AppListAdapter;
import com.cricketscoreprediction.app.Adapter.Starts.SliderAdapter;
import com.cricketscoreprediction.app.Ads.AESUtils;

import com.cricketscoreprediction.app.ExitActivity;
import com.cricketscoreprediction.app.Models.Starts.AppListModel;
import com.cricketscoreprediction.app.Models.Starts.SliderData;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FirstActivity extends AppCompatActivity {
    public static String LOG = "<<<FirstActivity>>>";
    public static ArrayList<SliderData> sliderData;
    public ArrayList<AppListModel> appListArray = new ArrayList<>();
    AppPreference appPreference;
    Button btn_start;
    FloatingActionButton fb_start;
    FrameLayout frame_tbn;
    String is_more_app;
    String is_slider_one;
    RecyclerView rvAppList;
    public ArrayList<SliderData> sliderArrayList = new ArrayList<>();
    SliderView sliderView;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new FirstActivity$$ExternalSyntheticLambda2(this));
    TextView toolbartitle;
    String where = "";


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_first);
        AppPreference appPreference2 = new AppPreference(this);
        this.appPreference = appPreference2;
        this.is_more_app = appPreference2.getString("is_more_app");
        this.is_slider_one = this.appPreference.getString("is_slider_one");
        TextView textView = (TextView) findViewById(R.id.toolbartitle);
        this.toolbartitle = textView;
        textView.setText(this.appPreference.getString("app_title"));
        this.fb_start = (FloatingActionButton) findViewById(R.id.fb_start);
        this.frame_tbn = (FrameLayout) findViewById(R.id.frame_tbn);
        this.sliderView = (SliderView) findViewById(R.id.slider);
        this.rvAppList = (RecyclerView) findViewById(R.id.rvAppList);
        this.fb_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFloatBtnStart(v);
            }
        });
        this.btn_start = (Button) findViewById(R.id.btn_start);
        String str = this.is_more_app;
        if (str == null || str.equalsIgnoreCase("")) {

            onAppList();
        } else if (this.is_more_app.equalsIgnoreCase("y")) {
            findViewById(R.id.rl_ad_bottom).setVisibility(View.GONE);
            getAppListData();
        } else {
            onAppList();
        }
        String str2 = this.is_slider_one;
        if (str2 == null || str2.equalsIgnoreCase("")) {

        } else if (this.is_slider_one.equalsIgnoreCase("y")) {
            findViewById(R.id.rl_ad_top).setVisibility(View.GONE);
            getSliderImageList();
        } else {
        }
    }


    public void onFloatBtnStart(View view) {
        if (Glob.isOnline(this)) {
            onShowInterstitialAd("AppServicesActivity");
        } else {
            Glob.noInternetDialogShowActivity(this);
        }
    }

    public void setSlider(ArrayList<SliderData> arrayList) {
        SliderAdapter sliderAdapter = new SliderAdapter(this, arrayList);
        this.sliderView.setAutoCycleDirection(0);
        this.sliderView.setSliderAdapter(sliderAdapter);
        this.sliderView.setScrollTimeInSec(2);
        this.sliderView.setAutoCycle(true);
        this.sliderView.startAutoCycle();
    }

    private void getAppListData() {
        Volley.newRequestQueue(this).add(new StringRequest(0, Glob.Service_Links, new FirstActivity$$ExternalSyntheticLambda5(this), new FirstActivity$$ExternalSyntheticLambda3(this)));
    }

    public void mo50084x5a544cfa(String str) {
        if (str == null) {

            onAppList();
        } else if (!str.matches("")) {
            try {
                JSONArray jSONArray = new JSONArray(AESUtils.decrypt(new JSONObject(str).getString("data")));
                Glob.log(LOG + " getAppListData", jSONArray + "");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("id");
                    String string2 = jSONObject.getString("app_name");
                    String string3 = jSONObject.getString("app_img");
                    String string4 = jSONObject.getString("img_logo_url");
                    String string5 = jSONObject.getString("app_link");
                    String string6 = jSONObject.getString("app_desc");
                    AppListModel appListModel = new AppListModel();
                    appListModel.setAppListModel(string, string2, string3, string4, string5, string6, false);
                    this.appListArray.add(appListModel);
                }
                ArrayList arrayList = new ArrayList();
                if (Glob.adCountInCategory == 0) {
                    arrayList.addAll(this.appListArray);
                } else {
                    int i2 = 0;
                    while (i2 < this.appListArray.size()) {
                        int i3 = i2 + 1;
                        if (i3 % Glob.adCountInCategory == 0) {
                            arrayList.add(this.appListArray.get(i2));
                            AppListModel appListModel2 = new AppListModel();
                            appListModel2.setAd(true);
                            arrayList.add(appListModel2);
                        } else {
                            arrayList.add(this.appListArray.get(i2));
                        }
                        i2 = i3;
                    }
                }
                AppListAdapter appListAdapter = new AppListAdapter(arrayList, this, new AppListAdapter.OnItemClickListener() {

                    @Override
                    public void onItemClick(String str) {
                        try {
                            FirstActivity firstActivity = FirstActivity.this;
                            firstActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                        } catch (ActivityNotFoundException unused) {
                            FirstActivity firstActivity2 = FirstActivity.this;
                            firstActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
                        }
                    }

                    @Override
                    public void onClickBanner() {
                        Glob.openCustomTab(FirstActivity.this);
                    }
                });
                this.rvAppList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
                this.rvAppList.setAdapter(appListAdapter);
            } catch (JSONException unused) {

                onAppList();
            }
        }
    }

    public void mo50085xf6c24959(VolleyError volleyError) {

        onAppList();
    }

    private void getSliderImageList() {
        String string = this.appPreference.getString("is_slider_one_url");
        sliderData = new ArrayList<>();
        Volley.newRequestQueue(this).add(new StringRequest(0, string, new FirstActivity$$ExternalSyntheticLambda6(this), new FirstActivity$$ExternalSyntheticLambda4(this)));
    }

    public void mo50086x5e5b0089(String str) {
        if (!str.equals("")) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
                Glob.log(LOG + " getSliderImageList", jSONArray + "");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("id");
                    String string2 = jSONObject.getString("img_url");
                    String string3 = jSONObject.getString("url_redirect_link");
                    SliderData sliderData2 = new SliderData();
                    sliderData2.SliderData(string, string2, string3);
                    sliderData.add(sliderData2);
                }
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.sliderArrayList.add(sliderData.get(i2));
                }
                setSlider(this.sliderArrayList);
            } catch (JSONException unused) {

            }
        } else {
        }
    }

    public void mo50087xfac8fce8(VolleyError volleyError) {
        Glob.log("GlobS onErrorResponse", String.valueOf(this.sliderArrayList));

    }

    public void onNext(String str) {
        startActivity(new Intent(this, SecondActivity.class));
        finish();
    }

    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
            return;
        }
        this.where = str;
        Intent intent = new Intent(this, TestAdActivity.class);
        intent.putExtra("where", str);
        this.someActivityResultLauncher.launch(intent);
    }

    public void mo50088xdc9d9303(ActivityResult activityResult) {
        if (activityResult.getResultCode() != -1) {
            return;
        }
        if (activityResult.getData() == null) {
            onNext(this.where);
        } else {
            onNext(activityResult.getData().getStringExtra("where"));
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ExitActivity.class));
    }

    public void onAppList() {
        this.fb_start.setVisibility(View.GONE);
        this.frame_tbn.setVisibility(View.VISIBLE);

        this.btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo50089x70285bc2(v);
            }
        });
    }

    public void mo50089x70285bc2(View view) {
        if (Glob.isOnline(this)) {
            onShowInterstitialAd("AppServicesActivity");
        } else {
            Glob.noInternetDialogShowActivity(this);
        }
    }


}
