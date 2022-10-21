package com.gsbusiness.livecricketscoreprediction.Models;

import java.util.ArrayList;

public class ModelTeam {
    ArrayList<ModelPlayer> arrayListPlayer;
    String fantasy_teamName;
    String teamtotalpoints;
    String timestamp;
    String totalProjectedPoints;

    public void ModelTeam(String str, String str2, String str3, String str4, ArrayList<ModelPlayer> arrayList) {
        this.teamtotalpoints = str;
        this.fantasy_teamName = str2;
        this.timestamp = str3;
        this.totalProjectedPoints = str4;
        this.arrayListPlayer = arrayList;
    }

    public String getTeamtotalpoints() {
        return this.teamtotalpoints;
    }

    public String getFantasy_teamName() {
        return this.fantasy_teamName;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getTotalProjectedPoints() {
        return this.totalProjectedPoints;
    }

    public ArrayList<ModelPlayer> getArrayListPlayer() {
        return this.arrayListPlayer;
    }
}
