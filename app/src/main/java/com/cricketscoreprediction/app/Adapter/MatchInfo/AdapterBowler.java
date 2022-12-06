package com.cricketscoreprediction.app.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.GetScoreCardQuery;
import com.cricketscoreprediction.app.R;

import java.util.List;

public class AdapterBowler extends RecyclerView.Adapter<AdapterBowler.ViewHolder> {
    Context context;
    List<GetScoreCardQuery.Bowling> playerBolling;

    public AdapterBowler(Context context2, List<GetScoreCardQuery.Bowling> list) {
        this.context = context2;
        this.playerBolling = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowler, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_bowler_name.setText(this.playerBolling.get(i).playerName());
        viewHolder.txt_bowler_over.setText(this.playerBolling.get(i).playerOversBowled());
        viewHolder.txt_bowler_maiden.setText(this.playerBolling.get(i).playerMaidensBowled());
        viewHolder.txt_bowler_run.setText(this.playerBolling.get(i).playerRunsConceeded());
        viewHolder.txt_bowler_wickets.setText(this.playerBolling.get(i).playerWicketsTaken());
        viewHolder.txt_bowler_eco.setText(this.playerBolling.get(i).playerEconomyRate());
    }

    @Override 
    public int getItemCount() {
        return this.playerBolling.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_bowler_eco;
        TextView txt_bowler_maiden;
        TextView txt_bowler_name;
        TextView txt_bowler_over;
        TextView txt_bowler_run;
        TextView txt_bowler_wickets;

        public ViewHolder(View view) {
            super(view);
            this.txt_bowler_name = (TextView) view.findViewById(R.id.txt_bowler_name);
            this.txt_bowler_over = (TextView) view.findViewById(R.id.txt_bowler_over);
            this.txt_bowler_maiden = (TextView) view.findViewById(R.id.txt_bowler_maiden);
            this.txt_bowler_run = (TextView) view.findViewById(R.id.txt_bowler_run);
            this.txt_bowler_wickets = (TextView) view.findViewById(R.id.txt_bowler_wickets);
            this.txt_bowler_eco = (TextView) view.findViewById(R.id.txt_bowler_eco);
        }
    }
}
