package com.ua.lesson23.flyweight;

public class FlyWeightMain {
    public static void main(String[] args) {
        Color blue = new Color("blue", "#335BFF");
        Color grey = new Color("grey", "#767676");
        Color white = new Color("white", "#FFFFFF");

        Car audi = new Car();
        audi.applyColor(blue);
        System.out.println(audi.getColor());

        Car bmw = new Car();
        Color blue1 = new Color("blue", "#335BFF");
        bmw.applyColor(blue1);
        System.out.println(bmw.getColor());

        System.out.println("----------------------------");

        ColorFlyweightFactory colorFactory = new ColorFlyweightFactory();

        Car car1 = new Car();
        Color color = colorFactory.getColor("Black");
        car1.applyColor(color);
        System.out.println(car1.getColor().getHex());

        Car car2 = new Car();
        Color color2 = colorFactory.getColor("Black");
        car2.applyColor(color2);
        System.out.println(car2.getColor().getHex());

        Car car3 = new Car();
        Color color3 = colorFactory.getColor("Blue");
        car3.applyColor(color3);
        System.out.println(car3.getColor().getHex());

        Car car4 = new Car();
        Color color4 = colorFactory.getColor("Black");
        car4.applyColor(color4);
        System.out.println(car4.getColor().getHex());

        Car car5 = new Car();
        Color color5 = colorFactory.getColor("Black");
        car5.applyColor(color5);
        System.out.println(car5.getColor().getHex());

        Car car6 = new Car();
        Color color6 = colorFactory.getColor("Blue");
        car6.applyColor(color6);
        System.out.println(car6.getColor().getHex());
    }
}
