package com.newsaggregator.servlets;

import com.newsaggregator.dao.UserDao;
import com.newsaggregator.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao = new UserDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] preferencesArray = request.getParameterValues("preferences");

        // Check if preferences are selected
        if (preferencesArray == null || preferencesArray.length == 0) {
            response.sendRedirect("register.jsp?message=Please select at least one preference.");
            return;
        }

        List<String> preferences = Arrays.asList(preferencesArray);

        // Check if username already exists
        if (userDao.userExists(username)) {
            response.sendRedirect("register.jsp?message=Username already taken. Please choose another.");
            return;
        }

        // Validate password (add any custom validation logic here)
        if (password == null || password.trim().isEmpty()) {
            response.sendRedirect("register.jsp?message=Password cannot be empty.");
            return;
        }

        // Hash the password for security (you can use a hashing library here)
        String hashedPassword = hashPassword(password);

        // Create a new user and set preferences
        User user = new User(username, hashedPassword, preferences);

        // Save user and preferences in the database
        boolean isUserSaved = userDao.saveUser(user);
        
        if (isUserSaved) {
            response.sendRedirect("index.jsp?message=Registration successful! Please login.");
        } else {
            response.sendRedirect("register.jsp?message=Registration failed. Please try again.");
        }
    }

    // Method to hash the password (implement with a library like BCrypt)
    private String hashPassword(String password) {
        // Placeholder: Use a proper hashing function for production
        return password; // Replace this with actual hashing logic
    }
}