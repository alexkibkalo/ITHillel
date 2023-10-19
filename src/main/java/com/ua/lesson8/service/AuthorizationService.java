package com.ua.lesson8.service;

import com.ua.lesson8.dao.UserService;
import com.ua.lesson8.dao.UserServiceImpl;
import com.ua.lesson8.model.User;

public class AuthorizationService {

    private final UserService userService = new UserServiceImpl();

    public boolean login(String username, String password) {
        User user = userService.getByUsername(username);

        if (username.equals("default")) {
            System.out.println("Default user can login without credentials!");
            return true;
        }

        if(user == null){
            System.out.println("Authorization failed! User with username: " + username + " does not exist!");
            return false;
        } else {
            if(password.equals(user.getPassword())){
                System.out.println("Authorization successfully! Welcome, " + username + "!");
                userService.authorizeUser(user.getId());
                return true;
            } else {
                System.out.println("Invalid credentials!");
                return false;
            }
        }
    }
}
