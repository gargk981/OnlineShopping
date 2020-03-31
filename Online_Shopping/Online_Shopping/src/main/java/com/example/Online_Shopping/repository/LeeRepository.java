package com.example.Online_Shopping.repository;
import com.example.Online_Shopping.models.Lee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeeRepository extends MongoRepository<Lee,String> {
    public Lee findByimgUrl(String imgUrl);
}
