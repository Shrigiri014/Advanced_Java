<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test"; // DB URL
    String dbUser = "root"; // DB user (change as per your setup)
    String dbPassword = "password"; // DB password (change as per your setup)

    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        if (coffeeName != null && priceStr != null) {
            double price = Double.parseDouble(priceStr);

            // Insert the new coffee product
            String insertSQL = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, coffeeName);
            pstmt.setDouble(2, price);
            pstmt.executeUpdate();
        }

        // Read all records from coffee table
        String selectSQL = "SELECT * FROM coffee";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(selectSQL);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Coffee Products</title>
</head>
<body>
    <h2>List of Coffee Products</h2>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                double price = rs.getDouble("price");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= name %></td>
            <td><%= price %></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <a href="index.html">Add Another Coffee</a>
</body>
</html>

<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch(Exception e) {}
        try { if (stmt != null) stmt.close(); } catch(Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch(Exception e) {}
        try { if (conn != null) conn.close(); } catch(Exception e) {}
    }
%>
