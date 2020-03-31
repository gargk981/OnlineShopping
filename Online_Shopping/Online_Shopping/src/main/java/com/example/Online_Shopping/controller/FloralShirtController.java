package com.example.Online_Shopping.controller;
import com.example.Online_Shopping.models.FloralShirt;
import com.example.Online_Shopping.repository.FloralShirtRepository;
import com.example.Online_Shopping.service.FloralShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FloralShirtController {
    @Autowired
    private FloralShirtService floralShirtService;
    @RequestMapping("/floralShirt")
    public List<FloralShirt> getAllTopics() {
        return floralShirtService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/floralShirt")
    public void create(@RequestBody FloralShirt topic) {
        floralShirtService.create(topic);
    }

    @RequestMapping("/deleteFloralShirts")
    public String delete(@RequestParam String imgUrl) {
        floralShirtService.delete(imgUrl);
        return "Deleted " ;
    }
}
