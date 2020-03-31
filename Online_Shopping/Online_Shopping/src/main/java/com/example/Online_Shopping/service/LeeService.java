package com.example.Online_Shopping.service;
import com.example.Online_Shopping.models.Lee;
import com.example.Online_Shopping.repository.LeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
@Service
public class LeeService {
    @Autowired
    private LeeRepository leeRepository;
    public void create(Lee lee)
    {
        leeRepository.save(lee);
    }
    public List<Lee> getAllTopicsByService() {
        return leeRepository.findAll();
    }
    public void delete(String imgUrl) {
        Lee p = leeRepository.findByimgUrl(imgUrl);
        leeRepository.delete(p);
    }
    public void deleteAll() {
        leeRepository.deleteAll();
    }
}
