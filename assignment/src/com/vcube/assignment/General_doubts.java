package com.vcube.assignment;

//import java.lang.reflect.Method;

public class General_doubts {

	static{
		System.out.println("static  block");
	}
	
	public static void main(String[] args) {
		method1();
	}
	//static
	static void method1(){
		System.out.println("static method");
		General_doubts a = new General_doubts();
		
		
		
	}
	//instance
	int method2(){
		System.out.println("instance method");
		return 0;
	}
	
}
