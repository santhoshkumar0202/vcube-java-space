package com.vcube.assignment;

public class Assignment_09_04_25 {

	public static void main(String[] args) {
		System.out.println("hi i'm main method");
		
		//Byte wrapper class
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		//short wrapper class
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		//Integer wrapper class
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		//Integer wrapper class
		System.out.println(Character.MIN_VALUE);
		
		System.out.println(Character.MAX_VALUE);
		//Integer wrapper class
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		//Integer wrapper class
		System.out.println("decimal");
		System.out.println("float");
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println("double");
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
	}

	// static method
	static void method1() {

		System.out.println("1st static method");

		// non static methods

	}

	void method2() {
		System.out.println("2nd non-static method");

	}

	void method3() {

		System.out.println("3rd non-static method");

	}

	void method4() {

		System.out.println("4th static method");

	}

	static {
		Assignment_09_04_25 obj = new Assignment_09_04_25();

		
		   method1();

//		System.out.println(obj.method2());
		obj.method3();

		obj.method4();

	}
	
	
	
	
	
	

}
