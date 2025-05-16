package com.vcube.assignment;
// methods

//class
public class Assignment_16_04_25 {
	static Assignment_16_04_25 t =new Assignment_16_04_25();
	static{
		
		System.out.println("static block 1");
		
		t.addition(100.12, 10);
		
		t.addition(90, 10);
		t.addition("king", 10);
		
	}
	
	
	{
	
		System.out.println("instance block 1");
	}
	static{
		System.out.println("static block 2");
	}
	
	//instance block 2
	{
		
		System.out.println("instance block 2");
	}
	
	
	
//	 main method is  a entry point of the program
	public static void main(String[] args) {
	
		System.out.println("main method started");
		
	}
	
	
	void addition(Double i,int j ) {
		
		System.out.println("result "+ (i+j));
		
	}
	void addition(int i,int j ) {
		
		System.out.println("result "+ (i+j));
		
	}
	void addition(char i,int j ) {
		
		System.out.println("result "+ (i+j));
		
	}
	void addition( String i,int j ) {
		
		System.out.println("result "+ (i+j));
		
	}
	void addition( byte i,byte j ) {
		
		System.out.println("result of byte para "+ (i+j));
		
	}
	
	
	
	
	

}
