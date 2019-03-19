package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static Connection getConnecttion() {
		Connection cons = null;
		try {

			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	          String url = "jdbc:sqlserver://localhost:1433;databaseName=sqlshop";
	          cons = DriverManager.getConnection(url,"sa", "12345678");
	          
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cons;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getConnecttion());
	}

}
