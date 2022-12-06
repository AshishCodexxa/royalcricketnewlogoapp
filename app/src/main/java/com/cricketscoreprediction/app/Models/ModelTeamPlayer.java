package com.cricketscoreprediction.app.Models;

import com.cricketscoreprediction.app.PreMatchPredectionQuery;
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
