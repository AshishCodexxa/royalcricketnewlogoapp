package com.cricketscoreprediction.app.Adapter.MatchInfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import com.cricketscoreprediction.app.GetScoreCardQuery;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.ArrayList;
import java.util.List;

public class AdapterScoreCard extends RecyclerView.Adapter<AdapterScoreCard.ViewHolder> {
    Context context;
    List<GetScoreCardQuery.FullScoreCard> fullScoreCards;
    private int selectedItem;

    public AdapterScoreCard(Context context2, List<GetScoreCardQuery.FullScoreCard> list) {
        this.context = context2;
        this.fullScoreCards = list;
        this.selectedItem = list.size() - 1;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_scorecard, viewGroup, false));
    }

    public void onBindViewHolder(final ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        String str;
        ((RequestBuilder) Glide.with(this.context).load(Glob.flag_start + this.fullScoreCards.get(i).battingTeamID() + Glob.flag_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_item_sc_flag);
        String runsScored = this.fullScoreCards.get(i).total().runsScored();
        String wickets = this.fullScoreCards.get(i).total().wickets();
        String overs = this.fullScoreCards.get(i).total().overs();
        String runRate = this.fullScoreCards.get(i).total().runRate();
        String format = String.format("%s%s%s %s%s%s", runsScored, "/", wickets, "(", overs, ")");
        String format2 = String.format("%s%s%s", runsScored, "/", wickets);
        String format3 = String.format("%s%s %s %s%s", "(", overs, "overs, RR:", runRate, ")");
        if (overs.length() != 0) {
            viewHolder.txt_item_sc_teamScore.setText(format);
            viewHolder.txt_sc_totalRun.setText(format2);
            viewHolder.txt_sc_totalOver.setText(format3);
        }
        viewHolder.txt_item_sc_team.setText(this.fullScoreCards.get(i).battingTeamShortName());
        viewHolder.txt_sc_eRun.setText(this.fullScoreCards.get(i).extras().totalExtras());
        viewHolder.txt_sc_extra.setText("( b " + this.fullScoreCards.get(i).extras().byes() + ", lb " + this.fullScoreCards.get(i).extras().legByes() + ", nb " + this.fullScoreCards.get(i).extras().noBalls() + ", wd " + this.fullScoreCards.get(i).extras().wides() + " )");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            str = "";
            if (i2 >= this.fullScoreCards.get(i).batting().size()) {
                break;
            }
            if (this.fullScoreCards.get(i).batting().get(i2).playerHowOut().equals(str)) {
                arrayList2.add(this.fullScoreCards.get(i).batting().get(i2));
            } else {
                arrayList.add(this.fullScoreCards.get(i).batting().get(i2));
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            str = str + ((GetScoreCardQuery.Batting) arrayList2.get(i3)).playerName() + ", ";
        }
        viewHolder.txt_yetToBat.setText(str);
        AdapterBatter adapterBatter = new AdapterBatter(this.context, arrayList);
        viewHolder.rv_batter.setLayoutManager(new LinearLayoutManager(this.context.getApplicationContext(), 1, false));
        viewHolder.rv_batter.setAdapter(adapterBatter);
        AdapterBowler adapterBowler = new AdapterBowler(this.context, this.fullScoreCards.get(i).bowling());
        viewHolder.rv_bowler.setLayoutManager(new LinearLayoutManager(this.context.getApplicationContext(), 1, false));
        viewHolder.rv_bowler.setAdapter(adapterBowler);
        AdapterFallOfWicket adapterFallOfWicket = new AdapterFallOfWicket(this.context, this.fullScoreCards.get(i).fow());
        viewHolder.rv_fall_of_wickets.setLayoutManager(new LinearLayoutManager(this.context.getApplicationContext(), 1, false));
        viewHolder.rv_fall_of_wickets.setAdapter(adapterFallOfWicket);
        if (this.selectedItem == i) {
            viewHolder.ll_score_detail.setVisibility(View.VISIBLE);;
            viewHolder.ll_scoreCard.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.back_top_toolbar, this.context.getTheme()));
            viewHolder.img_item_sc_arrow.setImageDrawable(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.ic_arrow_up, this.context.getTheme()));
            viewHolder.txt_item_sc_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_item_sc_teamScore.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.img_item_sc_arrow.setImageTintList(ResourcesCompat.getColorStateList(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
        } else {
            viewHolder.ll_score_detail.setVisibility(View.GONE);
            viewHolder.ll_scoreCard.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.transperent_5, this.context.getTheme()));
            viewHolder.img_item_sc_arrow.setImageDrawable(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.ic_arrow_down, this.context.getTheme()));
            viewHolder.txt_item_sc_team.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.txt_item_sc_teamScore.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
            viewHolder.img_item_sc_arrow.setImageTintList(ResourcesCompat.getColorStateList(this.context.getResources(), R.color.colorTextBlack, this.context.getTheme()));
        }
        viewHolder.ll_scoreCard.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                if (AdapterScoreCard.this.selectedItem == i) {
                    Log.d("scoredata", "onClick: "+i);
                    viewHolder.ll_score_detail.setVisibility(View.GONE);
                    viewHolder.ll_scoreCard.setBackgroundColor(ResourcesCompat.getColor(AdapterScoreCard.this.context.getResources(), R.color.transperent_5, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.img_item_sc_arrow.setImageDrawable(ResourcesCompat.getDrawable(AdapterScoreCard.this.context.getResources(), R.drawable.ic_arrow_down, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.txt_item_sc_team.setTextColor(ResourcesCompat.getColor(AdapterScoreCard.this.context.getResources(), R.color.colorTextBlack, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.txt_item_sc_teamScore.setTextColor(ResourcesCompat.getColor(AdapterScoreCard.this.context.getResources(), R.color.colorTextBlack, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.img_item_sc_arrow.setImageTintList(ResourcesCompat.getColorStateList(AdapterScoreCard.this.context.getResources(), R.color.colorTextBlack, AdapterScoreCard.this.context.getTheme()));
                    AdapterScoreCard.this.selectedItem = -1;
                    return;
                }
                else
                {
                    viewHolder.ll_score_detail.setVisibility(View.VISIBLE);;
                    viewHolder.ll_scoreCard.setBackground(ResourcesCompat.getDrawable(AdapterScoreCard.this.context.getResources(), R.drawable.back_top_toolbar, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.img_item_sc_arrow.setImageDrawable(ResourcesCompat.getDrawable(AdapterScoreCard.this.context.getResources(), R.drawable.ic_arrow_up, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.txt_item_sc_team.setTextColor(ResourcesCompat.getColor(AdapterScoreCard.this.context.getResources(), R.color.textWhite, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.txt_item_sc_teamScore.setTextColor(ResourcesCompat.getColor(AdapterScoreCard.this.context.getResources(), R.color.textWhite, AdapterScoreCard.this.context.getTheme()));
                    viewHolder.img_item_sc_arrow.setImageTintList(ResourcesCompat.getColorStateList(AdapterScoreCard.this.context.getResources(), R.color.textWhite, AdapterScoreCard.this.context.getTheme()));
                    AdapterScoreCard.this.selectedItem = i;
                }
                int i = AdapterScoreCard.this.selectedItem;
                AdapterScoreCard.this.selectedItem = i;
                AdapterScoreCard.this.notifyItemChanged(i);
            }
        });
    }

    @Override 
    public int getItemCount() {
        return this.fullScoreCards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_item_sc_arrow;
        ImageView img_item_sc_flag;
        LinearLayout ll_scoreCard;
        LinearLayout ll_score_detail;
        RecyclerView rv_batter;
        RecyclerView rv_bowler;
        RecyclerView rv_fall_of_wickets;
        TextView txt_item_sc_team;
        TextView txt_item_sc_teamScore;
        TextView txt_sc_eRun;
        TextView txt_sc_extra;
        TextView txt_sc_totalOver;
        TextView txt_sc_totalRun;
        TextView txt_yetToBat;

        public ViewHolder(View view) {
            super(view);
            this.ll_scoreCard = (LinearLayout) view.findViewById(R.id.ll_scoreCard);
            this.img_item_sc_flag = (ImageView) view.findViewById(R.id.img_item_sc_flag);
            this.txt_item_sc_team = (TextView) view.findViewById(R.id.txt_item_sc_team);
            this.txt_item_sc_teamScore = (TextView) view.findViewById(R.id.txt_item_sc_teamScore);
            this.img_item_sc_arrow = (ImageView) view.findViewById(R.id.img_item_sc_arrow);
            this.ll_score_detail = (LinearLayout) view.findViewById(R.id.ll_score_detail);
            this.rv_batter = (RecyclerView) view.findViewById(R.id.rv_batter);
            this.txt_sc_eRun = (TextView) view.findViewById(R.id.txt_sc_eRun);
            this.txt_sc_extra = (TextView) view.findViewById(R.id.txt_sc_extra);
            this.txt_sc_totalRun = (TextView) view.findViewById(R.id.txt_sc_totalRun);
            this.txt_sc_totalOver = (TextView) view.findViewById(R.id.txt_sc_totalOver);
            this.rv_bowler = (RecyclerView) view.findViewById(R.id.rv_bowler);
            this.rv_fall_of_wickets = (RecyclerView) view.findViewById(R.id.rv_fall_of_wickets);
            this.txt_yetToBat = (TextView) view.findViewById(R.id.txt_yetToBat);
        }
    }
}
