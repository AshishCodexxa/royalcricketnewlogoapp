package com.cricketscoreprediction.app.Adapter.Ipl;

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
import com.bumptech.glide.RequestManager;
import com.cricketscoreprediction.app.Ads.Server;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.SquadsQuery;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterIplTeamSquad extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    private int selectedItem = -1;
    List<SquadsQuery.Squad> squadList;

    public interface OnItemClickListener {
        void onClickBanner();

        void onClickItem();
    }

    public AdapterIplTeamSquad(Context context, List<SquadsQuery.Squad> list, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.squadList = list;
        this.onItemClickListener = onItemClickListener;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_squad, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new ViewHolder1(LayoutInflater.from(this.context).inflate(R.layout.item_ad, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            RequestManager with = Glide.with(this.context);
            with.load(Glob.flag_start + this.squadList.get(i).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag).into(viewHolder2.img_team_flag);
            viewHolder2.txt_team_name.setText(this.squadList.get(i).name());
            viewHolder2.rv_team.setLayoutManager(new LinearLayoutManager(this.context));
            viewHolder2.rv_team.setAdapter(new AdapterIplSquad(this.context, this.squadList.get(i).playerData()));
            if (this.selectedItem == i) {
                viewHolder2.rl_team.setVisibility(View.VISIBLE);
                viewHolder2.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder2.ll_team.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.primaryRed, this.context.getTheme()));
                viewHolder2.img_arrow.setImageDrawable(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.ic_arrow_up, this.context.getTheme()));
                viewHolder2.img_arrow.setImageTintList(ResourcesCompat.getColorStateList(this.context.getResources(), R.color.white, this.context.getTheme()));
            } else {
                viewHolder2.rl_team.setVisibility(View.GONE);
                viewHolder2.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder2.ll_team.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder2.img_arrow.setImageDrawable(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.ic_arrow_down, this.context.getTheme()));
                viewHolder2.img_arrow.setImageTintList(ResourcesCompat.getColorStateList(this.context.getResources(), R.color.transperent_30, this.context.getTheme()));
            }
            viewHolder2.ll_team.setOnClickListener(new View.OnClickListener() { 
                @Override 
                public void onClick(View view) {
                    int i2 = AdapterIplTeamSquad.this.selectedItem;
                    AdapterIplTeamSquad.this.selectedItem = i;
                    if (i2 == AdapterIplTeamSquad.this.selectedItem) {
                        viewHolder2.rl_team.setVisibility(View.GONE);
                        viewHolder2.txt_team_name.setTextColor(ResourcesCompat.getColor(AdapterIplTeamSquad.this.context.getResources(), R.color.colorTextBlack, AdapterIplTeamSquad.this.context.getTheme()));
                        viewHolder2.ll_team.setBackgroundColor(ResourcesCompat.getColor(AdapterIplTeamSquad.this.context.getResources(), R.color.white, AdapterIplTeamSquad.this.context.getTheme()));
                        viewHolder2.img_arrow.setImageDrawable(ResourcesCompat.getDrawable(AdapterIplTeamSquad.this.context.getResources(), R.drawable.ic_arrow_down, AdapterIplTeamSquad.this.context.getTheme()));
                        viewHolder2.img_arrow.setImageTintList(ResourcesCompat.getColorStateList(AdapterIplTeamSquad.this.context.getResources(), R.color.transperent_30, AdapterIplTeamSquad.this.context.getTheme()));
                        AdapterIplTeamSquad.this.selectedItem = -1;
                        return;
                    }
                    AdapterIplTeamSquad.this.onItemClickListener.onClickItem();
                    AdapterIplTeamSquad.this.notifyItemChanged(i2);
                    AdapterIplTeamSquad.this.notifyItemChanged(i);
                }
            });
        } else if (itemViewType == 1) {
            ViewHolder1 viewHolder1 = (ViewHolder1) viewHolder;
            AppPreference appPreference = new AppPreference(this.context);
            String banner = Glob.getBanner(appPreference.getJsonArray("img_banner_ad"));
            String string = appPreference.getString("img_banner_ad_icon");
            if (banner != null && !banner.matches("")) {
                Glide.with(this.context).load(banner).into(viewHolder1.ad_banner);
                if (string != null && !string.matches("")) {
                    Glide.with(this.context).load(string).into(viewHolder1.ad_icon);
                }
            }
            viewHolder1.ad_banner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AdapterIplTeamSquad.this.onItemClickListener.onClickBanner();
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
    public int getItemViewType(int i) {
        return this.squadList.get(i) == null ? 1 : 0;
    }

    @Override
    public int getItemCount() {
        return this.squadList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_arrow;
        ImageView img_team_flag;
        LinearLayout ll_team;
        RelativeLayout rl_team;
        RecyclerView rv_team;
        TextView txt_team_name;

        public ViewHolder(View view) {
            super(view);
            this.img_team_flag = (ImageView) view.findViewById(R.id.img_team_flag);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.ll_team = (LinearLayout) view.findViewById(R.id.ll_team);
            this.rl_team = (RelativeLayout) view.findViewById(R.id.rl_team);
            this.img_arrow = (ImageView) view.findViewById(R.id.img_arrow);
            this.rv_team = (RecyclerView) view.findViewById(R.id.rv_team);
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