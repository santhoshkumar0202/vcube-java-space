package com.opps.encapsulation;

public class Encapsulation {
private	String name = "santhosh1";
	private long phone_no = 7730063638L;
	int age=18;

	public Encapsulation() {
		System.out.println("no arg con");
	}

	public Encapsulation(String name, long phone_no) {
		super();
		this.name = name;
		this.phone_no = phone_no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main method started ");

	}
 void setName(String name) {
	 this.name=name;
 }
	void getName() {
		System.out.println(name);
	}

	void getPhone_no() {
		System.out.println(phone_no);
	}
	void age() {
		System.out.println(this.age);
	}
}

class utility {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation("kiran", 7730063638L);
		e.getName();
		e.getPhone_no();
	}
}

//inherit
class MinEncap extends Encapsulation {
	 String name = "ss";
	 int age=25;

	MinEncap() {
//		super("sikindhar", 7000450521l);

	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("main method started from MinEncap");

		MinEncap m = new MinEncap();
//		System.out.println(m.name);
		m.getName();
//		m.setName("roman");
//		m.getName();
		m.age();

	}
	
	

//	@Override
//	void getName() {
//		// TODO Auto-generated method stub
//		super.getName();
////		System.out.println(super.name);
//	}

	
}