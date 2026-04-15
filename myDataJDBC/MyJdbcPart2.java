package myDataJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbcPart2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/college_db";
		String un = "root";
		String pass = "Bablu@1...";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");

			Connection con = DriverManager.getConnection(url, un, pass);
			System.out.println("Connection established succesfully");
			
			Statement stmt = con.createStatement();
			String query1="insert into students(`id`,`name`,`age`,`college`,`degree`)values(1,'uma','30',IMIT','MCA')";
			String query2="insert into students(`id`,`name`,`age`,`college`,`degree`)values(2,'omm','23','BEC','Btech')";
			String query3="insert into students(`id`,`name`,`age`,`college`,`degree`)values(3,'Chinmaya','23','BEC','Btech')";
			String query4="insert into students(`id`,`name`,`age`,`college`,`degree`)values(4,'Sudhanshu','25','IMIT','MCA')";
			String query5="insert into students(`id`,`name`,`age`,`college`,`degree`)values(5,'Aman','RIT','','MCA')";
			
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			stmt.addBatch(query4);
			stmt.addBatch(query5); 
			stmt.executeBatch();
			
			String op="select * from students";
			ResultSet rs = stmt.executeQuery(op);
			while(rs.next()==true) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
			}
			

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}