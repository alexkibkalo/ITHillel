package com.ua.lesson23.proxy;

// Загальний інтерфейс
interface RealObject {
    void request();
}

// Реальний об'єкт, до якого потрібно здійснити доступ через Proxy
class RealObjectImpl implements RealObject {
    @Override
    public void request() {
        System.out.println("RealObject handles the request.");
    }
}

// Проксі для контролю доступу
class Proxy implements RealObject {
    private RealObjectImpl realObject;

    Proxy() {
        // Проксі створює реальний об'єкт лише при потребі
    }

    @Override
    public void request() {
        if (realObject == null) {
            realObject = new RealObjectImpl();
        }

        // Додаткова логіка перед викликом реального об'єкта
        System.out.println("Proxy checks access before forwarding the request.");

        // Виклик реального об'єкта
        realObject.request();
    }
}

// Клієнтський код
public class ProxyMain {
    public static void main(String[] args) {
        // Використання проксі для контролю доступу до реального об'єкта
        RealObject proxy = new Proxy();
        proxy.request();
    }
}
