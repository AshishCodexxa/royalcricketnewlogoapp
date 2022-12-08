package com.cricketlivescore.predictiontips.Models;

public class ModelPlayerMatchUp {
    String playerId;
    String playerName;

    public ModelPlayerMatchUp(String str, String str2) {
        this.playerId = str;
        this.playerName = str2;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }
}
