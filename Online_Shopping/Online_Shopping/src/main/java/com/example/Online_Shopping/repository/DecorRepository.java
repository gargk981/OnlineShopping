package com.example.Online_Shopping.repository;

import com.example.Online_Shopping.models.Decor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecorRepository extends MongoRepository<Decor,String> {
    public Decor findByimgUrl(String imgUrl);
}
