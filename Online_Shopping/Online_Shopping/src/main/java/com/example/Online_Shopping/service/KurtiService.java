package com.example.Online_Shopping.service;
import com.example.Online_Shopping.models.Kurti;
import com.example.Online_Shopping.repository.KurtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class KurtiService {
    @Autowired
    private KurtiRepository kurtiRepository;
    public void create(Kurti kurti)
    {
        kurtiRepository.save(kurti);
    }
    public List<Kurti> getAllTopicsByService() {
        return kurtiRepository.findAll();
    }
    public void deleteAll() {
        kurtiRepository.deleteAll();
    }
}
