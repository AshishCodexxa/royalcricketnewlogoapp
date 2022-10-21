package com.gsbusiness.livecricketscoreprediction.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.Models.Starts.AppListModel;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.ArrayList;

public class AppListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<AppListModel> appListData;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AppListAdapter(ArrayList<AppListModel> arrayList, Context context2, OnItemClickListener onItemClickListener2) {
        this.appListData = arrayList;
        this.context = context2;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.card_app_list, viewGroup, false));
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
            viewHolder2.txt_app_list_title.setText(this.appListData.get(i).getApp_name());
            ((RequestBuilder) Glide.with(this.context).load(this.appListData.get(i).getImg_logo_url()).placeholder((int) R.mipmap.ic_launcher)).into(viewHolder2.img_app_list_logo);
            String app_link = this.appListData.get(i).getApp_link();
            final String substring = app_link.substring(app_link.indexOf("=") + 1);
            viewHolder2.ll_main_app_list.setOnClickListener(new View.OnClickListener() {
              

                public void onClick(View view) {
                    AppListAdapter.this.onItemClickListener.onItemClick(substring.trim());
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
                    AppListAdapter.this.onItemClickListener.onClickBanner();
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
        return this.appListData.size();
    }

    @Override 
    public int getItemViewType(int i) {
        return this.appListData.get(i).isAd() ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_more_app_item;
        ImageView img_app_list_logo;
        LinearLayout ll_main_app_list;
        TextView txt_app_list_title;

        public ViewHolder(View view) {
            super(view);
            this.img_app_list_logo = (ImageView) view.findViewById(R.id.img_app_list_logo);
            this.txt_app_list_title = (TextView) view.findViewById(R.id.txt_app_list_title);
            this.ll_main_app_list = (LinearLayout) view.findViewById(R.id.ll_main_app_list);
            this.card_more_app_item = (CardView) view.findViewById(R.id.card_more_app_item);
        }
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {
        ImageView ad_banner;
        ImageView ad_icon;
        RelativeLayout item_rl_ad;

        public ViewHolder1(View view) {
            super(view);
            this.item_rl_ad = (RelativeLayout) view.findViewById(R.id.item_rl_ad);
            this.ad_icon = (ImageView) view.findViewById(R.id.ad_icon);
            this.ad_banner = (ImageView) view.findViewById(R.id.ad_banner);
        }
    }
}
