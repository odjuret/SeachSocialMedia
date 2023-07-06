package com.github.odjuret.SearchSocialMedia.Infrastructure;

import com.github.odjuret.SearchSocialMedia.Core.Entities.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRootDto {
    private Integer totalHits;
    private Integer offset;
    private String keyset;
    private Integer returnedHits;
    private List<Post> documents = new ArrayList<>();
    private List<Object> facets = new ArrayList<>();
    private AggregationsDto aggregations;
    public Integer getTotalHits() {
        return totalHits;
    }
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public String getKeyset() {
        return keyset;
    }
    public void setKeyset(String keyset) {
        this.keyset = keyset;
    }
    public Integer getReturnedHits() {
        return returnedHits;
    }
    public void setReturnedHits(Integer returnedHits) {
        this.returnedHits = returnedHits;
    }
    public List<Post> getDocuments() {
        return documents;
    }
    public void setDocuments(List<Post> documents) {
        this.documents = documents;
    }
    public List<Object> getFacets() {
        return facets;
    }
    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }
    public AggregationsDto getAggregations() {
        return aggregations;
    }
    public void setAggregations(AggregationsDto aggregations) {
        this.aggregations = aggregations;
    }
}
