package com.example.Online_Shopping.controller;

import com.example.Online_Shopping.models.UserHistory;
import com.example.Online_Shopping.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserHistoryController {
    @Autowired
    private UserHistoryService userHistoryService;
    @RequestMapping("/history")
    public List<UserHistory> getAllTopics() {
        return userHistoryService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/history")
    public String create(@RequestBody UserHistory topic) {
        userHistoryService.create(topic);
        return "Product added to cart history";
    }

    @RequestMapping("/deleteProductFromHistory")
    public String delete(@RequestParam String imgUrl) {
        userHistoryService.delete(imgUrl);
        return "Deleted";
    }
    @RequestMapping("/deleteAllHistory")
    public String deleteAll() {
        userHistoryService.deleteAll();
        return "Deleted";
    }
}
