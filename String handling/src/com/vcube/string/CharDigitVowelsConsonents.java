package com.vcube.string;

import java.util.Arrays;

public class CharDigitVowelsConsonents {

	public static void main(String[] args) {
		String s = "hello guys how are yoU guys doing 2334";
		char news[] = s.toLowerCase().toCharArray();
		System.out.println("Arr of char :"+Arrays.toString(news));
		int digit_count = 0;
		int vowels_count = 0;
		int consonents_count = 0;
		int char_count = 0;
		int total_char = 0;
		for (char c : news) {
			total_char++;
			if (Character.isLetter(c)) {

				char_count++;
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

					vowels_count++;
				} else {
					consonents_count++;
				}
			}
			if (Character.isDigit(c)) {

				digit_count++;
			}
		}

		System.out.println("char count " + char_count);// excluding white spaces and digits only char
		System.out.println("digit count " + digit_count);
		System.out.println("Vowels count " + vowels_count);
		System.out.println("consonents count " + consonents_count);
		System.out.println("total count " + total_char);// inlcuding white space and digits

	}

}
