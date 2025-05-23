<%@ page import="java.sql.*" %>
<%
Connection con = null;
PreparedStatement ps = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

    String deleteQuery = "DELETE FROM Emp WHERE empname LIKE 'S%'";
    ps = con.prepareStatement(deleteQuery);
    int rowsDeleted = ps.executeUpdate();

    out.println("<h3>" + rowsDeleted + " record(s) deleted successfully.</h3>");
    response.sendRedirect("report.jsp");
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (ps != null) ps.close();
    if (con != null) con.close();
}
%>
