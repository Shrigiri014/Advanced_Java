<%@ page import="java.sql.*" %>
<%
String empNo = request.getParameter("empno");
String empName = request.getParameter("empname");
String basic = request.getParameter("salary");

Connection conn = null;
PreparedStatement ps = null;

try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

  ps = conn.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
  ps.setInt(1, Integer.parseInt(empNo));
  ps.setString(2, empName);
  ps.setDouble(3, Double.parseDouble(basic));

  int result = ps.executeUpdate();

  if(result > 0){
    out.println("<h3>Employee added successfully.</h3>");
  } else {
    out.println("<h3>Failed to insert employee.</h3>");
  }
} catch(Exception e){
  out.println("<h3>Error: " + e.getMessage() + "</h3>");
} finally {
  if(ps != null) ps.close();
  if(conn != null) conn.close();
}
%>
<a href="index.html">Add Another Employee</a> | <a href="report.jsp">View Report</a>
