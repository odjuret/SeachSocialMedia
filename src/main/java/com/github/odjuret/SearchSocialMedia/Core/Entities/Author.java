package com.github.odjuret.SearchSocialMedia.Core.Entities;

public class Author {
    private String id;
    private String userName;
    private String displayName;
    private String imageUrl;
    private String profileUrl;
    private String description;
    private Influence influence;
    private Integer likes;
    private Double followers;
    private Double posts;
    private String fullUserName;
    private Double following;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getProfileUrl() {
        return profileUrl;
    }
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Influence getInfluence() {
        return influence;
    }
    public void setInfluence(Influence influence) {
        this.influence = influence;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Double getFollowers() {
        return followers;
    }
    public void setFollowers(Double followers) {
        this.followers = followers;
    }
    public Double getPosts() {
        return posts;
    }
    public void setPosts(Double posts) {
        this.posts = posts;
    }
    public String getFullUserName() {
        return fullUserName;
    }
    public void setFullUserName(String fullUserName) {
        this.fullUserName = fullUserName;
    }
    public Double getFollowing() {
        return following;
    }
    public void setFollowing(Double following) {
        this.following = following;
    }
}


