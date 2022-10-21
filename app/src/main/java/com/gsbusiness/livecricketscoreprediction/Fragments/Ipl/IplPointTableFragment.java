package com.gsbusiness.livecricketscoreprediction.Fragments.Ipl;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gsbusiness.livecricketscoreprediction.Adapter.Ipl.AdapterIplPointTable;

import com.gsbusiness.livecricketscoreprediction.GetPointsTableQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.graphql.GraphqlApi;
import com.gsbusiness.livecricketscoreprediction.graphql.Interface;
import java.util.ArrayList;

public class IplPointTableFragment extends Fragment {
    private static final String LOG = "<<<IplPointTableFragment>>>";
    AdapterIplPointTable adapterIplPointTable;
    Activity myActivity;
    RecyclerView rv_point_table;
    String seriesId = "";
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.seriesId = getArguments().getString("seriesId");
        this.view = layoutInflater.inflate(R.layout.fragment_ipl_point_table, viewGroup, false);
        initView();
        return this.view;
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {
            GraphqlApi graphqlApi = new GraphqlApi(this.myActivity);
            RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.rv_point_table);
            this.rv_point_table = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.myActivity));
            graphqlApi.getPointsTableQuery(this.seriesId, new Interface.GetPointsTable() {

                @Override
                public void getResponse(GetPointsTableQuery.GetPointsTable getPointsTable) {
                    IplPointTableFragment.this.onGetPointTable(getPointsTable);
                }
            });
        }
    }

    
  
    private void onGetPointTable(final GetPointsTableQuery.GetPointsTable getPointsTable) {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    if (getPointsTable != null) {
                        Glob.log(IplPointTableFragment.LOG, getPointsTable + "");
                        ArrayList arrayList = new ArrayList();
                        if (Glob.adCountInCategory == 0) {
                            arrayList.addAll(getPointsTable.standings().get(0).teams());
                        } else {
                            int i = 0;
                            while (i < getPointsTable.standings().get(0).teams().size()) {
                                int i2 = i + 1;
                                if (i2 % Glob.adCountInCategory == 0) {
                                    arrayList.add(getPointsTable.standings().get(0).teams().get(i));
                                    arrayList.add(null);
                                } else {
                                    arrayList.add(getPointsTable.standings().get(0).teams().get(i));
                                }
                                i = i2;
                            }
                        }
                        IplPointTableFragment.this.adapterIplPointTable = new AdapterIplPointTable(IplPointTableFragment.this.myActivity, arrayList, new AdapterIplPointTable.OnItemClickListener() {


                            @Override
                            public void onClickItem() {
                            }

                            @Override
                            public void onClickBanner() {
                                Glob.openCustomTab(IplPointTableFragment.this.myActivity);
                            }
                        });
                        IplPointTableFragment.this.rv_point_table.setAdapter(IplPointTableFragment.this.adapterIplPointTable);
                    }
                }
            });
        }
    }
}
