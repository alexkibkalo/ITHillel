package com.ua.lesson22.abstractfactory.gui.impl;

import com.ua.lesson22.abstractfactory.component.Animation;
import com.ua.lesson22.abstractfactory.component.Button;
import com.ua.lesson22.abstractfactory.component.Window;
import com.ua.lesson22.abstractfactory.component.linux.LinuxAnimation;
import com.ua.lesson22.abstractfactory.component.mac.MacAnimation;
import com.ua.lesson22.abstractfactory.component.mac.MacButton;
import com.ua.lesson22.abstractfactory.component.mac.MacWindow;
import com.ua.lesson22.abstractfactory.gui.GUIFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Animation createAnimation() {
        return new MacAnimation();
    }
}
