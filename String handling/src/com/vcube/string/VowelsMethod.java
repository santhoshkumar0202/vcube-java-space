package com.vcube.string;

import java.util.Scanner;

public class VowelsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vowelString = "aeiou";
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vowelsCount = 0;
		for (int i = 0; i < vowelString.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (vowelString.charAt(i) == str.toLowerCase().charAt(j)) {
					vowelsCount++;
				}
			}
		}
		sc.close();
		
		System.out.println(vowelsCount);

	}

}
