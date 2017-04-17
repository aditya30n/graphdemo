package com.ebay.seo.graph.domain.node;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

//import movies.spring.data.neo4j.domain.Role;


@NodeEntity
public class GraphNode {

    @GraphId
    private Long id;

    private String title;


    public GraphNode() {
    }

    public GraphNode(String title) {

        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


}
