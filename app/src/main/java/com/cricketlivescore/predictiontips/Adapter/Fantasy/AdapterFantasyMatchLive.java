package com.cricketlivescore.predictiontips.Adapter.Fantasy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Ads.Server;

import com.cricketlivescore.predictiontips.GetFRCHomePageQuery;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class AdapterFantasyMatchLive extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<GetFRCHomePageQuery.Livematch> livematches;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterFantasyMatchLive(Context context2, List<GetFRCHomePageQuery.Livematch> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.livematches = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_fantasy_match, viewGroup, false));
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
            viewHolder2.ll_live.setVisibility(View.VISIBLE);;
            viewHolder2.txt_seriesName.setText(this.livematches.get(i).matchName());
            viewHolder2.txt_status.setText(this.livematches.get(i).statusMessage());
            viewHolder2.txt_team1.setTypeface(Glob.oswald_medium);
            viewHolder2.txt_team2.setTypeface(Glob.oswald_medium);
            for (int i2 = 0; i2 < this.livematches.get(i).matchScore().size(); i2++) {
                if (this.livematches.get(i).homeTeamShortName().equals(this.livematches.get(i).matchScore().get(i2).teamShortName())) {
                    viewHolder2.txt_team1.setText(this.livematches.get(i).matchScore().get(i2).teamShortName());
                    RequestManager with = Glide.with(this.context);
                    ((RequestBuilder) with.load(Glob.teams_start + this.livematches.get(i).matchScore().get(i2).teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_team1);
                } else if (this.livematches.get(i).awayTeamShortName().equals(this.livematches.get(i).matchScore().get(i2).teamShortName())) {
                    viewHolder2.txt_team2.setText(this.livematches.get(i).matchScore().get(i2).teamShortName());
                    RequestManager with2 = Glide.with(this.context);
                    ((RequestBuilder) with2.load(Glob.teams_start + this.livematches.get(i).matchScore().get(i2).teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_team2);
                }
            }
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterFantasyMatchLive.this.onItemClickListener.onItemClick(AdapterFantasyMatchLive.this.livematches.get(i).matchID());
                }
            });
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
                    AdapterFantasyMatchLive.this.onItemClickListener.onClickBanner();
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
        return this.livematches.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.livematches.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_team1;
        ImageView img_team2;
        LinearLayout ll_live;
        TextView txt_seriesName;
        TextView txt_status;
        TextView txt_team1;
        TextView txt_team2;

        public ViewHolder(View view) {
            super(view);
            this.ll_live = (LinearLayout) view.findViewById(R.id.ll_live);
            this.txt_seriesName = (TextView) view.findViewById(R.id.txt_seriesName);
            this.txt_status = (TextView) view.findViewById(R.id.txt_status);
            this.txt_team1 = (TextView) view.findViewById(R.id.txt_team1);
            this.txt_team2 = (TextView) view.findViewById(R.id.txt_team2);
            this.img_team1 = (ImageView) view.findViewById(R.id.img_team1);
            this.img_team2 = (ImageView) view.findViewById(R.id.img_team2);
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
