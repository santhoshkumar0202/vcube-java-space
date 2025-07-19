package com.vcube.string;

import java.util.Iterator;

public class maxpalandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helo");
		String pal="malayalam";
		for (int i = 0; i < pal.length(); i++) {
			for (int j = i+2; j < pal.length()+1; j++) {
				
				String sub=pal.substring(i,j);
				
				if (ispal(sub)) {
					System.out.println(sub);
				}
			}
		}
		
	}

	static boolean ispal(String s) {
		
		boolean status=true;
		String str = s;
		int start = 0;
		int end = str.length()-1;
		
//		System.out.println(str.charAt(start));

		while (start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			} else {
				return status=false;
			}

		}
		return status;

	}
}
