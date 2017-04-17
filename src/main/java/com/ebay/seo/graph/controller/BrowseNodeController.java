package com.ebay.seo.graph.controller;

import java.util.Map;
import com.ebay.seo.graph.services.BrowseNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BrowseNodeController {

    final BrowseNodeService bnService;

    @Autowired
    public BrowseNodeController(BrowseNodeService bnService) {
        this.bnService = bnService;
    }

//    @RequestMapping("/graph")
//    public Map<String, Object> graph(@RequestParam(value = "limit",required = false) Integer limit) {
//        return bnService.graph();
//    }
    @RequestMapping("/create")
    public Map<String, Object> createSingle
            (
            @RequestParam(value = "label",required = false) String label,
            @RequestParam(value = "id",required = false) Long id,
             @RequestParam(value = "title",required = false) String title ) {
        return bnService.createSingle(label,id,title);
    }

    @RequestMapping("/deleteAll")
    public boolean deleteAll (){

        return bnService.deleteAll() ;
}

}
