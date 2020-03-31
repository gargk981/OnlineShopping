package com.example.Online_Shopping.controller;
import com.example.Online_Shopping.models.Kurti;
import com.example.Online_Shopping.service.KurtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class KurtiController {
    @Autowired
    private KurtiService kurtiService;

    @RequestMapping("/kurtis")
    public List<Kurti> getAllTopics() {
        return kurtiService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/kurtis")
    public void create(@RequestBody Kurti topic) {
        kurtiService.create(topic);
    }

    @RequestMapping("/deleteAllKurtis")
    public String deleteAll() {
        kurtiService.deleteAll();
        return "Deleted";
    }
}
