//package com.vcube.arrays;
//
//import java.util.Arrays;
//
//public class Selectsorting {
//public static void main(String[] args) {
//	int [] arr= {20,70,10,78,25,12,1,8,40};
//	for (int i = 0; i < arr.length; i++) {
//		// iteration i=0 which is 1 
//		int min =i;
//		for (int j = i+1; j < arr.length; j++) {
//			if(arr[j]<arr[min]) { // 70 < 20 --false , 10 < 70
//				min=j;
//			
//			}
////			if (min==i) {
////				continue;
////			}
//			int temp=arr[min];  //20 into temp
//			arr[min]=arr[i];  // 20 min into 20 i
//			arr[i]=temp; // 20 i to	;	
//		}
//	}
//	System.out.println(Arrays.toString(arr));
//}
//}

//2nd


package com.vcube.arrays;

import java.util.Arrays;

public class Selectsorting {
    public static void main(String[] args) {
        int[] arr = {20, 70, 10, 78, 25, 12, 1, 8, 40};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Initialize min to the current index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // Update min if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
