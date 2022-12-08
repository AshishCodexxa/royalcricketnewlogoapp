package com.cricketlivescore.predictiontips.Fragments.MatchInfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Activities.Player.PlayerDetailActivity;
import com.cricketlivescore.predictiontips.Activities.Stadium.StadiumDetailActivity;
import com.cricketlivescore.predictiontips.Activities.TestAdActivity;
import com.cricketlivescore.predictiontips.Adapter.MatchInfo.AdapteAwayPlayingXI;
import com.cricketlivescore.predictiontips.Adapter.MatchInfo.AdapterHomePlayingXI;
import com.cricketlivescore.predictiontips.GetMatchInfoQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

public class MatchInfoFragment extends Fragment {
    public static String TAG = ">>>>>LogMatchInfoFragment";
    ImageView img_11_one;
    ImageView img_11_two;
    ImageView img_mif_a_flag;
    ImageView img_mif_h_flag;
    LinearLayout ll_11_top_one;
    LinearLayout ll_11_top_two;
    LinearLayout ll_stadium;
    String matchId;
    Activity myActivity;
    String playerId;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                MatchInfoFragment matchInfoFragment = MatchInfoFragment.this;
                matchInfoFragment.onNext(matchInfoFragment.whereLocal);
                return;
            }
            MatchInfoFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RelativeLayout rl_11_one;
    RelativeLayout rl_11_two;
    RecyclerView rv_11_one;
    RecyclerView rv_11_two;
    TextView txt_mif_a_team;
    TextView txt_mif_dateTime;
    TextView txt_mif_h_team;
    TextView txt_mif_mReferee;
    TextView txt_mif_matchNo;
    TextView txt_mif_seriesName;
    TextView txt_mif_tUmpire;
    TextView txt_mif_toss;
    TextView txt_mif_umpires;
    TextView txt_mif_venue;
    TextView txt_no_data_one;
    TextView txt_no_data_two;
    String venueId;
    String venueName;
    View view;
    String whereLocal = "";

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_match_info, viewGroup, false);
        this.matchId = getArguments().getString("MatchId");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.txt_mif_seriesName = (TextView) this.view.findViewById(R.id.txt_mif_seriesName);
            this.txt_mif_dateTime = (TextView) this.view.findViewById(R.id.txt_mif_dateTime);
            this.txt_mif_matchNo = (TextView) this.view.findViewById(R.id.txt_mif_matchNo);
            this.txt_mif_toss = (TextView) this.view.findViewById(R.id.txt_mif_toss);
            this.txt_mif_h_team = (TextView) this.view.findViewById(R.id.txt_mif_h_team);
            this.txt_mif_a_team = (TextView) this.view.findViewById(R.id.txt_mif_a_team);
            this.txt_mif_venue = (TextView) this.view.findViewById(R.id.txt_mif_venue);
            this.txt_mif_umpires = (TextView) this.view.findViewById(R.id.txt_mif_umpires);
            this.txt_mif_tUmpire = (TextView) this.view.findViewById(R.id.txt_mif_tUmpire);
            this.txt_mif_mReferee = (TextView) this.view.findViewById(R.id.txt_mif_mReferee);
            this.img_mif_h_flag = (ImageView) this.view.findViewById(R.id.img_mif_h_flag);
            this.img_mif_a_flag = (ImageView) this.view.findViewById(R.id.img_mif_a_flag);
            this.img_11_one = (ImageView) this.view.findViewById(R.id.img_11_one);
            this.img_11_two = (ImageView) this.view.findViewById(R.id.img_11_two);
            this.ll_11_top_one = (LinearLayout) this.view.findViewById(R.id.ll_11_top_one);
            this.ll_11_top_two = (LinearLayout) this.view.findViewById(R.id.ll_11_top_two);
            this.rl_11_one = (RelativeLayout) this.view.findViewById(R.id.rl_11_one);
            this.rl_11_two = (RelativeLayout) this.view.findViewById(R.id.rl_11_two);
            this.rv_11_one = (RecyclerView) this.view.findViewById(R.id.rv_11_one);
            this.rv_11_two = (RecyclerView) this.view.findViewById(R.id.rv_11_two);
            this.ll_stadium = (LinearLayout) this.view.findViewById(R.id.ll_stadium);
            this.ll_11_top_one.setOnClickListener(new MatchInfoFragment$$ExternalSyntheticLambda1(this));
            this.ll_11_top_two.setOnClickListener(new MatchInfoFragment$$ExternalSyntheticLambda0(this));
            this.ll_stadium.setOnClickListener(new MatchInfoFragment$$ExternalSyntheticLambda2(this));
            new GraphqlApi(this.myActivity).getMatchInfoQuery(this.matchId, new Interface.GetMatchInfo() {

                @Override
                public void getResponse(GetMatchInfoQuery.GetMatchInfo getMatchInfo) {
                    MatchInfoFragment.this.getMatchInfo(getMatchInfo);
                }
            });
        }
    }

    
    public void onClickPlaying11Two(View view2) {
        if (this.rl_11_two.getVisibility() == View.VISIBLE) {
            this.ll_11_top_two.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, this.myActivity.getTheme()));
            this.rl_11_two.setVisibility(View.GONE);
            this.img_11_two.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_down, this.myActivity.getTheme()));
            return;
        }
        this.ll_11_top_two.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorPrimary, this.myActivity.getTheme()));
        this.rl_11_two.setVisibility(View.VISIBLE);;
        this.img_11_two.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_up, this.myActivity.getTheme()));
    }

    
    public void onClickPlaying11One(View view2) {
        if (this.rl_11_one.getVisibility() == View.VISIBLE) {
            this.ll_11_top_one.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white, this.myActivity.getTheme()));
            this.rl_11_one.setVisibility(View.GONE);
            this.img_11_one.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_down, this.myActivity.getTheme()));
            return;
        }
        this.ll_11_top_one.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorPrimary, this.myActivity.getTheme()));
        this.rl_11_one.setVisibility(View.VISIBLE);;
        this.img_11_one.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_arrow_up, this.myActivity.getTheme()));
    }

    
    public void onClickStadium(View view2) {
        onShowInterstitialAd("onClickStadium");
    }

    
  
    private void getMatchInfo(final GetMatchInfoQuery.GetMatchInfo getMatchInfo) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {

                public void run() {
                    if (getMatchInfo != null) {
                        MatchInfoFragment.this.txt_mif_seriesName.setText(getMatchInfo.seriesName());
                        MatchInfoFragment.this.txt_mif_dateTime.setText(Glob.getDateTime(Long.parseLong(getMatchInfo.date())));
                        MatchInfoFragment.this.txt_mif_matchNo.setText(getMatchInfo.matchOrder());
                        MatchInfoFragment.this.txt_mif_toss.setText(getMatchInfo.toss());
                        MatchInfoFragment.this.txt_mif_h_team.setText(getMatchInfo.homeTeamShortName());
                        MatchInfoFragment.this.txt_mif_a_team.setText(getMatchInfo.awayTeamShortName());
                        MatchInfoFragment.this.txt_mif_venue.setText(getMatchInfo.venue());
                        MatchInfoFragment.this.txt_mif_umpires.setText(getMatchInfo.umpires());
                        MatchInfoFragment.this.txt_mif_tUmpire.setText(getMatchInfo.thirdUmpire());
                        MatchInfoFragment.this.txt_mif_mReferee.setText(getMatchInfo.matchReferee());
                        AdapterHomePlayingXI adapterHomePlayingXI = new AdapterHomePlayingXI(MatchInfoFragment.this.myActivity, getMatchInfo.homePlayingXI(), new AdapterHomePlayingXI.OnItemClickListener() {

                            @Override
                            public void onItemClick(String str) {
                                MatchInfoFragment.this.playerId = str;
                                MatchInfoFragment.this.onShowInterstitialAd("onClickPlayer");
                            }
                        });
                        MatchInfoFragment.this.rv_11_one.setLayoutManager(new LinearLayoutManager(MatchInfoFragment.this.myActivity));
                        MatchInfoFragment.this.rv_11_one.setAdapter(adapterHomePlayingXI);
                        if (getMatchInfo.homePlayingXI() == null || getMatchInfo.homePlayingXI().isEmpty()) {
                            MatchInfoFragment matchInfoFragment = MatchInfoFragment.this;
                            matchInfoFragment.txt_no_data_one = (TextView) matchInfoFragment.view.findViewById(R.id.txt_no_data_one);
                            MatchInfoFragment.this.rv_11_one.setVisibility(View.GONE);
                            MatchInfoFragment.this.txt_no_data_one.setVisibility(View.VISIBLE);;
                        }
                        AdapteAwayPlayingXI adapteAwayPlayingXI = new AdapteAwayPlayingXI(MatchInfoFragment.this.myActivity, getMatchInfo.awayPlayingXI(), new AdapteAwayPlayingXI.OnItemClickListener() {

                            @Override
                            public void onItemClick(String str) {
                                MatchInfoFragment.this.playerId = str;
                                MatchInfoFragment.this.onShowInterstitialAd("onClickPlayer");
                            }
                        });
                        MatchInfoFragment.this.rv_11_two.setLayoutManager(new LinearLayoutManager(MatchInfoFragment.this.myActivity));
                        MatchInfoFragment.this.rv_11_two.setAdapter(adapteAwayPlayingXI);
                        if (getMatchInfo.awayPlayingXI() == null || getMatchInfo.awayPlayingXI().isEmpty()) {
                            MatchInfoFragment matchInfoFragment2 = MatchInfoFragment.this;
                            matchInfoFragment2.txt_no_data_two = (TextView) matchInfoFragment2.view.findViewById(R.id.txt_no_data_two);
                            MatchInfoFragment.this.rv_11_two.setVisibility(View.GONE);
                            MatchInfoFragment.this.txt_no_data_two.setVisibility(View.VISIBLE);;
                        }
                        RequestManager with = Glide.with(MatchInfoFragment.this.myActivity);
                        ((RequestBuilder) with.load(Glob.flag_start + getMatchInfo.homeTeamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchInfoFragment.this.img_mif_h_flag);
                        RequestManager with2 = Glide.with(MatchInfoFragment.this.myActivity);
                        ((RequestBuilder) with2.load(Glob.flag_start + getMatchInfo.awayTeamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(MatchInfoFragment.this.img_mif_a_flag);
                        MatchInfoFragment.this.venueId = getMatchInfo.venueID();
                        MatchInfoFragment.this.venueName = getMatchInfo.venue();
                    }
                }
            });
        }
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
        if (str.equals("onClickStadium")) {
            Intent intent = new Intent(this.myActivity, StadiumDetailActivity.class);
            intent.putExtra("VenueId", this.venueId);
            intent.putExtra("venueName", this.venueName);
            startActivity(intent);
        } else if (str.equals("onClickPlayer")) {
            Intent intent2 = new Intent(this.myActivity, PlayerDetailActivity.class);
            intent2.putExtra(Glob.PLAYER_ID, this.playerId);
            startActivity(intent2);
        }
    }
}
