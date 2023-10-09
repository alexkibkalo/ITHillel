package com.ua.lesson5.agregation;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
