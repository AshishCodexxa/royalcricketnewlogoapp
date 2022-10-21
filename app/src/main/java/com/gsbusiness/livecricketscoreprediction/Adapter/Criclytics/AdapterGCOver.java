package com.gsbusiness.livecricketscoreprediction.Adapter.Criclytics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.gsbusiness.livecricketscoreprediction.GameChangingOversQuery;
import com.gsbusiness.livecricketscoreprediction.R;

import java.util.List;

public class AdapterGCOver extends RecyclerView.Adapter<AdapterGCOver.ViewHolder> {
    List<GameChangingOversQuery.Commentary> arrayList;
    Context context;

    public AdapterGCOver(Context context2, List<GameChangingOversQuery.Commentary> list) {
        this.context = context2;
        this.arrayList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ball, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (this.arrayList.get(i).type().equals("")) {
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).runs());
        } else if (this.arrayList.get(i).type().equals("four")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_four, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).runs());
        } else if (this.arrayList.get(i).type().equals("wide")) {
            viewHolder.txt_ball_result.setText("wd");
        } else if (this.arrayList.get(i).type().equals("six")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_six, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).runs());
        } else if (this.arrayList.get(i).type().equals("wicket")) {
            viewHolder.ll_over.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_wicket, this.context.getTheme()));
            viewHolder.txt_ball_result.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textWhite, this.context.getTheme()));
            viewHolder.txt_ball_result.setText(this.arrayList.get(i).runs());
        }
        viewHolder.txt_ball.setText(this.arrayList.get(i).over());
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
