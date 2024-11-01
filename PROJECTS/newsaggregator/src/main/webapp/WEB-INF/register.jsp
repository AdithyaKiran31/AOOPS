<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register - Personalized News Aggregator</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <header>
        <h1>Create Your Account</h1>
    </header>

    <form action="RegisterServlet" method="post">
        <c:if test="${not empty param.message}">
            <div class="alert">${param.message}</div>
        </c:if>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="preferences">Select Your Preferences:</label>
        <select name="preferences" id="preferences" multiple required>
            <option value="technology">Technology</option>
            <option value="sports">Sports</option>
            <option value="business">Business</option>
            <option value="entertainment">Entertainment</option>
            <option value="health">Health</option>
        </select>

        <input type="submit" value="Register">
    </form>

    <p>Already have an account? <a href="login.jsp">Login here</a></p> <!-- Link to login page -->

    <footer>
        <p>&copy; 2024 Personalized News Aggregator</p>
    </footer>
</body>
</html>