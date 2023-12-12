package com.ua.lesson23.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        OldInterface oldInterface = new OldInterfaceImpl();
        oldInterface.doOldMethod();

        NewInterface adapter = new Adapter(oldInterface);
        adapter.doNewMethod();

        NewClass newClass = new NewClass();
        newClass.execute(adapter);
    }
}
