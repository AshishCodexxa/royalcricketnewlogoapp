package com.cricketlivescore.predictiontips.Models.Starts;

public class SliderData {

    private String f414id;
    private String imgUrl;
    private String url_redirect_link;

    public void SliderData(String str, String str2, String str3) {
        this.f414id = str;
        this.imgUrl = str2;
        this.url_redirect_link = str3;
    }

    public String getId() {
        return this.f414id;
    }

    public void setId(String str) {
        this.f414id = str;
    }

    public String getUrl_redirect_link() {
        return this.url_redirect_link;
    }

    public void setUrl_redirect_link(String str) {
        this.url_redirect_link = str;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }
}
