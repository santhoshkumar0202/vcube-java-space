package com.vcube.functional_interface_and_lamda;

//java features 
// functional interfaces
// lamda expressions
// functions (predicate,fucntions,consumer,producer.....etc)
// stream api
// date api 
//nodse java script
// string joiner
// optional class 
// method references :: or foreach
// comparable and comparator 

@FunctionalInterface
interface InitialInterface {
	void greetings();
}

interface Addone{
	
	int addOne(int x);
}

public class Functional_lamda {

	// lamda expressions mean no modifiers , return type , no name
	// anonymous obj

	public static void main(String[] args) {
		InitialInterface gre = () -> {
			System.out.println("hello welcome to the world of java 8 features");
		};

		gre.greetings();
	}
}
