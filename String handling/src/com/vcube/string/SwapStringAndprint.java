package com.vcube.string;



public class SwapStringAndprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "PROGRAM";
		String str = "";

		for (int i = 4 - 1; i <= string.length() - 1; i++) {

			str = str + string.charAt(i);

		}
		for (int i = 0; i <= 4 - 1 - 1; i++) {

			str = str + string.charAt(i);

		}

//		String dem = "";
		for (int i = 0; i < str.length() ; i++) {
			for (int j = str.length() - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
			}

			
			
//			dem += str.charAt(i);
//			System.out.println(dem);
			System.out.println();
		
		}
	

	}



}
