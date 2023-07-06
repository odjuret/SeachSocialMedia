package com.github.odjuret.SearchSocialMedia.CoreTests;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.GetSocialMediaException;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISocialMediaClient;
import com.github.odjuret.SearchSocialMedia.TestDataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaClientMock implements ISocialMediaClient {
    private final TestDataReader testDataReader;

    public SocialMediaClientMock() {
        testDataReader = new TestDataReader();
    }

    @Override
    public List<Post> Get() throws GetSocialMediaException {
        List<Post> allPosts = new ArrayList<>();

        try {
            Post twitterPost = testDataReader.read("twitter.json");
            Post podcastPost = testDataReader.read("podcast.json");
            allPosts.add(twitterPost);
            allPosts.add(podcastPost);
        } catch (IOException e) {
            throw new GetSocialMediaException("Mock failure");
        }

        return allPosts;
    }
}
