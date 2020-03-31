package com.example.Online_Shopping.controller;
import com.example.Online_Shopping.models.Lee;
import com.example.Online_Shopping.service.LeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class LeeController {
    @Autowired
    private LeeService leeService;

    @RequestMapping("/topics")
    public List<Lee> getAllTopics() {
        return leeService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void create(@RequestBody Lee topic) {
        leeService.create(topic);
    }
    @RequestMapping("/deleteLee")
    public String delete(@RequestParam String imgUrl) {
        leeService.delete(imgUrl);
        return "Deleted " ;
    }
    @RequestMapping("/deleteAllLee")
    public String deleteAll() {
        leeService.deleteAll();
        return "Deleted";
    }
}