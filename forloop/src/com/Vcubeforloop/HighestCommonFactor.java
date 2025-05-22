package com.Vcubeforloop;

public class HighestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 50;
		int second = 25;

		int min = Math.min(first, second);
		System.out.println(min);
		int com = 0;
		for (int i = 1; i <= min; i++) {
			if ((min % i == 0) && (first % i == 0)) {
				com = i;
				
			}

		}
		System.out.println(com);

	}

}
