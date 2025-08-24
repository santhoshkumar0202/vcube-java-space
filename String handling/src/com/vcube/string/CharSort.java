package com.vcube.string;

import java.util.Arrays;

public class CharSort {
	public static void main(String[] args) {
		System.out.println("main method started ");
		String s = "sakesh";

		char[] arr = s.toCharArray();

		Arrays.sort(arr);

		s=String.valueOf(arr);
		System.out.println(s);

	}
}
