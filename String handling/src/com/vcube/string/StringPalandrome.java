package com.vcube.string;

import java.util.Scanner;

public class StringPalandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String originalString = sc.next();
		String reversedString = "";
		for (int i = 0; i < originalString.length(); i++) {
			// + return new object so that the reason we have to use equals method
			reversedString = originalString.charAt(i) + reversedString;

		}
		System.out.println(reversedString);
		if (originalString.equalsIgnoreCase(reversedString)) {
			System.out.println("given string is palandrome");
		} else {
			System.out.println("given string is not palandrome");
		}

		sc.close();
	}

}
