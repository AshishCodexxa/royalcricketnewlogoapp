package com.cricketlivescore.predictiontips.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;

import com.cricketlivescore.predictiontips.GetBallByBallQuery;
import com.cricketlivescore.predictiontips.Models.ModelComOver;
import com.cricketlivescore.predictiontips.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterCommentaryBall extends RecyclerView.Adapter<AdapterCommentaryBall.ViewHolder> {
    List<GetBallByBallQuery.Ball> ballByBalls;
    Context context;

    public AdapterCommentaryBall(Context context2, List<GetBallByBallQuery.Ball> list) {
        this.context = context2;
        this.ballByBalls = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_commentary_ball, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_item_cOver.setText(String.format("%s", this.ballByBalls.get(i).over()));
        viewHolder.txt_item_cBall.setText(String.format("%s %s %s%s %s", this.ballByBalls.get(i).bowlerName(), "to", this.ballByBalls.get(i).batsmanName(), ",", this.ballByBalls.get(i).commentary()));
        if (this.ballByBalls.get(i).type().equals("four")) {
            viewHolder.txt_item_color.setText("4");
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_four, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else if (this.ballByBalls.get(i).type().equals("six")) {
            viewHolder.txt_item_color.setText("6");
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_six, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else if (this.ballByBalls.get(i).type().equals("wicket")) {
            viewHolder.txt_item_color.setText(ExifInterface.LONGITUDE_WEST);
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_wicket, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.white, this.context.getTheme()));
        } else {
            viewHolder.txt_item_color.setText(this.ballByBalls.get(i).runs());
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_all, this.context.getTheme()));
            viewHolder.ll_item_commentary.setBackground(ResourcesCompat.getDrawable(this.context.getResources(), R.drawable.border_com_all, this.context.getTheme()));
            viewHolder.view.setBackgroundColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
            viewHolder.txt_item_color.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
            viewHolder.txt_item_cOver.setTextColor(ResourcesCompat.getColor(this.context.getResources(), R.color.textFmBold, this.context.getTheme()));
        }
        if (this.ballByBalls.get(i).summary() != null) {
            viewHolder.ll_lastBallView.setVisibility(View.VISIBLE);;
            ArrayList arrayList = new ArrayList();
            for (int size = this.ballByBalls.size() - 1; size >= 0; size--) {
                arrayList.add(new ModelComOver(this.ballByBalls.get(size).runs(), this.ballByBalls.get(size).over(), this.ballByBalls.get(size).type()));
            }
            viewHolder.rv_over.setLayoutManager(new LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false));
            viewHolder.rv_over.setAdapter(new AdapterOver(this.context, arrayList));
            viewHolder.txt_item_over.setText(String.format("%s", this.ballByBalls.get(i).summary().over()));
            viewHolder.txt_item_score.setText(this.ballByBalls.get(i).summary().score());
            viewHolder.txt_item_team.setText(this.ballByBalls.get(i).summary().teamShortName());
            viewHolder.txt_batter_one.setText(this.ballByBalls.get(i).summary().batsmen().get(0).batsmanName());
            viewHolder.txt_batter_two.setText(this.ballByBalls.get(i).summary().batsmen().get(1).batsmanName());
            String format = String.format("%s%s%s%s", this.ballByBalls.get(i).summary().batsmen().get(0).runs(), "(", this.ballByBalls.get(i).summary().batsmen().get(0).balls(), ")");
            String format2 = String.format("%s%s%s%s", this.ballByBalls.get(i).summary().batsmen().get(1).runs(), "(", this.ballByBalls.get(i).summary().batsmen().get(1).balls(), ")");
            viewHolder.txt_batter_one_state.setText(format);
            viewHolder.txt_batter_two_state.setText(format2);
            viewHolder.txt_bower_name.setText(this.ballByBalls.get(i).summary().bowler().get(0).bowlerName());
            viewHolder.txt_bower_state.setText(String.format("%s%s%s%s%s%s%s", this.ballByBalls.get(i).summary().bowler().get(0).overs(), HelpFormatter.DEFAULT_OPT_PREFIX, this.ballByBalls.get(i).summary().bowler().get(0).maidens(), HelpFormatter.DEFAULT_OPT_PREFIX, this.ballByBalls.get(i).summary().bowler().get(0).runs(), HelpFormatter.DEFAULT_OPT_PREFIX, this.ballByBalls.get(i).summary().bowler().get(0).wickets()));
        }
    }

    @Override 
    public int getItemCount() {
        return this.ballByBalls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_item_commentary;
        LinearLayout ll_lastBallView;
        RecyclerView rv_over;
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
            this.rv_over = (RecyclerView) view2.findViewById(R.id.rv_over);
        }
    }
}
