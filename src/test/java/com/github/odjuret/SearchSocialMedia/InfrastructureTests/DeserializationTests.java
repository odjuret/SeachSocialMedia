package com.github.odjuret.SearchSocialMedia.InfrastructureTests;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.TestDataReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeserializationTests {
    private final TestDataReader testDataReader;
    public DeserializationTests() {
        testDataReader = new TestDataReader();
    }


    @Test
    public void can_read_twitter_post() throws IOException {
        Post post = testDataReader.read("twitter.json");

        assertThat(post.getId(), is("75010_1626130445971734528_1048664"));
    }

    @Test
    public void can_read_podcast_post() throws IOException {
        Post post = testDataReader.read("podcast.json");

        assertThat(post.getId(), is("084425202302161015edb2d1887ff592c303718817aa94_1644421"));
    }
}
