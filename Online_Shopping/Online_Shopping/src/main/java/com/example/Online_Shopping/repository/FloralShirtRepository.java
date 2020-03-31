package com.example.Online_Shopping.repository;

import com.example.Online_Shopping.models.FloralShirt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloralShirtRepository extends MongoRepository<FloralShirt,String> {
    public FloralShirt findByimgUrl(String imgUrl);
}
