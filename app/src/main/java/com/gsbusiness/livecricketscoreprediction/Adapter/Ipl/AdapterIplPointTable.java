package com.gsbusiness.livecricketscoreprediction.Adapter.Ipl;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetPointsTableQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class AdapterIplPointTable extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<GetPointsTableQuery.Team> getPointsTables;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onClickItem();
    }

    public AdapterIplPointTable(Context context2, List<GetPointsTableQuery.Team> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.getPointsTables = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_point_table, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new ViewHolder1(LayoutInflater.from(this.context).inflate(R.layout.item_ad, viewGroup, false));
    }

    @Override 
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) with.load(Glob.flag_start + this.getPointsTables.get(i).teamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder2.img_item_flag);
            viewHolder2.txt_team_name.setText(this.getPointsTables.get(i).teamShortName());
            viewHolder2.txt_match_played.setText(this.getPointsTables.get(i).all());
            viewHolder2.txt_match_won.setText(this.getPointsTables.get(i).wins());
            viewHolder2.txt_match_lost.setText(this.getPointsTables.get(i).lost());
            viewHolder2.txt_match_point.setText(this.getPointsTables.get(i).points());
            viewHolder2.txt_match_nrr.setText(this.getPointsTables.get(i).nrr());
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterIplPointTable.this.onItemClickListener.onClickItem();
                }
            });
            if (i == this.getPointsTables.size() - 1) {
                viewHolder2.view_line.setVisibility(View.GONE);
            }
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


                public void onClick(View view) {
                    AdapterIplPointTable.this.onItemClickListener.onClickBanner();
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
        return this.getPointsTables.get(i) == null ? 1 : 0;
    }

    @Override 
    public int getItemCount() {
        return this.getPointsTables.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_flag;
        TextView txt_match_lost;
        TextView txt_match_nrr;
        TextView txt_match_played;
        TextView txt_match_point;
        TextView txt_match_won;
        TextView txt_team_name;
        View view_line;

        public ViewHolder(View view) {
            super(view);
            this.img_item_flag = (ImageView) view.findViewById(R.id.img_item_flag);
            this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
            this.txt_match_played = (TextView) view.findViewById(R.id.txt_match_played);
            this.txt_match_won = (TextView) view.findViewById(R.id.txt_match_won);
            this.txt_match_lost = (TextView) view.findViewById(R.id.txt_match_lost);
            this.txt_match_point = (TextView) view.findViewById(R.id.txt_match_point);
            this.txt_match_nrr = (TextView) view.findViewById(R.id.txt_match_nrr);
            this.view_line = view.findViewById(R.id.view_line);
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
