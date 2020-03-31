package com.example.Online_Shopping.controller;

import com.example.Online_Shopping.models.Cart;
import com.example.Online_Shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CartController {
    @Autowired
    private CartService cartService;
    @RequestMapping("/addProduct")
    public List<Cart> getAllTopics() {
        return cartService.getAllTopicsByService();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addProduct")
    public String create(@RequestBody Cart topic) {
        cartService.create(topic);
        return "Product added to cart";
    }

    @RequestMapping("/deleteProducts")
    public String delete(@RequestParam String imgUrl) {
        cartService.delete(imgUrl);
        return "Deleted";
    }
    @RequestMapping("/deleteAllProducts")
    public String deleteAll() {
        cartService.deleteAll();
        return "Deleted";
    }
}
