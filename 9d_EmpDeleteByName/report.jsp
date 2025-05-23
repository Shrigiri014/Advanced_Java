<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>Salary Report</title>
</head>
<body>
  <h2>Salary Report (After Deletion)</h2>
<%
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

    stmt = con.createStatement();
    rs = stmt.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
        int empno = rs.getInt("empno");
        String empname = rs.getString("empname");
        double salary = rs.getDouble("basicsalary");
%>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
    Emp_No : <%= empno %><br>
    Emp_Name: <%= empname %><br>
    Basic : <%= salary %><br>
<%
    }
%>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
<%
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (rs != null) rs.close();
    if (stmt != null) stmt.close();
    if (con != null) con.close();
}
%>
<br><a href="deleteForm.html">Go Back</a>
</body>
</html>
