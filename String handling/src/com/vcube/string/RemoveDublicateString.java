package com.vcube.string;

public class RemoveDublicateString {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		String nameString = "programming";
		String filterString = "";

		for (int i = 0; i < nameString.length(); i++) {
			int cur_count = 1;
			for (int j = 0; j < i; j++) {
				if (nameString.charAt(i) == nameString.charAt(j)) {
					cur_count++;

				}

			}
			if (cur_count == 1) {
				filterString += (char) nameString.charAt(i);
				System.out.println(filterString);
			}

		}

	}

}
