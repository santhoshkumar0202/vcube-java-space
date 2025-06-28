package com.vcube.string;

public class MostRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aabbcadddddcasanthoshhhhhhhhh";

		String index = " ";

		int char_count = 0;
		char character = ' ';

		for (int i = 0; i < input.length(); i++) {
			int curr_count = 0;
			String index1 = "";
			for (int j = 0; j < input.length(); j++) {

				if (input.charAt(i) == input.charAt(j)) {
					curr_count++;
					index1 += j + " ";
//					System.out.println(curr_count);
					if (char_count < curr_count) {
						index = index1;
						char_count = curr_count;
						character = input.charAt(i);

					}
				}
			}
		}
		System.out.println("char: " + character);
		System.out.println("indexs: " + index);
		System.out.println("char count: " + char_count);
	}

}
