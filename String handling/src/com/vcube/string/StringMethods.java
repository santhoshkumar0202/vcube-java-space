package com.vcube.string;

public class StringMethods {
	public static void main(String[] args) {
		String s = new String("astrenght");

		String[] s1 = s.split(s);
		System.out.println(s.codePointCount(1, 9));
		System.out.println(s.compareTo("Astrengt"));
	}
}
