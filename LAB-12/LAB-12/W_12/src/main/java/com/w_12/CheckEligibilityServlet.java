package com.w_12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckEligibilityServlet")
public class CheckEligibilityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        
        try {
            int age = Integer.parseInt(ageStr);
            EligibilityChecker eligibilityChecker = new EligibilityChecker(name, age);
            String message = eligibilityChecker.checkEligibility();

            out.println("<html><body>");
            out.println("<h2>" + message + "</h2>");
            out.println("<a href='voterForm.html'>Go Back</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Invalid age input. Please enter a valid number.</h2>");
            out.println("<a href='voterForm.html'>Go Back</a>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}