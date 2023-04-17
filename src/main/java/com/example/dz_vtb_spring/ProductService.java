package com.example.dz_vtb_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    List<Product> products = new ArrayList<>();
    public void printAll() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    @PostConstruct
    public void InitProducts() {
        products.add(new Product(1, "pr1", 1));
        products.add(new Product(2, "pr2", 2));
        products.add(new Product(3, "pr3", 3));
        products.add(new Product(4, "pr4", 4));
        products.add(new Product(5, "pr5", 5));
        products.add(new Product(6, "pr6", 6));
        products.add(new Product(7, "pr7", 7));
        products.add(new Product(8, "igi", 8));
        products.add(new Product(9, "itg86gf", 9));
        products.add(new Product(10, "jgvuj", 10));

    }
    Product findByTitle(String title) {
        return products.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }
}
