import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection_firstweb {
static Connection getCon() {
	Connection con=null; 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch58","root","root");
		System.out.println("con executed");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.toString());
	}
	return con;
	
}
}
