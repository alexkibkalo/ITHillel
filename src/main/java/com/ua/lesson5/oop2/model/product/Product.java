package com.ua.lesson5.oop2.model.product;

import com.ua.lesson5.oop2.model.Category;

public class Product {
    private int price;
    private String color;
    private Category category;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
