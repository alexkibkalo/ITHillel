package com.ua.lesson22.prototype;

// Інтерфейс Прототипу
interface Prototype {
    Prototype clone();
}

// Конкретна реалізація Прототипу
class ConcretePrototype implements Prototype {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    // Глибока копія об'єкта
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.property);
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}

// Клієнтський код
public class Client {
    public static void main(String[] args) {
        // Створюємо об'єкт-прототип
        ConcretePrototype original = new ConcretePrototype("Original Property");

        // Клонуємо об'єкт
        ConcretePrototype cloned = (ConcretePrototype) original.clone();

        // Змінюємо властивість клонованого об'єкта
        cloned.setProperty("Modified Property");

        // Виводимо властивості об'єктів
        System.out.println("Original Property: " + original.getProperty());
        System.out.println("Cloned Property: " + cloned.getProperty());
    }
}
