package com.gsbusiness.livecricketscoreprediction.Activities.Starts;

import android.app.Dialog;
import android.content.Context;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;
import com.gsbusiness.livecricketscoreprediction.Activities.TestAdActivity;
import com.gsbusiness.livecricketscoreprediction.Adapter.Starts.ImageListAdapter;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.ExitActivity;
import com.gsbusiness.livecricketscoreprediction.Models.Starts.SliderData;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {
    static final  boolean $assertionsDisabled = false;
    private static final String LOG = "<<<SecondActivity>>>";
    public static ArrayList<SliderData> sliderData;
    public ArrayList<SliderData> ImageArrayList = new ArrayList<>();
    AppPreference appPreference;
    Button btn_share;
    Button btn_start;
    Dialog dialog;
    RelativeLayout rl_appServiceMain;
    RecyclerView rvImageList;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new SecondActivity$$ExternalSyntheticLambda2(this));
    RelativeLayout toolbars;
    TextView toolbartitle;

    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_second);
        this.appPreference = new AppPreference(this);
        this.toolbars = (RelativeLayout) findViewById(R.id.toolbars);
        TextView textView = (TextView) findViewById(R.id.toolbartitle);
        this.toolbartitle = textView;
        textView.setText(this.appPreference.getString("app_title"));
        this.btn_share = (Button) findViewById(R.id.btn_share);
        this.btn_start = (Button) findViewById(R.id.btn_start);
        this.rvImageList = (RecyclerView) findViewById(R.id.rvImageList);
        this.rl_appServiceMain = (RelativeLayout) findViewById(R.id.rl_appServiceMain);
        this.btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo50103x218f61f0(v);
            }
        });
        this.btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo50104x12e0f171(v);
            }
        });
        sliderData = new ArrayList<>();
        String string = this.appPreference.getString("is_slider_two");
        if (string == null || string.equalsIgnoreCase("")) {

        } else if (string.equalsIgnoreCase("y")) {
            findViewById(R.id.rl_ad_top).setVisibility(View.GONE);
            getSliderImageList();
        } else {
        }
    }

   public  void mo50103x218f61f0(View view) {
        onButtonNext();
    }

 public  void mo50104x12e0f171(View view) {
        if (Glob.isOnline(this)) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                intent.putExtra("android.intent.extra.SUBJECT", R.string.app_name);
                String str = "\nLet me recommend you this application\n\n" + "https://play.google.com/store/apps/details?id=" + getPackageName();
                Glob.log("TAGonClick: ", str);
                intent.putExtra("android.intent.extra.TEXT", str);
                startActivity(Intent.createChooser(intent, "choose one"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Dialog dialog2 = this.dialog;
            if (dialog2 != null && !dialog2.isShowing()) {
                this.dialog.show();
            }
        }
    }

    private void getSliderImageList() {
        Volley.newRequestQueue(this).add(new StringRequest(0, this.appPreference.getString("is_slider_two_url"), new SecondActivity$$ExternalSyntheticLambda4(this), new SecondActivity$$ExternalSyntheticLambda3(this)));
    }

  public  void mo50100xb2c53639(String str) {
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
                for (int i2 = 0; i2 < 3; i2++) {
                    this.ImageArrayList.add(sliderData.get(i2));
                }
                ImageListAdapter imageListAdapter = new ImageListAdapter(this.ImageArrayList, this);
                this.rvImageList.setHasFixedSize(true);
                this.rvImageList.setLayoutManager(new GridLayoutManager((Context) this, 3, 1, false));
                this.rvImageList.setAdapter(imageListAdapter);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
        }
    }

   public  void mo50101xa416c5ba(VolleyError volleyError) {

    }

    public void initcall() {
        startActivity(new Intent(this, ThirdActivity.class));
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

   public  void mo50102xfcd4f2ff(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1 && activityResult.getData().getStringExtra("where") == null) {
            initcall();
        }
    }

    @Override 
    public void onBackPressed() {
        startActivity(new Intent(this, ExitActivity.class));
    }


}
