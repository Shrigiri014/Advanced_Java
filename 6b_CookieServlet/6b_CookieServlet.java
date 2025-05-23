/* 6b. Build a servlet program to create a cookie to get your name through text box and press submit
   button( through HTML) to display the message by greeting Welcome back your name ! , you have
   visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.
*/


package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    // Use session to store visit count per user (since 'count' is per servlet, not user)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        // Set cookie if user provided name
        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // 1-minute expiry
            userCookie.setPath("/");
            response.addCookie(userCookie);

            // Set a new visit count cookie for first-time user
            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(60);
            countCookie.setPath("/");
            response.addCookie(countCookie);
        }

        // Get cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int visitCount = 1;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("count")) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    } catch (NumberFormatException e) {
                        visitCount = 1;
                    }
                }
            }
        }

        // Update visit count cookie if returning user
        if (existingUser != null) {
            Cookie countCookie = new Cookie("count", String.valueOf(visitCount));
            countCookie.setMaxAge(60);
            countCookie.setPath("/");
            response.addCookie(countCookie);
        }

        // Output
        out.println("<html><head><title>Cookie Servlet</title></head><body>");
        if (existingUser != null) {
            out.println("<h2>Welcome back, " + existingUser + "!</h2>");
            out.println("<h3>You have visited this page " + visitCount + " times!</h3>");
            out.println("<form method='post' action='CookieServlet'>");
            out.println("<input type='submit' value='Logout (Clear Cookies)'>");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Clear both user and count cookies
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);
        userCookie.setPath("/");

        Cookie countCookie = new Cookie("count", "");
        countCookie.setMaxAge(0);
        countCookie.setPath("/");

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}
