package com.example.dz_vtb_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DzVtbSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        ProductService productService = context.getBean(ProductService.class);
        Cart cart = context.getBean(Cart.class);
        OrderService orderService = context.getBean(OrderService.class);
        cart.add(productService.findByTitle("pr1"));
        cart.add(productService.findByTitle("pr3"));
        cart.add(productService.findByTitle("pr6"));
        orderService.printOrder();

        ((AnnotationConfigApplicationContext) context).close();
    }

}
