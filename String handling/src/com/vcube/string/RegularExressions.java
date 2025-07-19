package com.vcube.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "santhoshkumar8500@yahoo.in";

		System.out.println(email.replaceAll("^[a-zA-z\\d]+@{1}[a-zA-z]+\\.(com|in)?$", "s"));

		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher("17562king");
		System.out.println(m.matches());
		System.out.println(m.find());
		System.out.println(m.group());
	}

}
