package com.vcube.functional_interface_and_lamda;

interface TwoArg {
	int TWoArg(int x, int y);

	default void greet() {
		System.out.println("hi from two args");
	}
}

public class Lamda02 {

	public static void main(String[] args) {

		TwoArg num = (x, y) -> {
			return x + y;
		};

		System.out.println(num.TWoArg(10, 20));
		num.greet();
	}
}
