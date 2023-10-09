package com.ua.lesson5.oop2.model;

import com.ua.lesson5.oop2.model.order.Order;

import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private List<Order> orders;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " " + surname;
    }
}
