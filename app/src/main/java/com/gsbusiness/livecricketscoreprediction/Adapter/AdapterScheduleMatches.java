package com.gsbusiness.livecricketscoreprediction.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.gsbusiness.livecricketscoreprediction.CustomProgressBar;
import com.gsbusiness.livecricketscoreprediction.Models.ProgressItem;
import com.gsbusiness.livecricketscoreprediction.NewScheduleQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdapterScheduleMatches extends RecyclerView.Adapter<AdapterScheduleMatches.ViewHolder> {
    Context context;
    private ProgressItem mProgressItem;
    List<NewScheduleQuery.C6608Match> matchList;
    OnItemClickListener onItemClickListener;
    private ArrayList<ProgressItem> progressItemList;

    public interface OnItemClickListener {
        void onItemClick(String str, String str2, String str3);
    }

    public AdapterScheduleMatches(Context context2, List<NewScheduleQuery.C6608Match> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matchList = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_schedule_match, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.txt_item_matchNo.setText(this.matchList.get(i).matchNumber());
        viewHolder.txt_item_venue.setText(this.matchList.get(i).venue());
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) with.load(Glob.flag_start + this.matchList.get(i).matchScore().get(0).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_item_h_flag);
        RequestManager with2 = Glide.with(this.context);
        ((RequestBuilder) with2.load(Glob.flag_start + this.matchList.get(i).matchScore().get(1).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_item_a_flag);
        viewHolder.txt_item_h_team.setText(this.matchList.get(i).matchScore().get(0).teamShortName());
        viewHolder.txt_item_a_team.setText(this.matchList.get(i).matchScore().get(1).teamShortName());
        String startDate = this.matchList.get(i).startDate();
        viewHolder.txt_item_matchStatus.setText(Glob.getTimeDiff(Glob.getTimes(Long.parseLong(startDate))));
        if (Glob.getCurrentDate(new Date()).equals(Glob.getDate(startDate))) {
            viewHolder.txt_item_date.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.primaryRed, this.context.getTheme()));
            viewHolder.txt_item_date.setText("Today");
        } else {
            viewHolder.txt_item_date.setText(Glob.getDate(startDate));
            viewHolder.txt_item_matchStatus.setText(Glob.getDateDif(startDate));
        }
        viewHolder.txt_item_time.setText(Glob.getTime(Long.parseLong(startDate)));
        viewHolder.customProgressBar.getThumb().mutate().setAlpha(0);
        this.progressItemList = new ArrayList<>();
        ProgressItem progressItem = new ProgressItem();
        this.mProgressItem = progressItem;
        progressItem.progressItemPercentage = 100.0f;
        this.mProgressItem.color = R.color.gray_ad_border;
        this.progressItemList.add(this.mProgressItem);
        viewHolder.customProgressBar.initData(this.progressItemList);
        viewHolder.customProgressBar.invalidate();
        String homeTeamPercentage = this.matchList.get(i).teamsWinProbability().homeTeamPercentage();
        String awayTeamPercentage = this.matchList.get(i).teamsWinProbability().awayTeamPercentage();
        if (homeTeamPercentage == null || homeTeamPercentage.equalsIgnoreCase("")) {
            viewHolder.ll_prediction.setVisibility(View.GONE);
            viewHolder.rl_no_projection.setVisibility(View.VISIBLE);;
        } else {
            viewHolder.rl_no_projection.setVisibility(View.GONE);
            viewHolder.ll_prediction.setVisibility(View.VISIBLE);;
            String tiePercentage = this.matchList.get(i).teamsWinProbability().tiePercentage();
            TextView textView = viewHolder.txt_home_per;
            textView.setText(homeTeamPercentage + " %");
            viewHolder.txt_home.setText(this.matchList.get(i).teamsWinProbability().homeTeamShortName());
            viewHolder.txt_home_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
            viewHolder.txt_home.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
            TextView textView2 = viewHolder.txt_tie_per;
            textView2.setText(tiePercentage + " %");
            if (tiePercentage.equals("")) {
                viewHolder.txt_tie_per.setVisibility(View.GONE);
                viewHolder.txt_tie.setVisibility(View.GONE);
            }
            TextView textView3 = viewHolder.txt_away_per;
            textView3.setText(awayTeamPercentage + " %");
            viewHolder.txt_away.setText(this.matchList.get(i).teamsWinProbability().awayTeamShortName());
            viewHolder.txt_away_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
            viewHolder.txt_away.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
            initDataToSeekbar(Integer.parseInt(Glob.getInt(homeTeamPercentage)), Integer.parseInt(Glob.getInt(awayTeamPercentage)), Integer.parseInt(Glob.getInt(tiePercentage)), viewHolder);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterScheduleMatches.this.onItemClickListener.onItemClick(AdapterScheduleMatches.this.matchList.get(i).matchID(), AdapterScheduleMatches.this.matchList.get(i).currentinningsNo(), AdapterScheduleMatches.this.matchList.get(i).matchStatus());
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.matchList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CustomProgressBar customProgressBar;
        ImageView img_item_a_flag;
        ImageView img_item_h_flag;
        LinearLayout ll_prediction;
        RelativeLayout rl_no_projection;
        TextView txt_away;
        TextView txt_away_per;
        TextView txt_home;
        TextView txt_home_per;
        TextView txt_item_a_team;
        TextView txt_item_date;
        TextView txt_item_h_team;
        TextView txt_item_matchNo;
        TextView txt_item_matchStatus;
        TextView txt_item_time;
        TextView txt_item_venue;
        TextView txt_tie;
        TextView txt_tie_per;

        public ViewHolder(View view) {
            super(view);
            this.txt_item_matchNo = (TextView) view.findViewById(R.id.txt_item_matchNo);
            this.txt_item_venue = (TextView) view.findViewById(R.id.txt_item_venue);
            this.img_item_h_flag = (ImageView) view.findViewById(R.id.img_item_h_flag);
            this.img_item_a_flag = (ImageView) view.findViewById(R.id.img_item_a_flag);
            this.txt_item_h_team = (TextView) view.findViewById(R.id.txt_item_h_team);
            this.txt_item_a_team = (TextView) view.findViewById(R.id.txt_item_a_team);
            this.txt_item_date = (TextView) view.findViewById(R.id.txt_item_date);
            this.txt_item_time = (TextView) view.findViewById(R.id.txt_item_time);
            this.txt_item_matchStatus = (TextView) view.findViewById(R.id.txt_item_matchStatus);
            this.rl_no_projection = (RelativeLayout) view.findViewById(R.id.rl_no_projection);
            this.ll_prediction = (LinearLayout) view.findViewById(R.id.ll_prediction);
            this.customProgressBar = (CustomProgressBar) view.findViewById(R.id.customProgressBar);
            this.txt_home = (TextView) view.findViewById(R.id.txt_home);
            this.txt_tie = (TextView) view.findViewById(R.id.txt_tie);
            this.txt_away = (TextView) view.findViewById(R.id.txt_away);
            this.txt_home_per = (TextView) view.findViewById(R.id.txt_home_per);
            this.txt_tie_per = (TextView) view.findViewById(R.id.txt_tie_per);
            this.txt_away_per = (TextView) view.findViewById(R.id.txt_away_per);
        }
    }

    private void initDataToSeekbar(int i, int i2, int i3, ViewHolder viewHolder) {
        this.progressItemList = new ArrayList<>();
        ProgressItem progressItem = new ProgressItem();
        this.mProgressItem = progressItem;
        progressItem.progressItemPercentage = (float) i;
        this.mProgressItem.color = R.color.redLight;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem2 = new ProgressItem();
        this.mProgressItem = progressItem2;
        progressItem2.progressItemPercentage = (float) i3;
        this.mProgressItem.color = R.color.gray_ad_border;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem3 = new ProgressItem();
        this.mProgressItem = progressItem3;
        progressItem3.progressItemPercentage = (float) i2;
        this.mProgressItem.color = R.color.green;
        this.progressItemList.add(this.mProgressItem);
        viewHolder.customProgressBar.initData(this.progressItemList);
        viewHolder.customProgressBar.invalidate();
    }
}
