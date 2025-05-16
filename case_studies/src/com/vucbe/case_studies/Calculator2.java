package com.vucbe.case_studies;

import java.util.Scanner;

public class Calculator2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to mini calculator world");
		System.out.println("Enter value one");
		 int a=sc.nextInt();
		 System.out.println("Enter value two");
		 int b=sc.nextInt();
		 System.out.println("Enter the operator");
		 String c=sc.next();
		cal(a, b, c);
	}
static void cal(int a,int b, String operator) {

	
	 
	if(operator.equals("+")) {
		
		int result =add(a, b);
		System.out.println(result);
		return;
	}else if (operator.equals("-")) {
		int result =sub(a, b);
		System.out.println(result);
		return;
	} else if (operator.equals("*") ){
		int result =multi(a, b);
		System.out.println(result);
		return;
	}
		
	
}
	static int add(int a,int b) {
		int sum =a+b;
	return sum;}
	// multi
	static int multi(int a,int b) {
		int result =a*b;
		return result;
	}
	static	int sub(int a,int b) {
			int sum =a-b;
			return sum;
			}
			// module
		static	int mod(int a,int b) {
				int sum =a%b;
				return sum;
	}

}
