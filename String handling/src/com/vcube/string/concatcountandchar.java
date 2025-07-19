package com.vcube.string;

public class concatcountandchar {
	public static void main(String[] args) {
		String s = "abcaabbcz";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					continue;
				}
				break;
			}
			if (count > 1) {
				System.out.print(count + "" + s.charAt(i));
				i++;
			} else {
				System.out.print(count + "" + s.charAt(i));
			}
		}
	}
}
