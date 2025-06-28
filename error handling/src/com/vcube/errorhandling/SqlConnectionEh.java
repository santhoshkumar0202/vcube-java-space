package com.vcube.errorhandling;

import java.security.interfaces.RSAKey;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SqlConnectionEh {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
// loading
		// reflcetion api (secondary memory to primary memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("** Driver successfully loaded");
// establishment
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch58", "root", "root");
		System.out.println("** establishment was successfull ");
		// create statement;
		
	Statement st= con.createStatement();
	String sql="select * from emp;";
	// result set
	ResultSet re=st.executeQuery(sql);
	// result represntation;
	while (re.next()) {
 
		
		System.out.println(re.getString("hiredate")+" ");
//		System.out.print(re.getString("2"));
//		System.out.print(re.getString("2"));
//		System.out.print(re.getString("2"));
//		re.close();
		
	}
		
	}

}
