package com.vucbe.case_studies;

public class Case_rough {
	
		@Override
		protected void finalize() {
			// TODO Auto-generated method stub
			System.out.println("hello");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//unreferenced object
			new Case_rough();
			Case_rough e = new Case_rough();
			Case_rough d1 = new Case_rough();
			Case_rough d2 = new Case_rough();
			System.out.println(e);
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("*******");
			// nullifing object
			e = null;
			System.out.println(e);
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("*******");
			//reasigning
			
		
			Case_rough j=d1;
			System.out.println(e);
			System.out.println(d1);
			System.out.println(j);
			System.out.println("*******");
			System.gc();
			System.out.println("hello king");

		}

		public Case_rough() {
//			Case_rough	c=	new Case_rough(); we cant create obj at this level
			System.gc();
		}
		
		void method() {
			Case_rough b = new Case_rough();
			System.gc();
		}

	

}
