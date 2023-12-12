package com.ua.lesson23.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ColorFlyweightFactory {
    private final Map<String, Color> colors = new HashMap<>();

    public Color getColor(String key) {
        if(!colors.containsKey(key)){
            Color newColor = new Color(key, getHexByColorName(key));
            colors.put(key, newColor);
        }
        return colors.get(key);
    }

    private static String getHexByColorName(String colorName) {
        try {
            java.lang.reflect.Field field = Class.forName("java.awt.Color").getField(colorName.toLowerCase());
            java.awt.Color color = (java.awt.Color) field.get(null);
            return getHexColor(color);
        } catch (Exception e) {
            return null;
        }
    }

    private static String getHexColor(java.awt.Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }
}
