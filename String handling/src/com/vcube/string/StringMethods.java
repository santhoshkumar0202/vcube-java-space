package com.vcube.string;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = new String("astrenght la");
		char[] s2 = s.toCharArray();
		String s3 = "astrenght";
		String[] s1 = s.split(" ");
		System.out.println(s.codePointCount(1, 9));
		System.out.println(s.compareTo("Astrengt"));

		System.out.println(s.equals(s3));

		if (10 == 10)
			;

		System.err.println("56 ");
		for (int i = 0; i < s1.length; i++)
			;
		System.out.println("in for");
		System.out.println("10");
		System.out.println(Arrays.toString(s1));

		System.out.print(String.join("", s1));

		String names = "santhosh kumar singuru           ";

		System.out.println(names.trim().length());

		names = names.replace("", " ");
		String address = "ppplot no 21,umannagar colony, ppppmedchannl,hydearbad,telangana,501401";
		System.out.println(names.trim().length());

		System.out.print("20");

		String email = "santhoshkumar8500@yahoo.ink";

		System.out.println(address);
		System.out.println(email.replaceAll("^[a-zA-z\\d]+@{1}[a-zA-z]+\\.(com|in)?$", "s"));

	}
}
