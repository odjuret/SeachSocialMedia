package com.github.odjuret.SearchSocialMedia.Core.UseCases;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.List;

public interface ISearchAuthorMentions {
    List<Post> search(String postId) throws GetSocialMediaException;

}
