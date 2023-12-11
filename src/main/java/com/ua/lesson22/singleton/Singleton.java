package com.ua.lesson22.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватний конструктор, щоб заборонити створення інших екземплярів
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
