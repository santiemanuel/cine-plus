package com.cineplus.sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
    
        Connection conn = null;
		
		public DbConnection() {
			
			Properties prop = new Properties();
			
			String propFile = new String("JDBCConnection.properties");
			
			try {
				prop.load(new FileInputStream(propFile));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String dbConnUrl = prop.getProperty("db.conn.url");
			String dbUser = prop.getProperty("db.username");
			String dbPassword = prop.getProperty("db.password");
			
			try {
				conn = DriverManager.getConnection(dbConnUrl, dbUser, dbPassword);
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public Connection getConnection() {
			return conn;
		}
		
		public void disconnect() {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
}
