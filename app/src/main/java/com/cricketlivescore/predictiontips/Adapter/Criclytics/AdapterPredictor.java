package com.cricketlivescore.predictiontips.Adapter.Criclytics;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Models.ModelProbability;
import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;

public class AdapterPredictor extends RecyclerView.Adapter<AdapterPredictor.ViewHolder> {
    ArrayList<ModelProbability> arrayList;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClickBanner();

        void onItemClick(String str);
    }

    public AdapterPredictor(Context context2, ArrayList<ModelProbability> arrayList2, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.arrayList = arrayList2;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_predictor, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_team.setText(this.arrayList.get(i).getTeamName());
        TextView textView = viewHolder.txt_team_per;
        textView.setText(this.arrayList.get(i).getProbability().toString().replace(".0", "") + "%");
        viewHolder.progressBar.setProgress(Integer.parseInt(this.arrayList.get(i).getProbability().toString().replace(".0", "")));
        int parseColor = Color.parseColor(this.arrayList.get(i).getTeamColor());
        viewHolder.txt_team_per.setTextColor(parseColor);
        viewHolder.progressBar.setProgressTintList(ColorStateList.valueOf(parseColor));
        viewHolder.card.setCardBackgroundColor(parseColor);
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        ProgressBar progressBar;
        TextView txt_team;
        TextView txt_team_per;

        public ViewHolder(View view) {
            super(view);
            this.txt_team = (TextView) view.findViewById(R.id.txt_team);
            this.txt_team_per = (TextView) view.findViewById(R.id.txt_team_per);
            this.progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
            this.card = (CardView) view.findViewById(R.id.card);
        }
    }
}
