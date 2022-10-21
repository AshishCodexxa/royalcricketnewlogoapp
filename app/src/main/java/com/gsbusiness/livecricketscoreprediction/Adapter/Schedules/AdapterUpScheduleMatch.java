package com.gsbusiness.livecricketscoreprediction.Adapter.Schedules;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.ScheduleQuery;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.Date;
import java.util.List;

public class AdapterUpScheduleMatch extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<ScheduleQuery.Schedule> matcheslists;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2);
    }

    public AdapterUpScheduleMatch(Context context2, List<ScheduleQuery.Schedule> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matcheslists = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_up_schedule_match, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new ViewHolder1(LayoutInflater.from(this.context).inflate(R.layout.item_ad, viewGroup, false));
    }

    @Override 
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            String str5 = "completed";
            String str6 = "upcoming";
            if (this.matcheslists.get(i).matchStatus().equals("live")) {
                viewHolder2.card_item_ups.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        AdapterUpScheduleMatch.this.onItemClickListener.onItemClick(AdapterUpScheduleMatch.this.matcheslists.get(i).matchID(), AdapterUpScheduleMatch.this.matcheslists.get(i).currentinningsNo());
                    }
                });
            } else if (this.matcheslists.get(i).matchStatus().equals(str6)) {
                viewHolder2.card_item_ups.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        AdapterUpScheduleMatch.this.onItemClickListener.onItemClick(AdapterUpScheduleMatch.this.matcheslists.get(i).matchID(), AdapterUpScheduleMatch.this.matcheslists.get(i).currentinningsNo());
                    }
                });
            } else if (this.matcheslists.get(i).matchStatus().equals(str5)) {
                viewHolder2.card_item_ups.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        AdapterUpScheduleMatch.this.onItemClickListener.onItemClick(AdapterUpScheduleMatch.this.matcheslists.get(i).matchID(), AdapterUpScheduleMatch.this.matcheslists.get(i).currentinningsNo());
                    }
                });
            }
            viewHolder2.txt_item_ups_matchType.setText(this.matcheslists.get(i).matchType());
            viewHolder2.txt_item_ups_matchNumber.setText(this.matcheslists.get(i).matchNumber());
            viewHolder2.txt_item_ups_venue.setText(this.matcheslists.get(i).venue());
            viewHolder2.txt_item_ups_h_team.setText(this.matcheslists.get(i).homeTeamName());
            viewHolder2.txt_item_ups_a_team.setText(this.matcheslists.get(i).awayTeamName());
            int i2 = 0;
            while (i2 < this.matcheslists.get(i).matchScore().size()) {
                if (this.matcheslists.get(i).homeTeamName().equals(this.matcheslists.get(i).matchScore().get(i2).teamShortName())) {
                    RequestManager with = Glide.with(this.context);
                    ((RequestBuilder) with.load(Glob.flag_start + this.matcheslists.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_ups_h_flag);
                    if (this.matcheslists.get(i).matchScore().get(i2).teamScore().size() > 0) {
                        int i3 = 0;
                        while (i3 < this.matcheslists.get(i).matchScore().get(i2).teamScore().size()) {
                            String runsScored = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i3).runsScored();
                            String wickets = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i3).wickets();
                            String overs = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i3).overs();
                            if (overs.length() != 0) {
                                str4 = str6;
                                str3 = str5;
                                viewHolder2.txt_item_ups_h_score.setText(String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")"));
                            } else {
                                str3 = str5;
                                str4 = str6;
                            }
                            i3++;
                            str6 = str4;
                            str5 = str3;
                        }
                    }
                    str = str5;
                    str2 = str6;
                } else {
                    str = str5;
                    str2 = str6;
                    RequestManager with2 = Glide.with(this.context);
                    ((RequestBuilder) with2.load(Glob.flag_start + this.matcheslists.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_ups_a_flag);
                    if (this.matcheslists.get(i).matchScore().get(i2).teamScore().size() > 0) {
                        for (int i4 = 0; i4 < this.matcheslists.get(i).matchScore().get(i2).teamScore().size(); i4++) {
                            String runsScored2 = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i4).runsScored();
                            String wickets2 = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i4).wickets();
                            String overs2 = this.matcheslists.get(i).matchScore().get(i2).teamScore().get(i4).overs();
                            if (overs2.length() != 0) {
                                viewHolder2.txt_item_ups_a_score.setText(String.format("%s%s%s %s%s%s", runsScored2, "/", wickets2, "(", overs2, ")"));
                            }
                        }
                    }
                }
                i2++;
                str6 = str2;
                str5 = str;
            }
            if (this.matcheslists.get(i).matchStatus().equals("live")) {
                viewHolder2.txt_item_ups_matchStatus.setText(this.matcheslists.get(i).statusMessage());
            } else if (this.matcheslists.get(i).matchStatus().equals(str5)) {
                viewHolder2.txt_item_ups_matchStatus.setText(this.matcheslists.get(i).matchResult());
            } else if (this.matcheslists.get(i).matchStatus().equals(str6)) {
                String startDate = this.matcheslists.get(i).startDate();
                if (Glob.getCurrentDate(new Date()).equals(Glob.getDate(startDate))) {
                    viewHolder2.txt_item_ups_h_score.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.primaryRed, this.context.getTheme()));
                    viewHolder2.txt_item_ups_h_score.setText("Today");
                    viewHolder2.txt_item_ups_matchStatus.setText(Glob.getTimeDiff(Glob.getTimes(Long.parseLong(startDate))));
                } else {
                    viewHolder2.txt_item_ups_h_score.setText(Glob.getDate(startDate));
                    viewHolder2.txt_item_ups_matchStatus.setText(Glob.getDateDif(startDate));
                }
                viewHolder2.txt_item_ups_a_score.setText(Glob.getTime(Long.parseLong(startDate)));
            } else {
                viewHolder2.txt_item_ups_matchStatus.setText(this.matcheslists.get(i).matchStatus());
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
                    AdapterUpScheduleMatch.this.onItemClickListener.onClickBanner();
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
        CardView card_item_ups;
        ImageView img_item_ups_a_flag;
        ImageView img_item_ups_h_flag;
        TextView txt_item_ups_a_score;
        TextView txt_item_ups_a_team;
        TextView txt_item_ups_h_score;
        TextView txt_item_ups_h_team;
        TextView txt_item_ups_matchNumber;
        TextView txt_item_ups_matchStatus;
        TextView txt_item_ups_matchType;
        TextView txt_item_ups_venue;

        public ViewHolder(View view) {
            super(view);
            this.card_item_ups = (CardView) view.findViewById(R.id.card_item_ups);
            this.txt_item_ups_matchType = (TextView) view.findViewById(R.id.txt_item_ups_matchType);
            this.txt_item_ups_matchNumber = (TextView) view.findViewById(R.id.txt_item_ups_matchNumber);
            this.txt_item_ups_venue = (TextView) view.findViewById(R.id.txt_item_ups_venue);
            this.txt_item_ups_h_team = (TextView) view.findViewById(R.id.txt_item_ups_h_team);
            this.txt_item_ups_h_score = (TextView) view.findViewById(R.id.txt_item_ups_h_score);
            this.img_item_ups_h_flag = (ImageView) view.findViewById(R.id.img_item_ups_h_flag);
            this.txt_item_ups_a_team = (TextView) view.findViewById(R.id.txt_item_ups_a_team);
            this.txt_item_ups_a_score = (TextView) view.findViewById(R.id.txt_item_ups_a_score);
            this.img_item_ups_a_flag = (ImageView) view.findViewById(R.id.img_item_ups_a_flag);
            this.txt_item_ups_matchStatus = (TextView) view.findViewById(R.id.txt_item_ups_matchStatus);
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
