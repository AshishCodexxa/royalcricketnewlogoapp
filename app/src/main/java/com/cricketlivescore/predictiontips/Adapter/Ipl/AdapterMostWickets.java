package com.cricketlivescore.predictiontips.Adapter.Ipl;

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

import com.cricketlivescore.predictiontips.GetStatsResolverQuery;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.Glob;
import java.util.List;

public class AdapterMostWickets extends RecyclerView.Adapter<AdapterMostWickets.ViewHolder> {
    Context context;
    List<GetStatsResolverQuery.Most_Wicket1> most_Wicket;
    OnItemClickListener onItemClickListener;
    int selected = 0;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterMostWickets(Context context2, List<GetStatsResolverQuery.Most_Wicket1> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.most_Wicket = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowling_stats, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        if (this.selected == i) {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
        } else {
            viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
            viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
            viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_Wicket.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
        viewHolder.txt_player_name.setText(this.most_Wicket.get(i).player_name());
        viewHolder.txt_team_name.setText(this.most_Wicket.get(i).team_short_name());
        viewHolder.txt_one.setText(this.most_Wicket.get(i).matches_played());
        viewHolder.txt_two.setText(this.most_Wicket.get(i).overs());
        viewHolder.txt_three.setText(this.most_Wicket.get(i).wickets());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterMostWickets.this.onItemClickListener.onItemClick(AdapterMostWickets.this.most_Wicket.get(i).player_id());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.most_Wicket.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_playerImage;
        TextView txt_one;
        TextView txt_player_name;
        TextView txt_team_name;
        TextView txt_three;
        TextView txt_two;

        public ViewHolder(View view) {
            super(view);
            this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
            this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.txt_one = (TextView) view.findViewById(R.id.txt_one);
            this.txt_two = (TextView) view.findViewById(R.id.txt_two);
            this.txt_three = (TextView) view.findViewById(R.id.txt_three);
        }
    }
}
