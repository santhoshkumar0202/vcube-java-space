package com.Vcubepattern_1;

public class Pattern_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				//5-1 and 4 both are same
				if (i == 0 || j == 0 ||j==1|| i == 5 - 1 || j == 4) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}





}




class b extends a{
	
}

