package com.vcube.string;

import java.util.Scanner;

public class ReverseWordFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st="";
		String resultString="";
		String input=sc.nextLine();
		System.out.println(input);
		
//		if(){}

		for (int i = 0; i < input.length(); i++) {
			String str=input.charAt(i)+"";
			if(!str.equals(" ")) {st=input.charAt(i)+st;}
			
			if(str.equals(" ") | i==input.length()-1) {
				resultString =resultString+st+" "  ;
				st="";
			
			}
			
			
		}
		System.out.println(resultString);
	}
	

}
