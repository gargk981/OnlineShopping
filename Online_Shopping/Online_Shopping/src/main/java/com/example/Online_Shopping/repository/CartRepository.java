package com.example.Online_Shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Online_Shopping.models.Cart;
@Repository
public interface CartRepository extends MongoRepository<Cart,String> {
    public Cart findByimgUrl(String imgUrl);
}
