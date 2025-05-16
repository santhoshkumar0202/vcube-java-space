package ifelse_and_switch;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using  shift operators
		int a = 10;
		int b = 20;

		System.out.println("before swapping :");
		System.out.println("a: " + a + " " + "b: " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after swapping :");
		System.out.println("a: " + a + " " + "b: " + b);

	}

	public static void swap_UsingTemp() {
		int a = 10;
		int b = 20;
		int temp = a;

		System.out.println("before swapping :");
		System.out.println("a: " + a + " " + "b: " + b);
		a = b;
		b = temp;
		System.out.println("after swapping :");
		System.out.println("a: " + a + " " + "b: " + b);
	}
	
	public static void swap_Using_without_Temp() {

		int a = 10;
		int b = 20;

		System.out.println("before swapping :");
		System.out.println("a: " + a + " " + "b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping :");
		System.out.println("a: " + a + " " + "b: " + b);
	}

}
