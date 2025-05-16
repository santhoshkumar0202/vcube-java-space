package com.vcube.garbage_collector;

public class GcTestDemoReassign {
@Override

protected void finalize(){
	System.out.println("final was called by jvm");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		GcTestDemoReassign obj1=new GcTestDemoReassign();		
		GcTestDemoReassign obj2=new GcTestDemoReassign();		
		GcTestDemoReassign obj3=new GcTestDemoReassign();		
		GcTestDemoReassign obj4=new GcTestDemoReassign();	
		
	
		
		obj3=obj2;
		

		System.gc();
		
		System.out.println("hello babai0");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		
	}

	
}
