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

public class AdapterHomePlayingXI extends RecyclerView.Adapter<AdapterHomePlayingXI.ViewHolder> {
    Context context;
    List<GetMatchInfoQuery.HomePlayingXI> homePlayingXIS;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(String str);
    }

    public AdapterHomePlayingXI(Context context2, List<GetMatchInfoQuery.HomePlayingXI> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.homePlayingXIS = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_playing_xi, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.txt_item_player.setText(this.homePlayingXIS.get(i).playerName());
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.homePlayingXIS.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_item_playerImage);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                AdapterHomePlayingXI.this.onItemClickListener.onItemClick(AdapterHomePlayingXI.this.homePlayingXIS.get(i).playerID());
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.homePlayingXIS.size();
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
