package com.vcube.arrays;

import java.util.List;
import java.util.Arrays;

public class ArraysDestructuringAndReassigning {
public static void main(String[] args) {
	
	int List []= {1,2,3,4};
	int [] a=List;
	
	a[0]=10;
	System.out.println(Arrays.toString(List));
}
}
