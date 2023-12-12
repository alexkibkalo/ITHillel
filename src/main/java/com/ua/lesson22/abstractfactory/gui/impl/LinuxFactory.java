package com.ua.lesson22.abstractfactory.gui.impl;

import com.ua.lesson22.abstractfactory.component.Animation;
import com.ua.lesson22.abstractfactory.component.Button;
import com.ua.lesson22.abstractfactory.component.Window;
import com.ua.lesson22.abstractfactory.component.linux.LinuxAnimation;
import com.ua.lesson22.abstractfactory.component.linux.LinuxButton;
import com.ua.lesson22.abstractfactory.component.linux.LinuxWindow;
import com.ua.lesson22.abstractfactory.gui.GUIFactory;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Animation createAnimation() {
        return new LinuxAnimation();
    }
}
