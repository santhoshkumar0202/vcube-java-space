package com.vcube;

public class Private_Class {

 private  String name="name leko";
String	friend_name="friend name leko";
	Private_Class(){
		
	}
	
void getName() {
	System.out.println(this.name);
	System.out.println(this.friend_name);
}
void setName(String name) {
	this.name=name;
	
}
}


class private1 extends Private_Class{
	String name;
//	String frieString;
	
	public private1() {
		// TODO Auto-generated constructor stub
	}
	

	public private1(String name,String friend_name) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.friend_name=friend_name;
//		
	}
	public static void main(String[] args) {
		System.out.println("private1 main i being called");
		private1 p=new private1("hari", "suri");
		
//		System.out.println(p.name);
//		System.out.println(p.friend_name);
		p.setName("mahesh");
		p.getName();
		
	}
	
	

	
}
 

class private2 extends private1{
//	String name;
//	String frieString;
	
	public private2(String name,String friend_name) {
		// TODO Auto-generated constructor stub
		super(name, friend_name);
//		this.name=name;
//		this.friend_name=friend_name;
		
	}
	public static void main(String[] args) {
		System.out.println("private2 main i being called");
		private2 p=new private2("hari", "suri");
		
//		System.out.println(p.name);/
		System.out.println(p.friend_name);
	}
	
	
	
	
}
