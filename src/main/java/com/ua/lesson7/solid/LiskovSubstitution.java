package com.ua.lesson7.solid;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Sparrow sparrow = new Sparrow();
        Chicken chicken = new Chicken();

        handler(bird);
        handler(sparrow);
        handler(chicken);
    }

    public static void handler(Bird bird){
        bird.fly();
    }
}


class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Перевизначення методу fly
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Chicken extends Bird {
    // Перевизначення методу fly
    @Override
    void fly() {
        System.out.println("Chicken can not fly");
    }
}


// Всі підкласи повинні зберігати контракти (інтерфейси або абстрактні класи) базового класу.
// - Це означає, що вони повинні реалізовувати всі методи і властивості, які визначені в базовому класі.
// - Підкласи можуть розширювати функціональність базового класу, але не повинні змінювати поведінку методів базового класу.
// - Якщо код працює з базовим класом, то він також має працювати з будь-яким підкласом, не втрачаючи коректності і правильності.
//
// У цьому прикладі Sparrow та Chicken є підкласами Bird. Вони перевизначають метод fly, але при цьому зберігають
// контракт базового класу. Код, який працює з об'єктами типу Bird, може також працювати з Sparrow і Chicken без втрати коректності.
// Принцип підстановки Ліскова сприяє розширенню системи класів та її підтримці в майбутньому, оскільки нові підкласи можна
// додавати без необхідності змінювати існуючий код.
