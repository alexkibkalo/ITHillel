package com.ua.lesson22.abstractfactory.gui.impl;

import com.ua.lesson22.abstractfactory.component.Animation;
import com.ua.lesson22.abstractfactory.component.Button;
import com.ua.lesson22.abstractfactory.component.Window;
import com.ua.lesson22.abstractfactory.component.windows.WindowsAnimation;
import com.ua.lesson22.abstractfactory.component.windows.WindowsButton;
import com.ua.lesson22.abstractfactory.component.windows.WindowsWindow;
import com.ua.lesson22.abstractfactory.gui.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Animation createAnimation() {
        return new WindowsAnimation();
    }
}
