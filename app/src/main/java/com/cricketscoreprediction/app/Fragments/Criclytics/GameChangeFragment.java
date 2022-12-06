package com.cricketscoreprediction.app.Fragments.Criclytics;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.Adapter.Criclytics.AdapterGameChange;

import com.cricketscoreprediction.app.GameChangingOversQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

public class GameChangeFragment extends Fragment {
    private static final String LOG = "<<<GameChangeFragment>>>";
    String currentInnings;
    ImageView img_info;
    String matchId;
    String matchType;
    Activity myActivity;
    RelativeLayout rl_info;
    RecyclerView rv_game_change;
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
        this.view = layoutInflater.inflate(R.layout.fragment_game_change, viewGroup, false);
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
                    GameChangeFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {


                        public void run() {
                            GameChangeFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_game_change);
            this.rv_game_change = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            new GraphqlApi(this.myActivity).getGameChangingOvers(this.matchId, new Interface.GetGameChangingOvers() {

                @Override
                public void getResponse(GameChangingOversQuery.GameChangingOvers gameChangingOvers) {
                    GameChangeFragment.this.getGameChange(gameChangingOvers);
                }
            });
        }
    }

    
  
    private void getGameChange(final GameChangingOversQuery.GameChangingOvers gameChangingOvers) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    GameChangingOversQuery.GameChangingOvers gameChangingOvers2 = gameChangingOvers;
                    if (gameChangingOvers2 == null || gameChangingOvers2.matchID() == null) {
                        GameChangeFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.GONE);
                        GameChangeFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                        GameChangeFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
                        return;
                    }
                    GameChangeFragment.this.rv_game_change.setAdapter(new AdapterGameChange(GameChangeFragment.this.myActivity, gameChangingOvers.overs()));
                    GameChangeFragment.this.view.findViewById(R.id.scrollView).setVisibility(View.VISIBLE);;
                    GameChangeFragment.this.view.findViewById(R.id.progressBar).setVisibility(View.GONE);
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
