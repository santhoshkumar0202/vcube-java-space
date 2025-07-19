package com.vcube.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class jumbling {

	public static void main(String[] args) {
		String input = "Vcube5 am2 I1 going3 to4";
		String sp[] = input.split(" ");
	
		String rsnew [] = new String[sp.length];
		for (String s : sp) {
//			System.out.println(s.charAt(s.length()-1));
			int a=Integer.parseInt(""+s.charAt(s.length()-1));
			String fil=s.replaceAll("\\d", "kiran");
			rsnew[a-1]=fil;
			
		}
		
		for (String string : rsnew) {
			System.out.print(string+" ");
		}
		
	
	}

}
