package com.ua.lesson5.oop2.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Customer> customers;

    public Shop(){
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "Customers: " + customers;
    }
}
