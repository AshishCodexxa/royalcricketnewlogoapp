package com.cricketlivescore.predictiontips.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import com.cricketlivescore.predictiontips.ExitActivity;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.R;

public class SplashImageActivity extends AppCompatActivity {
    private ImageView img_splash;
    private ImageView img_splash_close;
    private String where;

    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_splash_image);
        this.img_splash = (ImageView) findViewById(R.id.img_splash);
        this.where = getIntent().getStringExtra("where");
        String banner = Glob.getBanner(new AppPreference(this).getJsonArray("img_url_splash"));
        if (banner == null || banner.equals("")) {
            Function_Banner();
        } else {
            ((RequestBuilder) ((RequestBuilder) Glide.with((FragmentActivity) this).load(banner).placeholder((int) R.drawable.img_back)).fitCenter()).into(this.img_splash);
        }
        this.img_splash_close = (ImageView) findViewById(R.id.img_splash_close);
        this.img_splash.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (SplashImageActivity.this.where.equals("exit")) {
                    SplashImageActivity.this.openGoogle();
                    SplashImageActivity.this.finishAffinity();
                    return;
                }
                SplashImageActivity.this.openGoogle();
            }
        });
        this.img_splash_close.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                SplashImageActivity.this.Function_Banner();
            }
        });
    }

    
    public void onRestart() {
        super.onRestart();
        Function_Banner();
    }

    
    @Override
    public void onStop() {
        super.onStop();
    }

    
  
    @SuppressLint("WrongConstant")
    private void Function_Banner() {
        if (this.where.equals("splash")) {
            Intent intent = new Intent();
            intent.putExtra("where", this.where);
            setResult(-1, intent);
            finish();
        } else if (this.where.equals("exit")) {
            Intent intent2 = new Intent(this, ExitActivity.class);
            intent2.addFlags(276856832);
            startActivity(intent2);
            finish();
        }
    }

    public void openGoogle() {
        Glob.openCustomTab(this);
    }

    
    @Override
    public void onDestroy() {
        super.onDestroy();
        Runtime.getRuntime().gc();
    }
}
