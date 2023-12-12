package com.ua.lesson22.abstractfactory.component.linux;

import com.ua.lesson22.abstractfactory.component.Animation;

public class LinuxAnimation implements Animation {
    @Override
    public void show() {
        System.out.println("Animation by Linux OS");
    }
}
