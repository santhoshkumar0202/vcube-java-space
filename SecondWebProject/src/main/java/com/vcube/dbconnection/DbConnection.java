package com.vcube.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/batch58", "root", "root");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return con;

	};

}
