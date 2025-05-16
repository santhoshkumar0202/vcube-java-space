package com.vcube.constructors;

public class Constructor1 {
 String name="sam";
 String surname;
 
 String lastname;
 String district;
// String
	public Constructor1() {
		this("sashanth");
		System.out.println("no arg constructor");
		
	}
	public Constructor1(String name ,String surname, String lastname ,String district ) {
//		this("sashanth");
		this.name=name;
		
		System.out.println("no arg constructor");
		this.surname=surname;
		this.lastname=lastname;
		this.district=district;
	}
	public Constructor1(String name) {
		this(name,"not provides","not provided","not");
		System.out.println("one arg constructor");
		this.name=name;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Constructor1 student=new Constructor1();
		student.details();
		
		
		
		Constructor1 student2=new Constructor1("kishore");
		student2.details();
	}
	
	public void details() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(lastname);
		System.out.println(district);
//		System.out.println(name);
	}
	
	
}


