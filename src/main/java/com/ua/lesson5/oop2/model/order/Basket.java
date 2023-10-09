package com.ua.lesson5.oop2.model.order;

import com.ua.lesson5.oop2.model.Customer;

public class Basket {
    private Customer customer;
    private Order order;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
