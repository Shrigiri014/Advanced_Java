<%@ page import="java.sql.*" %>
<%
int empno = Integer.parseInt(request.getParameter("empno"));
String empname = request.getParameter("empname");
double basicsalary = Double.parseDouble(request.getParameter("basicsalary"));

Connection con = null;
PreparedStatement ps = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

    String query = "INSERT INTO Emp (empno, empname, basicsalary) VALUES (?, ?, ?)";
    ps = con.prepareStatement(query);
    ps.setInt(1, empno);
    ps.setString(2, empname);
    ps.setDouble(3, basicsalary);

    ps.executeUpdate();
    response.sendRedirect("report.jsp");
} catch(Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (ps != null) ps.close();
    if (con != null) con.close();
}
%>
