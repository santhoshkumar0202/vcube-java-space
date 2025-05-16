package com.vucbe.case_studies;


import java.util.Scanner;



public class Case_study01_18_04_25 {

static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		cal(sc);
	}
	
	
	static void  cal(Scanner sc ) {
		System.out.println("insert a value");
		int a=sc.nextInt();
		System.out.println("insert b value");
				int b=sc.nextInt();
				System.out.println("result is "+add(a, b));
		
	
	}
	 static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
//	int multi() {
//		
//	}
//	int sub() {
//		
//	}
}
