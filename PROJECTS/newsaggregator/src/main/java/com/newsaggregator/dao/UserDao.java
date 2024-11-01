package com.newsaggregator.dao;
import com.newsaggregator.models.User;
import com.newsaggregator.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    // Method to get user by username and password
    public User getUserByUsernameAndPassword(String username, String password) {
        User user = null;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password); // Consider hashing the password

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password")); // Store hashed password if implemented
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // Method to check if a user exists by username
    public boolean userExists(String username) {
        boolean exists = false;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    // Method to save a new user
    public boolean saveUser(User user) {
        boolean isSaved = false;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword()); // Store hashed password here if implemented

            int rowsAffected = stmt.executeUpdate();
            isSaved = rowsAffected > 0; // Return true if a row was inserted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSaved;
    }
}