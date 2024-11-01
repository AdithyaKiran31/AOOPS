<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personalized News Aggregator</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <header>
        <h1>Welcome to the Personalized News Aggregator</h1>
    </header>
    
    <form action="news" method="get">
        <label for="category">Select News Category:</label>
        <select name="category" id="category" required>
            <option value="">--Select a category--</option>
            <option value="technology">Technology</option>
            <option value="sports">Sports</option>
            <option value="business">Business</option>
            <option value="entertainment">Entertainment</option>
            <option value="health">Health</option>
        </select>
        <input type="submit" value="Get News">
    </form>

    <p><a href="register.jsp">Register</a> | <a href="login.jsp">Login</a></p> <!-- Links to other pages -->

    <footer>
        <p>&copy; 2024 Personalized News Aggregator</p>
    </footer>
</body>
</html>