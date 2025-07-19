package backend_application;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConncetion {

static public Connection getCon() {
 Connection con=null;
	//--> reflection api
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch58","root","root");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
	

};
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
