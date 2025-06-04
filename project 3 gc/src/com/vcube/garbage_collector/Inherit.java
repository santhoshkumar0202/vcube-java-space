package com.vcube.garbage_collector;

public class Inherit {
String name= "parent";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inherit a=new Inherit();
a.hello();
a.hello("santhosh");
	}
	void hello() {
		System.out.println("bolo");
	}
	void hello(String n) {
		System.out.println("hi "+n );
	}

}

class child  extends Inherit{
	String name="child";
	public static void main(String[] args) {
		child a=new child();
		System.out.println(a.name);
		a.hello();
		a.hello("harish");
	}
	@Override
	void hello() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	@Override
	void hello(String s) {
		super.hello(s);
		System.out.println("whats upp");
	}
	
	
	
}

class subchild extends child{
	
}
