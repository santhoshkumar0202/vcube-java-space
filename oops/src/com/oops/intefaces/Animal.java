package com.oops.intefaces;

import java.awt.Color;

public interface Animal extends Animal1 {
	void legs();

	void sound();
//	void specality();
	
	public static void main(String [] args) {
		System.out.println("animal static");
		System.out.println("class name:- "+interface_name);
		
		
	}
	public static void main() {
		System.out.println("animal static 2");
		
		
	}
	
	public abstract void Color();
	
	private void animalname(String s) {
		System.out.println(s);
	}
	
	default void lifespan() {
		animalname("nainu");
		main();
		System.out.println(interface_name);
	
	}
	
	final String interface_name="animal";

}

interface Animal1 extends Animal2 {
	void legs();
	void sound();
	
}
interface Animal2 {
	void legs();
	void sound();
	void specality();
	
}
