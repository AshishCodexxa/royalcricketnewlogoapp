package com.cricketscoreprediction.app.Adapter.More;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.Models.More.ModelTeams;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.ArrayList;

public class AdapterTeams extends RecyclerView.Adapter<AdapterTeams.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    String team;
    ArrayList<ModelTeams> teamsArrayList;

    public interface OnItemClickListener {
        void onItemClick();
    }

    public AdapterTeams(Context context2, ArrayList<ModelTeams> arrayList, String str, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.teamsArrayList = arrayList;
        this.team = str;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_teams, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.team.equals("womens")) {
            viewHolder.ll_rankings.setVisibility(View.GONE);
        }
        viewHolder.txt_team.setText(this.teamsArrayList.get(i).getTeamName());
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) with.load(Glob.teams_start + this.teamsArrayList.get(i).getTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_team);
        viewHolder.txt_test_ranking.setText(this.teamsArrayList.get(i).getTestRanking());
        viewHolder.txt_odi_ranking.setText(this.teamsArrayList.get(i).getOdiRanking());
        viewHolder.txt_t20_ranking.setText(this.teamsArrayList.get(i).getT20Ranking());
    }

    @Override 
    public int getItemCount() {
        return this.teamsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_team;
        LinearLayout ll_rankings;
        TextView txt_odi_ranking;
        TextView txt_t20_ranking;
        TextView txt_team;
        TextView txt_test_ranking;

        public ViewHolder(View view) {
            super(view);
            this.txt_team = (TextView) view.findViewById(R.id.txt_team);
            this.img_team = (ImageView) view.findViewById(R.id.img_team);
            this.txt_test_ranking = (TextView) view.findViewById(R.id.txt_test_ranking);
            this.txt_odi_ranking = (TextView) view.findViewById(R.id.txt_odi_ranking);
            this.txt_t20_ranking = (TextView) view.findViewById(R.id.txt_t20_ranking);
            this.ll_rankings = (LinearLayout) view.findViewById(R.id.ll_rankings);
        }
    }
}
