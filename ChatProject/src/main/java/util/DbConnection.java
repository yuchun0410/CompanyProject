package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {

	}
	
	public static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="00000000";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			
		}catch(ClassNotFoundException e){
			System.out.println("No Driver");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("No Connection");
			e.printStackTrace();
		}return conn;
		
	}
	

}
