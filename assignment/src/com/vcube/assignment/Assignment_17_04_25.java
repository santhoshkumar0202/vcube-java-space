package com.vcube.assignment;

import java.util.Scanner;

public class Assignment_17_04_25 {

	public static void main(String[] args) {
		System.out.println("main method started of 17_04_25 ");
// addition method has been calling here
//	 int sum_result=addition(12,45);
		
	 // multi method has been calling here
//	 System.out.println("result "+sum_result);
//	 int multi_result=multiplication(12,45);
		
	 // division method has been calling here
//	 System.out.println("result "+multi_result);
//	 int div_result=division(12,45);
//	 // per method has been calling here
//	 System.out.println("result "+div_result);
//	 int per_result=percential(2,10);
//	 
//	 System.out.println("result "+per_result);
		
		System.out.println(addition());

	}

	static int addition(int i, int j) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		i = sc.nextInt();
		System.out.println("enter second value");
		j = sc.nextInt();
		System.out.println("addition method has been called");

		int sum = i + j;
		return sum;
	}
	static int multiplication(int i, int j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		i = sc.nextInt();
		System.out.println("enter second value");
		j = sc.nextInt();
		System.out.println("multi method has been called");
		
		int multi = i * j;
		return multi;
	}
	static int division(int i, int j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		i = sc.nextInt();
		System.out.println("enter second value");
		j = sc.nextInt();
		System.out.println("divisiom method has been called");
		
		int div = i / j;
		return div;
	}
	static int percential(int i, int j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		i = sc.nextInt();
		System.out.println("enter second value");
		j = sc.nextInt();
		System.out.println("divisiom method has been called");
		
		int per = i % j;
		return per;
	}
	
	//char addition
	
	static String addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition char has been called");
		System.out.println("can give the first char or string");
	char	char1= sc.next().charAt(0);
	System.out.println("can give the second char or string");
	char	char2= sc.next().charAt(0);
	
            char char3='s';
	String char1_sum=char1+""+char2;
	
		return char1_sum;
	}
	

}
