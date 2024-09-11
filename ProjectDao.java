package com.cestar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProjectDao {

	// This method returns a connection object
	public Connection setupConnection() {
		// create a variable of return type i.e connection
		Connection con = null;

		// Database credentials
		String user = "root";
		String pwd = "";
		String url = "jdbc:mysql://localhost:3306/library";

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Create a connection to the database
			con = DriverManager.getConnection(url, user, pwd);

			System.out.println("Connection Success");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
	public List<books> displayRecs(){
		
		//create a variable of return type i.e list
		
		List<books> library = new ArrayList<>();
		
	}
}
