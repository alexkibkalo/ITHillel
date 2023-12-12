package com.ua.lesson22.abstractfactory.component.linux;

import com.ua.lesson22.abstractfactory.component.Button;

public class LinuxButton implements Button {

    @Override
    public void show() {
        System.out.println("Button by Linux OS");
    }
}
