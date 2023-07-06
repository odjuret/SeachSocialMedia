package com.github.odjuret.SearchSocialMedia.Core.UseCases;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.ArrayList;
import java.util.List;

public class SearchSocialMedia implements ISearchSocialMedia {

    private final ISocialMediaClient socialMediaClient;

    public SearchSocialMedia(ISocialMediaClient socialMediaClient) {
        this.socialMediaClient = socialMediaClient;
    }

    @Override
    public List<Post> search(String searchTerm) throws GetSocialMediaException {
        List<Post> allPosts = socialMediaClient.Get();

        List<Post> matchedStories = new ArrayList<>();

        for (Post post : allPosts) {
            if (post.getStory().contains(searchTerm)) {

                post.makeSearchHitsBoldInStory(searchTerm);

                matchedStories.add(post);
            }
        }

        return matchedStories;
    }
}
