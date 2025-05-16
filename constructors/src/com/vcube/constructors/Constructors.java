package com.vcube.constructors;

public class Constructors {
String name;
int age1;

public Constructors() {
System.out.println("no arg constructor has been called");
	// TODO Auto-generated constructor stub
}
public Constructors(String name,int age) {
	System.out.println("para constructor has been called");
	// TODO Auto-generated constructor stub
	name=name;
	age=age;
	age1=age;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors n=new Constructors();
		Constructors n1=new Constructors("sam",26);
		n1.age1=28;
		System.out.println(n1.age1);
		
		
	}

}
