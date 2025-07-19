package com.vcube.string;

public class Getchar {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("kiran madharchod");
		char[] ch = new char[10];

		name.getChars(6, 16, ch, 0);
		System.out.print(ch);

	}

}
