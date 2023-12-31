package com.github.odjuret.SearchSocialMedia.WebApp.Controllers;


import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.GetSocialMediaException;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISearchSocialMediaStories;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.SearchSocialMediaStories;
import com.github.odjuret.SearchSocialMedia.Infrastructure.SocialMediaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private final ISearchSocialMediaStories searchSocialMedia;

    public SearchController() {
        searchSocialMedia = new SearchSocialMediaStories(new SocialMediaClient());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Post>> search(@RequestParam("searchWord") String searchWord) {

        try {
            List<Post> results = searchSocialMedia.search(searchWord);

            if (results.isEmpty()){
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok(results);

        } catch (GetSocialMediaException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
