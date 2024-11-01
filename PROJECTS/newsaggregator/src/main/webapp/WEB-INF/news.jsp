<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>News - Personalized News Aggregator</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your CSS file -->
</head>
<body>
    <header>
        <h1>Latest News</h1>
    </header>

    <div>
        <c:if test="${not empty newsList}">
            <ul>
                <c:forEach var="news" items="${newsList}">
                    <li>
                        <h2><a href="${news.url}" target="_blank">${news.title}</a></h2>
                        <p>${news.description}</p>
                    </li>
                </c:forEach>
            </ul>
        </c:if>
        <c:if test="${empty newsList}">
            <p>No news available for this category.</p>
        </c:if>
    </div>

    <footer>
        <p>&copy; 2024 Personalized News Aggregator</p>
    </footer>
</body>
</html>