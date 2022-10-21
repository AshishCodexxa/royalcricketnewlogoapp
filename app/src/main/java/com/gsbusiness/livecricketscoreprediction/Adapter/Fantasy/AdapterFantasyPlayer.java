package com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy;

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

import com.gsbusiness.livecricketscoreprediction.Models.ModelPlayer;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;
import java.util.List;

public class AdapterFantasyPlayer extends RecyclerView.Adapter<AdapterFantasyPlayer.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<ModelPlayer> playerArrayList;

    public interface OnItemClickListener {
        void onItemClick();
    }

    public AdapterFantasyPlayer(Context context2, List<ModelPlayer> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.playerArrayList = list;
        this.onItemClickListener = onItemClickListener2;
        Glob.playerArrayList = new ArrayList();
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_fantasy_player, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.playerArrayList.get(i).getPlayerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_player);
        RequestManager with2 = Glide.with(this.context);
        ((RequestBuilder) with2.load(Glob.teams_start + this.playerArrayList.get(i).getTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_team);
        viewHolder.txt_player.setText(this.playerArrayList.get(i).getPlayerName());
        viewHolder.txt_player.setTypeface(Glob.oswald_medium);
        viewHolder.txt_player_type.setText(this.playerArrayList.get(i).getPlayer_role().replace("_", " - "));
        if (this.playerArrayList.get(i).getCaptain().equals("1")) {
            viewHolder.card_position.setVisibility(View.VISIBLE);;
            viewHolder.txt_position.setText("C");
        } else if (this.playerArrayList.get(i).getVice_captain().equals("1")) {
            viewHolder.card_position.setVisibility(View.VISIBLE);;
            viewHolder.txt_position.setText("VC");
        } else {
            viewHolder.card_position.setVisibility(View.GONE);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterFantasyPlayer.this.onItemClickListener.onItemClick();
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
        TextView txt_player;
        TextView txt_player_type;
        TextView txt_position;

        public ViewHolder(View view) {
            super(view);
            this.img_player = (ImageView) view.findViewById(R.id.img_player);
            this.img_team = (ImageView) view.findViewById(R.id.img_team);
            this.txt_player = (TextView) view.findViewById(R.id.txt_player);
            this.txt_player_type = (TextView) view.findViewById(R.id.txt_player_type);
            this.txt_position = (TextView) view.findViewById(R.id.txt_position);
            this.card_position = (CardView) view.findViewById(R.id.card_position);
        }
    }
}
