package com.oops.inheritance;

import java.util.Scanner;

public class Loan {
	// vishwa sir question
	static String bankName = "UNIVERSAL LOOTING PERSONAL LOAN BANK";
	static String area="twin";
	int age = 100;
	Scanner sc = new Scanner(System.in);

	int getCibilScore() {
		System.out.println("Please enter cibilscore :");
		int cibilscore = sc.nextInt();
		return cibilscore;
	}

	int getSalary() {
		System.out.println("Please enter salary:");
		int salary = sc.nextInt();
		return salary;
	}

	double getRateOfInterest() {
		double roi = 9.5;
		return roi;
	}

	String getAddress() {
		System.out.println("welcome to address section");
		String plotno = null;
		System.out.println("plot/flat no");
		if (sc.hasNextInt()) {

			
			return "provide valid plot no" ; 
		} else {
			plotno = sc.next();
		}

		System.out.println("Enter you city");
		String city = sc.next();
		System.out.println("Enter you district");
		String district = sc.next();
		System.out.println("Enter you state");
		String state = sc.next();
		System.out.println("Enter you pincode");
		long pincode = sc.nextInt();

		String address = "Address:- \nplot: " + plotno + ",  city: " + city + ", district:  " + district + ", state: "
				+ state + ", pincode: " + pincode;
		return address;
	}
	static void greetings() {
		
		System.out.println("hope everybody is good");
	}
}
