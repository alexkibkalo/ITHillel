package com.ua.lesson22.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton.getInstance());
        }
    }
}
