package com.gsbusiness.livecricketscoreprediction.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.SeriesHomeCardQuery;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class AdapterTop extends RecyclerView.Adapter<AdapterTop.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<SeriesHomeCardQuery.TopPerformance> topPerformances;

    public interface OnItemClickListener {
        void onItemClick();
    }

    public AdapterTop(Context context2, List<SeriesHomeCardQuery.TopPerformance> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.topPerformances = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_top, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_player.setText(this.topPerformances.get(i).playerName());
        viewHolder.txt_player_team.setText(this.topPerformances.get(i).teamName());
        viewHolder.txt_number.setText(this.topPerformances.get(i).score());
        String ScoreType = this.topPerformances.get(i).ScoreType();
        TextView textView = viewHolder.txt_number_type;
        textView.setText("Most " + ScoreType);
        viewHolder.txt_number.setTypeface(Glob.montserrat_extra_bold);
        viewHolder.txt_player.setTypeface(Glob.montserrat_extra_bold);
        if (ScoreType.equals("runs")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.icon_orange_cap)).into(viewHolder.img_cap);
        } else if (ScoreType.equals("wickets")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.icon_purple_cap)).into(viewHolder.img_cap);
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.topPerformances.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_player);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterTop.this.onItemClickListener.onItemClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.topPerformances.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_cap;
        ImageView img_player;
        TextView txt_number;
        TextView txt_number_type;
        TextView txt_player;
        TextView txt_player_team;

        public ViewHolder(View view) {
            super(view);
            this.txt_number = (TextView) view.findViewById(R.id.txt_number);
            this.txt_number_type = (TextView) view.findViewById(R.id.txt_number_type);
            this.txt_player = (TextView) view.findViewById(R.id.txt_player);
            this.txt_player_team = (TextView) view.findViewById(R.id.txt_player_team);
            this.img_player = (ImageView) view.findViewById(R.id.img_player);
            this.img_cap = (ImageView) view.findViewById(R.id.img_cap);
        }
    }
}
