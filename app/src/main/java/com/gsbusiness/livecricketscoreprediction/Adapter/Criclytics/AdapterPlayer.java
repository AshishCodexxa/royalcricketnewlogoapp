package com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics;

import android.annotation.SuppressLint;
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

import com.gsbusiness.livecricketscoreprediction.Models.ModelPlayerMatchUp;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;

public class AdapterPlayer extends RecyclerView.Adapter<AdapterPlayer.ViewHolder> {
    Context context;
    ArrayList<ModelPlayerMatchUp> matchUpData;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(String str, String str2);
    }

    public AdapterPlayer(Context context2, ArrayList<ModelPlayerMatchUp> arrayList, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matchUpData = arrayList;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_playing_xi, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.matchUpData.get(i).getPlayerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_item_playerImage);
        viewHolder.txt_item_player.setText(this.matchUpData.get(i).getPlayerName());
        Glide.with(this.context).load(Integer.valueOf((int) R.drawable.bat)).into(viewHolder.img_item_player_type);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterPlayer.this.onItemClickListener.onItemClick(AdapterPlayer.this.matchUpData.get(i).getPlayerId(), AdapterPlayer.this.matchUpData.get(i).getPlayerName());
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.matchUpData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_playerImage;
        ImageView img_item_player_type;
        TextView txt_item_player;

        public ViewHolder(View view) {
            super(view);
            this.img_item_playerImage = (ImageView) view.findViewById(R.id.img_item_playerImage);
            this.img_item_player_type = (ImageView) view.findViewById(R.id.img_item_player_type);
            this.txt_item_player = (TextView) view.findViewById(R.id.txt_item_player);
        }
    }
}
