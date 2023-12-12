package com.ua.lesson22.abstractfactory.component.linux;

import com.ua.lesson22.abstractfactory.component.Window;

public class LinuxWindow implements Window {

    @Override
    public void show() {
        System.out.println("Window by Linux OS");
    }
}
