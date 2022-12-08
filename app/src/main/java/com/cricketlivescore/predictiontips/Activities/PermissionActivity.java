package com.cricketlivescore.predictiontips.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.bumptech.glide.Glide;
import com.cricketlivescore.predictiontips.Ads.Server;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;

import com.cricketlivescore.predictiontips.R;

public class PermissionActivity extends AppCompatActivity {
    private static final int PERMISSION_REQUEST_CODE = 200;
    ImageView img_continue;
    RelativeLayout rl_adView_top;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
                activityResult.getData().getStringExtra("where");
                Glob.goToHome(PermissionActivity.this);
            }
        }
    });


    @Override

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_permission);
        ImageView imageView = (ImageView) findViewById(R.id.img_continue);
        this.img_continue = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onContinue(v);

            }
        });
        onTopAdShow();
    }


    public void onContinue(View view) {
        if (!Glob.checkPermission(this)) {
            requestPermission();
        }
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.INTERNET"}, 200);
    }

    @Override

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 200 && iArr.length > 0) {
            boolean z = false;
            if (iArr[0] == 0) {
                z = true;
            }
            if (z) {
                showInterstitial("main");
            } else {
                showMessageOKCancel("Permission Denied, You must allow internet", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int i) {
                        PermissionActivity.this.requestPermissions(new String[]{"android.permission.INTERNET"}, 200);
                    }
                });
            }
        }
    }

    private void showMessageOKCancel(String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(this).setMessage(str).setPositiveButton("OK", onClickListener).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create().show();
    }

    private void showInterstitial(String str) {
        Intent intent = new Intent(this, TestAdActivity.class);
        intent.putExtra("where", str);
        this.someActivityResultLauncher.launch(intent);
    }

    public void onTopAdShow() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_ad_bottom);
        ImageView imageView = (ImageView) findViewById(R.id.ad_banner);
        ImageView imageView2 = (ImageView) findViewById(R.id.ad_icon);
        AppPreference appPreference = new AppPreference(getApplicationContext());
        String banner = Glob.getBanner(appPreference.getJsonArray("img_native_ad"));
        String string = appPreference.getString("img_banner_ad_icon");
        if (banner != null && !banner.equals("")) {
            Glide.with(getApplicationContext()).load(banner).into(imageView);
            if (string != null && !string.matches("")) {
                Glide.with(getApplicationContext()).load(string).into(imageView2);
            }
        }
        imageView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Glob.openCustomTab(PermissionActivity.this);
            }
        });
        if (Glob.isOnline(this)) {
            new Server(this).nativeLargeAdPreLoad(relativeLayout);
        } else {
            relativeLayout.setVisibility(View.GONE);
        }
    }
}
