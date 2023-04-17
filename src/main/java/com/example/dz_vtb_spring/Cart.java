package com.example.dz_vtb_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    List<Product> listCart = new ArrayList<>();

    public List<Product> getListCart() {
        return listCart;
    }

    @PostConstruct
    public void init() {
        listCart = new ArrayList<>();
    }
    void add(Product product) {
        listCart.add(product);
    }
}
