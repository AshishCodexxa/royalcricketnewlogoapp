package com.gsbusiness.livecricketscoreprediction.Activities.Starts;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.gsbusiness.livecricketscoreprediction.Activities.MainActivity;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Adapter.Starts.SliderAdapter;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.ExitActivity;
import com.gsbusiness.livecricketscoreprediction.Models.Starts.SliderData;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.smarteist.autoimageslider.SliderView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ThirdActivity extends AppCompatActivity {
    static final  boolean $assertionsDisabled = false;
    public static ArrayList<SliderData> sliderData;
    AppPreference appPreference;
    Button btn_start;
    Dialog dialog;
    String is_slider_one;
    public ArrayList<SliderData> sliderArrayList = new ArrayList<>();
    SliderView slider_bottom;
    SliderView slider_top;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ThirdActivity$$ExternalSyntheticLambda1(this));
    RelativeLayout toolbars;
    TextView toolbartitle;

    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_third);
        this.toolbars = (RelativeLayout) findViewById(R.id.toolbars);
        this.appPreference = new AppPreference(this);
        TextView textView = (TextView) findViewById(R.id.toolbartitle);
        this.toolbartitle = textView;
        textView.setText(this.appPreference.getString("app_title"));
        this.is_slider_one = this.appPreference.getString("is_slider_one");
        this.btn_start = (Button) findViewById(R.id.btn_start);
        this.slider_top = (SliderView) findViewById(R.id.slider_top);
        this.slider_bottom = (SliderView) findViewById(R.id.slider_bottom);
        this.btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo50115x7d2f0da9(v);
            }
        });
        String str = this.is_slider_one;
        if (str == null || str.equalsIgnoreCase("")) {
        } else if (this.is_slider_one.equalsIgnoreCase("y")) {
            findViewById(R.id.rl_ad_bottom).setVisibility(View.GONE);
            findViewById(R.id.rl_ad_top).setVisibility(View.GONE);
            getSliderImageList();
        } else {
        }
    }

     public  void mo50115x7d2f0da9(View view) {
        onButtonNext();
    }

    private void getSliderImageList() {
        String string = this.appPreference.getString("is_slider_one_url");
        sliderData = new ArrayList<>();
        Volley.newRequestQueue(this).add(new StringRequest(0, string, new ThirdActivity$$ExternalSyntheticLambda3(this), new ThirdActivity$$ExternalSyntheticLambda2(this)));
    }

   public  void mo50112x50cb0fe1(String str) {
        if (!str.equals("")) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
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
                setTopSlider(this.sliderArrayList);
                setBottomSlider(this.sliderArrayList);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
        }
    }

     public  void mo50113xed390c40(VolleyError volleyError) {

    }

    public void setTopSlider(ArrayList<SliderData> arrayList) {
        SliderAdapter sliderAdapter = new SliderAdapter(this, arrayList);
        this.slider_top.setAutoCycleDirection(0);
        this.slider_top.setSliderAdapter(sliderAdapter);
        this.slider_top.setScrollTimeInSec(2);
        this.slider_top.setAutoCycle(true);
        this.slider_top.startAutoCycle();
    }

    public void setBottomSlider(ArrayList<SliderData> arrayList) {
        SliderAdapter sliderAdapter = new SliderAdapter(this, arrayList);
        this.slider_bottom.setAutoCycleDirection(0);
        this.slider_bottom.setSliderAdapter(sliderAdapter);
        this.slider_bottom.setScrollTimeInSec(2);
        this.slider_bottom.setAutoCycle(true);
        this.slider_bottom.startAutoCycle();
    }

    public void initcall() {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void onButtonNext() {
        if (Glob.isOnline(this)) {
            this.someActivityResultLauncher.launch(new Intent(this, TestAdActivity.class));
            return;
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && !dialog2.isShowing()) {
            this.dialog.show();
        }
    }

   public  void mo50114xcf0da25b(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1 && activityResult.getData().getStringExtra("where") == null) {
            initcall();
        }
    }

    @Override 
    public void onBackPressed() {
        startActivity(new Intent(this, ExitActivity.class));
    }



    
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
