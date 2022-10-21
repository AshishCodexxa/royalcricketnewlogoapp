package com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics;

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
import com.gsbusiness.livecricketscoreprediction.Adapter.AdapterFeatureTeam;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.CustomProgressBar;
import com.gsbusiness.livecricketscoreprediction.FeaturematchQuery;
import com.gsbusiness.livecricketscoreprediction.Models.ProgressItem;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdapterCriclyticsMatch extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<FeaturematchQuery.Featurematch> featurematchList;
    private ProgressItem mProgressItem;
    String matchStatus;
    OnItemClickListener onItemClickListener;
    private ArrayList<ProgressItem> progressItemList;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2, String str3);
    }

    public AdapterCriclyticsMatch(Context context2, List<FeaturematchQuery.Featurematch> list, String str, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matchStatus = str;
        this.featurematchList = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_criclytics_match, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new ViewHolder1(LayoutInflater.from(this.context).inflate(R.layout.item_ad_medium, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            viewHolder2.txt_item_fm_matchNo.setText(this.featurematchList.get(i).matchNumber());
            viewHolder2.txt_item_fm_seriesName.setText(this.featurematchList.get(i).seriesName());
            viewHolder2.click.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterCriclyticsMatch.this.onItemClickListener.onItemClick(AdapterCriclyticsMatch.this.featurematchList.get(i).matchID(), AdapterCriclyticsMatch.this.featurematchList.get(i).currentinningsNo(), AdapterCriclyticsMatch.this.featurematchList.get(i).matchType());
                }
            });
            if (this.matchStatus.equalsIgnoreCase("live")) {
                viewHolder2.img_live.setVisibility(View.VISIBLE);;
                team(viewHolder2, i);
                viewHolder2.txt_item_fm_matchStatus.setText(this.featurematchList.get(i).statusMessage());
                viewHolder2.rl_player_of_the_match.setVisibility(View.GONE);
                viewHolder2.ll_prediction.setVisibility(View.VISIBLE);;
                viewHolder2.customProgressBar.getThumb().mutate().setAlpha(0);
                this.progressItemList = new ArrayList<>();
                ProgressItem progressItem = new ProgressItem();
                this.mProgressItem = progressItem;
                progressItem.progressItemPercentage = 100.0f;
                this.mProgressItem.color = R.color.gray_ad_border;
                this.progressItemList.add(this.mProgressItem);
                viewHolder2.customProgressBar.initData(this.progressItemList);
                viewHolder2.customProgressBar.invalidate();
                String homeTeamPercentage = this.featurematchList.get(i).teamsWinProbability().homeTeamPercentage();
                String awayTeamPercentage = this.featurematchList.get(i).teamsWinProbability().awayTeamPercentage();
                String tiePercentage = this.featurematchList.get(i).teamsWinProbability().tiePercentage();
                TextView textView = viewHolder2.txt_home_per;
                textView.setText(homeTeamPercentage + " %");
                viewHolder2.txt_home.setText(this.featurematchList.get(i).teamsWinProbability().homeTeamShortName());
                viewHolder2.txt_home_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
                viewHolder2.txt_home.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
                TextView textView2 = viewHolder2.txt_tie_per;
                textView2.setText(tiePercentage + " %");
                if (tiePercentage.equals("")) {
                    viewHolder2.txt_tie_per.setVisibility(View.GONE);
                    viewHolder2.txt_tie.setVisibility(View.GONE);
                }
                TextView textView3 = viewHolder2.txt_away_per;
                textView3.setText(awayTeamPercentage + " %");
                viewHolder2.txt_away.setText(this.featurematchList.get(i).teamsWinProbability().awayTeamShortName());
                viewHolder2.txt_away_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
                viewHolder2.txt_away.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
                initDataToSeekbar(Integer.parseInt(Glob.getInt(homeTeamPercentage)), Integer.parseInt(Glob.getInt(awayTeamPercentage)), Integer.parseInt(Glob.getInt(tiePercentage)), viewHolder2);
            } else if (this.matchStatus.equalsIgnoreCase("completed")) {
                team(viewHolder2, i);
                viewHolder2.txt_item_fm_matchStatus.setText(this.featurematchList.get(i).matchResult());
                viewHolder2.ll_prediction.setVisibility(View.GONE);
                viewHolder2.rl_player_of_the_match.setVisibility(View.VISIBLE);;
                viewHolder2.txt_playerOfTheMatchName.setText(this.featurematchList.get(i).playerOfTheMatch());
                RequestManager with = Glide.with(this.context);
                ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.featurematchList.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder2.img_playerOfTheMatchImage);
            } else if (this.matchStatus.equalsIgnoreCase("upcoming")) {
                viewHolder2.ll_score.setVisibility(View.GONE);
                viewHolder2.ll_score_.setVisibility(View.VISIBLE);;
                String startDate = this.featurematchList.get(i).startDate();
                viewHolder2.txt_item_h_team.setText(this.featurematchList.get(i).homeTeamName());
                viewHolder2.txt_item_a_team.setText(this.featurematchList.get(i).awayTeamName());
                for (int i2 = 0; i2 < this.featurematchList.get(i).matchScore().size(); i2++) {
                    if (this.featurematchList.get(i).matchScore().get(i2).teamShortName().equals(this.featurematchList.get(i).homeTeamName())) {
                        RequestManager with2 = Glide.with(this.context);
                        ((RequestBuilder) with2.load(Glob.flag_start + this.featurematchList.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_h_flag);
                    } else if (this.featurematchList.get(i).matchScore().get(i2).teamShortName().equals(this.featurematchList.get(i).awayTeamName())) {
                        RequestManager with3 = Glide.with(this.context);
                        ((RequestBuilder) with3.load(Glob.flag_start + this.featurematchList.get(i).matchScore().get(i2).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_a_flag);
                    }
                }
                viewHolder2.txt_item_fm_matchStatus.setText(Glob.getTimeDiff(Glob.getTimes(Long.parseLong(startDate))));
                if (Glob.getCurrentDate(new Date()).equals(Glob.getDate(startDate))) {
                    viewHolder2.txt_item_date.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.primaryRed, this.context.getTheme()));
                    viewHolder2.txt_item_date.setText("Today");
                } else {
                    viewHolder2.txt_item_date.setText(Glob.getDate(startDate));
                    viewHolder2.txt_item_fm_matchStatus.setText(Glob.getDateDif(startDate));
                }
                viewHolder2.txt_item_time.setText(Glob.getTime(Long.parseLong(startDate)));
                viewHolder2.rl_player_of_the_match.setVisibility(View.GONE);
                viewHolder2.ll_prediction.setVisibility(View.VISIBLE);;
                viewHolder2.customProgressBar.getThumb().mutate().setAlpha(0);
                this.progressItemList = new ArrayList<>();
                ProgressItem progressItem2 = new ProgressItem();
                this.mProgressItem = progressItem2;
                progressItem2.progressItemPercentage = 100.0f;
                this.mProgressItem.color = R.color.gray_ad_border;
                this.progressItemList.add(this.mProgressItem);
                viewHolder2.customProgressBar.initData(this.progressItemList);
                viewHolder2.customProgressBar.invalidate();
                String homeTeamPercentage2 = this.featurematchList.get(i).teamsWinProbability().homeTeamPercentage();
                String awayTeamPercentage2 = this.featurematchList.get(i).teamsWinProbability().awayTeamPercentage();
                String tiePercentage2 = this.featurematchList.get(i).teamsWinProbability().tiePercentage();
                TextView textView4 = viewHolder2.txt_home_per;
                textView4.setText(homeTeamPercentage2 + " %");
                viewHolder2.txt_home.setText(this.featurematchList.get(i).teamsWinProbability().homeTeamShortName());
                viewHolder2.txt_home_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
                viewHolder2.txt_home.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
                TextView textView5 = viewHolder2.txt_tie_per;
                textView5.setText(tiePercentage2 + " %");
                if (tiePercentage2.equals("")) {
                    viewHolder2.txt_tie_per.setVisibility(View.GONE);
                    viewHolder2.txt_tie.setVisibility(View.GONE);
                }
                TextView textView6 = viewHolder2.txt_away_per;
                textView6.setText(awayTeamPercentage2 + " %");
                viewHolder2.txt_away.setText(this.featurematchList.get(i).teamsWinProbability().awayTeamShortName());
                viewHolder2.txt_away_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
                viewHolder2.txt_away.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
                initDataToSeekbar(Integer.parseInt(Glob.getInt(homeTeamPercentage2)), Integer.parseInt(Glob.getInt(awayTeamPercentage2)), Integer.parseInt(Glob.getInt(tiePercentage2)), viewHolder2);
            }
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
                    AdapterCriclyticsMatch.this.onItemClickListener.onClickBanner();
                }
            });
            Server server = new Server((Activity) this.context);
            if (!Glob.isOnline(this.context)) {
                viewHolder1.item_rl_ad.setVisibility(View.GONE);
            } else if (this.matchStatus.equalsIgnoreCase("upcoming")) {
                server.nativeSmallAd(viewHolder1.item_rl_ad);
            } else {
                viewHolder1.ad_banner.setMinimumHeight(650);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(25, 25, 25, 25);
                viewHolder1.itemView.setLayoutParams(layoutParams);
                server.nativeLargeAd(viewHolder1.item_rl_ad);
            }
        }
    }

    public void team(ViewHolder viewHolder, int i) {
        AdapterFeatureTeam adapterFeatureTeam = new AdapterFeatureTeam(this.context, this.featurematchList.get(i).matchScore());
        viewHolder.rv_feature_team.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
        viewHolder.rv_feature_team.setAdapter(adapterFeatureTeam);
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
        CustomProgressBar customProgressBar;
        ImageView img_item_a_flag;
        ImageView img_item_h_flag;
        ImageView img_live;
        ImageView img_playerOfTheMatchImage;
        LinearLayout ll_prediction;
        LinearLayout ll_score;
        LinearLayout ll_score_;
        RelativeLayout rl_player_of_the_match;
        RecyclerView rv_feature_team;
        TextView txt_away;
        TextView txt_away_per;
        TextView txt_home;
        TextView txt_home_per;
        TextView txt_item_a_team;
        TextView txt_item_date;
        TextView txt_item_fm_matchNo;
        TextView txt_item_fm_matchStatus;
        TextView txt_item_fm_seriesName;
        TextView txt_item_h_team;
        TextView txt_item_time;
        TextView txt_playerOfTheMatchName;
        TextView txt_tie;
        TextView txt_tie_per;

        public ViewHolder(View view) {
            super(view);
            this.ll_score = (LinearLayout) view.findViewById(R.id.ll_score);
            this.txt_item_fm_matchNo = (TextView) view.findViewById(R.id.txt_item_fm_matchNo);
            this.txt_item_fm_seriesName = (TextView) view.findViewById(R.id.txt_item_fm_seriesName);
            this.img_live = (ImageView) view.findViewById(R.id.img_live);
            this.txt_item_fm_matchStatus = (TextView) view.findViewById(R.id.txt_item_fm_matchStatus);
            this.rv_feature_team = (RecyclerView) view.findViewById(R.id.rv_feature_team);
            this.click = (FrameLayout) view.findViewById(R.id.click);
            this.ll_score_ = (LinearLayout) view.findViewById(R.id.ll_score_);
            this.txt_item_h_team = (TextView) view.findViewById(R.id.txt_item_h_team);
            this.txt_item_a_team = (TextView) view.findViewById(R.id.txt_item_a_team);
            this.txt_item_date = (TextView) view.findViewById(R.id.txt_item_date);
            this.txt_item_time = (TextView) view.findViewById(R.id.txt_item_time);
            this.img_item_a_flag = (ImageView) view.findViewById(R.id.img_item_a_flag);
            this.img_item_h_flag = (ImageView) view.findViewById(R.id.img_item_h_flag);
            this.rl_player_of_the_match = (RelativeLayout) view.findViewById(R.id.rl_player_of_the_match);
            this.img_playerOfTheMatchImage = (ImageView) view.findViewById(R.id.img_playerOfTheMatchImage);
            this.txt_playerOfTheMatchName = (TextView) view.findViewById(R.id.txt_playerOfTheMatchName);
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
