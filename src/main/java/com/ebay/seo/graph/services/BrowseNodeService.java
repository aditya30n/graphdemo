package com.ebay.seo.graph.services;


import java.util.*;

import com.ebay.seo.graph.domain.node.BrowseNode;
import com.ebay.seo.graph.repositories.BrowseNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BrowseNodeService {

    @Autowired
    BrowseNodeRepository bnRepository;

//    private Map<String, Object> toD3Format(Collection<BrowseNode> bn) {
//        List<Map<String, Object>> nodes = new ArrayList<>();
//        List<Map<String, Object>> rels = new ArrayList<>();
//        int i = 0;
//        Iterator<Movie> result = movies.iterator();
//        while (result.hasNext()) {
//            Movie movie = result.next();
//            nodes.add(map("title", movie.getTitle(), "label", "movie"));
//            int target = i;
//            i++;
//            for (Role role : movie.getRoles()) {
//                Map<String, Object> actor = map("title", role.getPerson().getName(), "label", "actor");
//                int source = nodes.indexOf(actor);
//                if (source == -1) {
//                    nodes.add(actor);
//                    source = i++;
//                }
//                rels.add(map("source", source, "target", target));
//            }
//        }
//        return map("nodes", nodes, "links", rels);
//    }

    private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
        Map<String, Object> result = new HashMap<String, Object>(2);
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }

    @Transactional(readOnly = true)
    public Map<String, Object>  graph() {
        Collection<BrowseNode> result = bnRepository.graph();

        List<Map<String, Object>> nodes = new ArrayList<>();
        List<Map<String, Object>> rels = new ArrayList<>();
        Iterator<BrowseNode> iter = result.iterator();
        while (iter.hasNext()) {
            BrowseNode bn = iter.next();
            nodes.add(map("title",bn.getTitle(),"label","title"));
        }
//        nodes.add(map("title", "test", "label", "test2"));
        return map("nodes", nodes, "links", rels);

//        return toD3Format(result);

    }
}

