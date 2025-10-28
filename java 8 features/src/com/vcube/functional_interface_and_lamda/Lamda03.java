package com.vcube.functional_interface_and_lamda;

@FunctionalInterface
interface int1 {
	void display();
}

//this is not called as functional interface when it extends if parents class doesnt have abstarct method then in that case it is valid . now its not valid
interface int2  extends int1{

//	void price();
}

public class Lamda03 {

	public static void main(String[] args) {

		
		int2 inter=()-> System.out.println("displayed");
		inter.display();
	
	}
}
