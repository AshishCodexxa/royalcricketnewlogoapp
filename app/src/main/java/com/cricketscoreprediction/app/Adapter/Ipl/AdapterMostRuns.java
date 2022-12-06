package com.cricketscoreprediction.app.Adapter.Ipl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.GetStatsResolverQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterMostRuns extends RecyclerView.Adapter<AdapterMostRuns.ViewHolder> {
    Context context;
    List<GetStatsResolverQuery.Most_Run1> most_runs;
    OnItemClickListener onItemClickListener;
    int selected = 0;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterMostRuns(Context context2, List<GetStatsResolverQuery.Most_Run1> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.most_runs = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_most_runs, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        if (this.selected == i) {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.txt_runs.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_match.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_innings.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_runs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
        } else {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_runs.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
            viewHolder.txt_match.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_innings.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_runs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_runs.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
        viewHolder.txt_player_name.setText(this.most_runs.get(i).player_name());
        viewHolder.txt_team_name.setText(this.most_runs.get(i).team_short_name());
        viewHolder.txt_match.setText(this.most_runs.get(i).matches_played());
        viewHolder.txt_innings.setText(this.most_runs.get(i).innings_played());
        viewHolder.txt_runs.setText(this.most_runs.get(i).runs_scored());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterMostRuns.this.onItemClickListener.onItemClick(AdapterMostRuns.this.most_runs.get(i).player_id());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.most_runs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_playerImage;
        TextView txt_innings;
        TextView txt_match;
        TextView txt_player_name;
        TextView txt_runs;
        TextView txt_team_name;

        public ViewHolder(View view) {
            super(view);
            this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
            this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.txt_match = (TextView) view.findViewById(R.id.txt_match);
            this.txt_innings = (TextView) view.findViewById(R.id.txt_innings);
            this.txt_runs = (TextView) view.findViewById(R.id.txt_runs);
        }
    }
}
