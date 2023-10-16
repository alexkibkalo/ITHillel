package com.ua.lesson7.solid;

public class OpenClosed {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Приклад використання розширюючих класів
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0; // Повертає площу форми (за замовчуванням 0.0)
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Реалізація обчислення площі для кола
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Реалізація обчислення площі для прямокутника
    }
}


// У цьому прикладі клас Shape є абстракцією, яка містить загальні властивості та методи для всіх фігур.
// Класи Circle і Rectangle розширюють клас Shape, надаючи конкретну реалізацію метода calculateArea.
// Принцип відкритості/закритості дотримується, оскільки для додавання нових фігур не потрібно змінювати клас Shape.

