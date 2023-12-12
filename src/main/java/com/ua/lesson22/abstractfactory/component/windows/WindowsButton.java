package com.ua.lesson22.abstractfactory.component.windows;

import com.ua.lesson22.abstractfactory.component.Button;

public class WindowsButton implements Button {
    @Override
    public void show() {
        System.out.println("Button by Windows OS");
    }
}
