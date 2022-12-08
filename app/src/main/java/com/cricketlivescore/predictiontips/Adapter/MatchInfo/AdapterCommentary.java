package com.cricketlivescore.predictiontips.Adapter.MatchInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;

import com.cricketlivescore.predictiontips.GetBallByBallQuery;
import com.cricketlivescore.predictiontips.R;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class AdapterCommentary extends RecyclerView.Adapter<AdapterCommentary.ViewHolder> {
    List<GetBallByBallQuery.Over> ballByBalls;
    List<GetBallByBallQuery.Ball> ballList;
    Context context;

    public AdapterCommentary(Context context2, List<GetBallByBallQuery.Over> list) {
        this.context = context2;
        this.ballByBalls = list;
    }

    @Override 
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_commentary, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AdapterCommentaryBall adapterCommentaryBall = new AdapterCommentaryBall(this.context, reverseArrayList(this.ballByBalls.get(i).balls()));
        viewHolder.rv_item_commentary.setLayoutManager(new LinearLayoutManager(this.context));
        viewHolder.rv_item_commentary.setAdapter(adapterCommentaryBall);
    }

    @Override 
    public int getItemCount() {
        return this.ballByBalls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rv_item_commentary;

        public ViewHolder(View view) {
            super(view);
            this.rv_item_commentary = (RecyclerView) view.findViewById(R.id.rv_item_commentary);
        }
    }

    public List<GetBallByBallQuery.Ball> reverseArrayList(List<GetBallByBallQuery.Ball> list) {
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayList.add(list.get(size));
        }
        return arrayList;
    }

    public void printElements(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            PrintStream printStream = System.out;
            printStream.print(arrayList.get(i) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
    }
}
