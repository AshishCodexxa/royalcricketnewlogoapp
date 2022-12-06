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
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.cricketscoreprediction.app.Ads.Server;

import com.cricketscoreprediction.app.Models.ModelTeam;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class AdapterFantasyTeams extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<ModelTeam> teamList;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterFantasyTeams(Context context2, List<ModelTeam> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.teamList = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_fantasy_teams, viewGroup, false));
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
            if (this.teamList.get(i).getFantasy_teamName().equals("Best Fantasy XI")) {
                viewHolder2.txt_team_no.setText(this.teamList.get(i).getFantasy_teamName());
                viewHolder2.ll_team.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_fantasy_team_yellow, this.context.getTheme()));
            } else {
                viewHolder2.txt_team_no.setText(this.teamList.get(i).getFantasy_teamName());
            }
            viewHolder2.txt_point.setText(this.teamList.get(i).getTeamtotalpoints());
            viewHolder2.txt_point.setTypeface(Glob.oswald_medium);
            AdapterFantasyPlayer adapterFantasyPlayer = new AdapterFantasyPlayer(this.context, this.teamList.get(i).getArrayListPlayer(), new AdapterFantasyPlayer.OnItemClickListener() {


                @Override
                public void onItemClick() {
                    AdapterFantasyTeams.this.onItemClickListener.onItemClick(AdapterFantasyTeams.this.teamList.get(i).getFantasy_teamName());
                }
            });
            viewHolder2.rv_fantasy_team.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false));
            viewHolder2.rv_fantasy_team.setAdapter(adapterFantasyPlayer);
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
                    AdapterFantasyTeams.this.onItemClickListener.onClickBanner();
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
        return this.teamList.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.teamList.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_team;
        RecyclerView rv_fantasy_team;
        TextView txt_point;
        TextView txt_team_no;

        public ViewHolder(View view) {
            super(view);
            this.txt_point = (TextView) view.findViewById(R.id.txt_point);
            this.txt_team_no = (TextView) view.findViewById(R.id.txt_team_no);
            this.ll_team = (LinearLayout) view.findViewById(R.id.ll_team);
            this.rv_fantasy_team = (RecyclerView) view.findViewById(R.id.rv_fantasy_team);
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
