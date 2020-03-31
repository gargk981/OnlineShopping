package com.example.Online_Shopping.repository;

import com.example.Online_Shopping.models.UserHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHistoryRepository extends MongoRepository<UserHistory,String> {
    public UserHistory findByimgUrl(String imgUrl);
}
