package com.vcube.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringInlcudingindentation {
// do it again with the collections and substring pending........
	public static void main(String[] args) {
		System.out.println("main");
		List individual_length = new ArrayList<>();
		int reg_count = 0;
		String str = "i love Vcube";
//		char [] ch=str.toCharArray();
		int count = 0;

		String[] splitedStr = str.split(" ");
//		int [] indexs=new int[splitedStr.length];
		StringBuffer sb = new StringBuffer(String.join("", splitedStr));
		sb.reverse();
		for (int i = 0; i < splitedStr.length; i++) {

			System.out.println(splitedStr[i].length());
		}
		for (int i = 0; i < sb.length(); i++) {
			if (i == sb.length()) {
				break;
			}
			;
			String st = str.charAt(count) + "";
			if (st.equals(" ")) {
				System.out.print("2" + sb.charAt(i));
				count = count + 2;
				continue;
			}
			System.out.print(sb.charAt(i));
			count++;
		}
		System.out.println(individual_length);

	}
}