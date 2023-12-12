package com.ua.lesson22.abstractfactory.component.mac;

import com.ua.lesson22.abstractfactory.component.Animation;

public class MacAnimation implements Animation {
    @Override
    public void show() {
        System.out.println("Animation by Mac OS");
    }
}
