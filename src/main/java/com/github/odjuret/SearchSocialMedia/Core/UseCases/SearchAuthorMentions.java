package com.github.odjuret.SearchSocialMedia.Core.UseCases;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Mentioned;
import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.ArrayList;
import java.util.List;

public class SearchAuthorMentions implements ISearchAuthorMentions{

    private final ISocialMediaClient socialMediaClient;

    public SearchAuthorMentions(ISocialMediaClient socialMediaClient) {
        this.socialMediaClient = socialMediaClient;
    }


    @Override
    public List<Post> search(String postId) throws GetSocialMediaException {
        List<Post> allPosts = socialMediaClient.Get();

        List<Post> matchedStories = new ArrayList<>();

        for (Post post : allPosts) {
            if (post.getId().equals(postId)) {

                List<String> usedPostIds = new ArrayList<>();

                usedPostIds.add(post.getId());

                buildATree(post, allPosts, usedPostIds);

                matchedStories.add(post);
            }
        }

        return matchedStories;
    }

    private static void buildATree(Post currentNode, List<Post> allPosts, List<String> usedPostIds){
        String authorId = currentNode.getAuthor().getId();

        for (Post post : allPosts) {
            for (Mentioned mentioned : post.getMentioned()) {
                if (mentioned.getId().equals(authorId) && !usedPostIds.contains(post.getId())) {
                    usedPostIds.add(post.getId());

                    buildATree(post, allPosts, usedPostIds);

                    currentNode.addMentionedPost(post);
                }
            }
        }
    }


}
