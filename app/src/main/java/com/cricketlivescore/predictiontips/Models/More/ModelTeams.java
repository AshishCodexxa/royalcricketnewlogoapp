package com.cricketlivescore.predictiontips.Models.More;

import java.util.List;

public class ModelTeams {
    String odiRanking;
    String t20Ranking;
    String teamID;
    String teamName;
    String teamShortName;
    String testRanking;
    List<String> trophy_details;

    public void ModelTeams(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        this.teamID = str;
        this.teamName = str2;
        this.odiRanking = str3;
        this.testRanking = str4;
        this.t20Ranking = str5;
        this.trophy_details = list;
        this.teamShortName = str6;
    }

    public String getTeamID() {
        return this.teamID;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getOdiRanking() {
        return this.odiRanking;
    }

    public String getTestRanking() {
        return this.testRanking;
    }

    public String getT20Ranking() {
        return this.t20Ranking;
    }

    public List<String> getTrophy_details() {
        return this.trophy_details;
    }

    public String getTeamShortName() {
        return this.teamShortName;
    }
}
