package com.ua.lesson7.solid;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Robot robot = new Robot();

        engineer.work();
        engineer.eat();

        robot.work();
    }
}

interface PersonOptions extends RelaxOptions, WorkOptions {
}

interface RelaxOptions {
    void eat();
}

interface WorkOptions {
    void work();
}

class Engineer implements PersonOptions {

    @Override
    public void eat() {
        System.out.println("Engineer is eating");
    }

    @Override
    public void work() {
        System.out.println("Engineer is working");
    }
}

class Robot implements WorkOptions {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

// This is bad code

//interface Worker {
//    void eat();
//    void work();
//}
//
//class Engineer implements Worker {
//    public void work() {
//        // Робота інженера
//    }
//
//    public void eat() {
//        // Обід інженера
//    }
//}
//
//class Robot implements Worker {
//    public void work() {
//        // Робот може працювати
//    }
//
//    public void eat() {
//        // Але робот не може їсти
//    }
//}
