<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>Results - Coffee Names Starting with D</title>
</head>
<body>
  <h2>Coffee Records Starting with 'D'</h2>
  <table border="1" cellpadding="10">
    <tr>
      <th>ID</th>
      <th>Coffee Name</th>
      <th>Price</th>
    </tr>
<%
Connection conn = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "your_password");

    // Query: coffee names starting with 'D'
    ps = conn.prepareStatement("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");
    rs = ps.executeQuery();

    boolean found = false;
    while (rs.next()) {
        found = true;
%>
    <tr>
      <td><%= rs.getInt("id") %></td>
      <td><%= rs.getString("coffee_name") %></td>
      <td><%= rs.getDouble("price") %></td>
    </tr>
<%
    }
    if (!found) {
%>
    <tr><td colspan="3">No coffee names starting with 'D' found.</td></tr>
<%
    }
} catch(Exception e) {
%>
    <tr><td colspan="3">Error: <%= e.getMessage() %></td></tr>
<%
} finally {
    if (rs != null) rs.close();
    if (ps != null) ps.close();
    if (conn != null) conn.close();
}
%>
  </table>
  <br>
  <a href="query.html">Back to Search</a>
</body>
</html>
