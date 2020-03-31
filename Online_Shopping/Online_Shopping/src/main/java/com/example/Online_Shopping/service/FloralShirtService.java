package com.example.Online_Shopping.service;

import com.example.Online_Shopping.models.FloralShirt;
import com.example.Online_Shopping.repository.FloralShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloralShirtService {
    @Autowired
    private FloralShirtRepository floralShirtRepository;
    public void create(FloralShirt floralShirt)
    {
        floralShirtRepository.save(floralShirt);
    }
    public List<FloralShirt> getAllTopicsByService() {
        return floralShirtRepository.findAll();
    }
    public void delete(String imgUrl) {
        FloralShirt p = floralShirtRepository.findByimgUrl(imgUrl);
        floralShirtRepository.delete(p);
    }
}
