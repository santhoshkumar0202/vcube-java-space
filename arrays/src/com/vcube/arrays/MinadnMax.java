package com.vcube.arrays;

public class MinadnMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("min max using arrays");

int [] arr= {1,-4,4,6,8,-22,25,100,-7};
int min=0;
int max=0;
int second_heighest=0;
int second_min=0;
for (int i = 0; i < arr.length; i++) {
	if(min>arr[i]) {
		second_min=min;
		min=arr[i];
	}else if (second_heighest>arr[i]) {
		second_min=arr[i];
	}
	if(max<arr[i]) {
		second_heighest=max;
		max=arr[i];
	}
	
}

System.out.println("min: "+(min));
System.out.println("sec_min: "+(second_min));
System.out.println("man: "+(max));
System.out.println("sec_max: "+(second_heighest));
	}

}
