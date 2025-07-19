import java.sql.ResultSet;

public interface Dao_interface {
public void insertStudent(Dto dt);
public void updateStudent(Dto dt);
public void deleteStudent(Dto dt);

public ResultSet readStudent();
}
