package com.github.odjuret.SearchSocialMedia.Core.Entities;

public class Attachment {
    private String type;
    private String displayUrl;
    private String expandedUrl;
    private String title;
    private String description;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDisplayUrl() {
        return displayUrl;
    }
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }
    public String getExpandedUrl() {
        return expandedUrl;
    }
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
