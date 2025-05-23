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

  ps = conn.prepareStatement("UPDATE Emp SET Emp_Name = ?, BasicSalary = ? WHERE Emp_No = ?");
  ps.setString(1, empName);
  ps.setDouble(2, Double.parseDouble(basic));
  ps.setInt(3, Integer.parseInt(empNo));

  int result = ps.executeUpdate();

  if(result > 0){
    out.println("<h3>Employee record updated successfully.</h3>");
  } else {
    out.println("<h3>No record found with Emp_No: " + empNo + "</h3>");
  }
} catch(Exception e){
  out.println("<h3>Error: " + e.getMessage() + "</h3>");
} finally {
  if(ps != null) ps.close();
  if(conn != null) conn.close();
}
%>
<a href="update.html">Update Another</a> | <a href="show.jsp">View All Employees</a>
