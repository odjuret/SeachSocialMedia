package com.github.odjuret.SearchSocialMedia.Core.Entities;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String id;
    private Source source;
    private String socialsource;
    private String story;
    private String status;
    private String parent;
    private Boolean repost;
    private String docId;
    private String url;
    private Integer profileId;
    private String profileName;
    private Boolean isGroup;
    private double docdate;
    private double updated;
    private String obtainedWithQueryString;
    private Author author;
    private List<Mentioned> mentioned = new ArrayList<Mentioned>();
    private SocialMetrics socialmetrics;
    private List<Attachment> attachments = new ArrayList<Attachment>();
    private List<Url> urls = new ArrayList<Url>();
    private List<String> tags = new ArrayList<String>();
    private String headline;
    private String intro;
    private List<PodcastHit> podcastHits = new ArrayList<PodcastHit>();
    private String podcastDuration;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Source getSource() {
        return source;
    }
    public void setSource(Source source) {
        this.source = source;
    }
    public String getSocialsource() {
        return socialsource;
    }
    public void setSocialsource(String socialsource) {
        this.socialsource = socialsource;
    }
    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getParent() {
        return parent;
    }
    public void setParent(String parent) {
        this.parent = parent;
    }
    public Boolean getRepost() {
        return repost;
    }
    public void setRepost(Boolean repost) {
        this.repost = repost;
    }
    public String getDocId() {
        return docId;
    }
    public void setDocId(String docId) {
        this.docId = docId;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getProfileId() {
        return profileId;
    }
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }
    public String getProfileName() {
        return profileName;
    }
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
    public Boolean getIsGroup() {
        return isGroup;
    }
    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }
    public double getDocdate() {
        return docdate;
    }
    public void setDocdate(double docdate) {
        this.docdate = docdate;
    }
    public double getUpdated() {
        return updated;
    }
    public void setUpdated(double updated) {
        this.updated = updated;
    }
    public String getObtainedWithQueryString() {
        return obtainedWithQueryString;
    }
    public void setObtainedWithQueryString(String obtainedWithQueryString) {
        this.obtainedWithQueryString = obtainedWithQueryString;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public List<Mentioned> getMentioned() {
        return mentioned;
    }
    public void setMentioned(List<Mentioned> mentioned) {
        this.mentioned = mentioned;
    }
    public SocialMetrics getSocialmetrics() {
        return socialmetrics;
    }
    public void setSocialmetrics(SocialMetrics socialmetrics) {
        this.socialmetrics = socialmetrics;
    }
    public List<Attachment> getAttachments() {
        return attachments;
    }
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
    public List<Url> getUrls() {
        return urls;
    }
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public List<PodcastHit> getPodcastHits() {
        return podcastHits;
    }
    public void setPodcastHits(List<PodcastHit> podcastHits) {
        this.podcastHits = podcastHits;
    }
    public String getPodcastDuration() {
        return podcastDuration;
    }
    public void setPodcastDuration(String podcastDuration) {
        this.podcastDuration = podcastDuration;
    }
}


