package com.ua.lesson22.abstractfactory;

import com.ua.lesson22.abstractfactory.component.Animation;
import com.ua.lesson22.abstractfactory.component.Button;
import com.ua.lesson22.abstractfactory.component.Window;
import com.ua.lesson22.abstractfactory.gui.GUIFactory;
import com.ua.lesson22.abstractfactory.gui.impl.LinuxFactory;
import com.ua.lesson22.abstractfactory.gui.impl.MacFactory;
import com.ua.lesson22.abstractfactory.gui.impl.WindowsFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        GUIFactory factory = getFactory("Windows");

        Button button = factory.createButton();
        button.show();

        Window window = factory.createWindow();
        window.show();

        Animation animation = factory.createAnimation();
        animation.show();
    }

    static GUIFactory getFactory(String factory) {
        switch (factory) {
            case "Linux" -> {
                return new LinuxFactory();
            }
            case "Mac" -> {
                return new MacFactory();
            }
            case "Windows" -> {
                return new WindowsFactory();
            }
            default -> throw new RuntimeException("GUI Factory not found");
        }
    }
}
