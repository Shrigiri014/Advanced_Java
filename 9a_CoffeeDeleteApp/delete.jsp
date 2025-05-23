<%@ page import="java.sql.*" %>
<%
String id = request.getParameter("id"); // Get coffee ID from form
Connection conn = null;
PreparedStatement ps = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Connect to test database
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "your_password");

    // SQL to delete coffee record
    ps = conn.prepareStatement("DELETE FROM coffee WHERE id = ?");
    ps.setInt(1, Integer.parseInt(id));

    int result = ps.executeUpdate(); // Execute deletion

    if(result > 0) {
        out.println("<h3>Record with ID " + id + " deleted successfully.</h3>");
    } else {
        out.println("<h3>No record found with ID " + id + ".</h3>");
    }
} catch(Exception e){
    out.println("<h3>Error: " + e.getMessage() + "</h3>");
} finally {
    if(ps != null) ps.close();
    if(conn != null) conn.close();
}
%>
<a href="delete.html">Delete Another</a> | <a href="view.jsp">View All</a>
