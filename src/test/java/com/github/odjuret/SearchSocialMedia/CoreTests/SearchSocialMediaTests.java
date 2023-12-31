package com.github.odjuret.SearchSocialMedia.CoreTests;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.GetSocialMediaException;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISearchSocialMediaStories;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.SearchSocialMediaStories;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSocialMediaTests {
    private final ISearchSocialMediaStories sut;  // sut = system under test

    public SearchSocialMediaTests() {
        this.sut = new SearchSocialMediaStories(new SocialMediaClientMock());
    }

    @Test
    public void can_search() throws GetSocialMediaException {
        List<Post> results = sut.search("Goliaths");

        assertThat(results.size(), is(1));
        assertThat(results.get(0).getSocialsource(), is("twitter"));
    }
}
