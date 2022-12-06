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
import com.cricketscoreprediction.app.Activities.Stadium.StadiumDetailActivity;
import com.cricketscoreprediction.app.Activities.TestAdActivity;
import com.cricketscoreprediction.app.Adapter.Ipl.AdapterIplStadium;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.VenuedetailsQuery;
import com.cricketscoreprediction.app.graphql.GraphqlApi;
import com.cricketscoreprediction.app.graphql.Interface;
import java.util.ArrayList;
import java.util.List;

public class IplStadiumFragment extends Fragment {
    private static final String LOG = "<<<IplStadiumFragment>>>";
    AdapterIplStadium adapterIplStadium;
    Activity myActivity;
    ActivityResultLauncher<Intent> resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() != -1) {
                return;
            }
            if (activityResult.getData() == null) {
                IplStadiumFragment iplStadiumFragment = IplStadiumFragment.this;
                iplStadiumFragment.onNext(iplStadiumFragment.whereLocal);
                return;
            }
            IplStadiumFragment.this.onNext(activityResult.getData().getStringExtra("where"));
        }
    });
    RecyclerView rv_stadium;
    String seriesId = "";
    String venueId = "";
    String venueName = "";
    View view;
    String whereLocal = "";

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.seriesId = getArguments().getString("seriesId");
        this.view = layoutInflater.inflate(R.layout.fragment_ipl_stadium, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_stadium);
            this.rv_stadium = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            new GraphqlApi(this.myActivity).getVenueDetails(this.seriesId, new Interface.GetVenueDetail() {

                @Override
                public void getResponse(List<VenuedetailsQuery.Venuedetail> list) {
                    IplStadiumFragment.this.onGetStadium(list);
                }
            });
        }
    }

    
  
    private void onGetStadium(final List<VenuedetailsQuery.Venuedetail> list) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {

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
                                    arrayList.add((VenuedetailsQuery.Venuedetail) list.get(i));
                                    arrayList.add(null);
                                } else {
                                    arrayList.add((VenuedetailsQuery.Venuedetail) list.get(i));
                                }
                                i = i2;
                            }
                        }
                        IplStadiumFragment.this.adapterIplStadium = new AdapterIplStadium(IplStadiumFragment.this.myActivity, arrayList, new AdapterIplStadium.OnItemClickListener() {

                            @Override
                            public void onItemClick(String str, String str2) {
                                IplStadiumFragment.this.venueId = str;
                                IplStadiumFragment.this.venueName = str2;
                                IplStadiumFragment.this.onShowInterstitialAd("StadiumDetailActivity");
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(IplStadiumFragment.this.myActivity);
                            }
                        });
                        IplStadiumFragment.this.rv_stadium.setAdapter(IplStadiumFragment.this.adapterIplStadium);
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
        if (str.equals("StadiumDetailActivity")) {
            Intent intent = new Intent(this.myActivity, StadiumDetailActivity.class);
            intent.putExtra("VenueId", this.venueId);
            intent.putExtra("venueName", this.venueName);
            startActivity(intent);
        }
    }
}
