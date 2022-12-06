package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.CustomProgressBar;
import com.cricketscoreprediction.app.GetcriclyticsCommonApiQuery;
import com.cricketscoreprediction.app.Models.ProgressItem;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;
import java.util.Iterator;

public class TeamScoreProjectionFragment extends Fragment {
    private static final String LOG = "<<<TeamScoreProjectionFragment>>>";
    private static Activity myActivity;
    String currentInnings;
    Handler handler = new Handler();
    ImageView img_flag_inning1;
    ImageView img_flag_inning2;
    ImageView img_flag_inning3;
    ImageView img_flag_inning4;
    ImageView img_flag_one;
    ImageView img_flag_two;
    ImageView img_info;
    LinearLayout ll_test;
    LinearLayout ll_two_innings;
    private ProgressItem mProgressItem;
    String matchId;
    String matchType;
    private ArrayList<ProgressItem> progressItemList;
    Runnable refresh;
    RelativeLayout rl_info;
    private CustomProgressBar seekbar;
    TextView txt_draw_per;
    TextView txt_over_inning1;
    TextView txt_over_inning2;
    TextView txt_over_inning3;
    TextView txt_over_inning4;
    TextView txt_over_one;
    TextView txt_over_two;
    TextView txt_projection_over_inning1;
    TextView txt_projection_over_inning2;
    TextView txt_projection_over_inning3;
    TextView txt_projection_over_inning4;
    TextView txt_projection_over_one;
    TextView txt_projection_over_two;
    TextView txt_projection_score_inning1;
    TextView txt_projection_score_inning2;
    TextView txt_projection_score_inning3;
    TextView txt_projection_score_inning4;
    TextView txt_projection_score_one;
    TextView txt_projection_score_two;
    TextView txt_score_inning1;
    TextView txt_score_inning2;
    TextView txt_score_inning3;
    TextView txt_score_inning4;
    TextView txt_score_one;
    TextView txt_score_two;
    TextView txt_team1;
    TextView txt_team1_per;
    TextView txt_team2;
    TextView txt_team2_per;
    TextView txt_team_inning1;
    TextView txt_team_inning2;
    TextView txt_team_inning3;
    TextView txt_team_inning4;
    TextView txt_team_one;
    TextView txt_team_two;
    TextView txt_winner_prediction;
    View view;

    @Override 
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public static TeamScoreProjectionFragment newInstance(Activity activity) {
        TeamScoreProjectionFragment teamScoreProjectionFragment = new TeamScoreProjectionFragment();
        myActivity = activity;
        return teamScoreProjectionFragment;
    }

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString(Glob.MATCH_ID);
        this.currentInnings = getArguments().getString(Glob.INNINGS);
        this.matchType = getArguments().getString(Glob.TYPES);
        this.view = layoutInflater.inflate(R.layout.fragment_team_score_projection, viewGroup, false);
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType + "");
        initView();
        return this.view;
    }

    private void initView() {
        if (myActivity != null && isAdded()) {

            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    TeamScoreProjectionFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            TeamScoreProjectionFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            this.txt_team1_per = (TextView) this.view.findViewById(R.id.txt_team1_per);
            this.txt_draw_per = (TextView) this.view.findViewById(R.id.txt_draw_per);
            this.txt_team2_per = (TextView) this.view.findViewById(R.id.txt_team2_per);
            this.txt_team1 = (TextView) this.view.findViewById(R.id.txt_team1);
            this.txt_team2 = (TextView) this.view.findViewById(R.id.txt_team2);
            this.ll_two_innings = (LinearLayout) this.view.findViewById(R.id.ll_two_innings);
            this.txt_score_one = (TextView) this.view.findViewById(R.id.txt_score_one);
            this.txt_over_one = (TextView) this.view.findViewById(R.id.txt_over_one);
            this.txt_team_one = (TextView) this.view.findViewById(R.id.txt_team_one);
            this.txt_projection_score_one = (TextView) this.view.findViewById(R.id.txt_projection_score_one);
            this.txt_projection_over_one = (TextView) this.view.findViewById(R.id.txt_projection_over_one);
            this.img_flag_one = (ImageView) this.view.findViewById(R.id.img_flag_one);
            this.txt_score_two = (TextView) this.view.findViewById(R.id.txt_score_two);
            this.txt_over_two = (TextView) this.view.findViewById(R.id.txt_over_two);
            this.txt_team_two = (TextView) this.view.findViewById(R.id.txt_team_two);
            this.txt_projection_score_two = (TextView) this.view.findViewById(R.id.txt_projection_score_two);
            this.txt_projection_over_two = (TextView) this.view.findViewById(R.id.txt_projection_over_two);
            this.img_flag_two = (ImageView) this.view.findViewById(R.id.img_flag_two);
            this.ll_test = (LinearLayout) this.view.findViewById(R.id.ll_test);
            this.img_flag_inning1 = (ImageView) this.view.findViewById(R.id.img_flag_inning1);
            this.txt_team_inning1 = (TextView) this.view.findViewById(R.id.txt_team_inning1);
            this.txt_score_inning1 = (TextView) this.view.findViewById(R.id.txt_score_inning1);
            this.txt_over_inning1 = (TextView) this.view.findViewById(R.id.txt_over_inning1);
            this.txt_projection_score_inning1 = (TextView) this.view.findViewById(R.id.txt_projection_score_inning1);
            this.txt_projection_over_inning1 = (TextView) this.view.findViewById(R.id.txt_projection_over_inning1);
            this.img_flag_inning2 = (ImageView) this.view.findViewById(R.id.img_flag_inning2);
            this.txt_team_inning2 = (TextView) this.view.findViewById(R.id.txt_team_inning2);
            this.txt_score_inning2 = (TextView) this.view.findViewById(R.id.txt_score_inning2);
            this.txt_over_inning2 = (TextView) this.view.findViewById(R.id.txt_over_inning2);
            this.txt_projection_score_inning2 = (TextView) this.view.findViewById(R.id.txt_projection_score_inning2);
            this.txt_projection_over_inning2 = (TextView) this.view.findViewById(R.id.txt_projection_over_inning2);
            this.img_flag_inning3 = (ImageView) this.view.findViewById(R.id.img_flag_inning3);
            this.txt_team_inning3 = (TextView) this.view.findViewById(R.id.txt_team_inning3);
            this.txt_score_inning3 = (TextView) this.view.findViewById(R.id.txt_score_inning3);
            this.txt_over_inning3 = (TextView) this.view.findViewById(R.id.txt_over_inning3);
            this.txt_projection_score_inning3 = (TextView) this.view.findViewById(R.id.txt_projection_score_inning3);
            this.txt_projection_over_inning3 = (TextView) this.view.findViewById(R.id.txt_projection_over_inning3);
            this.img_flag_inning4 = (ImageView) this.view.findViewById(R.id.img_flag_inning4);
            this.txt_team_inning4 = (TextView) this.view.findViewById(R.id.txt_team_inning4);
            this.txt_score_inning4 = (TextView) this.view.findViewById(R.id.txt_score_inning4);
            this.txt_over_inning4 = (TextView) this.view.findViewById(R.id.txt_over_inning4);
            this.txt_projection_score_inning4 = (TextView) this.view.findViewById(R.id.txt_projection_score_inning4);
            this.txt_projection_over_inning4 = (TextView) this.view.findViewById(R.id.txt_projection_over_inning4);
            this.txt_winner_prediction = (TextView) this.view.findViewById(R.id.txt_winner_prediction);
            final GraphqlApi graphqlApi = new GraphqlApi(myActivity);
            CustomProgressBar customProgressBar = (CustomProgressBar) this.view.findViewById(R.id.seekBar0);
            this.seekbar = customProgressBar;
            customProgressBar.getThumb().mutate().setAlpha(0);
            this.progressItemList = new ArrayList<>();
            initDataToSeekbar("0", "0", "0");
            ProgressItem progressItem = new ProgressItem();
            this.mProgressItem = progressItem;
            progressItem.progressItemPercentage = 100.0f;
            this.mProgressItem.color = R.color.gray_ad_border;
            this.progressItemList.add(this.mProgressItem);
            this.seekbar.initData(this.progressItemList);
            this.seekbar.invalidate();
            Runnable r1 = new Runnable() {


                public void run() {
                    graphqlApi.getCriclyticsCommonApi(TeamScoreProjectionFragment.this.matchId, new Interface.GetcriclyticsCommonApi() {


                        @Override
                        public void getResponse(GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi) {
                            TeamScoreProjectionFragment.this.getTeamProjection(getcriclyticsCommonApi);
                        }
                    });
                    TeamScoreProjectionFragment.this.handler.postDelayed(TeamScoreProjectionFragment.this.refresh, 15000);
                }
            };
            this.refresh = r1;
            this.handler.post(r1);
        }
    }

    public class ModelTeam {
        String teamId;
        String teamName;

        public ModelTeam() {
        }

        public void ModelTeam(String str, String str2) {
            this.teamId = str;
            this.teamName = str2;
        }

        public String getTeamId() {
            return this.teamId;
        }

        public String getTeamName() {
            return this.teamName;
        }
    }

    
  
    private void getTeamProjection(final GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi) {
        Activity activity = myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    Object obj;
                    Object obj2;
                    String str;
                    String str2;
                    GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi2 = getcriclyticsCommonApi;
                    if (getcriclyticsCommonApi2 == null || getcriclyticsCommonApi2.TeamProjections() == null || getcriclyticsCommonApi.TeamProjections().get(0) == null) {
                        TeamScoreProjectionFragment.this.view.findViewById(R.id.ll_live_team_score_pro).setVisibility(View.GONE);
                        TeamScoreProjectionFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        TeamScoreProjectionFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                        return;
                    }
                    ArrayList<ModelTeam> arrayList = new ArrayList<>();
                    ModelTeam modelTeam = new ModelTeam();
                    modelTeam.ModelTeam(getcriclyticsCommonApi.TeamProjections().get(0).team1Id(), getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                    arrayList.add(modelTeam);
                    ModelTeam modelTeam2 = new ModelTeam();
                    modelTeam2.ModelTeam(getcriclyticsCommonApi.TeamProjections().get(0).team2Id(), getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                    arrayList.add(modelTeam2);
                    String homeTeamShortName = getcriclyticsCommonApi.TeamProjections().get(0).homeTeamShortName();
                    if (!Glob.isNull(homeTeamShortName)) {
                        TeamScoreProjectionFragment.this.txt_team1.setText(String.format("%s", homeTeamShortName));
                    }
                    String awayTeamShortName = getcriclyticsCommonApi.TeamProjections().get(0).awayTeamShortName();
                    if (!Glob.isNull(awayTeamShortName)) {
                        TeamScoreProjectionFragment.this.txt_team2.setText(String.format("%s", awayTeamShortName));
                    }
                    String homeTeamPercentage = getcriclyticsCommonApi.TeamProjections().get(0).homeTeamPercentage();
                    if (!Glob.isNull(homeTeamPercentage)) {
                        TeamScoreProjectionFragment.this.txt_team1_per.setText(String.format("%s%s", homeTeamPercentage, "%"));
                    } else {
                        homeTeamPercentage = "0";
                    }
                    String awayTeamPercentage = getcriclyticsCommonApi.TeamProjections().get(0).awayTeamPercentage();
                    if (!Glob.isNull(awayTeamPercentage)) {
                        TeamScoreProjectionFragment.this.txt_team2_per.setText(String.format("%s%s", awayTeamPercentage, "%"));
                    } else {
                        awayTeamPercentage = "0";
                    }
                    String format = String.format("%s%s%s", getcriclyticsCommonApi.TeamProjections().get(0).currentScore(), "/", getcriclyticsCommonApi.TeamProjections().get(0).currentWickets());
                    String format2 = String.format("%s%s%s", "(", getcriclyticsCommonApi.TeamProjections().get(0).currentOvers(), ")");
                    String format3 = String.format("%s%s%s", getcriclyticsCommonApi.TeamProjections().get(0).predictedScore(), "/", getcriclyticsCommonApi.TeamProjections().get(0).predictedWicket());
                    String format4 = String.format("%s%s%s", "(", getcriclyticsCommonApi.TeamProjections().get(0).predictedOver(), ")");
                    if (TeamScoreProjectionFragment.this.matchType.equalsIgnoreCase("ODI") || TeamScoreProjectionFragment.this.matchType.equalsIgnoreCase("T20")) {
                        TeamScoreProjectionFragment.this.ll_two_innings.setVisibility(View.VISIBLE);;
                        String tiePercentage = getcriclyticsCommonApi.TeamProjections().get(0).tiePercentage();
                        str = Glob.getInt(tiePercentage);
                        obj2 = ")";
                        obj = "/";
                        TeamScoreProjectionFragment.this.txt_draw_per.setText(String.format("%s%s", Glob.getInt(tiePercentage), "%"));
                        TeamScoreProjectionFragment.this.initDataToSeekbar(homeTeamPercentage, awayTeamPercentage, str);
                        TeamScoreProjectionFragment.this.txt_team_one.setText(getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                        TeamScoreProjectionFragment.this.txt_team_two.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                        RequestManager with = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_one);
                        RequestManager with2 = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with2.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_two);
                        if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("1")) {
                            TeamScoreProjectionFragment.this.txt_score_one.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_one.setText(format2);
                            TeamScoreProjectionFragment.this.txt_projection_score_one.setText(format3);
                            TeamScoreProjectionFragment.this.txt_projection_over_one.setText(format4);
                        } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                            TeamScoreProjectionFragment.this.txt_score_two.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_two.setText(format2);
                            TeamScoreProjectionFragment.this.txt_score_one.setText(format3);
                            TeamScoreProjectionFragment.this.txt_over_one.setText(format4);
                        }
                        str2 = "%s%s%s";
                        TeamScoreProjectionFragment.this.txt_projection_score_two.setText(String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedScore(), obj, getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedWicket()));
                        TeamScoreProjectionFragment.this.txt_projection_over_two.setText(String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedOVer(), obj2));
                    } else {
                        str2 = "%s%s%s";
                        obj = "/";
                        str = "0";
                        obj2 = ")";
                    }
                    if (TeamScoreProjectionFragment.this.matchType.equalsIgnoreCase("Test")) {
                        TeamScoreProjectionFragment.this.ll_test.setVisibility(View.VISIBLE);;
                        String tiePercentage2 = getcriclyticsCommonApi.TeamProjections().get(0).tiePercentage();
                        str = Glob.getInt(tiePercentage2);
                        TeamScoreProjectionFragment.this.txt_draw_per.setText(String.format("%s%s", Glob.getInt(tiePercentage2), "%"));
                        TeamScoreProjectionFragment.this.initDataToSeekbar(homeTeamPercentage, awayTeamPercentage, str);
                        TeamScoreProjectionFragment.this.txt_team_inning1.setText(getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                        RequestManager with3 = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with3.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_inning1);
                        TeamScoreProjectionFragment.this.txt_team_inning2.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                        RequestManager with4 = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with4.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_inning2);
                        TeamScoreProjectionFragment.this.txt_team_inning3.setText(getcriclyticsCommonApi.TeamProjections().get(0).team1ShortName());
                        RequestManager with5 = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with5.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team1Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_inning3);
                        TeamScoreProjectionFragment.this.txt_team_inning4.setText(getcriclyticsCommonApi.TeamProjections().get(0).team2ShortName());
                        RequestManager with6 = Glide.with(TeamScoreProjectionFragment.myActivity);
                        ((RequestBuilder) with6.load(Glob.teams_start + getcriclyticsCommonApi.TeamProjections().get(0).team2Id() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(TeamScoreProjectionFragment.this.img_flag_inning4);
                        String format5 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedScore(), obj, getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedWicket());
                        String format6 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).secondPredictedOVer(), obj2);
                        String format7 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedScore(), obj, getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedWicket());
                        String format8 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).thirdPredictedOver(), obj2);
                        String format9 = String.format(str2, getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedScore(), obj, getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedWicket());
                        String format10 = String.format(str2, "(", getcriclyticsCommonApi.TeamProjections().get(0).fourthPredictedOver(), obj2);
                        if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("1")) {
                            TeamScoreProjectionFragment.this.txt_score_inning1.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_inning1.setText(format2);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning1.setText(format3);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning1.setText(format3);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning2.setText(format5);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning2.setText(format6);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning3.setText(format7);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning3.setText(format8);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning4.setText(format9);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning4.setText(format10);
                        } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                            TeamScoreProjectionFragment.this.txt_score_inning1.setText(format3);
                            TeamScoreProjectionFragment.this.txt_over_inning1.setText(format4);
                            TeamScoreProjectionFragment.this.txt_score_inning2.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_inning2.setText(format2);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning2.setText(format5);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning2.setText(format6);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning3.setText(format7);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning3.setText(format8);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning4.setText(format9);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning4.setText(format10);
                        } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                            TeamScoreProjectionFragment.this.txt_score_inning1.setText(format3);
                            TeamScoreProjectionFragment.this.txt_over_inning1.setText(format4);
                            TeamScoreProjectionFragment.this.txt_score_inning2.setText(format5);
                            TeamScoreProjectionFragment.this.txt_over_inning2.setText(format6);
                            TeamScoreProjectionFragment.this.txt_score_inning3.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_inning3.setText(format2);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning3.setText(format7);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning3.setText(format8);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning4.setText(format9);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning4.setText(format10);
                        } else if (getcriclyticsCommonApi.TeamProjections().get(0).inningNo().equals("4")) {
                            TeamScoreProjectionFragment.this.txt_score_inning1.setText(format3);
                            TeamScoreProjectionFragment.this.txt_over_inning1.setText(format4);
                            TeamScoreProjectionFragment.this.txt_score_inning2.setText(format5);
                            TeamScoreProjectionFragment.this.txt_over_inning2.setText(format6);
                            TeamScoreProjectionFragment.this.txt_score_inning3.setText(format7);
                            TeamScoreProjectionFragment.this.txt_over_inning3.setText(format8);
                            TeamScoreProjectionFragment.this.txt_score_inning4.setText(format);
                            TeamScoreProjectionFragment.this.txt_over_inning4.setText(format2);
                            TeamScoreProjectionFragment.this.txt_projection_score_inning4.setText(format9);
                            TeamScoreProjectionFragment.this.txt_projection_over_inning4.setText(format10);
                        }
                    }
                    String teamName = TeamScoreProjectionFragment.this.getTeamName(arrayList, getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().winnerTeamId());
                    String format11 = String.format("%s %s %s", teamName, " to win by " + getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().wickets(), " Wickets");
                    if (Integer.parseInt(str) > 50) {
                        format11 = "Match to end in Draw";
                    } else if (getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().wickets().equals("")) {
                        format11 = String.format("%s %s %s", teamName, " to win by " + getcriclyticsCommonApi.TeamProjections().get(0).predictvizMarginView().runs(), " Runs");
                    }
                    TeamScoreProjectionFragment.this.txt_winner_prediction.setText(format11);
                    TeamScoreProjectionFragment.this.view.findViewById(R.id.ll_live_team_score_pro).setVisibility(View.VISIBLE);;
                    TeamScoreProjectionFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                }
            });
        }
    }

    public String getTeamName(ArrayList<ModelTeam> arrayList, String str) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        Iterator<ModelTeam> it = arrayList.iterator();
        while (it.hasNext()) {
            ModelTeam next = it.next();
            if (next.getTeamId().equals(str)) {
                return next.getTeamName();
            }
        }
        return "";
    }

    public void initDataToSeekbar(String str, String str2, String str3) {
        this.progressItemList = new ArrayList<>();
        if (Integer.parseInt(str) > Integer.parseInt(str2)) {
            this.txt_team1_per.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorGreenIS, myActivity.getTheme()));
            this.txt_team2_per.setTextColor(ResourcesCompat.getColor(getResources(), R.color.red, myActivity.getTheme()));
            ProgressItem progressItem = new ProgressItem();
            this.mProgressItem = progressItem;
            progressItem.progressItemPercentage = (float) Integer.parseInt(str);
            this.mProgressItem.color = R.color.green;
            this.progressItemList.add(this.mProgressItem);
            ProgressItem progressItem2 = new ProgressItem();
            this.mProgressItem = progressItem2;
            progressItem2.progressItemPercentage = (float) Integer.parseInt(str3);
            this.mProgressItem.color = R.color.gray_ad_border;
            this.progressItemList.add(this.mProgressItem);
            ProgressItem progressItem3 = new ProgressItem();
            this.mProgressItem = progressItem3;
            progressItem3.progressItemPercentage = (float) Integer.parseInt(str2);
            this.mProgressItem.color = R.color.red;
            this.progressItemList.add(this.mProgressItem);
        } else {
            this.txt_team1_per.setTextColor(ResourcesCompat.getColor(getResources(), R.color.red, myActivity.getTheme()));
            this.txt_team2_per.setTextColor(ResourcesCompat.getColor(getResources(), R.color.colorGreenIS, myActivity.getTheme()));
            ProgressItem progressItem4 = new ProgressItem();
            this.mProgressItem = progressItem4;
            progressItem4.progressItemPercentage = (float) Integer.parseInt(str);
            this.mProgressItem.color = R.color.red;
            this.progressItemList.add(this.mProgressItem);
            ProgressItem progressItem5 = new ProgressItem();
            this.mProgressItem = progressItem5;
            progressItem5.progressItemPercentage = (float) Integer.parseInt(str3);
            this.mProgressItem.color = R.color.gray_ad_border;
            this.progressItemList.add(this.mProgressItem);
            ProgressItem progressItem6 = new ProgressItem();
            this.mProgressItem = progressItem6;
            progressItem6.progressItemPercentage = (float) Integer.parseInt(str2);
            this.mProgressItem.color = R.color.green;
            this.progressItemList.add(this.mProgressItem);
        }
        this.seekbar.initData(this.progressItemList);
        this.seekbar.invalidate();
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
