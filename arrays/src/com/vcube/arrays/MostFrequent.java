package com.vcube.arrays;

public class MostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 4, 3, 4, 2, 1, 3 };
	int count=0;
	int previos=0;
	int freq=0;
	for (int i = 0; i < arr.length; i++) {
		count=0;
		for (int j = i+1; j < arr.length-1; j++) {
			if(arr[i]==arr[j]) {
				count++;
				
			}
			
			
		}
		if(count>previos) {
			previos=count;
			freq=arr[i];
			System.out.println(j);
			
		}
		
	}
	System.out.println(freq);
	
	}
}
