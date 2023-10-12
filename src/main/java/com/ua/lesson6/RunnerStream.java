package com.ua.lesson6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RunnerStream {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(18, "Mike", 1000));
        users.add(new User(20, "Alex", 2000));
        users.add(new User(25, "Joon", 1500));
        users.add(new User(22, "Richard", 4000));
        users.add(new User(17, "Braian", 3300));
        users.add(new User(17, "Braian", 3300));
        users.add(new User(17, "Braian", 3300));
        users.add(new User(16, "Joon1", 1500));

        System.out.println("Stream API:");

        Optional<User> any = users.stream()
                .min(Comparator.comparing(User::getAge));

        System.out.println(any.get());
    }
}

class User {
    private int age;
    private String name;
    private long salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public User(int age, String name, long salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User: " + name + ", " + age + ", " + salary + "$";
    }
}
