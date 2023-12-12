package com.ua.lesson22.abstractfactory.component.mac;

import com.ua.lesson22.abstractfactory.component.Window;

public class MacWindow implements Window {
    @Override
    public void show() {
        System.out.println("Window by Mac OS");
    }
}
