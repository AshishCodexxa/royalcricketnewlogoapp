package com.cricketlivescore.predictiontips.Fragments.MatchInfo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Adapter.MatchInfo.AdapterHighlights;
import com.cricketlivescore.predictiontips.GetHighlightsQuery;
import com.cricketlivescore.predictiontips.MiniScoreCardQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;
import com.cricketlivescore.predictiontips.graphql.GraphqlApi;
import com.cricketlivescore.predictiontips.graphql.Interface;

import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class HighlightsFragment extends Fragment {
    static final  boolean $assertionsDisabled = false;
    private static final String LOG = "<<<HighlightsFragment>>>";
    AdapterHighlights adapterHighlights;
    String currentInnings = "1";
    GraphqlApi graphqlApi;
    Handler handler = new Handler();
    List<GetHighlightsQuery.HighlightBall> highlightBalls;
    String matchId;
    ArrayList<modelTeam> modelTeams;
    ArrayList<ModelType> modelTypes;
    Activity myActivity;
    Runnable refresh;
    RecyclerView rv_highlightsType;
    RecyclerView rv_innings;
    RecyclerView rv_type_data;
    View view;

    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myActivity = getActivity();
    }

    @Override 
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.matchId = getArguments().getString("MatchId");
        this.view = layoutInflater.inflate(R.layout.fragment_highlights, viewGroup, false);
        Log.d("LOG", this.matchId + " : ");
        initView();
        return this.view;
    }

    public class modelTeam {


        String f404id;
        int innings;
        String team;

        public modelTeam(String str, String str2, int i) {
            this.team = str;
            this.f404id = str2;
            this.innings = i;
        }
    }

    public class ModelType {

        
        int f403id;
        String type;
        String value;

        public ModelType(int i, String str, String str2) {
            this.type = str;
            this.f403id = i;
            this.value = str2;
        }
    }

    private void initView() {
        if (this.myActivity != null && isAdded()) {

            this.graphqlApi = new GraphqlApi(this.myActivity);
            this.rv_innings = (RecyclerView) this.view.findViewById(R.id.rv_innings);
            this.rv_highlightsType = (RecyclerView) this.view.findViewById(R.id.rv_highlightsType);
            this.rv_type_data = (RecyclerView) this.view.findViewById(R.id.rv_type_data);
            this.rv_innings.setLayoutManager(new LinearLayoutManager(this.myActivity, RecyclerView.HORIZONTAL, false));
            this.rv_highlightsType.setLayoutManager(new GridLayoutManager((Context) this.myActivity, 4, RecyclerView.VERTICAL, false));
            this.rv_type_data.setLayoutManager(new LinearLayoutManager(this.myActivity));
            this.highlightBalls = new ArrayList();
            AdapterHighlights adapterHighlights2 = new AdapterHighlights(this.myActivity, this.highlightBalls);
            this.adapterHighlights = adapterHighlights2;
            this.rv_type_data.setAdapter(adapterHighlights2);
            getMatchHighLights(this.matchId, this.currentInnings, "");
            ArrayList<ModelType> arrayList = new ArrayList<>();
            this.modelTypes = arrayList;
            arrayList.add(new ModelType(0, "All", ""));
            this.modelTypes.add(new ModelType(1, "Four", "four"));
            this.modelTypes.add(new ModelType(2, "Six", "six"));
            this.modelTypes.add(new ModelType(3, "Wicket", "wicket"));
            this.graphqlApi.getMiniScoreCardLive(this.matchId, new Interface.GetMiniScoreCardLive() {


                @Override
                public void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard) {
                    if (!(miniScoreCard == null || miniScoreCard.data() == null || miniScoreCard.data().isEmpty())) {
                        HighlightsFragment.this.modelTeams = new ArrayList<>();
                        for (int i = 0; i < miniScoreCard.data().get(0).matchScore().size(); i++) {
                            for (int i2 = 0; i2 < miniScoreCard.data().get(0).matchScore().get(i).teamScore().size(); i2++) {
                                HighlightsFragment.this.modelTeams.add(new modelTeam(miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).battingTeamShortName(), miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).teamID(), miniScoreCard.data().get(0).matchScore().get(i).teamScore().get(i2).inning().intValue()));
                            }
                        }
                        HighlightsFragment.this.setTeamsAndType();
                    }
                }
            });
        }
    }

    
  
    private void setTeamsAndType() {
        Activity activity = this.myActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {


                public void run() {
                    final AdapterType adapterType = new AdapterType(HighlightsFragment.this.myActivity, HighlightsFragment.this.modelTypes, new AdapterType.OnItemClickListener() {


                        @Override
                        public void onItemClick(String str) {
                            if (str.equals("")) {
                                HighlightsFragment.this.view.findViewById(R.id.ll_four).setVisibility(View.VISIBLE);;
                                HighlightsFragment.this.view.findViewById(R.id.ll_six).setVisibility(View.VISIBLE);;
                                HighlightsFragment.this.view.findViewById(R.id.ll_wicket).setVisibility(View.VISIBLE);;
                            } else if (str.equals("four")) {
                                HighlightsFragment.this.view.findViewById(R.id.ll_four).setVisibility(View.VISIBLE);;
                                HighlightsFragment.this.view.findViewById(R.id.ll_six).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.ll_wicket).setVisibility(View.GONE);
                            } else if (str.equals("six")) {
                                HighlightsFragment.this.view.findViewById(R.id.ll_four).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.ll_six).setVisibility(View.VISIBLE);;
                                HighlightsFragment.this.view.findViewById(R.id.ll_wicket).setVisibility(View.GONE);
                            } else if (str.equals("wicket")) {
                                HighlightsFragment.this.view.findViewById(R.id.ll_four).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.ll_six).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.ll_wicket).setVisibility(View.VISIBLE);;
                            }
                            HighlightsFragment.this.getMatchHighLights(HighlightsFragment.this.matchId, HighlightsFragment.this.currentInnings, str);
                        }
                    });
                    HighlightsFragment.this.rv_innings.setAdapter(new AdapterTeam(HighlightsFragment.this.myActivity, HighlightsFragment.this.modelTeams, new AdapterTeam.OnItemClickListener() {


                        @Override
                        public void onItemClick(String str) {
                            HighlightsFragment.this.currentInnings = str;
                            HighlightsFragment.this.getMatchHighLights(HighlightsFragment.this.matchId, str, "All");
                            HighlightsFragment.this.view.findViewById(R.id.ll_four).setVisibility(View.VISIBLE);;
                            HighlightsFragment.this.view.findViewById(R.id.ll_six).setVisibility(View.VISIBLE);;
                            HighlightsFragment.this.view.findViewById(R.id.ll_wicket).setVisibility(View.VISIBLE);;
                            adapterType.AdapterType();
                        }
                    }));
                    HighlightsFragment.this.rv_highlightsType.setAdapter(adapterType);
                }
            });
        }
    }

    
  
    private void getMatchHighLights(String str, String str2, String str3) {
        if (this.myActivity != null) {
            this.graphqlApi.getHighlight(str, str2, str3, new Interface.GetHighlight() {
                @Override
                public void getResponse(final GetHighlightsQuery.GetHighlights getHighlights) {
                    HighlightsFragment.this.myActivity.runOnUiThread(new Runnable() {
                        @Override 
                        public void run() {
                            GetHighlightsQuery.GetHighlights getHighlights2 = getHighlights;
                            if (getHighlights2 == null || getHighlights2.HighlightBall() == null || getHighlights.HighlightBall().isEmpty()) {
                                HighlightsFragment.this.view.findViewById(R.id.progress_highlights).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.scroll_highlights).setVisibility(View.GONE);
                                HighlightsFragment.this.view.findViewById(R.id.ll_no_data).setVisibility(View.VISIBLE);
                                return;
                            }
                            HighlightsFragment.this.highlightBalls.clear();
                            HighlightsFragment.this.highlightBalls.addAll(getHighlights.HighlightBall());
                            TextView textView = (TextView) HighlightsFragment.this.view.findViewById(R.id.txt_four);
                            TextView textView2 = (TextView) HighlightsFragment.this.view.findViewById(R.id.txt_six);
                            TextView textView3 = (TextView) HighlightsFragment.this.view.findViewById(R.id.txt_wicket);
                            if (getHighlights.totalCount() != null) {
                                textView.setText(Glob.getString(getHighlights.totalCount().totalFours() + ""));
                                textView2.setText(Glob.getString(getHighlights.totalCount().totalSix() + ""));
                                textView3.setText(Glob.getString(getHighlights.totalCount().totalWickets() + ""));
                            } else {
                                HighlightsFragment.this.view.findViewById(R.id.ll_total).setVisibility(View.GONE);
                            }
                            Glob.log("", getHighlights + "");
                            HighlightsFragment.this.adapterHighlights.notifyDataSetChanged();
                            HighlightsFragment.this.view.findViewById(R.id.progress_highlights).setVisibility(View.GONE);
                            HighlightsFragment.this.view.findViewById(R.id.scroll_highlights).setVisibility(View.VISIBLE);
                        }
                    });
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
        super.onStop();
        this.handler.removeCallbacks(this.refresh);
    }

    public static class AdapterTeam extends RecyclerView.Adapter<AdapterTeam.ViewHolder> {
        Context context;
        OnItemClickListener onItemClickListener;
        private int selectedItem = 0;
        ArrayList<modelTeam> teamArrayList;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterTeam(Context context2, ArrayList<modelTeam> arrayList, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.teamArrayList = arrayList;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_team_highlights, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            viewHolder.txt_team.setText(this.teamArrayList.get(i).team);
            if (this.selectedItem == i) {
                viewHolder.txt_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.darkRed_, this.context.getTheme()));
                viewHolder.itemView.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.back_highlights_selected, this.context.getTheme()));
            } else {
                viewHolder.txt_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorDarkMode, this.context.getTheme()));
                viewHolder.itemView.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.back_highlights_unselected, this.context.getTheme()));
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    OnItemClickListener onItemClickListener = AdapterTeam.this.onItemClickListener;
                    onItemClickListener.onItemClick(AdapterTeam.this.teamArrayList.get(i).innings + "");
                    int i = AdapterTeam.this.selectedItem;
                    AdapterTeam.this.selectedItem = i;
                    AdapterTeam.this.notifyItemChanged(i);
                    AdapterTeam.this.notifyItemChanged(i);
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.teamArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            LinearLayout ll_back;
            TextView txt_team;

            public ViewHolder(View view) {
                super(view);
                this.txt_team = (TextView) view.findViewById(R.id.txt_team);
                this.ll_back = (LinearLayout) view.findViewById(R.id.ll_back);
            }
        }
    }

    public static class AdapterType extends RecyclerView.Adapter<AdapterType.ViewHolder> {
        Context context;
        ArrayList<ModelType> modelTypes;
        OnItemClickListener onItemClickListener;
        private int selectedItem = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public void AdapterType() {
            notifyDataSetChanged();
            this.selectedItem = 0;
        }

        public AdapterType(Context context2, ArrayList<ModelType> arrayList, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.modelTypes = arrayList;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_team_highlights, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            viewHolder.txt_team.setText(this.modelTypes.get(i).type);
            if (this.selectedItem == i) {
                viewHolder.txt_team.setTextSize(12.0f);
                viewHolder.txt_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.itemView.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_wicket, this.context.getTheme()));
            } else {
                viewHolder.txt_team.setTextSize(12.0f);
                viewHolder.txt_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.text_Fantasy, this.context.getTheme()));
                viewHolder.itemView.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.back_highlights_selected, this.context.getTheme()));
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterType.this.onItemClickListener.onItemClick(AdapterType.this.modelTypes.get(i).value);
                    int i = AdapterType.this.selectedItem;
                    AdapterType.this.selectedItem = i;
                    AdapterType.this.notifyItemChanged(i);
                    AdapterType.this.notifyItemChanged(i);
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.modelTypes.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            LinearLayout ll_back;
            TextView txt_team;

            public ViewHolder(View view) {
                super(view);
                this.txt_team = (TextView) view.findViewById(R.id.txt_team);
                this.ll_back = (LinearLayout) view.findViewById(R.id.ll_back);
            }
        }
    }
}
