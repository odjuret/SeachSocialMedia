package com.github.odjuret.SearchSocialMedia.Core.Entities;

public class Highlight {
    private Integer hits;
    private String match;
    public Integer getHits() {
        return hits;
    }
    public void setHits(Integer hits) {
        this.hits = hits;
    }
    public String getMatch() {
        return match;
    }
    public void setMatch(String match) {
        this.match = match;
    }
}
