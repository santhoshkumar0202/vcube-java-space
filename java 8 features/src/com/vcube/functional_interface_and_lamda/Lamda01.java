package com.vcube.functional_interface_and_lamda;

public class Lamda01 {
	public static void main(String[] args) {
		// if single para or arg no need of paranthesis and if it is single statement no
		// need of return key word and curly braces
		Addone num = x -> x + 10;
		System.out.println(num.addOne(10));
	}
}
