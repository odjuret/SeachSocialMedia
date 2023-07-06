package com.github.odjuret.SearchSocialMedia.Core.UseCases;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.List;

public interface ISearchSocialMedia {
    List<Post> search(List<Post> posts, String searchTerm);
}
