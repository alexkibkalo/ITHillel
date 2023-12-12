package com.ua.lesson23.flyweight;

public class Car implements ColorApplier {
    private Color color;

    public Color getColor() {
        return color;
    }

    @Override
    public void applyColor(Color color) {
        this.color = color;
        System.out.println("Applying new color: " + color.getName());
    }
}
