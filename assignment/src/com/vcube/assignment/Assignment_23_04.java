package com.vcube.assignment;

//import java.math.BigInteger;

public class Assignment_23_04 {
   String name;
   float salary;
   static int age=20;
   static long number;
   static String hello;
	Assignment_23_04(){
		System.out.println("no arg has been called");
	this.name="not assigned";
	this.salary=0;
	
	
}
	Assignment_23_04(String name, float salary){
		System.out.println("para has been called");
		this.name=name;
		this.salary=salary;
		
		
	}
	Assignment_23_04(String name, float salary, long number){
		System.out.println("para has been called");
		this.name=name;
		this.salary=salary;
		this.number=number;
		
	}
	public static void main(String[] args) {
		Assignment_23_04 n=new Assignment_23_04();
		Assignment_23_04 n1=new Assignment_23_04("kiran",200);
		Assignment_23_04 n3=new Assignment_23_04("kiran",200,7730058585l);
		
		
//		System.out.println(n.name);
//		System.out.println(n.salary);
//		System.out.println(n1.salary);
		System.out.println(n3.name);
		System.out.println(n3.number);
		System.out.println(n3.hello);
		n1.hobbie("hello");
	System.out.println(	goal("char"));
	}
	
	void hobbie(String name) {
		System.out.println(this.name);
		System.out.println(name);
	
		
//		return name;
	}
	
	 static char goal(String name) {
//		System.out.println(this.name);
		System.out.println(name);
		char h=107;
		
		return h;
	}
	
	
}
