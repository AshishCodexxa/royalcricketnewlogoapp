package com.gsbusiness.livecricketscoreprediction.Models;

import com.gsbusiness.livecricketscoreprediction.PreMatchPredectionQuery;
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
