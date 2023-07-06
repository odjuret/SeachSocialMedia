package com.github.odjuret.SearchSocialMedia.CoreTests;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISearchSocialMedia;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.SearchSocialMedia;
import com.github.odjuret.SearchSocialMedia.TestDataReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSocialMediaTests {
    private ISearchSocialMedia sut;  // sut = system under test
    private final TestDataReader testDataReader;

    public SearchSocialMediaTests() {
        this.sut = new SearchSocialMedia();
        testDataReader = new TestDataReader();
    }

    @Test
    public void can_search() throws IOException {
        Post twitterPost = testDataReader.read("twitter.json");
        Post podcastPost = testDataReader.read("podcast.json");

        List<Post> allPosts = new ArrayList<Post>();
        allPosts.add(twitterPost);
        allPosts.add(podcastPost);

        List<Post> results = sut.search(allPosts, "Goliaths");

        assertThat(results.size(), is(1));
        assertThat(results.get(0).getSocialsource(), is("twitter"));
    }
}
