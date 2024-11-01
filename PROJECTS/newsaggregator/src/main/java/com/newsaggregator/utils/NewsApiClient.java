package com.newsaggregator.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class NewsApiClient {
    private static final String API_KEY = "1b6681a7aeda4c0fa022d482a2ab7aab"; // Replace with your News API key
    private static final String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=1b6681a7aeda4c0fa022d482a2ab7aab";

    public List<String> getTopHeadlines(String category) throws IOException {
        List<String> headlines = new ArrayList<>();
        String urlString = BASE_URL + "top-headlines?category=" + category + "&apiKey=" + API_KEY;

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONArray articles = jsonResponse.getJSONArray("articles");

            for (int i = 0; i < articles.length(); i++) {
                JSONObject article = articles.getJSONObject(i);
                String title = article.getString("title");
                headlines.add(title);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return headlines;
    }
}