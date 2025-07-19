package com.vcube.string;

public class SeparateCharAndDigit {

	public static void main(String[] args) {
		String str="hello world";
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			String str1=str.charAt(i)+"";
			if(str1.equals(" ")) {
				continue;
			}
			count=0;
			for (int j = 1; j < str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					count=count+1;
					
				}
			}
			
			if(count<=1) {
				System.out.println(i+":"+str.charAt(i));
			}
			
			
		}
		
	}

}
