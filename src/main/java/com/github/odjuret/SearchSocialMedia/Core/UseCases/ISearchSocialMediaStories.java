package com.github.odjuret.SearchSocialMedia.Core.UseCases;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.List;

public interface ISearchSocialMediaStories {
    List<Post> search(String searchTerm) throws GetSocialMediaException;
}
