package com.vcube.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 60, 30, 40, 40, 50, 60, 80, 70, 60 };

		int uniqueCount=0;
		for (int i = 0; i < arr.length; i++) {
			boolean isduplicate = false;
			int count = 0;

			for (int j = 0; j < uniqueCount; j++) {
				if (arr[i] == arr[j]) {
					isduplicate = true;
					count++;
					break;

				}

			}
			
			//for checking only unique values if wanna find out just remove !

			if (!isduplicate) {
				arr[uniqueCount] = arr[i];  // Place it at the next unique index
                uniqueCount++;   
                  
//				System.out.println("dupli : " + arr[i] + "count : " + count);
			}
			
			

		}
		
		for (int j = uniqueCount; j <arr.length ; j++) {
			arr[j]=0;

	}
		System.out.println(Arrays.toString(arr));

	}
	}
