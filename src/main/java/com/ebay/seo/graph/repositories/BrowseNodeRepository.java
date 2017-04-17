//package com.ebay.seo.graph.repositories;
//
//
//import com.ebay.seo.graph.domain.node.BrowseNode;
//import org.springframework.data.neo4j.annotation.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import java.util.Collection;
////@RepositoryRestResource(collectionResourceRel = "BrowseNode", path = "BrowseNode")
//public interface BrowseNodeRepository extends PagingAndSortingRepository<BrowseNode, Long> {
//    BrowseNode findByTitle(@Param("title") String title);
//
//    Collection<BrowseNode> findByTitleLike(@Param("title") String title);
//
////    @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT {limit}")
////    @Query("MATCH(BrowseNode) RETURN BrowseNode")
//@Query("MATCH(BrowseNode) where BrowseNode.title=\"FirstBn\" RETURN BrowseNode")
//    Collection<BrowseNode> graph();
//
//@Query("CREATE(BrowseNode{id:124,title:\"SecondBn\"})")
//    BrowseNode createSingle(String label, Integer id, String title);
//
//}
