package com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics;

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

import com.gsbusiness.livecricketscoreprediction.GetLivePlayerProjectionDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class AdapterBatsmanProjection extends RecyclerView.Adapter<AdapterBatsmanProjection.ViewHolder> {
    List<GetLivePlayerProjectionDetailsQuery.Batsman> batsmanArrayList;
    Context context;

    public void AdapterBatsmanProjection(Context context2, List<GetLivePlayerProjectionDetailsQuery.Batsman> list) {
        this.context = context2;
        this.batsmanArrayList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_player_projection, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_player_name.setText(this.batsmanArrayList.get(i).playerName());
        viewHolder.txt_team_name.setText(this.batsmanArrayList.get(i).playerTeamName());
        if (!Glob.isNull(this.batsmanArrayList.get(i).playerRuns().toString())) {
            TextView textView = viewHolder.txt_player_run;
            textView.setText(this.batsmanArrayList.get(i).playerRuns() + "");
        }
        if (!Glob.isNull(this.batsmanArrayList.get(i).playerBalls().toString())) {
            TextView textView2 = viewHolder.txt_player_bol;
            textView2.setText("(" + this.batsmanArrayList.get(i).playerBalls() + ")");
        }
        if (!Glob.isNull(this.batsmanArrayList.get(i).playerBattingProbabilities().playerBound())) {
            TextView textView3 = viewHolder.txt_projection;
            textView3.setText("Criclytics predicts " + this.batsmanArrayList.get(i).playerName() + " to score " + this.batsmanArrayList.get(i).playerBattingProbabilities().playerBound() + " runs");
        }
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.batsmanArrayList.get(i).playerId() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
    }

    @Override
    public int getItemCount() {
        return this.batsmanArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_playerImage;
        TextView txt_player_bol;
        TextView txt_player_name;
        TextView txt_player_run;
        TextView txt_projection;
        TextView txt_team_name;

        public ViewHolder(View view) {
            super(view);
            this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
            this.txt_player_run = (TextView) view.findViewById(R.id.txt_player_run);
            this.txt_player_bol = (TextView) view.findViewById(R.id.txt_player_bol);
            this.txt_projection = (TextView) view.findViewById(R.id.txt_projection);
        }
    }
}
