<%@ page import="java.sql.*" %>
<h2>Salary Report</h2>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
double total = 0;

try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

  stmt = conn.createStatement();
  rs = stmt.executeQuery("SELECT * FROM Emp");

  while(rs.next()) {
    int no = rs.getInt("Emp_No");
    String name = rs.getString("Emp_Name");
    double basic = rs.getDouble("BasicSalary");

    out.println("Emp_No   : " + no);
    out.println("Emp_Name : " + name);
    out.println("Basic    : " + basic);
    out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    total += basic;
  }
} catch(Exception e){
  out.println("Error: " + e.getMessage());
} finally {
  if(rs != null) rs.close();
  if(stmt != null) stmt.close();
  if(conn != null) conn.close();
}
%>
Grand Salary : <%= total %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<a href="index.html">Go Back</a>
