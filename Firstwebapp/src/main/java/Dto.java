
public class Dto {
	private int no;
	private String name;
	private int age;
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Dto(String name, int age) {
		this.name = name;
		this.age = age;
	}

	


}
