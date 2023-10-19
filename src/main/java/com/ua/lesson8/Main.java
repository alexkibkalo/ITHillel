package com.ua.lesson8;

import com.ua.lesson8.dao.UserService;
import com.ua.lesson8.dao.UserServiceImpl;
import com.ua.lesson8.resources.SecureResource;
import com.ua.lesson8.service.AuthorizationService;

public class Main {

    private final static String USERNAME = "maewrfewrfrtin";
    private final static String PASSWORD = "rfewrferwf";

    public static void main(String[] args) throws InterruptedException {
        SecureResource resource = new SecureResource();
        AuthorizationService authorizationService = new AuthorizationService();
        UserService userService = new UserServiceImpl();

        resource.printSecuredText(USERNAME, PASSWORD);

        Thread.sleep(2000);

        authorizationService.login(USERNAME, PASSWORD);

        Thread.sleep(2000);

        resource.printSecuredText(USERNAME, PASSWORD);

        System.out.println("Creating new user...");

        userService.create(USERNAME, PASSWORD);
        authorizationService.login(USERNAME, PASSWORD);

        Thread.sleep(2000);

        resource.printSecuredText(USERNAME, PASSWORD);
    }
}
