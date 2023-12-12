package com.ua.lesson23.facade;

// Складна підсистема
class SubsystemA {
    void operationA() {
        System.out.println("SubsystemA operation");
    }
}

class SubsystemB {
    void operationB() {
        System.out.println("SubsystemB operation");
    }
}

class SubsystemC {
    void operationC() {
        System.out.println("SubsystemC operation");
    }
}

// Фасад, який надає спрощений інтерфейс
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    // Спрощений метод, який об'єднує роботу різних компонентів підсистеми
    void doWork() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

// Клієнтський код
public class FacadeMain {
    public static void main(String[] args) {
        // Використання фасаду для спрощеної взаємодії з підсистемою
        Facade facade = new Facade();
        facade.doWork();
    }
}
