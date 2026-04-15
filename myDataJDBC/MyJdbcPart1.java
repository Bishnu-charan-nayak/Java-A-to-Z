package myDataJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class MyJdbcPart1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/rooman";
        String un = "root";
        String pass = "Bablu@1...";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            Connection conn = DriverManager.getConnection(url, un, pass);
            System.out.println("Connection established");

            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM students";
            ResultSet res = stmt.executeQuery(query);

            // Print column names
            ResultSetMetaData meta = res.getMetaData();
            int colCount = meta.getColumnCount();

            for (int i = 1; i <= colCount; i++) {
                System.out.print(meta.getColumnName(i) + "\t");
            }
            System.out.println();

            // Print data
            while (res.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(res.getString(i) + "\t");
                }
                System.out.println();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace(); // IMPORTANT for debugging
        }
    }
}