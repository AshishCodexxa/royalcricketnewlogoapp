package com.cricketlivescore.predictiontips.Models.Starts;

public class AppListModel {
    String app_des;
    String app_img;
    String app_link;
    String app_name;

    String f413id;
    String img_logo_url;
    boolean isAd;

    public void setAppListModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f413id = str;
        this.app_name = str2;
        this.app_img = str3;
        this.img_logo_url = str4;
        this.app_link = str5;
        this.app_des = str6;
        this.isAd = z;
    }

    public String getId() {
        return this.f413id;
    }

    public void setId(String str) {
        this.f413id = str;
    }

    public String getApp_name() {
        return this.app_name;
    }

    public void setApp_name(String str) {
        this.app_name = str;
    }

    public String getApp_img() {
        return this.app_img;
    }

    public void setApp_img(String str) {
        this.app_img = str;
    }

    public String getImg_logo_url() {
        return this.img_logo_url;
    }

    public void setImg_logo_url(String str) {
        this.img_logo_url = str;
    }

    public String getApp_link() {
        return this.app_link;
    }

    public void setApp_link(String str) {
        this.app_link = str;
    }

    public String getNative_desc() {
        return this.app_des;
    }

    public void setNative_desc(String str) {
        this.app_des = str;
    }

    public boolean isAd() {
        return this.isAd;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }
}
