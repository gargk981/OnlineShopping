package com.API1.LeeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Lee1 {
    @Autowired
    private LeeService leeService;

    @RequestMapping("/topics")
    public List<Lee> getAllTopics(){
        return this.leeService.getAllTopicsByService();
    }

    @RequestMapping("/topics/{id}")
    public Lee getStreamById(@PathVariable int id){
        return this.leeService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Lee topic){
        this.leeService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@PathVariable int id, @RequestBody Lee topic){
        this.leeService.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable int id){
        this.leeService.deleteTopic(id);
    }
}
