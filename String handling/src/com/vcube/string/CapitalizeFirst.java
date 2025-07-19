package com.vcube.string;

public class CapitalizeFirst {
	
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("java is simple");
	
	String s1=null+"";
	s1=s1+ " sam ";
	System.out.println(s1);
System.out.println(" ".trim().length());

	
	String []s2=s1.split(" ");
	for (String str : s2) {
		String c=str.charAt(0)+"";
		System.out.print(c.toUpperCase()+str.substring(1)+" ");
//		System.out.print(c+);
		
	}
	


	
	
}
}
