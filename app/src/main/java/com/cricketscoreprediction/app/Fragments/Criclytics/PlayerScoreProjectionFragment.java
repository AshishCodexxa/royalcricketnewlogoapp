package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.cricketscoreprediction.app.Adapter.Criclytics.AdapterBatsmanProjection;

import com.cricketscoreprediction.app.GetLivePlayerProjectionDetailsQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

public class PlayerScoreProjectionFragment extends Fragment {
    private static final String LOG = "<<<PlayerScoreProjectionFragment>>>";
    String currentInnings;
    Handler handler = new Handler();
    ImageView img_info;
    ImageView img_playerImage;
    String matchId;
    String matchType;
    Activity myActivity;
    Runnable refresh;
    RelativeLayout rl_info;
    RecyclerView rv_player_projection;
    TextView txt_player_bol;
    TextView txt_player_name;
    TextView txt_player_run;
    TextView txt_projection;
    TextView txt_team_name;
    View view;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString(Glob.MATCH_ID);
        this.currentInnings = getArguments().getString(Glob.INNINGS);
        this.matchType = getArguments().getString(Glob.TYPES);
        this.view = layoutInflater.inflate(R.layout.fragment_player_score_projection, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    PlayerScoreProjectionFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            PlayerScoreProjectionFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_player_projection);
            this.rv_player_projection = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            this.img_playerImage = (ImageView) this.view.findViewById(R.id.img_playerImage);
            this.txt_player_name = (TextView) this.view.findViewById(R.id.txt_player_name);
            this.txt_team_name = (TextView) this.view.findViewById(R.id.txt_team_name);
            this.txt_player_run = (TextView) this.view.findViewById(R.id.txt_player_run);
            this.txt_player_bol = (TextView) this.view.findViewById(R.id.txt_player_bol);
            this.txt_projection = (TextView) this.view.findViewById(R.id.txt_projection);
            final GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            Runnable r1 = new Runnable() {


                public void run() {
                    graphqlApi.getLivePlayerProjectionDetails(PlayerScoreProjectionFragment.this.matchId, new Interface.GetLivePlayerProjectionDetails() {


                        @Override
                        public void getResponse(GetLivePlayerProjectionDetailsQuery.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails) {
                            PlayerScoreProjectionFragment.this.getPlayerProjection(getLivePlayerProjectionDetails);
                        }
                    });
                    PlayerScoreProjectionFragment.this.handler.postDelayed(PlayerScoreProjectionFragment.this.refresh, 5000);
                }
            };
            this.refresh = r1;
            this.handler.post(r1);
        }
    }

    
  
    private void getPlayerProjection(final GetLivePlayerProjectionDetailsQuery.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    GetLivePlayerProjectionDetailsQuery.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails2 = getLivePlayerProjectionDetails;
                    if (getLivePlayerProjectionDetails2 == null) {
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_player_live_score_pro).setVisibility(View.GONE);
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                    } else if (getLivePlayerProjectionDetails2.batsman() == null || getLivePlayerProjectionDetails.batsman().isEmpty()) {
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_player_live_score_pro).setVisibility(View.GONE);
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                    } else {
                        AdapterBatsmanProjection adapterBatsmanProjection = new AdapterBatsmanProjection();
                        adapterBatsmanProjection.AdapterBatsmanProjection(PlayerScoreProjectionFragment.this.myActivity, getLivePlayerProjectionDetails.batsman());
                        PlayerScoreProjectionFragment.this.rv_player_projection.setAdapter(adapterBatsmanProjection);
                        if (getLivePlayerProjectionDetails.bowler() != null) {
                            ((RequestBuilder) ((RequestBuilder) Glide.with(PlayerScoreProjectionFragment.this.myActivity).load(Glob.player_start + getLivePlayerProjectionDetails.bowler().bowlerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(PlayerScoreProjectionFragment.this.img_playerImage);
                            String bowlerName = getLivePlayerProjectionDetails.bowler().bowlerName();
                            PlayerScoreProjectionFragment.this.txt_player_name.setText(bowlerName);
                            PlayerScoreProjectionFragment.this.txt_team_name.setText(getLivePlayerProjectionDetails.bowler().teamName());
                            if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().wicketsTakenTillNow() + "")) {
                                if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().bowlerRuns() + "")) {
                                    PlayerScoreProjectionFragment.this.txt_player_run.setText(String.format("%s%s%s", getLivePlayerProjectionDetails.bowler().wicketsTakenTillNow(), "/", getLivePlayerProjectionDetails.bowler().bowlerRuns()));
                                }
                            }
                            String str = getLivePlayerProjectionDetails.bowler().oversBowledSoFar() + "";
                            if (!Glob.isNull(str)) {
                                PlayerScoreProjectionFragment.this.txt_player_bol.setText(String.format("%s%s%s", "(", str, ")"));
                            }
                            if (getLivePlayerProjectionDetails.bowler().bounds() != null && !getLivePlayerProjectionDetails.bowler().bounds().isEmpty()) {
                                if (!Glob.isNull(getLivePlayerProjectionDetails.bowler().bounds() + "")) {
                                    PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.VISIBLE);;
                                    String str2 = getLivePlayerProjectionDetails.bowler().bounds().get(0);
                                    if (getLivePlayerProjectionDetails.bowler().bounds().size() > 1) {
                                        str2 = getLivePlayerProjectionDetails.bowler().bounds().get(1);
                                    }
                                    PlayerScoreProjectionFragment.this.txt_projection.setText(String.format("%s %s %s %s %s", "Criclytics predicts ", bowlerName, " to pick ", str2, " wickets"));
                                }
                            }
                            PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.GONE);
                        } else {
                            PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_pro_bowler).setVisibility(View.GONE);
                        }
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.ll_player_live_score_pro).setVisibility(View.VISIBLE);;
                        PlayerScoreProjectionFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                    }
                }
            });
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.refresh);
    }

    @Override
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

}
