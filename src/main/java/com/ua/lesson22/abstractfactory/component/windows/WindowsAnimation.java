package com.ua.lesson22.abstractfactory.component.windows;

import com.ua.lesson22.abstractfactory.component.Animation;

public class WindowsAnimation implements Animation {
    @Override
    public void show() {
        System.out.println("Animation by Windows OS");
    }
}
