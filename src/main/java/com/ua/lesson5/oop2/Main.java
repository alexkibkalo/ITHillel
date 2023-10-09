package com.ua.lesson5.oop2;


import com.ua.lesson5.oop2.model.Category;
import com.ua.lesson5.oop2.model.Customer;
import com.ua.lesson5.oop2.model.Shop;
import com.ua.lesson5.oop2.model.order.Basket;
import com.ua.lesson5.oop2.model.order.Order;
import com.ua.lesson5.oop2.model.order.OrderStatus;
import com.ua.lesson5.oop2.model.product.Product;
import com.ua.lesson5.oop2.model.product.clothes.Clothes;
import com.ua.lesson5.oop2.model.product.footwear.Footwear;

import java.util.List;

public class Main {

    private static Basket basket = new Basket();

    public static void main(String[] args) {
        Shop shop = new Shop();

        Customer customer = createCustomer();
        Product boots = createProduct(Category.FOOTWEAR);
        Product coat = createProduct(Category.CLOTHES);
        Order order = createOrder(
                List.of(boots, coat),
                customer
        );
        if(order != null) {
            handleOrder(order);
            shop.addCustomer(customer);
            System.out.println("Order status: " + order.getStatus());
        } else {
            System.out.println("Order was not created");
        }

        System.out.println(shop);
    }

    public static Customer createCustomer() {
        Customer customer = new Customer();
        customer.setName("Oleksandr");
        customer.setSurname("Kibkalo");

        System.out.println("New customer created");
        return customer;
    }

    public static Product createProduct(Category category) {
        switch (category) {
            case FOOTWEAR -> {
                Footwear footwear = new Footwear();
                footwear.setColor("green");
                footwear.setPrice(100);
                footwear.setSize(29);
                footwear.setCategory(Category.FOOTWEAR);
                System.out.println("Footwear created");
                return footwear;
            }
            case CLOTHES -> {
                Clothes clothes = new Clothes();
                clothes.setColor("black");
                clothes.setPrice(200);
                clothes.setSize("M");
                clothes.setCategory(Category.FOOTWEAR);
                System.out.println("Clothes created");
                return clothes;
            }
            default -> throw new RuntimeException("Invalid category value");
        }
    }

    public static Order createOrder(List<Product> products, Customer customer) {
        try {
            Order order = new Order();
            order.setId(1);
            order.setStatus(OrderStatus.IN_PROGRESS);
            order.setProducts(products);
            System.out.println("Order set to status IN PROGRESS");

            basket.setOrder(order);
            basket.setCustomer(customer);
            System.out.println("Order put to basket");

            return order;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }

    public static void handleOrder(Order order){
        System.out.println("Order handled");
        order.setStatus(OrderStatus.DONE);
    }
}
