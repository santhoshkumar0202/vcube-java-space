package com.vcube.string;

public class CharcountAndCount {

	public static void main(String[] args) {

		System.out.println("main method started");
		String s = "succcess";
		String new_s = "";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			char ch = s.charAt(i);
			if (!new_s.contains("" + ch)) {

				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == ch) {
						count++;
					}

				}

				new_s += ch + "" + count;
				// System.out.println(count);
			}
		}
		System.out.println(new_s);

	}

}
