package com.vcube.string;

public class CharCount {
	public static void main(String[] args) {
		String s = "success";
		String result = "";
		char ch = s.charAt(0);
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			} else {
				result = result + ch + count;
				ch=s.charAt(i);
				count=1;
			}
		}
		result = result + ch + count;

		System.out.println(result); // Output: s1u1c2e1s2
	}
}
