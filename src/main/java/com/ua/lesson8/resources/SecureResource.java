package com.ua.lesson8.resources;

import com.ua.lesson8.dao.UserService;
import com.ua.lesson8.dao.UserServiceImpl;

public class SecureResource {

    private final UserService userService = new UserServiceImpl();

    public void printSecuredText(String username, String password){
        if(userService.isAuthorized(username, password) || username.equals("default")){
            System.out.println("Hello! You can see protected resources!");
        } else {
            System.out.println("Unauthorized!");
        }
    }
}
