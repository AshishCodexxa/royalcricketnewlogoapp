package com.cricketlivescore.predictiontips.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.cricketlivescore.predictiontips.Models.ModelComOver;
import com.cricketlivescore.predictiontips.R;

import java.util.List;

public class AdapterOver extends RecyclerView.Adapter<AdapterOver.ViewHolder> {
    List<ModelComOver> arrayList;
    Context context;

    public AdapterOver(Context context2, List<ModelComOver> list) {
        this.context = context2;
        this.arrayList = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ball, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.arrayList.get(i).getType().equals("")) {
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).getRun());
        } else if (this.arrayList.get(i).getType().equals("four")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_four, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).getRun());
        } else if (this.arrayList.get(i).getType().equals("wide")) {
            viewHolder.txt_ball_result.setText("wd");
        } else if (this.arrayList.get(i).getType().equals("six")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_six, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).getRun());
        } else if (this.arrayList.get(i).getType().equals("wicket")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_wicket, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).getRun());
        }
        viewHolder.txt_ball.setText(this.arrayList.get(i).getOver());
    }

    @Override 
    public int getItemCount() {
        return this.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_over;
        TextView txt_ball;
        TextView txt_ball_result;

        public ViewHolder(View view) {
            super(view);
            this.txt_ball_result = (TextView) view.findViewById(R.id.txt_ball_result);
            this.txt_ball = (TextView) view.findViewById(R.id.txt_ball);
            this.ll_over = (LinearLayout) view.findViewById(R.id.ll_over);
        }
    }
}
