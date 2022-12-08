package com.cricketlivescore.predictiontips.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.GetScoreCardQuery;
import com.cricketlivescore.predictiontips.R;

import java.util.List;

public class AdapterFallOfWicket extends RecyclerView.Adapter<AdapterFallOfWicket.ViewHolder> {
    Context context;
    List<GetScoreCardQuery.Fow> fallOfWicket;

    public AdapterFallOfWicket(Context context2, List<GetScoreCardQuery.Fow> list) {
        this.context = context2;
        this.fallOfWicket = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fall_of_wicket, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_fow_score.setText(this.fallOfWicket.get(i).runs() + "/" + this.fallOfWicket.get(i).order());
        viewHolder.txt_fow_player.setText(this.fallOfWicket.get(i).playerName());
        viewHolder.txt_fow_over.setText(this.fallOfWicket.get(i).over_ball());
    }

    @Override 
    public int getItemCount() {
        return this.fallOfWicket.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_fow_over;
        TextView txt_fow_player;
        TextView txt_fow_score;

        public ViewHolder(View view) {
            super(view);
            this.txt_fow_score = (TextView) view.findViewById(R.id.txt_fow_score);
            this.txt_fow_player = (TextView) view.findViewById(R.id.txt_fow_player);
            this.txt_fow_over = (TextView) view.findViewById(R.id.txt_fow_over);
        }
    }
}
