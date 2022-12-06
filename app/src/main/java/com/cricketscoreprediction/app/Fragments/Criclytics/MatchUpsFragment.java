package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketscoreprediction.app.Adapter.Criclytics.AdapterPlayer;

import com.cricketscoreprediction.app.MatchupsByIdQuery;
import com.cricketscoreprediction.app.Models.ModelPlayerMatchUp;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;

public class MatchUpsFragment extends Fragment {
    private static final String LOG = "<<<MatchUpsFragment>>>";
    String batterId = "";
    CardView card_otherMatchup;
    String currentInnings;
    ImageView img_info;
    ImageView img_player_batter;
    ImageView img_player_bowler;
    LinearLayout ll_player;
    LinearLayout ll_states;
    String matchId;
    String matchType;
    Activity myActivity;
    RelativeLayout rl_info;
    RecyclerView rv_player_batter;
    RecyclerView rv_player_bowler;
    TextView txt_balFaced;
    TextView txt_batter;
    TextView txt_battingSR;
    TextView txt_bowler;
    TextView txt_bowlingSR;
    TextView txt_dismissals;
    TextView txt_runs;
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
        this.view = layoutInflater.inflate(R.layout.fragment_match_ups, viewGroup, false);
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType + " : ");
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    MatchUpsFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            MatchUpsFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            this.img_player_batter = (ImageView) this.view.findViewById(R.id.img_player_batter);
            this.img_player_bowler = (ImageView) this.view.findViewById(R.id.img_player_bowler);
            this.txt_batter = (TextView) this.view.findViewById(R.id.txt_batter);
            this.txt_bowler = (TextView) this.view.findViewById(R.id.txt_bowler);
            this.ll_states = (LinearLayout) this.view.findViewById(R.id.ll_states);
            this.txt_balFaced = (TextView) this.view.findViewById(R.id.txt_balFaced);
            this.txt_dismissals = (TextView) this.view.findViewById(R.id.txt_dismissals);
            this.txt_runs = (TextView) this.view.findViewById(R.id.txt_runs);
            this.txt_battingSR = (TextView) this.view.findViewById(R.id.txt_battingSR);
            this.txt_bowlingSR = (TextView) this.view.findViewById(R.id.txt_bowlingSR);
            this.txt_balFaced.setTypeface(Glob.oswald_medium);
            this.txt_dismissals.setTypeface(Glob.oswald_medium);
            this.txt_runs.setTypeface(Glob.oswald_medium);
            this.txt_battingSR.setTypeface(Glob.oswald_medium);
            this.txt_bowlingSR.setTypeface(Glob.oswald_medium);
            this.card_otherMatchup = (CardView) this.view.findViewById(R.id.card_otherMatchup);
            this.ll_player = (LinearLayout) this.view.findViewById(R.id.ll_player);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_player_batter);
            this.rv_player_batter = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            RecyclerView recyclerView2 = (RecyclerView) this.view.findViewById(R.id.rv_player_bowler);
            this.rv_player_bowler = recyclerView2;
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.myActivity));
            this.card_otherMatchup.setOnClickListener(new MatchUpsFragment$$ExternalSyntheticLambda0(this));
            new GraphqlApi(this.myActivity).getMatchupsById(this.matchId, new Interface.GetMatchupsById() {


                @Override
                public void getResponse(MatchupsByIdQuery.MatchupsById matchupsById) {
                    MatchUpsFragment.this.getMatchUps(matchupsById);
                }
            });
        }
    }

    
    public void onClickOtherMatchUps(View view2) {
        RequestManager with = Glide.with(this.myActivity);
        Integer valueOf = Integer.valueOf((int) R.drawable.player_dummy);
        with.load(valueOf).into(this.img_player_batter);
        Glide.with(this.myActivity).load(valueOf).into(this.img_player_bowler);
        this.txt_batter.setText("Batter");
        this.txt_bowler.setText("Bowler");
        this.ll_states.setVisibility(View.GONE);
        this.ll_player.setVisibility(View.VISIBLE);;
    }

    
  
    private void getMatchUps(final MatchupsByIdQuery.MatchupsById matchupsById) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    MatchupsByIdQuery.MatchupsById matchupsById2 = matchupsById;
                    if (matchupsById2 == null || matchupsById2.matchUpData() == null || matchupsById.matchUpData().isEmpty()) {
                        MatchUpsFragment.this.view.findViewById(R.id.ll_player_match_ups).setVisibility(View.GONE);
                        MatchUpsFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        MatchUpsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                        return;
                    }
                    String string = Glob.getString(matchupsById.matchUpData().get(0).player1());
                    String string2 = Glob.getString(matchupsById.matchUpData().get(0).player1Name());
                    String string3 = Glob.getString(matchupsById.matchUpData().get(0).player2());
                    String string4 = Glob.getString(matchupsById.matchUpData().get(0).player2Name());
                    RequestManager with = Glide.with(MatchUpsFragment.this.myActivity);
                    ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + string + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(MatchUpsFragment.this.img_player_batter);
                    MatchUpsFragment.this.txt_batter.setText(string2);
                    RequestManager with2 = Glide.with(MatchUpsFragment.this.myActivity);
                    ((RequestBuilder) ((RequestBuilder) with2.load(Glob.player_start + string3 + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(MatchUpsFragment.this.img_player_bowler);
                    MatchUpsFragment.this.txt_bowler.setText(string4);
                    String str = Glob.getInt(matchupsById.matchUpData().get(0).ballsFaced() + "");
                    String str2 = Glob.getInt(matchupsById.matchUpData().get(0).Dismissals() + "");
                    String str3 = Glob.getInt(matchupsById.matchUpData().get(0).runsScored() + "");
                    String str4 = Glob.getInt(matchupsById.matchUpData().get(0).battingSR() + "");
                    String str5 = Glob.getInt(matchupsById.matchUpData().get(0).bowlingSR() + "");
                    MatchUpsFragment.this.txt_balFaced.setText(str);
                    MatchUpsFragment.this.txt_dismissals.setText(str2);
                    MatchUpsFragment.this.txt_runs.setText(str3);
                    MatchUpsFragment.this.txt_battingSR.setText(str4);
                    MatchUpsFragment.this.txt_bowlingSR.setText(str5);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < matchupsById.matchUpData().size(); i++) {
                        String player1 = matchupsById.matchUpData().get(i).player1();
                        ModelPlayerMatchUp modelPlayerMatchUp = new ModelPlayerMatchUp(player1, matchupsById.matchUpData().get(i).player1Name());
                        boolean z = false;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (((ModelPlayerMatchUp) arrayList.get(i2)).getPlayerId().equals(player1)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            arrayList.add(modelPlayerMatchUp);
                        }
                    }
                    MatchUpsFragment.this.rv_player_batter.setAdapter(new AdapterPlayer(MatchUpsFragment.this.myActivity, arrayList, new AdapterPlayer.OnItemClickListener() {


                        @Override
                        public void onItemClick(String str, String str2) {
                            MatchUpsFragment.this.batterId = str;
                            RequestManager with = Glide.with(MatchUpsFragment.this.myActivity);
                            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + str + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(MatchUpsFragment.this.img_player_batter);
                            MatchUpsFragment.this.txt_batter.setText(str2);
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < matchupsById.matchUpData().size(); i++) {
                                if (matchupsById.matchUpData().get(i).player1().equals(str)) {
                                    arrayList.add(new ModelPlayerMatchUp(matchupsById.matchUpData().get(i).player2(), matchupsById.matchUpData().get(i).player2Name()));
                                }
                            }
                            MatchUpsFragment.this.rv_player_bowler.setAdapter(new AdapterPlayer(MatchUpsFragment.this.myActivity, arrayList, new AdapterPlayer.OnItemClickListener() {


                                @Override
                                public void onItemClick(String str, String str2) {
                                    RequestManager with = Glide.with(MatchUpsFragment.this.myActivity);
                                    ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + str + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(MatchUpsFragment.this.img_player_bowler);
                                    MatchUpsFragment.this.txt_bowler.setText(str2);
                                    for (int i = 0; i < matchupsById.matchUpData().size(); i++) {
                                        if (matchupsById.matchUpData().get(i).player1().equals(MatchUpsFragment.this.batterId) && matchupsById.matchUpData().get(i).player2().equals(str)) {
                                            String str3 = Glob.getInt(matchupsById.matchUpData().get(i).ballsFaced() + "");
                                            String str4 = Glob.getInt(matchupsById.matchUpData().get(i).Dismissals() + "");
                                            String str5 = Glob.getInt(matchupsById.matchUpData().get(i).runsScored() + "");
                                            String str6 = Glob.getInt(matchupsById.matchUpData().get(i).battingSR() + "");
                                            String str7 = Glob.getInt(matchupsById.matchUpData().get(i).bowlingSR() + "");
                                            MatchUpsFragment.this.txt_balFaced.setText(str3);
                                            MatchUpsFragment.this.txt_dismissals.setText(str4);
                                            MatchUpsFragment.this.txt_runs.setText(str5);
                                            MatchUpsFragment.this.txt_battingSR.setText(str6);
                                            MatchUpsFragment.this.txt_bowlingSR.setText(str7);
                                        }
                                    }
                                    MatchUpsFragment.this.ll_states.setVisibility(View.VISIBLE);;
                                    MatchUpsFragment.this.ll_player.setVisibility(View.GONE);
                                    MatchUpsFragment.this.rv_player_batter.setVisibility(View.VISIBLE);;
                                    MatchUpsFragment.this.rv_player_bowler.setVisibility(View.GONE);
                                }
                            }));
                            MatchUpsFragment.this.rv_player_batter.setVisibility(View.GONE);
                            MatchUpsFragment.this.rv_player_bowler.setVisibility(View.VISIBLE);;
                        }
                    }));
                    MatchUpsFragment.this.view.findViewById(R.id.ll_player_match_ups).setVisibility(View.VISIBLE);;
                    MatchUpsFragment.this.view.findViewById(R.id.ProgressBar).setVisibility(View.GONE);
                }
            });
        }
    }


    @Override
    public void onStop() {
        Glob.freeMemory();
        super.onStop();
    }
}
