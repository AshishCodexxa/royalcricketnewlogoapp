package com.gsbusiness.livecricketscoreprediction.Adapter.Ipl;

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

import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class AdapterBestSR extends RecyclerView.Adapter<AdapterBestSR.ViewHolder> {
    List<GetStatsResolverQuery.Best_Strike_Rate1> best_Strike_Rate;
    Context context;
    OnItemClickListener onItemClickListener;
    int selected = 0;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterBestSR(Context context2, List<GetStatsResolverQuery.Best_Strike_Rate1> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.best_Strike_Rate = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_most_50s, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        if (this.selected == i) {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
            viewHolder.txt_50s.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_match.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_50s.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_runs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
        } else {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_50s.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
            viewHolder.txt_match.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_50s.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_runs.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.best_Strike_Rate.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
        viewHolder.txt_player_name.setText(this.best_Strike_Rate.get(i).player_name());
        viewHolder.txt_team_name.setText(this.best_Strike_Rate.get(i).team_short_name());
        viewHolder.txt_match.setText(this.best_Strike_Rate.get(i).matches_played());
        viewHolder.txt_50s.setText(this.best_Strike_Rate.get(i).batting_strike_rate());
        viewHolder.txt_runs.setText(this.best_Strike_Rate.get(i).runs_scored());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterBestSR.this.onItemClickListener.onItemClick(AdapterBestSR.this.best_Strike_Rate.get(i).player_id());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.best_Strike_Rate.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_playerImage;
        TextView txt_50s;
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
            this.txt_runs = (TextView) view.findViewById(R.id.txt_runs);
            this.txt_50s = (TextView) view.findViewById(R.id.txt_50s);
        }
    }
}
