package com.ua.lesson22.abstractfactory;

// Абстрактні продукти
interface Button {
    void click();
}

interface Checkbox {
    void check();
}

// Конкретні продукти
class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}

// Абстрактна фабрика
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Конкретні фабрики
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
