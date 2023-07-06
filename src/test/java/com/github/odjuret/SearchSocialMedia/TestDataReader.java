package com.github.odjuret.SearchSocialMedia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestDataReader {

    private final Path workingDir;
    private final ObjectMapper mapper;

    public TestDataReader() {
        this.workingDir = Path.of("", "src/test/resources");
        mapper = new ObjectMapper();
    }

    public Post read(String fileName) throws IOException {
        Path file = this.workingDir.resolve(fileName);
        String content = Files.readString(file);

        return mapper.readValue(content, Post.class);
    }

}
