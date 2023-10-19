package com.ua.lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "admin";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String login = "test";
            String providedPassword = "test";

            String sql = "SELECT password FROM users WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, login);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String storedPassword = resultSet.getString("password");

                        if (providedPassword.equals(storedPassword)) {
                            System.out.println("Authentication successful. Welcome, " + login + "!");
                        } else {
                            System.out.println("Authentication failed. Invalid password.");
                        }
                    } else {
                        System.out.println("Authentication failed. User not found.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
