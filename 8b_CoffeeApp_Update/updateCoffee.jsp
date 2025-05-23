<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Coffee Product</title>
</head>
<body>
<%
    // JDBC connection parameters
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = "your_password";  // Change this to your MySQL password

    Connection conn = null;
    PreparedStatement psUpdate = null;
    Statement stmt = null;
    ResultSet rs = null;

    int id = 0;
    String coffeeName = "";
    double price = 0.0;
    String message = "";

    try {
        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to DB
        conn = DriverManager.getConnection(url, user, password);

        // Read form parameters
        id = Integer.parseInt(request.getParameter("id"));
        coffeeName = request.getParameter("coffee_name");
        price = Double.parseDouble(request.getParameter("price"));

        // Update coffee record
        String updateSQL = "UPDATE coffee SET coffee_name=?, price=? WHERE id=?";
        psUpdate = conn.prepareStatement(updateSQL);
        psUpdate.setString(1, coffeeName);
        psUpdate.setDouble(2, price);
        psUpdate.setInt(3, id);

        int rowsUpdated = psUpdate.executeUpdate();

        if (rowsUpdated > 0) {
            message = "Coffee product updated successfully.";
        } else {
            message = "No coffee product found with ID " + id;
        }

        // Retrieve all records
        String selectSQL = "SELECT * FROM coffee";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(selectSQL);
%>
        <h2><%= message %></h2>
        <h3>All Coffee Products</h3>
        <table border="1" cellpadding="8" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }
    } catch (Exception e) {
%>
        <h3 style="color:red;">Error: <%= e.getMessage() %></h3>
<%
    } finally {
        // Close resources
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if (psUpdate != null) try { psUpdate.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
        </table>
    <br>
    <a href="updateCoffee.html">Back to Update Form</a>
</body>
</html>
