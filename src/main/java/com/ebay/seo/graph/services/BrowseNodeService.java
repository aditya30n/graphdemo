package com.ebay.seo.graph.services;


import java.security.SecureRandom;
import java.util.*;

import com.ebay.seo.graph.domain.node.BrowseNode;
import com.ebay.seo.graph.domain.node.Product;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class BrowseNodeService {

    private SecureRandom random = new SecureRandom();



    private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
        Map<String, Object> result = new HashMap<String, Object>(2);
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }


    public Map<String,Object> createSingle(String label, Long id, String title) {
        SessionFactory sessionFactory = new SessionFactory("com.ebay.seo.graph.domain.node");
        Session session = sessionFactory.openSession();
        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        BrowseNode bn = new BrowseNode();
        bn.setTitle(title);
        bn.setSiteId(random.nextInt());
        bn.setCategoryId(random.nextLong());
        bn.setShortTitle(Long.toString(random.nextLong()));
        bn.setQualityScore(random.nextDouble());

        Product product = new Product();
        product.setMaturityScore(2.0);
        bn.setProduct(product);
        product.setBn(bn);

        session.save(bn);

        Map<String, Object> map = new HashMap<>();
        bn.toMap(map);
        nodes.add(map);

        return map("nodes", nodes, "links", rels);
    }

    public boolean deleteAll() {
        SessionFactory sessionFactory = new SessionFactory("com.ebay.seo.graph.domain.node");
        Session session = sessionFactory.openSession();
        session.deleteAll(BrowseNode.class);
        session.deleteAll(Product.class);

        return true;
    }
}

