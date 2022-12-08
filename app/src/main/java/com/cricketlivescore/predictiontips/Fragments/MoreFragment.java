package com.cricketlivescore.predictiontips.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import com.cricketlivescore.predictiontips.Activities.Ipl.IplActivity;
import com.cricketlivescore.predictiontips.Activities.More.PlayerListActivity;
import com.cricketlivescore.predictiontips.Activities.More.SchedulesActivity;
import com.cricketlivescore.predictiontips.Activities.More.TeamListActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;

import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;

public class MoreFragment extends Fragment {
    private static final String LOG = "<<<MoreFragment>>>";
    LinearLayout ll_ipl;
    LinearLayout ll_players;
    LinearLayout ll_schedules;
    LinearLayout ll_stadiums;
    LinearLayout ll_teams;
    Activity myActivity;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                MoreFragment moreFragment = MoreFragment.this;
                moreFragment.onNext(moreFragment.whereLocal);
                return;
            }
            MoreFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    View view;
    String whereLocal = "";

    public static MoreFragment newInstance() {
        return new MoreFragment();
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_more, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            this.ll_ipl = (LinearLayout) this.view.findViewById(R.id.ll_ipl);
            this.ll_schedules = (LinearLayout) this.view.findViewById(R.id.ll_schedules);
            this.ll_players = (LinearLayout) this.view.findViewById(R.id.ll_players);
            this.ll_teams = (LinearLayout) this.view.findViewById(R.id.ll_teams);
            this.ll_stadiums = (LinearLayout) this.view.findViewById(R.id.ll_stadiums);
            this.ll_ipl.setOnClickListener(new MoreFragment$$ExternalSyntheticLambda3(this));
            this.ll_schedules.setOnClickListener(new MoreFragment$$ExternalSyntheticLambda2(this));
            this.ll_players.setOnClickListener(new MoreFragment$$ExternalSyntheticLambda4(this));
            this.ll_teams.setOnClickListener(new MoreFragment$$ExternalSyntheticLambda1(this));
            this.ll_stadiums.setOnClickListener(new MoreFragment$$ExternalSyntheticLambda0(this));

        }
    }


    public void onClickIpl(View view2) {
        onShowInterstitialAd("onClickIpl");
    }

    
    public void onClickSchedules(View view2) {
        onShowInterstitialAd("onClickSchedules");
    }

    
    public void onClickPlayers(View view2) {
        onShowInterstitialAd("onClickPlayers");
    }

    
    public void onClickTeams(View view2) {
        onShowInterstitialAd("onClickTeams");
    }

    
    public void onClickStadiums(View view2) {
        onShowInterstitialAd("onClickStadiums");
    }

    private void onShowInterstitialAd(String str) {
        if (!Glob.isNetworkAvailable(this.myActivity)) {
            Glob.noInternetDialogShowFragment(this.myActivity);
            return;
        }
        this.whereLocal = str;
        Intent intent = new Intent(this.myActivity, TestAdActivity.class);
        intent.putExtra("where", str);
        this.resultLauncher.launch(intent);
    }

    
  
    private void onNext(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1741887411:
                if (str.equals("onClickTeams")) {
                    c = 0;
                    break;
                }
                break;
            case -618581892:
                if (str.equals("onClickIpl")) {
                    c = 1;
                    break;
                }
                break;
            case 1807186899:
                if (str.equals("onClickSchedules")) {
                    c = 2;
                    break;
                }
                break;
            case 2029147785:
                if (str.equals("onClickPlayers")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent(this.myActivity, TeamListActivity.class);
                intent.putExtra("where", "nav_more");
                startActivity(intent);
                return;
            case 1:
                Intent intent2 = new Intent(this.myActivity, IplActivity.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                return;
            case 2:
                Intent intent3 = new Intent(this.myActivity, SchedulesActivity.class);
                intent3.putExtra("where", "nav_more");
                startActivity(intent3);
                return;
            case 3:
                Intent intent4 = new Intent(this.myActivity, PlayerListActivity.class);
                intent4.putExtra("where", "nav_more");
                startActivity(intent4);
                return;
            default:
                return;
        }
    }
}
