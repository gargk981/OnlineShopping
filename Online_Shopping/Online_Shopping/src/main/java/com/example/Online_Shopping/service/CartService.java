package com.example.Online_Shopping.service;

import com.example.Online_Shopping.models.Cart;
import com.example.Online_Shopping.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public void create(Cart cart)
    {
        cartRepository.save(cart);
    }
    public List<Cart> getAllTopicsByService() {
        return cartRepository.findAll();
    }
    public void delete(String imgUrl){
        Cart p = cartRepository.findByimgUrl(imgUrl);
        cartRepository.delete(p);
    }
    public void deleteAll() {
        cartRepository.deleteAll();
    }
}
