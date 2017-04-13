package com.ebay.seo.graph.domain.node;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity(label = "bn1")
public class BrowseNode {

    @GraphId
    private Long id;

    private String title;
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


}
