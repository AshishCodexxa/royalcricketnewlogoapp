package com.cricketscoreprediction.app.Adapter.MatchInfo;

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

import com.cricketscoreprediction.app.GetMatchInfoQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapteAwayPlayingXI extends RecyclerView.Adapter<AdapteAwayPlayingXI.ViewHolder> {
    List<GetMatchInfoQuery.AwayPlayingXI> awayPlayingXIS;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapteAwayPlayingXI(Context context2, List<GetMatchInfoQuery.AwayPlayingXI> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.awayPlayingXIS = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_playing_xi, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.txt_item_player.setText(this.awayPlayingXIS.get(i).playerName());
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.awayPlayingXIS.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_item_playerImage);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapteAwayPlayingXI.this.onItemClickListener.onItemClick(AdapteAwayPlayingXI.this.awayPlayingXIS.get(i).playerID());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.awayPlayingXIS.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_playerImage;
        TextView txt_item_player;

        public ViewHolder(View view) {
            super(view);
            this.img_item_playerImage = (ImageView) view.findViewById(R.id.img_item_playerImage);
            this.txt_item_player = (TextView) view.findViewById(R.id.txt_item_player);
        }
    }
}
