package com.ua.lesson8.dao;

import com.ua.lesson8.model.User;

public interface UserService {

    User getByUsername(String username);

    void delete(int id);

    void authorizeUser(int id);

    boolean isAuthorized(String username, String password);

    void create(String username, String password);
}
