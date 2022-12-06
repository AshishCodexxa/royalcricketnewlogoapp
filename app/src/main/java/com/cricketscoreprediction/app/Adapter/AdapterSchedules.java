package com.cricketscoreprediction.app.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cricketscoreprediction.app.Ads.Server;

import com.cricketscoreprediction.app.NewScheduleQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.AppPreference;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterSchedules extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    private List<NewScheduleQuery.NewSchedule> newSchedules;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2, String str3);
    }

    public AdapterSchedules(Context context2, List<NewScheduleQuery.NewSchedule> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.newSchedules = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_home_series, viewGroup, false));
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
            viewHolder2.txt_seriesName.setText(this.newSchedules.get(i).seriesName());
            viewHolder2.rv_matches.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false));
            viewHolder2.rv_matches.setAdapter(new AdapterScheduleMatches(this.context, this.newSchedules.get(i).matches(), new AdapterScheduleMatches.OnItemClickListener() {
               

                @Override 
                public void onItemClick(String str, String str2, String str3) {
                    AdapterSchedules.this.onItemClickListener.onItemClick(str, str2, str3);
                }
            }));
        } else if (itemViewType == 1) {
            ViewHolder1 viewHolder1 = (ViewHolder1) viewHolder;
            AppPreference appPreference = new AppPreference(this.context);
//            String banner = Glob.getBanner(appPreference.getJsonArray("img_banner_ad_large"));
            String string = appPreference.getString("img_banner_ad_icon");
//            if (banner != null && !banner.matches("")) {
//                Glide.with(this.context).load(banner).into(viewHolder1.ad_banner);
//                if (string != null && !string.matches("")) {
//                    Glide.with(this.context).load(string).into(viewHolder1.ad_icon);
//                }
//            }
            viewHolder1.ad_banner.setOnClickListener(new View.OnClickListener() {
               

                public void onClick(View view) {
                    AdapterSchedules.this.onItemClickListener.onClickBanner();
                }
            });
            Server server = new Server((Activity) this.context);
            if (Glob.isOnline(this.context)) {
//                server.nativeLargeAd(viewHolder1.item_rl_ad);
            } else {
                viewHolder1.item_rl_ad.setVisibility(View.GONE);
            }
        }
    }

    @Override 
    public int getItemCount() {
        return this.newSchedules.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.newSchedules.get(i) == null ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rv_matches;
        TextView txt_seriesName;

        public ViewHolder(View view) {
            super(view);
            this.txt_seriesName = (TextView) view.findViewById(R.id.txt_seriesName);
            this.rv_matches = (RecyclerView) view.findViewById(R.id.rv_matches);
        }
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {
        ImageView ad_banner;
        ImageView ad_icon;
        CardView card_view;
        RelativeLayout item_rl_ad;

        public ViewHolder1(View view) {
            super(view);
            this.card_view = (CardView) view.findViewById(R.id.card_view);
            this.item_rl_ad = (RelativeLayout) view.findViewById(R.id.item_rl_ad);
            this.ad_banner = (ImageView) view.findViewById(R.id.ad_banner);
            this.ad_icon = (ImageView) view.findViewById(R.id.ad_icon);
        }
    }
}
