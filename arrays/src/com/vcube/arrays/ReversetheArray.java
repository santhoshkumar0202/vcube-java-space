package com.vcube.arrays;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversetheArray {
	// reversing the single number
	public static void main(String[] args) {
		int[] a = { 12, 13, 14, 15 };

		int r = 0;
		int reversed = 0;
		int count = 0;
		
		for (int i = 0;i<a.length;i++) {
			
			int num=a[i];
		
			while (num!= 0) {
				
				r=num%10;
				reversed=reversed*10+r;
				num=num/10;

			}
			a[count]=reversed;
			
			reversed=0;
			count++;
		
//			System.out.println(a);
		}
		System.out.println(Arrays.toString(a));

	}
}
