package com.example.dz_vtb_spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    Cart cart;

    void printOrder() {
        List<Product> products = cart.getListCart();
        for (Product product: products) {
            System.out.println(product.toString());
        }
        System.out.println("Sum = " + products.stream().mapToInt(Product::getCost).sum());
    }
}
