package com.vcube.garbage_collector;

public class GcTestDemo {
	@Override
	protected void finalize() {
		System.out.println("final has been called");
	}

	public static void main(String[] args) {

		GcTestDemo o1 = new GcTestDemo();
		GcTestDemo o2 = new GcTestDemo();
		GcTestDemo o3 = new GcTestDemo();
		GcTestDemo o4 = new GcTestDemo();
		GcTestDemo o5 = new GcTestDemo();
		new GcTestDemo();
		 o1 = null;
		 o2 = null;
	     o5=o2;
		 
		System.gc();

//		System.out.println(o1);
//		System.out.println(o2);
//		System.out.println(o3);
//		System.out.println(o4);
//		System.out.println(o5);
//				System.out.println(o1);
	}

}
