package com.vcube.utill.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {


 public static Connection getConnection(){
	  Connection con=null;
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/eventmanagement","root","root");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getStackTrace());
		System.out.println("connection error");
	}
	
	return con;
	 
	 
 }
}
