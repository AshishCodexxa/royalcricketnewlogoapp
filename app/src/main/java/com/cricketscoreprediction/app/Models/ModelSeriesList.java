package com.cricketscoreprediction.app.Models;

import java.io.Serializable;

public class ModelSeriesList implements Serializable {
    Integer Odicount;
    Integer T20count;
    Integer Testcount;
    String league;
    String seriesID;
    String seriesName;
    String startDate;
    String startEndDate;
    String status;
    String type;

    public void ModelSeriesList(String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, String str5, String str6, String str7) {
        this.seriesID = str;
        this.seriesName = str2;
        this.Odicount = num;
        this.T20count = num2;
        this.status = str3;
        this.Testcount = num3;
        this.startEndDate = str4;
        this.league = str5;
        this.startDate = str6;
        this.type = str7;
    }

    public String getSeriesID() {
        return this.seriesID;
    }

    public void setSeriesID(String str) {
        this.seriesID = str;
    }

    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String str) {
        this.seriesName = str;
    }

    public Integer getOdicount() {
        return this.Odicount;
    }

    public void setOdicount(Integer num) {
        this.Odicount = num;
    }

    public Integer getT20count() {
        return this.T20count;
    }

    public void setT20count(Integer num) {
        this.T20count = num;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public Integer getTestcount() {
        return this.Testcount;
    }

    public void setTestcount(Integer num) {
        this.Testcount = num;
    }

    public String getStartEndDate() {
        return this.startEndDate;
    }

    public void setStartEndDate(String str) {
        this.startEndDate = str;
    }

    public String getLeague() {
        return this.league;
    }

    public void setLeague(String str) {
        this.league = str;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
