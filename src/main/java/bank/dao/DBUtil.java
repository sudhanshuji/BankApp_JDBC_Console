package bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bank.exception.DBUtilExceptions;

public class DBUtil {
	
	private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/bank_db";
	private static final String DBUsername = "root";
	private static final String dbPassword = "Welcome123";
	
	public static Connection getConnection() throws DBUtilExceptions {
		Connection conn = null;
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBURL, DBUsername, dbPassword);
			return conn;
		} catch (ClassNotFoundException e) {
			throw new DBUtilExceptions();
		} catch (SQLException e) {
			throw new DBUtilExceptions();
		}
	}

}
