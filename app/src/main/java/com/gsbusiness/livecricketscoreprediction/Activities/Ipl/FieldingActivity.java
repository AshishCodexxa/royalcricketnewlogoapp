package com.gsbusiness.livecricketscoreprediction.Activities.Ipl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class FieldingActivity extends AppCompatActivity {
    String statsType = "";

    LinearLayout adContainerView;
    AdView adViewone;

    public void BannerIDCardAds() {
        adContainerView = findViewById(R.id.adsmultyViews);
        adViewone = new AdView(getApplicationContext());
        adViewone.setAdUnitId(getString(R.string.AdMob_Banner));
        adContainerView.addView(adViewone);
        BannerLoad();
        adViewone.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

            }
        });
    }

    private void BannerLoad() {
        AdRequest adRequest = new AdRequest.Builder().build();
        AdSize adSize = BannerGetSize();
        adViewone.setAdSize(adSize);
        adViewone.loadAd(adRequest);
    }

    private AdSize BannerGetSize() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fielding);
        BannerIDCardAds();
        this.statsType = getIntent().getStringExtra("statsType");
        if (!Glob.isNetworkAvailable(this)) {
            Glob.noInternetDialogShowActivity(this);
        }
        initView();
    }

    private void initView() {
        ((ImageView) findViewById(R.id.img_back)).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                FieldingActivity.this.onBackPressed();
            }
        });
        if (this.statsType.equals("mostCatch")) {
            findViewById(R.id.ll_most_catches).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_most_catches);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView.setAdapter(new AdapterMostCatches(this, Glob.fieldingStatsList.Most_Catches(), new AdapterMostCatches.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(FieldingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("mostRunOut")) {
            findViewById(R.id.ll_most_runout).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_most_runout);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView2.setAdapter(new AdapterMostRunOuts(this, Glob.fieldingStatsList.Most_Run_Outs(), new AdapterMostRunOuts.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(FieldingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("mostDismissals")) {
            findViewById(R.id.ll_most_dismissal).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rv_most_dismissal);
            recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView3.setAdapter(new AdapterMostDismissals(this, Glob.fieldingStatsList.Most_Dismissals(), new AdapterMostDismissals.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(FieldingActivity.this, str);
                }
            }));
        }
    }


    public static class AdapterMostCatches extends RecyclerView.Adapter<AdapterMostCatches.ViewHolder> {
        Context context;
        List<GetStatsResolverQuery.Most_Catch1> most_catch;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterMostCatches(Context context2, List<GetStatsResolverQuery.Most_Catch1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.most_catch = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fielding_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_catch.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.most_catch.get(i).player_name());
            viewHolder.txt_team_name.setText(this.most_catch.get(i).team_short_name());
            viewHolder.txt_one.setText(this.most_catch.get(i).matches_played());
            viewHolder.txt_two.setText(this.most_catch.get(i).most_catches());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterMostCatches.this.onItemClickListener.onItemClick(AdapterMostCatches.this.most_catch.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.most_catch.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
            }
        }
    }

    public static class AdapterMostRunOuts extends RecyclerView.Adapter<AdapterMostRunOuts.ViewHolder> {
        Context context;
        List<GetStatsResolverQuery.Most_Run_Out1> most_run_out;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterMostRunOuts(Context context2, List<GetStatsResolverQuery.Most_Run_Out1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.most_run_out = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fielding_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_run_out.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.most_run_out.get(i).player_name());
            viewHolder.txt_team_name.setText(this.most_run_out.get(i).team_short_name());
            viewHolder.txt_one.setText(this.most_run_out.get(i).matches_played());
            viewHolder.txt_two.setText(this.most_run_out.get(i).most_run_outs());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterMostRunOuts.this.onItemClickListener.onItemClick(AdapterMostRunOuts.this.most_run_out.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.most_run_out.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
            }
        }
    }

    public static class AdapterMostDismissals extends RecyclerView.Adapter<AdapterMostDismissals.ViewHolder> {
        Context context;
        List<GetStatsResolverQuery.Most_Dismissal1> most_dismissal;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterMostDismissals(Context context2, List<GetStatsResolverQuery.Most_Dismissal1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.most_dismissal = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fielding_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTop, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_two.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.most_dismissal.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.most_dismissal.get(i).player_name());
            viewHolder.txt_team_name.setText(this.most_dismissal.get(i).team_short_name());
            viewHolder.txt_one.setText(this.most_dismissal.get(i).matches_played());
            viewHolder.txt_two.setText(this.most_dismissal.get(i).most_dismissals());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterMostDismissals.this.onItemClickListener.onItemClick(AdapterMostDismissals.this.most_dismissal.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.most_dismissal.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
            }
        }
    }
}
