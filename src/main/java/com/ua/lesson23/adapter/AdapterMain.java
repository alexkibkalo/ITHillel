package com.ua.lesson23.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        // Створення об'єкта, який реалізує старий інтерфейс
        OldInterface oldObject = new OldObject();

        // Створення адаптера для використання старого об'єкта в новому контексті
        NewInterface adaptedObject = new Adapter(oldObject);

        // Використання нового класу з новим інтерфейсом
        NewClass newClass = new NewClass();
        newClass.useNewInterface(adaptedObject);
    }
}

// Старий клас, який реалізує OldInterface
class OldObject implements OldInterface {
    @Override
    public void doOldStuff() {
        System.out.println("Doing old stuff.");
    }
}

// Адаптер, який приводить OldInterface до NewInterface
class Adapter implements NewInterface {
    private OldInterface oldInterface;

    Adapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void doNewStuff() {
        // Виклик методу старого інтерфейсу через адаптер
        oldInterface.doOldStuff();
    }
}

// Новий клас, який використовує NewInterface
class NewClass {
    void useNewInterface(NewInterface newInterface) {
        System.out.println("Using new interface.");
        newInterface.doNewStuff();
    }
}

// Новий інтерфейс, який очікує NewClass
interface NewInterface {
    void doNewStuff();
}

// Старий інтерфейс, який потрібно адаптувати
interface OldInterface {
    void doOldStuff();
}


