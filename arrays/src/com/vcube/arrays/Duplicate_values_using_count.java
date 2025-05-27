package com.vcube.arrays;import java.util.Arrays;

public class Duplicate_values_using_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 60,30, 40, 40, 50, 60, 80, 70, 60 };
		int last=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr [min]>arr[j]) { 
				min=j;
				}
				
				
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr)+Arrays.toString(arr));

		for (int i : arr) {
			int count = 0;
			for (int j : arr) {
				if (j == i) {

					count++;
				}

			}
			if (count > 1 && i!=last) {
				
				System.out.println("Duplicate number found: "+i + " ");
				last=i;
				
			}
			
		}
	}

}
