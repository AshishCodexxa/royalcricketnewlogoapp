package com.cricketlivescore.predictiontips.Models;

import java.io.Serializable;

public class ModelSubCategory implements Serializable {
    String icon;
    String name;
    String url;

    public void ModelSubCategory(String str, String str2, String str3) {
        this.name = str;
        this.icon = str2;
        this.url = str3;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
