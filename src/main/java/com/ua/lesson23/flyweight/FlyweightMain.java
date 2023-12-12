package com.ua.lesson23.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

// Легковажкий об'єкт для представлення кольору
interface ColorFlyweight {
    void applyColor();
}

// Конкретна реалізація легковажкого об'єкта (кольору)
class ConcreteColor implements ColorFlyweight {
    private Color color;

    ConcreteColor(Color color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color: " + color);
    }
}

// Фабрика для створення та управління легковажкими об'єктами
class ColorFlyweightFactory {
    private Map<String, ColorFlyweight> colorFlyweights = new HashMap<>();

    ColorFlyweight getColor(String key) {
        if (!colorFlyweights.containsKey(key)) {
            // Якщо об'єкт з вказаним ключем не існує, створюємо його
            Color newColor = getColorFromString(key);
            colorFlyweights.put(key, new ConcreteColor(newColor));
        }
        return colorFlyweights.get(key);
    }

    private Color getColorFromString(String colorString) {
        // Логіка конвертації рядка в об'єкт Color (просто для прикладу)
        // Реальна логіка може бути більш складною
        return Color.decode(colorString);
    }
}

// Клієнтський код
public class FlyweightMain {
    public static void main(String[] args) {
        ColorFlyweightFactory colorFactory = new ColorFlyweightFactory();

        // Використання легковажкого об'єкта
        ColorFlyweight color1 = colorFactory.getColor("#FF0000");
        color1.applyColor();

        // Використання іншого легковажкого об'єкта з тим самим ключем
        ColorFlyweight color2 = colorFactory.getColor("#FF0000");
        color2.applyColor();

        // Використання легковажкого об'єкта з іншим ключем
        ColorFlyweight color3 = colorFactory.getColor("#00FF00");
        color3.applyColor();
    }
}
