
import java.nio.channels.NonWritableChannelException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao implements Dao_interface {
	static public Connection con = dbconnection_firstweb.getCon();

	@Override
	public void insertStudent(Dto dt) {
		// TODO Auto-generated method stub
		try {

			PreparedStatement st = con.prepareStatement("insert into student2(studentname,age) values(?,?) ");
			st.setString(1, dt.getName());
			st.setInt(2, dt.getAge());
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
	public void updateStudent(Dto dt) {
		// TODO Auto-generated method stub
		try {

			PreparedStatement st = con.prepareStatement("update student2 set age=? where studentname=? ");
			st.setString(2, dt.getName());
			st.setInt(1, dt.getAge());
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
	public ResultSet readStudent() {
		// TODO Auto-generated method stub
		ResultSet res = null;
		try {

			PreparedStatement st = con.prepareStatement("select * from student2");

			res = st.executeQuery();
			System.out.println("into select");
//			while (res.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3));
//
//				
//			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void deleteStudent(Dto dt) {
		// TODO Auto-generated method stub
		try {

			PreparedStatement st = con.prepareStatement("delete from student2  where studentname=? ");
			st.setString(1, dt.getName());
			int return_value = st.executeUpdate();
			if (return_value > 0) {
				System.out.println(return_value + ": Row (s) affected");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void kel() {
		// TODO Auto-generated method stub
		System.out.println("ki");
	}

}
