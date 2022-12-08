package com.cricketlivescore.predictiontips.Adapter.Criclytics;

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
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.cricketlivescore.predictiontips.Ads.Server;

import com.cricketlivescore.predictiontips.MatchRatingsQuery;
import com.cricketlivescore.predictiontips.R;
import com.cricketlivescore.predictiontips.Utils.AppPreference;
import com.cricketlivescore.predictiontips.Utils.Glob;
import java.util.List;

public class AdapterReportCard extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<MatchRatingsQuery.FinalArray> reportCardList;
    private int selectedItem;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public void AdapterReportCard(Context context2, List<MatchRatingsQuery.FinalArray> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.reportCardList = list;
        this.onItemClickListener = onItemClickListener2;
        this.selectedItem = 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_report_card, viewGroup, false));
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
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.reportCardList.get(i).playerID() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder2.img_playerImage);
            RequestManager with2 = Glide.with(this.context);
            ((RequestBuilder) with2.load(Glob.teams_start + this.reportCardList.get(i).playerTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_flag);
            viewHolder2.txt_team.setTypeface(Glob.montserrat_medium);
            viewHolder2.txt_playerName.setTypeface(Glob.boldralway);
            viewHolder2.txt_team.setText(this.reportCardList.get(i).playerTeamName());
            viewHolder2.txt_playerName.setText(this.reportCardList.get(i).playerName());
            viewHolder2.txt_player_rate.setText(String.format("%s%s", this.reportCardList.get(i).totalPoints(), "/10"));
            viewHolder2.txt_player_bat_rate.setText(this.reportCardList.get(i).battingPoints());
            viewHolder2.txt_player_bowl_rate.setText(this.reportCardList.get(i).bowlingPoints());
            if (this.selectedItem == i) {
                viewHolder2.ll_rating.setVisibility(View.VISIBLE);;
                viewHolder2.ll_report_card.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.transperent_5, this.context.getTheme()));
            } else {
                viewHolder2.ll_rating.setVisibility(View.GONE);
                viewHolder2.ll_report_card.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            }
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    if (AdapterReportCard.this.selectedItem == i) {
                        AdapterReportCard.this.onItemClickListener.onItemClick(AdapterReportCard.this.reportCardList.get(i).playerID());
                        int i = AdapterReportCard.this.selectedItem;
                        AdapterReportCard.this.selectedItem = i;
                        AdapterReportCard.this.notifyItemChanged(i);
                        AdapterReportCard.this.notifyItemChanged(i);
                        return;
                    }
                    int i2 = AdapterReportCard.this.selectedItem;
                    AdapterReportCard.this.selectedItem = i;
                    AdapterReportCard.this.notifyItemChanged(i2);
                    AdapterReportCard.this.notifyItemChanged(i);
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
                    AdapterReportCard.this.onItemClickListener.onClickBanner();
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
        return this.reportCardList.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.reportCardList.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_flag;
        ImageView img_playerImage;
        LinearLayout ll_rating;
        LinearLayout ll_report_card;
        TextView txt_playerName;
        TextView txt_player_bat_rate;
        TextView txt_player_bowl_rate;
        TextView txt_player_rate;
        TextView txt_team;

        public ViewHolder(View view) {
            super(view);
            this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
            this.img_flag = (ImageView) view.findViewById(R.id.img_flag);
            this.txt_team = (TextView) view.findViewById(R.id.txt_team);
            this.txt_playerName = (TextView) view.findViewById(R.id.txt_playerName);
            this.txt_player_rate = (TextView) view.findViewById(R.id.txt_player_rate);
            this.txt_player_bat_rate = (TextView) view.findViewById(R.id.txt_player_bat_rate);
            this.txt_player_bowl_rate = (TextView) view.findViewById(R.id.txt_player_bowl_rate);
            this.ll_rating = (LinearLayout) view.findViewById(R.id.ll_rating);
            this.ll_report_card = (LinearLayout) view.findViewById(R.id.ll_report_card);
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
