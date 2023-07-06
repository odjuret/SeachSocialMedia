package com.github.odjuret.SearchSocialMedia.Core.Entities;

public class Source {
    private double id;
    private String name;
    private String mediatype1;
    private String edition;
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMediatype1() {
        return mediatype1;
    }
    public void setMediatype1(String mediatype1) {
        this.mediatype1 = mediatype1;
    }
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
}
