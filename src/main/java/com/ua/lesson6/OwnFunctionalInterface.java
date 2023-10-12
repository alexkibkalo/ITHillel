package com.ua.lesson6;

@FunctionalInterface
public interface OwnFunctionalInterface {

    // only one abstract method
    void compare();

    default void helper(){
        System.out.println("Help you");
    }
}
