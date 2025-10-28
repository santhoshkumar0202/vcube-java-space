package com.vcube.functional_interface_and_lamda;


interface inter5 {
	// by default public and abstract
void greetings();
	void display();
}

//function interface can be achieve both lamda and inner anonymus classes but anonymous class can override more than 1 in anonymous class
@FunctionalInterface
interface inter6 {
	void sound(int a, int b);
}

public class Lamda_Innerfunction_difference {

	public static void main(String[] args) {

		inter5 in_ano = new inter5() {
			@Override
			public void display() {
				System.out.println("hello from overiden method");
			}

			@Override
			public void greetings() {
				// TODO Auto-generated method stub
				System.out.println("good evening from overiden greeting" );
			}
		};

		inter6 in_lam = (a, b) -> {
			System.out.println("heelo" + " sound :" + a + "," + b);
		};

		in_ano.display();
		in_ano.greetings();;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;System.out.println("sasa");
		;
		in_lam.sound(2, 3);
	}
}
