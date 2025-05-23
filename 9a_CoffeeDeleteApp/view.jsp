<%@ page import="java.sql.*" %>
<h2>Remaining Coffee Records</h2>
<table border="1" cellpadding="10">
<tr>
  <th>ID</th>
  <th>Coffee Name</th>
  <th>Price</th>
</tr>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Connect to database
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "your_password");

    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM coffee");

    while(rs.next()) {
%>
<tr>
  <td><%= rs.getInt("id") %></td>
  <td><%= rs.getString("coffee_name") %></td>
  <td><%= rs.getDouble("price") %></td>
</tr>
<%
    }
} catch(Exception e){
    out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
} finally {
    if(rs != null) rs.close();
    if(stmt != null) stmt.close();
    if(conn != null) conn.close();
}
%>
</table>
<a href="delete.html">Delete a Coffee Product</a>
