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

public class AdapterMost50s extends RecyclerView.Adapter<AdapterMost50s.ViewHolder> {
    Context context;
    List<GetStatsResolverQuery.Most_Fifty1> most_fifty;
    OnItemClickListener onItemClickListener;
    int selected = 0;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterMost50s(Context context2, List<GetStatsResolverQuery.Most_Fifty1> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.most_fifty = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_most_50s, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        if (this.selected == i) {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop2, this.context.getTheme()));
            viewHolder.txt_50s.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop2, this.context.getTheme()));
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
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_fifty.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
        viewHolder.txt_player_name.setText(this.most_fifty.get(i).player_name());
        viewHolder.txt_team_name.setText(this.most_fifty.get(i).team_short_name());
        viewHolder.txt_match.setText(this.most_fifty.get(i).matches_played());
        viewHolder.txt_50s.setText(this.most_fifty.get(i).fifties());
        viewHolder.txt_runs.setText(this.most_fifty.get(i).runs_scored());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterMost50s.this.onItemClickListener.onItemClick(AdapterMost50s.this.most_fifty.get(i).player_id());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.most_fifty.size();
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
