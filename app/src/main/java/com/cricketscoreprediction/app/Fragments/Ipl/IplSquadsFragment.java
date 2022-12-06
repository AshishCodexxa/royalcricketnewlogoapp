package com.cricketscoreprediction.app.Fragments.Ipl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterIplTeamSquad;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.SquadsQuery;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;

import java.util.ArrayList;
import java.util.List;

public class IplSquadsFragment extends Fragment {
    private static final String LOG = "<<<IplSquadsFragment>>>";
    AdapterIplTeamSquad adapterIplSquad;
    Activity myActivity;
    RecyclerView rv_team_squad;
    View view;
    String seriesId = "";
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: com.livecricketscoreprediction.com.Fragments.Ipl.IplSquadsFragment.3
        public void onActivityResult(ActivityResult activityResult) {
        }
    });

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.seriesId = getArguments().getString("seriesId");
        this.view = layoutInflater.inflate(R.layout.fragment_ipl_squads, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_team_squad);
            this.rv_team_squad = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            new GraphqlApi(this.myActivity).getSquads(this.seriesId, new Interface.GetSquad() {
                @Override
                public void getResponse(List<SquadsQuery.Squad> list) {
                    IplSquadsFragment.this.onGetSquads(list);
                }
            });
        }
    }


    public void onGetSquads(final List<SquadsQuery.Squad> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList.addAll(list);
                        } else {
                            int i = 0;
                            while (i < list.size()) {
                                int i2 = i + 1;
                                if (i2 % Glob.adCountInCategory == 0) {
                                    arrayList.add((SquadsQuery.Squad) list.get(i));
                                    arrayList.add(null);
                                } else {
                                    arrayList.add((SquadsQuery.Squad) list.get(i));
                                }
                                i = i2;
                            }
                        }
                        IplSquadsFragment.this.adapterIplSquad = new AdapterIplTeamSquad(IplSquadsFragment.this.myActivity, arrayList, new AdapterIplTeamSquad.OnItemClickListener() { // from class: com.livecricketscoreprediction.com.Fragments.Ipl.IplSquadsFragment.2.1
                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(IplSquadsFragment.this.myActivity);
                            }

                            @Override
                            public void onClickItem() {
                                IplSquadsFragment.this.onShowInterstitialAd();
                            }
                        });
                        IplSquadsFragment.this.rv_team_squad.setAdapter(IplSquadsFragment.this.adapterIplSquad);
                    }
                }
            });
        }
    }

    public void onShowInterstitialAd() {
        Intent intent = new Intent(this.myActivity, TestAdActivity.class);
        intent.putExtra("where", "");
        this.resultLauncher.launch(intent);
    }
}