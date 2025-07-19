package backend_application;

import java.nio.channels.NonWritableChannelException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao implements Dao_interface {
	public Connection con = new DbConncetion().getCon();
	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		try {
			
			PreparedStatement st = con.prepareStatement("insert into student2(studentname,age) values(?,?) ");
			st.setString(1, "surya");
			st.setInt(2, 45);
			int return_value = st.executeUpdate();
			if (return_value > 0) {
				System.out.println(return_value + ": Row (s) affected");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		//class not found CE 
Dao dao=new Dao();
dao.insertStudent();

	}

}
