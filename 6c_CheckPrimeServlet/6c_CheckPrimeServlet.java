/* 6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure. */


package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CheckPrimeServlet")
public class CheckPrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><head><title>Prime Check Result</title></head><body>");
            out.println("<h2>Result:</h2>");
            out.println("<p>The number <strong>" + number + "</strong> is " +
                        (isPrime ? "<span style='color:green;'>a Prime Number</span>" :
                                   "<span style='color:red;'>not a Prime Number</span>") + ".</p>");
            out.println("<br><a href='prime.html'>Check Another Number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body><h3 style='color:red;'>Invalid input. Please enter a valid number.</h3>");
            out.println("<a href='prime.html'>Back</a></body></html>");
        }
    }

    // Optional: redirect GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.sendRedirect("prime.html");
    }
}
