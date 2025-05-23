<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    if (name != null && !name.isEmpty()) {
        // Display welcome message
        out.print("Welcome! " + name + "<br>");
        out.print("Session has started for " + name + "<br>");
        
        // Store name in session
        session.setAttribute("user", name);
        
        out.print("Your name has been stored in the session.<br>");
        
        // Set session timeout to 60 seconds
        session.setMaxInactiveInterval(60);
        
        out.print("Session will expire after 1 minute of inactivity.<br>");
        out.print("Click the link below to check the session value:<br>");
%>
        <a href="second.jsp">Display the session value</a>
<%
    } else {
        out.print("No name provided. Please go back and enter your name.");
    }
%>
</body>
</html>
