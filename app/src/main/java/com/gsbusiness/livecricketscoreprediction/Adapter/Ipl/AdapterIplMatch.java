package com.gsbusiness.livecricketscoreprediction.Adapter.Ipl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.MatcheslistQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class AdapterIplMatch extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<MatcheslistQuery.Matcheslist> featurematchList;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2, String str3);
    }

    public AdapterIplMatch(Context context2, List<MatcheslistQuery.Matcheslist> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.featurematchList = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_ipl_match, viewGroup, false));
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
            viewHolder2.txt_item_matchNo.setText(this.featurematchList.get(i).matchNumber());
            viewHolder2.txt_item_vanue.setText(this.featurematchList.get(i).venue());
            String startDate = this.featurematchList.get(i).startDate();
            viewHolder2.txt_item_startDate.setText(Glob.getDate(startDate));
            viewHolder2.click.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterIplMatch.this.onItemClickListener.onItemClick(AdapterIplMatch.this.featurematchList.get(i).matchID(), AdapterIplMatch.this.featurematchList.get(i).currentinningsNo(), AdapterIplMatch.this.featurematchList.get(i).matchStatus());
                }
            });
            if (this.featurematchList.get(i).matchStatus().equals("live")) {
                AdapterIplTeam adapterIplTeam = new AdapterIplTeam(this.context, this.featurematchList.get(i).matchScore());
                viewHolder2.rv_team.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.VERTICAL, false));
                viewHolder2.rv_team.setAdapter(adapterIplTeam);
                viewHolder2.txt_item_matchStatus.setText(this.featurematchList.get(i).statusMessage());
            } else if (this.featurematchList.get(i).matchStatus().equals("completed")) {
                AdapterIplTeam adapterIplTeam2 = new AdapterIplTeam(this.context, this.featurematchList.get(i).matchScore());
                viewHolder2.rv_team.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.VERTICAL, false));
                viewHolder2.rv_team.setAdapter(adapterIplTeam2);
                viewHolder2.txt_item_matchStatus.setText(this.featurematchList.get(i).matchResult());
            } else if (this.featurematchList.get(i).matchStatus().equals("upcoming")) {
                viewHolder2.ll_score.setVisibility(View.GONE);
                viewHolder2.ll_score_.setVisibility(View.VISIBLE);;
                viewHolder2.txt_item_h_team.setText(this.featurematchList.get(i).homeTeamShortName());
                viewHolder2.txt_item_a_team.setText(this.featurematchList.get(i).awayTeamShortName());
                for (int i2 = 0; i2 < this.featurematchList.get(i).matchScore().size(); i2++) {
                    if (this.featurematchList.get(i).matchScore().get(i2).teamShortName().equals(this.featurematchList.get(i).homeTeamShortName())) {
                        RequestManager with = Glide.with(this.context);
                        ((RequestBuilder) with.load(Glob.flag_start + this.featurematchList.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_h_flag);
                    } else if (this.featurematchList.get(i).matchScore().get(i2).teamShortName().equals(this.featurematchList.get(i).awayTeamShortName())) {
                        RequestManager with2 = Glide.with(this.context);
                        ((RequestBuilder) with2.load(Glob.flag_start + this.featurematchList.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_a_flag);
                    }
                }
                viewHolder2.txt_item_time.setText(Glob.getTime(Long.parseLong(startDate)));
                if (Glob.getCurrentDate(new Date()).equals(Glob.getDate(startDate))) {
                    viewHolder2.txt_item_date.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.primaryRed, this.context.getTheme()));
                    viewHolder2.txt_item_date.setText("Today");
                    viewHolder2.txt_item_matchStatus.setText(Glob.getTimeDiff(Glob.getTimes(Long.parseLong(startDate))));
                    return;
                }
                viewHolder2.txt_item_date.setText(Glob.getDate(startDate));
                viewHolder2.txt_item_matchStatus.setText(Glob.getDateDif(startDate));
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
                    AdapterIplMatch.this.onItemClickListener.onClickBanner();
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
        return this.featurematchList.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.featurematchList.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FrameLayout click;
        ImageView img_item_a_flag;
        ImageView img_item_h_flag;
        LinearLayout ll_score;
        LinearLayout ll_score_;
        RecyclerView rv_team;
        TextView txt_item_a_team;
        TextView txt_item_date;
        TextView txt_item_h_team;
        TextView txt_item_matchNo;
        TextView txt_item_matchStatus;
        TextView txt_item_startDate;
        TextView txt_item_time;
        TextView txt_item_vanue;

        public ViewHolder(View view) {
            super(view);
            this.txt_item_startDate = (TextView) view.findViewById(R.id.txt_item_startDate);
            this.txt_item_matchNo = (TextView) view.findViewById(R.id.txt_item_matchNo);
            this.txt_item_vanue = (TextView) view.findViewById(R.id.txt_item_vanue);
            this.txt_item_matchStatus = (TextView) view.findViewById(R.id.txt_item_matchStatus);
            this.rv_team = (RecyclerView) view.findViewById(R.id.rv_team);
            this.txt_item_date = (TextView) view.findViewById(R.id.txt_item_date);
            this.txt_item_time = (TextView) view.findViewById(R.id.txt_item_time);
            this.txt_item_a_team = (TextView) view.findViewById(R.id.txt_item_a_team);
            this.txt_item_h_team = (TextView) view.findViewById(R.id.txt_item_h_team);
            this.img_item_a_flag = (ImageView) view.findViewById(R.id.img_item_a_flag);
            this.img_item_h_flag = (ImageView) view.findViewById(R.id.img_item_h_flag);
            this.click = (FrameLayout) view.findViewById(R.id.click);
            this.ll_score_ = (LinearLayout) view.findViewById(R.id.ll_score_);
            this.ll_score = (LinearLayout) view.findViewById(R.id.ll_score);
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
