package com.vcube.string;

public class CharCount {
	public static void main(String[] args) {
		String s = "success";
		String s1="abcaaabbcz";
		String result = "";
		char ch = s1.charAt(0);
		int count = 1;

		for (int i = 1; i < s1.length(); i++) {
			if (ch == s1.charAt(i)) {
				count++;
			} else {
				result = result + ch + count;
				ch=s1.charAt(i);
				count=1;
			}
		}
		result = result + ch + count;

		System.out.println(result); // Output: s1u1c2e1s2
	}
}
