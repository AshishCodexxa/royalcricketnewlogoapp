package com.cricketscoreprediction.app.Adapter.More;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;

import com.cricketscoreprediction.app.Models.More.ModelTeams;
import com.cricketscoreprediction.app.R;
import com.cricketscoreprediction.app.Utils.Glob;
import java.util.ArrayList;

public class AdapterTeamsOther extends RecyclerView.Adapter<AdapterTeamsOther.ViewHolder> {
    Context context;
    OnItemClickListener onItemClickListener;
    String team;
    ArrayList<ModelTeams> teamsArrayList;

    public interface OnItemClickListener {
        void onItemClick();
    }

    public AdapterTeamsOther(Context context2, ArrayList<ModelTeams> arrayList, OnItemClickListener onItemClickListener2) {
        this.context = context2;
        this.teamsArrayList = arrayList;
        this.onItemClickListener = onItemClickListener2;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_teams_other, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txt_team.setText(this.teamsArrayList.get(i).getTeamShortName());
        ((RequestBuilder) Glide.with(this.context).load(Glob.teams_start + this.teamsArrayList.get(i).getTeamID() + Glob.teams_end).placeholder((int) R.drawable.icon_flag)).into(viewHolder.img_team);
        if (this.teamsArrayList.get(i).getTrophy_details().isEmpty()) {
            viewHolder.txt_title.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
            return;
        }
        String str = "";
        for (int i2 = 0; i2 < this.teamsArrayList.get(i).getTrophy_details().size(); i2++) {
            str = str + this.teamsArrayList.get(i).getTrophy_details().get(i2) + ",";
        }
        viewHolder.txt_title.setText(this.teamsArrayList.get(i).getTrophy_details().toString().replace("[", "").replace("]", ""));
    }

    @Override 
    public int getItemCount() {
        return this.teamsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_team;
        TextView txt_team;
        TextView txt_title;

        public ViewHolder(View view) {
            super(view);
            this.txt_team = (TextView) view.findViewById(R.id.txt_team);
            this.img_team = (ImageView) view.findViewById(R.id.img_team);
            this.txt_title = (TextView) view.findViewById(R.id.txt_title);
        }
    }
}
