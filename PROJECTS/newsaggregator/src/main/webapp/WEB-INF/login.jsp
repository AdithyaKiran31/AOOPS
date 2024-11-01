<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Personalized News Aggregator</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <header>
        <h1>Login to Your Account</h1>
    </header>

    <form action="login" method="post">
        <c:if test="${not empty param.message}">
            <div class="alert">${param.message}</div>
        </c:if>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Login">
    </form>

    <p>Don't have an account? <a href="register.jsp">Register here</a></p> <!-- Link to registration page -->

    <footer>
        <p>&copy; 2024 Personalized News Aggregator</p>
    </footer>
</body>
</html>