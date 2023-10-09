package com.ua.lesson5.oop2.model.order;

import com.ua.lesson5.oop2.model.product.Product;

import java.util.List;

public class Order {
    private int id;
    private List<Product> products;
    private OrderStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
