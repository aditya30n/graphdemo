package com.ebay.seo.graph.domain.node;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//import movies.spring.data.neo4j.domain.Role;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public class GraphNode {

	@GraphId
	private Long id;

	private String title;

	private int released;

	private String tagline;

//	@Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
//	private List<Role> roles = new ArrayList<>();

	public GraphNode() {
	}

	public GraphNode(String title, int released) {

		this.title = title;
		this.released = released;
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

	public int getReleased() {
		return released;
	}

	public String getTagline() {
		return tagline;
	}

//	public Collection<Role> getRoles() {
//		return roles;
//	}
//
//	public void addRole(Role role) {
//		this.roles.add(role);
//	}
}
