package com.vcube.assignment;

import java.util.Scanner;

public class Assignment_07_05_25 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
// user login details
		String username = sc.next();
		
		int password = sc.nextInt();
		

		if (username.equalsIgnoreCase("admin") && password == 1234) {
			System.out.println("successfully logged in");
			System.out.println("please enter the pin");
// taking pin input from user
			int pin = sc.nextInt();
			
			if (pin == 9999) {
				

				System.out.println("successfully pin matched");

				System.out.println("please enter the role");
// taking role input from user
				String role = sc.next();
				

				if (role.equalsIgnoreCase("superuser")) {
					System.out.println("yup you are authorized!! ");
				} else {
					System.out.println("you  are not authorized");
				}

			} else {
				System.out.println("please enter the pin correctly");
			}

		} else {
			System.out.println("please provide the valid credentials");
		}
		sc.close();
		
	}
	

}
