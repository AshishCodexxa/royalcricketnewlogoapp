package com.cricketscoreprediction.app.Activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;


public class TestAdActivity extends AppCompatActivity {

    String where = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;

    @Override
    public void onCreate(Bundle bundle) {
        Glob.setOrientation(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_test_ad);
        where = getIntent().getStringExtra("where");
        Intent intent = new Intent();
        intent.putExtra("where", where);
        setResult(-1, intent);
        finish();
    }


}
