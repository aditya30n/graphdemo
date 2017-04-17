package com.ebay.seo.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.ebay.seo.graph.domain.node")
public class GraphDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphDemoApplication.class, args);
	}
}
