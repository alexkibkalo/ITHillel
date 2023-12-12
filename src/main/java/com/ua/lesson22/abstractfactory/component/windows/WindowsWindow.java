package com.ua.lesson22.abstractfactory.component.windows;

import com.ua.lesson22.abstractfactory.component.Window;

public class WindowsWindow implements Window {
    @Override
    public void show() {
        System.out.println("Window by Windows OS");
    }
}
