package com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.gsbusiness.livecricketscoreprediction.MiniScoreCardQuery;
import com.gsbusiness.livecricketscoreprediction.R;

import java.util.List;

public class AdapterFeatureTeamScore extends RecyclerView.Adapter<AdapterFeatureTeamScore.ViewHolder> {
    Context context;
    List<MiniScoreCardQuery.TeamScore> teamScores;

    public AdapterFeatureTeamScore(Context context2, List<MiniScoreCardQuery.TeamScore> list) {
        this.context = context2;
        this.teamScores = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_feature_team_score, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String runsScored = this.teamScores.get(i).runsScored();
        String wickets = this.teamScores.get(i).wickets();
        String overs = this.teamScores.get(i).overs();
        if (runsScored.length() == 0) {
            return;
        }
        if (this.teamScores.size() > 1) {
            viewHolder.txt_item_team_score.setText(String.format("%s%s%s  %S", runsScored, "/", wickets, "&"));
            if (i == 1) {
                viewHolder.txt_item_team_score.setText(String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")"));
                return;
            }
            return;
        }
        viewHolder.txt_item_team_score.setText(String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")"));
    }

    @Override 
    public int getItemCount() {
        return this.teamScores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_item_team_score;

        public ViewHolder(View view) {
            super(view);
            this.txt_item_team_score = (TextView) view.findViewById(R.id.txt_item_team_score);
        }
    }
}
