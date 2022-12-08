package com.cricketlivescore.predictiontips.Models;

import com.cricketlivescore.predictiontips.PreMatchPredectionQuery;
import java.util.ArrayList;

public class ModelTeamPlayer {
    ArrayList<PreMatchPredectionQuery.PlayerList> teamPlayer;

    public ModelTeamPlayer(ArrayList<PreMatchPredectionQuery.PlayerList> arrayList) {
        this.teamPlayer = arrayList;
    }

    public ArrayList<PreMatchPredectionQuery.PlayerList> getTeamsPlayer() {
        return this.teamPlayer;
    }
}
