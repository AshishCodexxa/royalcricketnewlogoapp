package com.gsbusiness.livecricketscoreprediction.Adapter.Ipl;

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
import com.gsbusiness.livecricketscoreprediction.SquadsQuery;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class AdapterIplSquad extends RecyclerView.Adapter<AdapterIplSquad.ViewHolder> {
    Context context;
    List<SquadsQuery.PlayerDatum> squadList;

    public AdapterIplSquad(Context context2, List<SquadsQuery.PlayerDatum> list) {
        this.context = context2;
        this.squadList = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_playing_xi, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + "" + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_item_playerImage);
        viewHolder.txt_item_player.setText(this.squadList.get(i).name());
        if (this.squadList.get(i).playerRole().equals("BATSMAN")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.bat)).into(viewHolder.img_item_player_type);
        } else if (this.squadList.get(i).playerRole().equals("ALL_ROUNDER")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.all_rounder)).into(viewHolder.img_item_player_type);
        } else if (this.squadList.get(i).playerRole().equals("BOWLER")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.ball)).into(viewHolder.img_item_player_type);
        } else if (this.squadList.get(i).playerRole().equals("KEEPER")) {
            Glide.with(this.context).load(Integer.valueOf((int) R.drawable.keeper)).into(viewHolder.img_item_player_type);
        }
    }

    @Override 
    public int getItemCount() {
        return this.squadList.size();
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
