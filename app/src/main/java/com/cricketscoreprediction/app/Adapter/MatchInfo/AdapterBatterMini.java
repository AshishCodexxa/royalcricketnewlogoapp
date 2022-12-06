package com.cricketscoreprediction.app.Adapter.MatchInfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.cricketscoreprediction.app.Activities.Player.PlayerDetailActivity;

import com.cricketscoreprediction.app.MiniScoreCardQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterBatterMini extends RecyclerView.Adapter<AdapterBatterMini.ViewHolder> {
    Context context;
    List<MiniScoreCardQuery.Batting> playerScore;

    public AdapterBatterMini(Context context2, List<MiniScoreCardQuery.Batting> list) {
        this.context = context2;
        this.playerScore = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_batter, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.txt_ps_batter_name.setText(this.playerScore.get(i).playerName());
        viewHolder.txt_ps_batter_run.setText(this.playerScore.get(i).runs());
        viewHolder.txt_ps_batter_ball.setText(this.playerScore.get(i).playerMatchBalls());
        viewHolder.txt_ps_batter_4s.setText(this.playerScore.get(i).fours());
        viewHolder.txt_ps_batter_6s.setText(this.playerScore.get(i).sixes());
        viewHolder.txt_ps_batter_sr.setText(this.playerScore.get(i).playerMatchStrikeRate());
        viewHolder.txt_ps_batter_status.setVisibility(View.GONE);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent intent = new Intent(AdapterBatterMini.this.context, PlayerDetailActivity.class);
                intent.putExtra(Glob.PLAYER_ID, AdapterBatterMini.this.playerScore.get(i).playerID());
                AdapterBatterMini.this.context.startActivity(intent);
            }
        });
        viewHolder.txt_ps_batter_status.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.orange, this.context.getTheme()));
    }

    @Override 
    public int getItemCount() {
        return this.playerScore.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_ps_batter_4s;
        TextView txt_ps_batter_6s;
        TextView txt_ps_batter_ball;
        TextView txt_ps_batter_name;
        TextView txt_ps_batter_run;
        TextView txt_ps_batter_sr;
        TextView txt_ps_batter_status;

        public ViewHolder(View view) {
            super(view);
            this.txt_ps_batter_name = (TextView) view.findViewById(R.id.txt_ps_batter_name);
            this.txt_ps_batter_run = (TextView) view.findViewById(R.id.txt_ps_batter_run);
            this.txt_ps_batter_ball = (TextView) view.findViewById(R.id.txt_ps_batter_ball);
            this.txt_ps_batter_4s = (TextView) view.findViewById(R.id.txt_ps_batter_4s);
            this.txt_ps_batter_6s = (TextView) view.findViewById(R.id.txt_ps_batter_6s);
            this.txt_ps_batter_sr = (TextView) view.findViewById(R.id.txt_ps_batter_sr);
            this.txt_ps_batter_status = (TextView) view.findViewById(R.id.txt_ps_batter_status);
        }
    }
}
