package com.myProject.liveUrlShortner;

public class UrlData {

    private String originalUrl;
    private Long expirationTime;

    public UrlData() {

    }

    public UrlData(String originalUrl, Long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
