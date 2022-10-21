package com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.gsbusiness.livecricketscoreprediction.GetFantasySixTeamsQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;
import java.util.List;

public class AdapterFantasyBatter extends RecyclerView.Adapter<AdapterFantasyBatter.ViewHolder> {
    Context context;
    String matchStatus;
    OnItemClickListener onItemClickListener;
    List<GetFantasySixTeamsQuery.Batsman> playerArrayList;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterFantasyBatter(Context context2, List<GetFantasySixTeamsQuery.Batsman> list, String str, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.playerArrayList = list;
        this.onItemClickListener = onItemClickListener2;
        this.matchStatus = str;
        Glob.playerArrayList = new ArrayList();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_fantasy_match_player, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.playerArrayList.get(i).playerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_player);
        RequestManager with2 = Glide.with(this.context);
        ((RequestBuilder) with2.load(Glob.teams_start + this.playerArrayList.get(i).teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_team);
        viewHolder.txt_player.setText(this.playerArrayList.get(i).playerName());
        viewHolder.txt_player.setTypeface(Glob.oswald_medium);
        viewHolder.txt_point.setText(this.playerArrayList.get(i).totalPoints());
        if (this.matchStatus.equals("Upcomingmatch") || this.matchStatus.equals("upcoming")) {
            viewHolder.txt_point.setText(this.playerArrayList.get(i).credits());
            viewHolder.txt.setText("Credits");
        }
        if (this.playerArrayList.get(i).captain().equals("1")) {
            viewHolder.card_position.setVisibility(View.VISIBLE);;
            viewHolder.txt_position.setText("C");
        } else if (this.playerArrayList.get(i).vice_captain().equals("1")) {
            viewHolder.card_position.setVisibility(View.VISIBLE);;
            viewHolder.txt_position.setText("VC");
        } else {
            viewHolder.card_position.setVisibility(View.GONE);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterFantasyBatter.this.onItemClickListener.onItemClick(AdapterFantasyBatter.this.playerArrayList.get(i).playerId());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.playerArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_position;
        ImageView img_player;
        ImageView img_team;
        TextView txt;
        TextView txt_player;
        TextView txt_point;
        TextView txt_position;

        public ViewHolder(View view) {
            super(view);
            this.img_player = (ImageView) view.findViewById(R.id.img_player);
            this.img_team = (ImageView) view.findViewById(R.id.img_team);
            this.txt_player = (TextView) view.findViewById(R.id.txt_player);
            this.txt_point = (TextView) view.findViewById(R.id.txt_point);
            this.txt = (TextView) view.findViewById(R.id.txt);
            this.txt_position = (TextView) view.findViewById(R.id.txt_position);
            this.card_position = (CardView) view.findViewById(R.id.card_position);
        }
    }
}
