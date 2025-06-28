package com.vcube.string;


public class NonRepeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "swiss";
		int strng_length = s.length();
		char character = ' ';
		int count = 1;

		for (int i = 0; i < strng_length; i++) {
			int cur_count = 0;
			for (int j = 0; j < strng_length; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cur_count++;

				}
			}
			if (cur_count == count) {
				character = s.charAt(i);
				System.out.println(character);
//				break;

			}

		}
//		System.out.println(character);

	}

}
