package com.example.Online_Shopping.service;
import com.example.Online_Shopping.models.Decor;
import com.example.Online_Shopping.repository.DecorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DecorService {
    @Autowired
    private DecorRepository decorRepository;
    public void create(Decor kurti)
    {
        decorRepository.save(kurti);
    }
    public List<Decor> getAllTopicsByService() {
        return decorRepository.findAll();
    }
    public void delete(String imgUrl){
        Decor p = decorRepository.findByimgUrl(imgUrl);
        decorRepository.delete(p);
    }
}
