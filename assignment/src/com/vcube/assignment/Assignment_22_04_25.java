package com.vcube.assignment;
// count onj without instance block
public class Assignment_22_04_25 {
static int count=0;

Assignment_22_04_25(){
	count++;
}

static int getcount() {
	return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_22_04_25 o1=new Assignment_22_04_25();
		Assignment_22_04_25 o2=new Assignment_22_04_25();
		Assignment_22_04_25 o3=new Assignment_22_04_25();
		Assignment_22_04_25 o4=new Assignment_22_04_25();
		
System.out.println(		getcount());
	}

}
