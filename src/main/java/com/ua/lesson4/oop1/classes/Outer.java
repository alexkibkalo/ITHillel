package com.ua.lesson4.oop1.classes;

public class Outer {

    static class Nested {
        public void nestedMethod(){
            System.out.println("nested");
        }
    }

    class Inner {
        public void innerMethod(){
            System.out.println("inner");
        }
    }

    public void nonStaticMethod(){
        Inner innerClass = new Inner();
    }

    public static void main(String[] args) {
        Nested nestedClass = new Nested();


        new Runnable() {
            @Override
            public void run() {
                System.out.println("Started!");
            }
        };
    }
}
