package com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.gsbusiness.livecricketscoreprediction.PreMatchPredectionQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;

public class AdapterPlayerProjection extends RecyclerView.Adapter<AdapterPlayerProjection.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    private int selectedItem = 0;
    ArrayList<PreMatchPredectionQuery.PlayerList> teamPlayer;

    public interface OnItemClickListener {
        void onItemClick(PreMatchPredectionQuery.PlayerList playerList);
    }

    public AdapterPlayerProjection(Context context2, ArrayList<PreMatchPredectionQuery.PlayerList> arrayList, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.teamPlayer = arrayList;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_projection_player, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.teamPlayer.get(i).playerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_player);
        if (this.selectedItem == i) {
            this.onItemClickListener.onItemClick(this.teamPlayer.get(i));
            viewHolder.img_player.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_red, this.context.getTheme()));
        } else {
            viewHolder.img_player.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.gray_ad_border, this.context.getTheme()));
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                int i = AdapterPlayerProjection.this.selectedItem;
                AdapterPlayerProjection.this.selectedItem = i;
                AdapterPlayerProjection.this.notifyItemChanged(i);
                AdapterPlayerProjection.this.notifyItemChanged(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.teamPlayer.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_player;

        public ViewHolder(View view) {
            super(view);
            this.img_player = (ImageView) view.findViewById(R.id.img_player);
        }
    }
}
