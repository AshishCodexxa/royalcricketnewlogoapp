package com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;

import com.gsbusiness.livecricketscoreprediction.GetHighlightsQuery;
import com.gsbusiness.livecricketscoreprediction.R;

import java.util.List;

public class AdapterHighlights extends RecyclerView.Adapter<AdapterHighlights.ViewHolder> {
    Context context;
    List<GetHighlightsQuery.HighlightBall> highlightBalls;

    public AdapterHighlights(Context context2, List<GetHighlightsQuery.HighlightBall> list) {
        this.context = context2;
        this.highlightBalls = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_commentary_ball, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_item_cOver.setText(String.format("%s", this.highlightBalls.get(i).over()));
        viewHolder.txt_item_cBall.setText(String.format("%s", this.highlightBalls.get(i).commentary()));
        if (this.highlightBalls.get(i).runs().equalsIgnoreCase("4")) {
            viewHolder.txt_item_color.setText("4");
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_four, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else if (this.highlightBalls.get(i).runs().equalsIgnoreCase("6")) {
            viewHolder.txt_item_color.setText("6");
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_six, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else if (this.highlightBalls.get(i).wicket().booleanValue()) {
            viewHolder.txt_item_color.setText(ExifInterface.LONGITUDE_WEST);
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_wicket, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else {
            viewHolder.txt_item_color.setText(this.highlightBalls.get(i).runs());
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_all, this.context.getTheme()));
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_all, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
        }
    }

    @Override 
    public int getItemCount() {
        return this.highlightBalls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_item_commentary;
        LinearLayout ll_lastBallView;
        TextView txt_batter_one;
        TextView txt_batter_one_state;
        TextView txt_batter_two;
        TextView txt_batter_two_state;
        TextView txt_bower_name;
        TextView txt_bower_state;
        TextView txt_item_cBall;
        TextView txt_item_cOver;
        TextView txt_item_color;
        TextView txt_item_over;
        TextView txt_item_score;
        TextView txt_item_team;
        View view;

        public ViewHolder(View view2) {
            super(view2);
            this.txt_item_cOver = (TextView) view2.findViewById(R.id.txt_item_cOver);
            this.txt_item_cBall = (TextView) view2.findViewById(R.id.txt_item_cBall);
            this.txt_item_over = (TextView) view2.findViewById(R.id.txt_item_over);
            this.txt_item_score = (TextView) view2.findViewById(R.id.txt_item_score);
            this.txt_item_team = (TextView) view2.findViewById(R.id.txt_item_team);
            this.ll_lastBallView = (LinearLayout) view2.findViewById(R.id.ll_lastBallView);
            this.txt_bower_state = (TextView) view2.findViewById(R.id.txt_bower_state);
            this.txt_bower_name = (TextView) view2.findViewById(R.id.txt_bower_name);
            this.txt_item_color = (TextView) view2.findViewById(R.id.txt_item_color);
            this.txt_batter_one = (TextView) view2.findViewById(R.id.txt_batter_one);
            this.txt_batter_one_state = (TextView) view2.findViewById(R.id.txt_batter_one_state);
            this.txt_batter_two = (TextView) view2.findViewById(R.id.txt_batter_two);
            this.txt_batter_two_state = (TextView) view2.findViewById(R.id.txt_batter_two_state);
            this.ll_item_commentary = (LinearLayout) view2.findViewById(R.id.ll_item_commentary);
            this.view = view2.findViewById(R.id.view);
        }
    }
}
