package com.newsaggregator.models;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private List<String> preferences; // Add this line if you want to store preferences

    // Default constructor
    public User() {
    }

    // Constructor with parameters
    public User(String username, String password, List<String> preferences) {
        this.username = username;
        this.password = password;
        this.preferences = preferences;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", preferences=" + preferences +
                '}';
    }
}