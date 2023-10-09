package com.ua.lesson4;

public class Main {
    public static void main(String[] args) {
        // Створення анонімного класу, який реалізує інтерфейс Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Цей код виконується в потоці");
            }
        };

        // Створення потоку і запуск анонімного класу
        Thread thread = new Thread(runnable);
        thread.start();
    }
}


