package com.ua.lesson8.util;

public class SQLConstants {
    public final static String CREATE_USER = "INSERT INTO users (username, password, is_authorized) VALUES (?, ?, ?)";
    public final static String DELETE_USER_BY_ID = "DELETE FROM users WHERE id = ?";
    public final static String AUTHORIZE_USER = "UPDATE users SET is_authorized = true WHERE id = ?";
    public final static String USER_BY_USERNAME = "SELECT * FROM users WHERE username = ?";
}
