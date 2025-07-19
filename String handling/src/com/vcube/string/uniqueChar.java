package com.vcube.string;

public class uniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bananas";
		String news = "";
		for (int i = 0; i < s.length(); i++) {
			if (news.indexOf(s.charAt(i)) == -1) {
				news += s.charAt(i);
			}
		}
 
		System.out.println("filtered:- " + news);
	}

}
 