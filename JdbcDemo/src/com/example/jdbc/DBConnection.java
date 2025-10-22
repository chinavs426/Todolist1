package com.example.jdbc;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/testdb3?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "Mtkr617$$$$";

        try {
            // optional with modern drivers, but safe to include
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 PreparedStatement ps = conn.prepareStatement("SELECT id, name FROM users");
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver class not found — add the JDBC driver jar to project build path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL error:");
            e.printStackTrace();
        }
    }
}