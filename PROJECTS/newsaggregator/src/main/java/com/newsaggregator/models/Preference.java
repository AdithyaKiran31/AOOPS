package com.newsaggregator.models;

public class Preference {
    private int userId;
    private String category;

    // Default constructor
    public Preference() {
    }

    // Constructor with parameters
    public Preference(int userId, String category) {
        this.userId = userId;
        this.category = category;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "userId=" + userId +
                ", category='" + category + '\'' +
                '}';
    }
}