package com.gsbusiness.livecricketscoreprediction.Models;

public class ModelTeams {

    String f412id;
    String team;

    public ModelTeams(String str, String str2) {
        this.team = str;
        this.f412id = str2;
    }

    public String getTeam() {
        return this.team;
    }

    public String getId() {
        return this.f412id;
    }
}
