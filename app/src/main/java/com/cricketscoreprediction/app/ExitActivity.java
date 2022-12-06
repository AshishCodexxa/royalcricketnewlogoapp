package com.cricketscoreprediction.app;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class ExitActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_exit);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }, 2000);
    }
}