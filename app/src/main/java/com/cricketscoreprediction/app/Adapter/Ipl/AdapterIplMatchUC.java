package com.cricketscoreprediction.app.Adapter.Ipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.SeriesHomeCardQuery;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.List;

public class AdapterIplMatchUC extends RecyclerView.Adapter<AdapterIplMatchUC.ViewHolder> {
    Context context;
    List<SeriesHomeCardQuery.MatchesDatum> matchesData;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick();
    }

    public AdapterIplMatchUC(Context context2, List<SeriesHomeCardQuery.MatchesDatum> list, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.matchesData = list;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_match_uc, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_team_home.setText(this.matchesData.get(i).homeTeamShortName());
        viewHolder.txt_team_away.setText(this.matchesData.get(i).awayTeamShortName());
        String matchDateTimeIST = this.matchesData.get(i).matchDateTimeIST();
        viewHolder.txt_month.setText(Glob.getDateMonth(Long.parseLong(matchDateTimeIST)));
        viewHolder.txt_date.setTypeface(Glob.oswald_medium);
        viewHolder.txt_date.setText(Glob.getDateDay(matchDateTimeIST));
        RequestManager with = Glide.with(this.context);
        ((RequestBuilder) with.load(Glob.teams_start + this.matchesData.get(i).homeTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_flag_home);
        RequestManager with2 = Glide.with(this.context);
        ((RequestBuilder) with2.load(Glob.teams_start + this.matchesData.get(i).awayTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_flag_away);
        viewHolder.txt_time.setText(Glob.getTime(Long.parseLong(matchDateTimeIST)));
        viewHolder.txt_venue.setText(this.matchesData.get(i).venue());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                AdapterIplMatchUC.this.onItemClickListener.onItemClick();
            }
        });
        if (i == this.matchesData.size() - 1) {
            viewHolder.view_line.setVisibility(View.GONE);
        }
    }

    @Override 
    public int getItemCount() {
        return this.matchesData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_flag_away;
        ImageView img_flag_home;
        TextView txt_date;
        TextView txt_month;
        TextView txt_team_away;
        TextView txt_team_home;
        TextView txt_time;
        TextView txt_venue;
        View view_line;

        public ViewHolder(View view) {
            super(view);
            this.txt_month = (TextView) view.findViewById(R.id.txt_month);
            this.txt_date = (TextView) view.findViewById(R.id.txt_date);
            this.img_flag_home = (ImageView) view.findViewById(R.id.img_flag_home);
            this.txt_team_home = (TextView) view.findViewById(R.id.txt_team_home);
            this.img_flag_away = (ImageView) view.findViewById(R.id.img_flag_away);
            this.txt_team_away = (TextView) view.findViewById(R.id.txt_team_away);
            this.txt_time = (TextView) view.findViewById(R.id.txt_time);
            this.txt_venue = (TextView) view.findViewById(R.id.txt_venue);
            this.view_line = view.findViewById(R.id.view_line);
        }
    }
}
