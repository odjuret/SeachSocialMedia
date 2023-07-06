package com.github.odjuret.SearchSocialMedia.Core.UseCases;


import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.ArrayList;
import java.util.List;

public class SearchSocialMedia implements ISearchSocialMedia {
    @Override
    public List<Post> search(List<Post> posts, String searchTerm) {
        List<Post> matchedStories = new ArrayList<>();

        for (Post post : posts) {
            if (post.getStory().contains(searchTerm)) {
                matchedStories.add(post);
            }
        }

        return matchedStories;
    }
}
