package com.github.odjuret.SearchSocialMedia.Core.Entities;

import java.util.ArrayList;
import java.util.List;

public class PodcastHit {
    private List<Highlight> highlight = new ArrayList<>();
    private String time;
    public List<Highlight> getHighlight() {
        return highlight;
    }
    public void setHighlight(List<Highlight> highlight) {
        this.highlight = highlight;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
