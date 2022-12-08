package com.cricketlivescore.predictiontips.Adapter.Schedules;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.cricketlivescore.predictiontips.Ads.Server;

import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.ScheduleQuery;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;
import java.util.List;

public class AdapterLiveScheduleMatch extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<ScheduleQuery.Schedule> matcheslists;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2);
    }

    public AdapterLiveScheduleMatch(Context context2, List<ScheduleQuery.Schedule> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matcheslists = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_schedule_live_match, viewGroup, false));
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
            if (this.matcheslists.get(i).matchStatus().equals("live")) {
                viewHolder2.click.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        AdapterLiveScheduleMatch.this.onItemClickListener.onItemClick(AdapterLiveScheduleMatch.this.matcheslists.get(i).matchID(), AdapterLiveScheduleMatch.this.matcheslists.get(i).currentinningsNo());
                    }
                });
            } else if (this.matcheslists.get(i).matchStatus().equals("completed")) {
                viewHolder2.click.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        AdapterLiveScheduleMatch.this.onItemClickListener.onItemClick(AdapterLiveScheduleMatch.this.matcheslists.get(i).matchID(), AdapterLiveScheduleMatch.this.matcheslists.get(i).currentinningsNo());
                    }
                });
            }
            viewHolder2.txt_venue.setText(this.matcheslists.get(i).venue());
            viewHolder2.txt_item_matchType.setText(this.matcheslists.get(i).matchType());
            viewHolder2.txt_item_matchNumber.setText(this.matcheslists.get(i).matchNumber());
            viewHolder2.rv_team.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.VERTICAL, false));
            viewHolder2.rv_team.setAdapter(new AdapterLiveTeam(this.context, this.matcheslists.get(i).matchScore(), this.matcheslists.get(i).currentinningsNo()));
            if (this.matcheslists.get(i).matchStatus().equals("live")) {
                viewHolder2.txt_item_matchStatus.setText(this.matcheslists.get(i).statusMessage());
            } else if (this.matcheslists.get(i).matchStatus().equals("completed")) {
                viewHolder2.txt_item_matchStatus.setText(this.matcheslists.get(i).matchResult());
            }
        } else if (itemViewType == 1) {
            ViewHolder1 viewHolder1 = (ViewHolder1) viewHolder;
            AppPreference appPreference = new AppPreference(this.context);
            String banner = Glob.getBanner(appPreference.getJsonArray("img_banner_ad_large"));
            String string = appPreference.getString("img_banner_ad_icon");
            if (banner != null && !banner.matches("")) {
                Glide.with(this.context).load(banner).into(viewHolder1.ad_banner);
                if (string != null && !string.matches("")) {
                    Glide.with(this.context).load(string).into(viewHolder1.ad_icon);
                }
            }
            viewHolder1.ad_banner.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterLiveScheduleMatch.this.onItemClickListener.onClickBanner();
                }
            });
            Server server = new Server((Activity) this.context);
            if (Glob.isOnline(this.context)) {
                server.nativeLargeAd(viewHolder1.item_rl_ad);
            } else {
                viewHolder1.item_rl_ad.setVisibility(View.GONE);
            }
        }
    }

    @Override 
    public int getItemCount() {
        return this.matcheslists.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.matcheslists.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FrameLayout click;
        RecyclerView rv_team;
        TextView txt_item_matchNumber;
        TextView txt_item_matchStatus;
        TextView txt_item_matchType;
        TextView txt_venue;

        public ViewHolder(View view) {
            super(view);
            this.txt_venue = (TextView) view.findViewById(R.id.txt_venue);
            this.txt_item_matchType = (TextView) view.findViewById(R.id.txt_item_matchType);
            this.txt_item_matchNumber = (TextView) view.findViewById(R.id.txt_item_matchNumber);
            this.rv_team = (RecyclerView) view.findViewById(R.id.rv_team);
            this.txt_item_matchStatus = (TextView) view.findViewById(R.id.txt_item_matchStatus);
            this.click = (FrameLayout) view.findViewById(R.id.click);
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
}
