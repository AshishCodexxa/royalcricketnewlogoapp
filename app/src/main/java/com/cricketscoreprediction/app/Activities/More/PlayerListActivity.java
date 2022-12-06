package com.cricketscoreprediction.app.Activities.More;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.cricketscoreprediction.app.Activities.MainActivity;

import com.cricketscoreprediction.app.R;

public class PlayerListActivity extends AppCompatActivity {
    static final String LOG = "PlayerListActivity";
    String where = "";

    
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_player_list);
        this.where = new Intent().getStringExtra("where");
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                PlayerListActivity.this.onBackPressed();
            }
        });
    }

    @Override 
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("where", this.where);
        setResult(-1, intent);
        finish();
    }
}
