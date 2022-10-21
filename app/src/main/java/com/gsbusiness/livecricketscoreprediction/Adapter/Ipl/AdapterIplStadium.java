package com.gsbusiness.livecricketscoreprediction.Adapter.Ipl;

import android.annotation.SuppressLint;
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
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import com.gsbusiness.livecricketscoreprediction.VenuedetailsQuery;
import java.util.List;

public class AdapterIplStadium extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    List<VenuedetailsQuery.Venuedetail> venuedetails;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str, String str2);
    }

    public AdapterIplStadium(Context context2, List<VenuedetailsQuery.Venuedetail> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.venuedetails = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_stadium, viewGroup, false));
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
            viewHolder2.txt_name.setText(this.venuedetails.get(i).stadiumName());
            viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    AdapterIplStadium.this.onItemClickListener.onItemClick(AdapterIplStadium.this.venuedetails.get(i).venueId(), AdapterIplStadium.this.venuedetails.get(i).stadiumName());
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


                public void onClick(View view) {
                    AdapterIplStadium.this.onItemClickListener.onClickBanner();
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
        return this.venuedetails.get(i) == null ? 1 : 0;
    }

    @Override 
    public int getItemCount() {
        return this.venuedetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name;

        public ViewHolder(View view) {
            super(view);
            this.txt_name = (TextView) view.findViewById(R.id.txt_name);
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
