package com.cricketscoreprediction.app.Adapter.Fantasy;

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
import com.cricketscoreprediction.app.Ads.Server;

import com.cricketscoreprediction.app.GetFRCHomePageQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class AdapterFantasyMatchCompleted extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<GetFRCHomePageQuery.Completedmatch> completedmatches;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterFantasyMatchCompleted(Context context2, List<GetFRCHomePageQuery.Completedmatch> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.completedmatches = list;
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
            viewHolder2.ll_completed.setVisibility(View.VISIBLE);;
            viewHolder2.txtCom_seriesName.setText(this.completedmatches.get(i).matchName());
            viewHolder2.txtCom_status.setText(this.completedmatches.get(i).statusMessage());
            for (int i2 = 0; i2 < this.completedmatches.get(i).matchScore().size(); i2++) {
                if (this.completedmatches.get(i).matchScore().get(i2).teamID().equals(this.completedmatches.get(i).winningTeamID())) {
                    viewHolder2.txtCom_team1.setText(this.completedmatches.get(i).matchScore().get(i2).teamShortName());
                    RequestManager with = Glide.with(this.context);
                    ((RequestBuilder) with.load(Glob.teams_start + this.completedmatches.get(i).winningTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.imgCom_team);
                } else {
                    viewHolder2.txtCom_team2.setText(this.completedmatches.get(i).matchScore().get(i2).teamShortName());
                }
            }
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterFantasyMatchCompleted.this.onItemClickListener.onItemClick(AdapterFantasyMatchCompleted.this.completedmatches.get(i).matchID());
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
                    AdapterFantasyMatchCompleted.this.onItemClickListener.onClickBanner();
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
        return this.completedmatches.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.completedmatches.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCom_team;
        LinearLayout ll_completed;
        TextView txtCom_seriesName;
        TextView txtCom_status;
        TextView txtCom_team1;
        TextView txtCom_team2;

        public ViewHolder(View view) {
            super(view);
            this.ll_completed = (LinearLayout) view.findViewById(R.id.ll_completed);
            this.txtCom_seriesName = (TextView) view.findViewById(R.id.txtCom_seriesName);
            this.txtCom_status = (TextView) view.findViewById(R.id.txtCom_status);
            this.txtCom_team1 = (TextView) view.findViewById(R.id.txtCom_team1);
            this.txtCom_team2 = (TextView) view.findViewById(R.id.txtCom_team2);
            this.imgCom_team = (ImageView) view.findViewById(R.id.imgCom_team);
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
