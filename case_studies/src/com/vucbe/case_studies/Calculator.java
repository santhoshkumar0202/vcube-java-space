package com.vucbe.case_studies;

import java.util.Scanner;

public class Calculator {
	static String s;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("insert a value " + null);
		int a = sc.nextInt();
		System.out.println("insert b value" + s);
		int b = sc.nextInt();

		Calculator add_result = new Calculator();

		System.out.println(add_result.add(a, b));
//	System.out.println(add_result.multi(a, b));
//	System.out.println(add_result.mod(a, b));
//	System.out.println(add_result.sub(a, b));
//	

	}

int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// multi
	int multi(int a, int b) {
		int result = a + b;
		return result;
	}

	int sub(int a, int b) {
		int sum = a - b;
		return sum;
	}

	// module
	int mod(int a, int b) {
		int sum = a % b;
		return sum;
	}
}
