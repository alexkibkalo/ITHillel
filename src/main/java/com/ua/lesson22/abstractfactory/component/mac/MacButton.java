package com.ua.lesson22.abstractfactory.component.mac;

import com.ua.lesson22.abstractfactory.component.Button;

public class MacButton implements Button {
    @Override
    public void show() {
        System.out.println("Button by Mac OS");
    }
}
