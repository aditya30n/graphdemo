package com.ebay.seo.graph.domain.node;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.neo4j.ogm.annotation.*;

import java.util.Map;

@NodeEntity(label = "BrowseNode")
public class BrowseNode {

    @GraphId
    public Long id;

    private Integer siteId;

    @Index
    public String title;

    private String shortTitle;

    @Index
    private Long categoryId;

    private Double qualityScore;

    @Relationship(type = "ProductType", direction = Relationship.OUTGOING)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public BrowseNode(){

    }
    public BrowseNode(String title){
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public void toMap(Map<String , Object > map){
        map.put("Title", title);
        map.put("Id", id);
    }


}
