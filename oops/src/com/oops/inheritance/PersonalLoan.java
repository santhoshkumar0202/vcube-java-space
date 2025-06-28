package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoan extends Loan{
	Scanner sc = new Scanner(System.in);
	
	int age = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("main method started");

		System.out.println("welcome to UNIVERSAL LOOTING PERSONAL LOAN BANK \n How May I Help You?");

		PersonalLoan p1 = new PersonalLoan();

//		int cibil = p1.getCibilScore();
//		int salary = p1.getSalary();
//		if (cibil > 700 && salary > 600000) {
//
//			System.out.println("hello from " + bankName);
//			System.out.println("you are eligible for personal loan");
//			System.out.println(p1.getAddress());
//			System.out.println("documents are getting verified");
//		} else {
//			System.out.println("sorry !! Try again after couple of months");
//		}

		greetings();
		System.out.println(area="sdks");
	}

}
