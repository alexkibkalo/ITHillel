package com.ua.lesson22.abstractfactory.gui;

import com.ua.lesson22.abstractfactory.component.Animation;
import com.ua.lesson22.abstractfactory.component.Button;
import com.ua.lesson22.abstractfactory.component.Window;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Animation createAnimation();
}
