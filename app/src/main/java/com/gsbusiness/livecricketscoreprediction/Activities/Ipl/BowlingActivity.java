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
import com.gsbusiness.livecricketscoreprediction.Adapter.Ipl.AdapterBestFigure;
import com.gsbusiness.livecricketscoreprediction.Adapter.Ipl.AdapterMostWickets;
import com.gsbusiness.livecricketscoreprediction.Ads.Server;

import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.R;
import com.gsbusiness.livecricketscoreprediction.Utils.AppPreference;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;
import java.util.List;

public class BowlingActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_bowling);
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
                BowlingActivity.this.onBackPressed();
            }
        });
        if (this.statsType.equals("mostWickets")) {
            findViewById(R.id.ll_most_wickets).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_most_wickets);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView.setAdapter(new AdapterMostWickets(this, Glob.bowlingStatsList.Most_Wickets(), new AdapterMostWickets.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestFigure")) {
            findViewById(R.id.ll_best_figure).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_best_figure);
            recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView2.setAdapter(new AdapterBestFigure(this, Glob.bowlingStatsList.Best_figures(), new AdapterBestFigure.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestAvg")) {
            findViewById(R.id.ll_best_avg).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.rv_best_avg);
            recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView3.setAdapter(new AdapterBestAvg(this, Glob.bowlingStatsList.Best_Bowling_Average(), new AdapterBestAvg.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestSR")) {
            findViewById(R.id.ll_best_sr).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_best_sr);
            recyclerView4.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView4.setAdapter(new AdapterBestSR(this, Glob.bowlingStatsList.Best_Bowling_Strike_Rate(), new AdapterBestSR.OnItemClickListener() {


                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("bestEco")) {
            findViewById(R.id.ll_best_eco).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.rv_best_eco);
            recyclerView5.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView5.setAdapter(new AdapterBestEco(this, Glob.bowlingStatsList.Best_Economy_Rates(), new AdapterBestEco.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
        if (this.statsType.equals("3Wicket")) {
            findViewById(R.id.ll_3_wicket).setVisibility(View.VISIBLE);;
            RecyclerView recyclerView6 = (RecyclerView) findViewById(R.id.rv_3_wicket);
            recyclerView6.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
            recyclerView6.setAdapter(new Adapter3Wicket(this, Glob.bowlingStatsList.Three_Wicket_Haul(), new Adapter3Wicket.OnItemClickListener() {

                @Override
                public void onItemClick(String str) {
                    Glob.goToPlayerDetail(BowlingActivity.this, str);
                }
            }));
        }
    }


    public static class AdapterBestAvg extends RecyclerView.Adapter<AdapterBestAvg.ViewHolder> {
        List<GetStatsResolverQuery.Best_Bowling_Average1> best_bowling_average;
        Context context;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterBestAvg(Context context2, List<GetStatsResolverQuery.Best_Bowling_Average1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.best_bowling_average = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowling_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.best_bowling_average.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.best_bowling_average.get(i).player_name());
            viewHolder.txt_team_name.setText(this.best_bowling_average.get(i).team_short_name());
            viewHolder.txt_one.setText(this.best_bowling_average.get(i).matches_played());
            viewHolder.txt_two.setText(this.best_bowling_average.get(i).wickets());
            viewHolder.txt_three.setText(this.best_bowling_average.get(i).best_bowling_average());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterBestAvg.this.onItemClickListener.onItemClick(AdapterBestAvg.this.best_bowling_average.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.best_bowling_average.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_three;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
                this.txt_three = (TextView) view.findViewById(R.id.txt_three);
            }
        }
    }

    public static class AdapterBestSR extends RecyclerView.Adapter<AdapterBestSR.ViewHolder> {
        List<GetStatsResolverQuery.Best_Bowling_Strike_Rate1> best_Strike_Rate;
        Context context;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterBestSR(Context context2, List<GetStatsResolverQuery.Best_Bowling_Strike_Rate1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.best_Strike_Rate = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowling_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorBackTopRed, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.best_Strike_Rate.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.best_Strike_Rate.get(i).player_name());
            viewHolder.txt_team_name.setText(this.best_Strike_Rate.get(i).team_short_name());
            viewHolder.txt_one.setText(this.best_Strike_Rate.get(i).matches_played());
            viewHolder.txt_two.setText(this.best_Strike_Rate.get(i).wickets());
            viewHolder.txt_three.setText(this.best_Strike_Rate.get(i).bowling_strike_rate());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterBestSR.this.onItemClickListener.onItemClick(AdapterBestSR.this.best_Strike_Rate.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.best_Strike_Rate.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_three;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
                this.txt_three = (TextView) view.findViewById(R.id.txt_three);
            }
        }
    }

    public static class AdapterBestEco extends RecyclerView.Adapter<AdapterBestEco.ViewHolder> {
        List<GetStatsResolverQuery.Best_Economy_Rate1> best_economy_rate;
        Context context;
        OnItemClickListener onItemClickListener;
        int selected = 0;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public AdapterBestEco(Context context2, List<GetStatsResolverQuery.Best_Economy_Rate1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.best_economy_rate = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowling_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmNormal, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmNormal, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.best_economy_rate.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.best_economy_rate.get(i).player_name());
            viewHolder.txt_team_name.setText(this.best_economy_rate.get(i).team_short_name());
            viewHolder.txt_one.setText(this.best_economy_rate.get(i).matches_played());
            viewHolder.txt_two.setText(this.best_economy_rate.get(i).wickets());
            viewHolder.txt_three.setText(this.best_economy_rate.get(i).economy());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    AdapterBestEco.this.onItemClickListener.onItemClick(AdapterBestEco.this.best_economy_rate.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.best_economy_rate.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_three;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
                this.txt_three = (TextView) view.findViewById(R.id.txt_three);
            }
        }
    }

    public static class Adapter3Wicket extends RecyclerView.Adapter<Adapter3Wicket.ViewHolder> {
        Context context;
        OnItemClickListener onItemClickListener;
        int selected = 0;
        List<GetStatsResolverQuery.Three_Wicket_Haul1> three_wicket_haul;

        public interface OnItemClickListener {
            void onItemClick(String str);
        }

        public Adapter3Wicket(Context context2, List<GetStatsResolverQuery.Three_Wicket_Haul1> list, OnItemClickListener onItemClickListener2) {
            this.context = context2;
            this.three_wicket_haul = list;
            this.onItemClickListener = onItemClickListener2;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bowling_stats, viewGroup, false));
        }

        public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
            if (this.selected == i) {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorYellow, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorYellow, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            } else {
                viewHolder.itemView.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
                viewHolder.txt_three.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorMainBackGround, this.context.getTheme()));
                viewHolder.txt_player_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_team_name.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textBlackLight, this.context.getTheme()));
                viewHolder.txt_one.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_two.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
                viewHolder.txt_three.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            }
            RequestManager with = Glide.with(this.context);
            ((RequestBuilder) ((RequestBuilder) with.load(Glob.player_start + this.three_wicket_haul.get(i).player_id() + Glob.player_end).placeholder((int) R.drawable.player_dummy)).error(R.drawable.player_dummy)).into(viewHolder.img_playerImage);
            viewHolder.txt_player_name.setText(this.three_wicket_haul.get(i).player_name());
            viewHolder.txt_team_name.setText(this.three_wicket_haul.get(i).team_short_name());
            viewHolder.txt_one.setText(this.three_wicket_haul.get(i).matches_played());
            viewHolder.txt_two.setText(this.three_wicket_haul.get(i).wickets());
            viewHolder.txt_three.setText(this.three_wicket_haul.get(i).three_wickets_haul());
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Adapter3Wicket.this.onItemClickListener.onItemClick(Adapter3Wicket.this.three_wicket_haul.get(i).player_id());
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.three_wicket_haul.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img_playerImage;
            TextView txt_one;
            TextView txt_player_name;
            TextView txt_team_name;
            TextView txt_three;
            TextView txt_two;

            public ViewHolder(View view) {
                super(view);
                this.img_playerImage = (ImageView) view.findViewById(R.id.img_playerImage);
                this.txt_player_name = (TextView) view.findViewById(R.id.txt_player_name);
                this.txt_team_name = (TextView) view.findViewById(R.id.txt_team_name);
                this.txt_one = (TextView) view.findViewById(R.id.txt_one);
                this.txt_two = (TextView) view.findViewById(R.id.txt_two);
                this.txt_three = (TextView) view.findViewById(R.id.txt_three);
            }
        }
    }
}
