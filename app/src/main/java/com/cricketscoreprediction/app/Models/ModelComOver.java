package com.cricketscoreprediction.app.Models;

public class ModelComOver {
    String over;
    String run;
    String type;

    public ModelComOver(String str, String str2, String str3) {
        this.run = str;
        this.over = str2;
        this.type = str3;
    }

    public String getRun() {
        return this.run;
    }

    public String getOver() {
        return this.over;
    }

    public String getType() {
        return this.type;
    }
}
