package com.oops.inheritance;

import java.util.Scanner;

public class HomeLoan extends Loan {

	Scanner sc = new Scanner(System.in);

	int age = 108;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main method started");

		System.out.println("welcome to UNIVERSAL LOOTING PERSONAL LOAN BANK \n How May I Help You?");

		HomeLoan p1 = new HomeLoan();
		Loan p2 = new HomeLoan();

		int cibil = p1.getCibilScore();
		int salary = p1.getSalary();
		if (cibil >= 700 && salary >= 500000) {

			System.out.println("hello from " + bankName);
			System.out.println("you are eligible for Home Loan");
			System.out.println("The Rate of interest is : " + p1.getRateOfInterest());
			System.out.println(p1.getAddress());
			System.out.println("documents are getting verified");
		} else {
			System.out.println("sorry !! Try again after couple of months");
		}

	}

	@Override
	double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.0;
	}

}
