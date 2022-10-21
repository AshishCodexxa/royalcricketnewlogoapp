package com.gsbusiness.livecricketscoreprediction.Models;

public class ModelPlayer {
    String captain;
    String credits;
    String playerId;
    String playerName;
    String playerNameHindi;
    String player_role;
    String projectedPoints;
    String teamID;
    String totalPoints;
    String vice_captain;

    public void ModelPlayer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.playerName = str;
        this.playerNameHindi = str2;
        this.credits = str3;
        this.playerId = str4;
        this.captain = str5;
        this.vice_captain = str6;
        this.teamID = str7;
        this.totalPoints = str8;
        this.player_role = str9;
        this.projectedPoints = str10;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getPlayerNameHindi() {
        return this.playerNameHindi;
    }

    public String getCredits() {
        return this.credits;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public String getCaptain() {
        return this.captain;
    }

    public String getVice_captain() {
        return this.vice_captain;
    }

    public String getTeamID() {
        return this.teamID;
    }

    public String getTotalPoints() {
        return this.totalPoints;
    }

    public String getPlayer_role() {
        return this.player_role;
    }

    public String getProjectedPoints() {
        return this.projectedPoints;
    }
}
