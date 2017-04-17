package com.ebay.seo.graph.domain.node;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "Product")
public class Product {
    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    @GraphId
    private Long internalId;


    public BrowseNode getBn() {
        return bn;
    }

    public void setBn(BrowseNode bn) {
        this.bn = bn;
    }

    @Relationship(type = "ProductType", direction = Relationship.INCOMING)
    private BrowseNode bn;

    public Double getMaturityScore() {
        return maturityScore;
    }

    public void setMaturityScore(Double maturityScore) {
        this.maturityScore = maturityScore;
    }

    private Double maturityScore;


}
