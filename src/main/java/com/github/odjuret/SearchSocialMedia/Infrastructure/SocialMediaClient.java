package com.github.odjuret.SearchSocialMedia.Infrastructure;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.ISocialMediaClient;
import com.github.odjuret.SearchSocialMedia.Core.UseCases.GetSocialMediaException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class SocialMediaClient implements ISocialMediaClient {
    private static final String EXTERNAL_API_URL = "https://www.retriever-info.com/doccyexample/pulse.json";

    @Override
    public List<Post> Get() throws GetSocialMediaException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PostRootDto> response = restTemplate.getForEntity(EXTERNAL_API_URL, PostRootDto.class);

        if (response.getStatusCode().is2xxSuccessful()) {

            PostRootDto rootDto = response.getBody();
            if (rootDto != null){
                return rootDto.getDocuments();
            }
        }

        throw new GetSocialMediaException("Failed GET request(url=" + EXTERNAL_API_URL + "): code=" + response.getStatusCode());
    }
}

