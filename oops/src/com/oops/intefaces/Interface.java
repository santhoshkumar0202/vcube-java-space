package com.oops.intefaces;

import java.sql.Connection;

 public class Interface implements Animal {
	private Interface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("hello");
		Interface.kelo();

	}

	@Override
	public void specality() {
		// TODO Auto-generated method stub

	}

	@Override
	public void legs() {
		// TODO Auto-generated method stub

	}

	public void lifespan() {
		// TODO Auto-generated method stub
		System.out.println("life span from interface class");
		sound();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub

	}

	static public void kelo() {
		System.out.println("konsa jel");
//		lifespan();
		//instance methods can't be called
	}
// abstract methods 
//	abstract void classname();
//
//}






class Interface2 extends Interface {
	public static void main(String[] args) {
		System.out.println("inter2");
		Interface dc = new Interface();
		dc.lifespan();
	}

//	@Override
//	void classname() {
//		// TODO Auto-generated method stub
//		
//	}
	
}}
