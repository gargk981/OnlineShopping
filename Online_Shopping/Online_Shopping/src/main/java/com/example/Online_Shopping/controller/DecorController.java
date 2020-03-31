package com.example.Online_Shopping.controller;
import com.example.Online_Shopping.models.Decor;
import com.example.Online_Shopping.service.DecorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class DecorController {
    @Autowired
    private DecorService decorService;
    @RequestMapping("/decor")
    public List<Decor> getAllTopics() {
        return decorService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/decor")
    public void create(@RequestBody Decor topic) {
        decorService.create(topic);
    }

    @RequestMapping("/deleteDecors")
    public String delete(@RequestParam String imgUrl) {
        decorService.delete(imgUrl);
        return "Deleted";
    }
}
