package com.newsaggregator.servlets;

import com.newsaggregator.dao.PreferenceDao;
import com.newsaggregator.models.User;
import com.newsaggregator.utils.NewsApiClient;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String apiKey = "1b6681a7aeda4c0fa022d482a2ab7aab";
    private PreferenceDao preferenceDao = new PreferenceDao();

    @SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String category = request.getParameter("category"); // Get the news category from the request
        NewsApiClient newsApiClient = new NewsApiClient();
        List<String> headlines;

        try {
            headlines = newsApiClient.getTopHeadlines(category);
            request.setAttribute("headlines", headlines);
            request.getRequestDispatcher("news.jsp").forward(request, response); // Forward to news.jsp
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error500.jsp"); // Redirect to error page
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if (user == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        List<String> preferences = preferenceDao.getUserPreferences(user.getId());
        String categories = String.join(",", preferences);

        // API request
        String apiUrl = "https://newsapi.org/v2/top-headlines?category=" + categories + "&apiKey=" + apiKey;
        @SuppressWarnings("deprecation")
		HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
        connection.setRequestMethod("GET");

        // Parse response
        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        @SuppressWarnings("resource")
		String jsonResponse = new BufferedReader(reader).lines().collect(Collectors.joining());
        
        JSONObject newsData = new JSONObject(jsonResponse);
        JSONArray articles = newsData.getJSONArray("articles");

        request.setAttribute("articles", articles);
        request.getRequestDispatcher("news.jsp").forward(request, response);
    }
   

}