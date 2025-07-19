import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Dto dt=new Dto("kiran", 45);
Dao_interface da= new Dao();
System.out.println("main s");
//da.updateStudent(dt);
ResultSet rs=da.readStudent();

while (rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3));

	
}

da.deleteStudent(dt);
System.out.println("main e");
	}

}
