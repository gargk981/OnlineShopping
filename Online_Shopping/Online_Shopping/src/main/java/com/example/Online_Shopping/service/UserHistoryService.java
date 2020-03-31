package com.example.Online_Shopping.service;

import com.example.Online_Shopping.models.UserHistory;
import com.example.Online_Shopping.repository.UserHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHistoryService {
    @Autowired
    private UserHistoryRepository userHistoryRepository;
    public void create(UserHistory cart)
    {
        userHistoryRepository.save(cart);
    }
    public List<UserHistory> getAllTopicsByService() {
        return userHistoryRepository.findAll();
    }
    public void delete(String imgUrl){
        UserHistory p = userHistoryRepository.findByimgUrl(imgUrl);
        userHistoryRepository.delete(p);
    }
    public void deleteAll() {
        userHistoryRepository.deleteAll();
    }
}
