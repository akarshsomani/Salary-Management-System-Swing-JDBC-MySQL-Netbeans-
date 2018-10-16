package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			Class.forName("java.sql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/projectdatabase", "root", "1234");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}