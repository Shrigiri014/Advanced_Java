<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>Salary Report</title>
</head>
<body>
  <h2>Salary Report</h2>
<%
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
double totalSalary = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

    stmt = con.createStatement();
    rs = stmt.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
        int no = rs.getInt("empno");
        String name = rs.getString("empname");
        double salary = rs.getDouble("basicsalary");
        totalSalary += salary;
%>
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
  Emp_No : <%= no %><br>
  Emp_Name: <%= name %><br>
  Basic : <%= salary %><br>
<%
    }
%>
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
  <strong>Grand Salary : <%= totalSalary %></strong><br>
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
<%
} catch(Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (rs != null) rs.close();
    if (stmt != null) stmt.close();
    if (con != null) con.close();
}
%>
<br><a href="index.html">Insert Another Record</a>
</body>
</html>
