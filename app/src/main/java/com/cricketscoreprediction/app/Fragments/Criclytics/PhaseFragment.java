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
import androidx.fragment.app.Fragment;

import com.cricketscoreprediction.app.PhaseOfSessionsQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

public class PhaseFragment extends Fragment {
    private static final String LOG = "<<<PhaseFragment>>>";
    String currentInnings;
    ImageView img_info;
    LinearLayout ll_phase;
    String matchId;
    String matchType;
    Activity myActivity;
    RelativeLayout rl_info;
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
        Glob.log(LOG, this.matchId + " : " + this.currentInnings + " : " + this.matchType + " : ");
        this.view = layoutInflater.inflate(R.layout.fragment_phase, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            this.img_info = (ImageView) this.view.findViewById(R.id.img_info);
            this.rl_info = (RelativeLayout) this.view.findViewById(R.id.rl_info);
            this.img_info.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    PhaseFragment.this.rl_info.setVisibility(View.VISIBLE);;
                    new Handler().postDelayed(new Runnable() {

                        public void run() {
                            PhaseFragment.this.rl_info.setVisibility(View.GONE);
                        }
                    }, 5000);
                }
            });
            this.ll_phase = (LinearLayout) this.view.findViewById(R.id.ll_phase);
            new GraphqlApi(this.myActivity).getPhaseOfSessions(this.matchId, new Interface.GetPhaseOfSessions() {

                @Override
                public void getResponse(PhaseOfSessionsQuery.PhaseOfSessions phaseOfSessions) {
                    PhaseFragment.this.getPhaseTest(phaseOfSessions);
                }
            });
        }
    }

    
  
    private void getPhaseTest(final PhaseOfSessionsQuery.PhaseOfSessions phaseOfSessions) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    Glob.log(PhaseFragment.LOG, phaseOfSessions + "");
                    if (phaseOfSessions != null) {
                        PhaseFragment.this.ll_phase.setVisibility(View.VISIBLE);;
                        PhaseFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.GONE);
                        return;
                    }
                    PhaseFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);;
                    PhaseFragment.this.ll_phase.setVisibility(View.GONE);
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
