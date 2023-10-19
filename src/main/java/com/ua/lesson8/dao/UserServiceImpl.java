package com.ua.lesson8.dao;

import com.ua.lesson8.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.ua.lesson8.util.SQLConstants.AUTHORIZE_USER;
import static com.ua.lesson8.util.SQLConstants.CREATE_USER;
import static com.ua.lesson8.util.SQLConstants.DELETE_USER_BY_ID;
import static com.ua.lesson8.util.SQLConstants.USER_BY_USERNAME;
import static com.ua.lesson8.dao.connection.JDBCConnection.getConnection;

public class UserServiceImpl implements UserService {

    @Override
    public void create(String username, String password) {
        Connection connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setBoolean(3, false);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getByUsername(String username) {
        Connection connection = getConnection();
        User user;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(USER_BY_USERNAME);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void delete(int id) {
        Connection connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void authorizeUser(int id) {
        Connection connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(AUTHORIZE_USER);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isAuthorized(String username, String password) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(USER_BY_USERNAME);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getBoolean("is_authorized");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
