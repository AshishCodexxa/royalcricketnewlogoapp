package com.cricketscoreprediction.app.Adapter.Criclytics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketscoreprediction.app.CustomProgressBar;
import com.cricketscoreprediction.app.GameChangingOversQuery;
import com.cricketscoreprediction.app.Models.ProgressItem;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.ArrayList;
import java.util.List;

public class AdapterGameChange extends RecyclerView.Adapter<AdapterGameChange.ViewHolder> {
    List<GameChangingOversQuery.Over> arrayList;
    Context context;
    private ProgressItem mProgressItem;
    private ArrayList<ProgressItem> progressItemList;
    private int selectedItem = 0;

    public AdapterGameChange(Context context2, List<GameChangingOversQuery.Over> list) {
        this.context = context2;
        this.arrayList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_change, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.txt_score.setText(String.format("%s %s", this.arrayList.get(position).teamShortName(), this.arrayList.get(position).score()));
        viewHolder.txt_over.setText(this.arrayList.get(position).overNo());
        ArrayList arrayList2 = new ArrayList();
        for (int size = this.arrayList.get(position).commentary().size() - 1; size >= 0; size--) {
            arrayList2.add(this.arrayList.get(position).commentary().get(size));
        }
        viewHolder.rv_over.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false));
        viewHolder.rv_over.setAdapter(new AdapterGCOver(this.context, arrayList2));
        viewHolder.txt_home.setText(this.arrayList.get(position).lastBallPredictionData().get(0).homeTeamShortName());
        viewHolder.txt_tie.setText("TIE");
        viewHolder.txt_away.setText(this.arrayList.get(position).lastBallPredictionData().get(0).awayTeamShortName());
        viewHolder.customProgressBar.getThumb().mutate().setAlpha(0);
        this.progressItemList = new ArrayList<>();
        ProgressItem progressItem = new ProgressItem();
        this.mProgressItem = progressItem;
        progressItem.progressItemPercentage = 100.0f;
        this.mProgressItem.color = R.color.gray_ad_border;
        this.progressItemList.add(this.mProgressItem);
        viewHolder.customProgressBar.initData(this.progressItemList);
        viewHolder.customProgressBar.invalidate();
        String homeTeamPercent = this.arrayList.get(position).lastBallPredictionData().get(this.arrayList.get(position).lastBallPredictionData().size() - 1).homeTeamPercent();
        String awayTeamPercent = this.arrayList.get(position).lastBallPredictionData().get(this.arrayList.get(position).lastBallPredictionData().size() - 1).awayTeamPercent();
        String tiePercent = this.arrayList.get(position).lastBallPredictionData().get(this.arrayList.get(position).lastBallPredictionData().size() - 1).tiePercent();
        viewHolder.txt_home_per.setText(homeTeamPercent + " %");
        viewHolder.txt_home_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.green, this.context.getTheme()));
        viewHolder.txt_tie_per.setText(tiePercent + " %");
        viewHolder.txt_away_per.setText(awayTeamPercent + " %");
        viewHolder.txt_away_per.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.redLight, this.context.getTheme()));
        initDataToSeekbar(Integer.parseInt(Glob.getInt(homeTeamPercent)), Integer.parseInt(Glob.getInt(awayTeamPercent)), Integer.parseInt(Glob.getInt(tiePercent)), viewHolder);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
            }
        });
    }


    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CustomProgressBar customProgressBar;
        RecyclerView rv_over;
        TextView txt_away;
        TextView txt_away_per;
        TextView txt_home;
        TextView txt_home_per;
        TextView txt_over;
        TextView txt_score;
        TextView txt_tie;
        TextView txt_tie_per;

        public ViewHolder(View view) {
            super(view);
            this.txt_over = (TextView) view.findViewById(R.id.txt_over);
            this.txt_score = (TextView) view.findViewById(R.id.txt_score);
            this.rv_over = (RecyclerView) view.findViewById(R.id.rv_over);
            this.customProgressBar = (CustomProgressBar) view.findViewById(R.id.customProgressBar);
            this.txt_home = (TextView) view.findViewById(R.id.txt_home);
            this.txt_tie = (TextView) view.findViewById(R.id.txt_tie);
            this.txt_away = (TextView) view.findViewById(R.id.txt_away);
            this.txt_home_per = (TextView) view.findViewById(R.id.txt_home_per);
            this.txt_tie_per = (TextView) view.findViewById(R.id.txt_tie_per);
            this.txt_away_per = (TextView) view.findViewById(R.id.txt_away_per);
        }
    }

    private void initDataToSeekbar(int i, int i2, int i3, ViewHolder viewHolder) {
        this.progressItemList = new ArrayList<>();
        ProgressItem progressItem = new ProgressItem();
        this.mProgressItem = progressItem;
        progressItem.progressItemPercentage = (float) i;
        this.mProgressItem.color = R.color.green;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem2 = new ProgressItem();
        this.mProgressItem = progressItem2;
        progressItem2.progressItemPercentage = (float) i3;
        this.mProgressItem.color = R.color.gray_ad_border;
        this.progressItemList.add(this.mProgressItem);
        ProgressItem progressItem3 = new ProgressItem();
        this.mProgressItem = progressItem3;
        progressItem3.progressItemPercentage = (float) i2;
        this.mProgressItem.color = R.color.redLight;
        this.progressItemList.add(this.mProgressItem);
        viewHolder.customProgressBar.initData(this.progressItemList);
        viewHolder.customProgressBar.invalidate();
    }
}
