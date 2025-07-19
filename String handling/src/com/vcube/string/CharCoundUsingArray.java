package com.vcube.string;

import java.util.Arrays;

public class CharCoundUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "santhosh";
		int arr[] = new int[127];
		int count = 0;
		String res="";

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}

		int max = -1;
		char frqchar=' ';
		for (int i = 0; i < s.length(); i++) {
			// find most frequent logic
			if (max < arr[s.charAt(i)]) {
                 max=arr[s.charAt(i)];
                 frqchar=s.charAt(i);
			}
			// concate frequent char logic
			if(!res.contains((char)s.charAt(i)+"")) {
				res+=" "+s.charAt(i)+arr[s.charAt(i)];
			}
		}
		System.out.println("most frequent: "+frqchar);
		System.out.println("concatinated frequency with char: "+res);

	}

}
