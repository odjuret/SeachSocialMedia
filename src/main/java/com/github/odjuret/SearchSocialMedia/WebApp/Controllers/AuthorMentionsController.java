package com.github.odjuret.SearchSocialMedia.WebApp.Controllers;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.GetSocialMediaException;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISearchAuthorMentions;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.SearchAuthorMentions;
import com.github.odjuret.SearchSocialMedia.Infrastructure.SocialMediaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorMentionsController {

    private final ISearchAuthorMentions searchAuthorMentions;

    public AuthorMentionsController() {
        searchAuthorMentions = new SearchAuthorMentions(new SocialMediaClient());
    }


    @GetMapping("post/{id}/mentions/search")
    public ResponseEntity<Post> search(@PathVariable("id") String postId) {

        try {
            List<Post> results = searchAuthorMentions.search(postId);

            if (results.isEmpty()){
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok(results.get(0));

        } catch (GetSocialMediaException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
