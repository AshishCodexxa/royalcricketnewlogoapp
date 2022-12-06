package com.cricketscoreprediction.app.Adapter.Criclytics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketscoreprediction.app.Ads.Server;

import com.cricketscoreprediction.app.PlayerIndexQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;

public class AdapterValuablePlayer extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    ArrayList<PlayerIndexQuery.PlayerObject> playerObjectList;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterValuablePlayer(Context context2, ArrayList<PlayerIndexQuery.PlayerObject> arrayList, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.playerObjectList = arrayList;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_valuable_player, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new ViewHolder1(LayoutInflater.from(this.context).inflate(R.layout.item_ad, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            viewHolder2.txt_player_name.setText(this.playerObjectList.get(i).playerName());
            viewHolder2.txt_player_country.setText(this.playerObjectList.get(i).playerTeamName());
            viewHolder2.txt_point.setText(this.playerObjectList.get(i).totalPoints());
            viewHolder2.view_color.setBackgroundColor(Color.parseColor(this.playerObjectList.get(i).teamColor()));
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.playerObjectList.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder2.img_player);
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterValuablePlayer.this.onItemClickListener.onItemClick(AdapterValuablePlayer.this.playerObjectList.get(i).playerID());
                }
            });
        } else if (itemViewType == 1) {
            ViewHolder1 viewHolder1 = (ViewHolder1) viewHolder;
            AppPreference appPreference = new AppPreference(this.context);
            String banner = Glob.getBanner(appPreference.getJsonArray("img_native_ad"));
            String string = appPreference.getString("img_banner_ad_icon");
            if (banner != null && !banner.equals("")) {
                Glide.with(this.context).load(banner).into(viewHolder1.ad_banner);
                if (string != null && !string.matches("")) {
                    Glide.with(this.context).load(string).into(viewHolder1.ad_icon);
                }
            }
            viewHolder1.ad_banner.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterValuablePlayer.this.onItemClickListener.onClickBanner();
                }
            });
            Server server = new Server((Activity) this.context);
            if (Glob.isOnline(this.context)) {
                server.nativeSmallAd(viewHolder1.item_rl_ad);
            } else {
                viewHolder1.item_rl_ad.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return this.playerObjectList.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.playerObjectList.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_player;
        TextView txt_player_country;
        TextView txt_player_name;
        TextView txt_point;
        View view_color;

        public ViewHolder(View view) {
            super(view);
            this.img_player = (ImageView) view.findViewById(R.id.img_player);
            this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
            this.txt_player_country = (TextView) view.findViewById(R.id.txt_player_country);
            this.txt_point = (TextView) view.findViewById(R.id.txt_point);
            this.view_color = view.findViewById(R.id.view_color);
        }
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {
        ImageView ad_banner;
        ImageView ad_icon;
        RelativeLayout item_rl_ad;

        public ViewHolder1(View view) {
            super(view);
            this.item_rl_ad = (RelativeLayout) view.findViewById(R.id.item_rl_ad);
            this.ad_banner = (ImageView) view.findViewById(R.id.ad_banner);
            this.ad_icon = (ImageView) view.findViewById(R.id.ad_icon);
        }
    }

    private String getDate(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd LLLL hh:mm a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
