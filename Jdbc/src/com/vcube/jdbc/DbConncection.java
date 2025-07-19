package com.vcube.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConncection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load
		// connection
		// create staements
		// result set
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch58", "root", "root");

			Statement st = con.createStatement();
			int a = st.executeUpdate("insert into student2(studentname,age) values('kiran',25),('samesh',25)");

			if (a > 0) {
				System.out.println(a+" success");
			} else {
				System.out.println("failed you");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
