package com.gsbusiness.livecricketscoreprediction.Adapter.Fantasy;

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
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetFRCHomePageQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class AdapterFantasyMatchUpcoming extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<GetFRCHomePageQuery.Upcomingmatch> upcomingmatches;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterFantasyMatchUpcoming(Context context2, List<GetFRCHomePageQuery.Upcomingmatch> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.upcomingmatches = list;
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
            viewHolder2.ll_upcoming.setVisibility(View.VISIBLE);;
            viewHolder2.txtUC_seriesName.setText(this.upcomingmatches.get(i).matchName());
            viewHolder2.txtUC_vanue.setText(this.upcomingmatches.get(i).city());
            viewHolder2.txtUC_time.setText(String.format("%s %s %s %s", Glob.getDateDay(this.upcomingmatches.get(i).matchDateTimeGMT()), Glob.getDateMonth(Long.parseLong(this.upcomingmatches.get(i).matchDateTimeGMT())), ", at", Glob.getTime(Long.parseLong(this.upcomingmatches.get(i).matchDateTimeGMT()))));
            viewHolder2.txtUC_date.setText(Glob.getDate(this.upcomingmatches.get(i).matchDateTimeGMT()));
            viewHolder2.txtUC_team1.setTypeface(Glob.oswald_medium);
            viewHolder2.txtUC_team2.setTypeface(Glob.oswald_medium);
            for (int i2 = 0; i2 < this.upcomingmatches.get(i).matchScore().size(); i2++) {
                if (this.upcomingmatches.get(i).homeTeamShortName().equals(this.upcomingmatches.get(i).matchScore().get(i2).teamShortName())) {
                    viewHolder2.txtUC_team1.setText(this.upcomingmatches.get(i).matchScore().get(i2).teamShortName());
                    RequestManager with = Glide.with(this.context);
                    ((RequestBuilder) with.load(Glob.teams_start + this.upcomingmatches.get(i).matchScore().get(i2).teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.imgUC_team1);
                } else if (this.upcomingmatches.get(i).awayTeamShortName().equals(this.upcomingmatches.get(i).matchScore().get(i2).teamShortName())) {
                    viewHolder2.txtUC_team2.setText(this.upcomingmatches.get(i).matchScore().get(i2).teamShortName());
                    RequestManager with2 = Glide.with(this.context);
                    ((RequestBuilder) with2.load(Glob.teams_start + this.upcomingmatches.get(i).matchScore().get(i2).teamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.imgUC_team2);
                }
            }
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterFantasyMatchUpcoming.this.onItemClickListener.onItemClick(AdapterFantasyMatchUpcoming.this.upcomingmatches.get(i).matchID());
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
                    AdapterFantasyMatchUpcoming.this.onItemClickListener.onClickBanner();
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
        return this.upcomingmatches.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.upcomingmatches.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUC_team1;
        ImageView imgUC_team2;
        LinearLayout ll_upcoming;
        TextView txtUC_date;
        TextView txtUC_seriesName;
        TextView txtUC_team1;
        TextView txtUC_team2;
        TextView txtUC_time;
        TextView txtUC_vanue;

        public ViewHolder(View view) {
            super(view);
            this.ll_upcoming = (LinearLayout) view.findViewById(R.id.ll_upcoming);
            this.txtUC_seriesName = (TextView) view.findViewById(R.id.txtUC_seriesName);
            this.txtUC_date = (TextView) view.findViewById(R.id.txtUC_date);
            this.txtUC_vanue = (TextView) view.findViewById(R.id.txtUC_vanue);
            this.txtUC_time = (TextView) view.findViewById(R.id.txtUC_time);
            this.txtUC_team1 = (TextView) view.findViewById(R.id.txtUC_team1);
            this.txtUC_team2 = (TextView) view.findViewById(R.id.txtUC_team2);
            this.imgUC_team1 = (ImageView) view.findViewById(R.id.imgUC_team1);
            this.imgUC_team2 = (ImageView) view.findViewById(R.id.imgUC_team2);
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
