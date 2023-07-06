package com.github.odjuret.SearchSocialMedia.CoreTests;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostTests {

    @Test
    public void can_make_search_hits_bold(){
        Post post = new Post();

        post.setStory("this is a large story text with several words. many words even. more than three words.");

        post.makeSearchHitsBoldInStory("words");

        assertThat(post.getStory(), is("this is a large story text with several <b>words</b>. many <b>words</b> even. more than three <b>words</b>."));

    }
}
