package com.gsbusiness.livecricketscoreprediction.Models;

public class ModelProbability {
    Double probability;
    String teamColor;
    String teamName;

    public ModelProbability(String str, String str2, Double d) {
        this.teamName = str;
        this.teamColor = str2;
        this.probability = d;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTeamColor() {
        return this.teamColor;
    }

    public Double getProbability() {
        return this.probability;
    }
}
