package com.oops.inheritance;

import java.util.jar.Attributes.Name;

public class UpcastingandDowncasting {
	String name_class = "upanddown";
	static String concept = "inherit_upanddown";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpcastingandDowncasting().get_class();
	}

	void get_class() {
		System.out.println(this.name_class);
		System.out.println(concept);

	}

}

class Casting extends UpcastingandDowncasting {
	String name_class = "casting";
	static String concept = "inherit_casting";

	public static void main(String[] args) {
		// upcasting
		UpcastingandDowncasting c = new Casting();
		// downcasting
		Casting d = (Casting) c;
		System.out.println(d.name_class);
		c.get_class();
	}

	@Override
	void get_class() {
		// TODO Auto-generated method stub
		System.out.println("chri");
	}
}

class caste extends Casting {
	String name_class = "caste";
	static String concept = "inherit_caste";

	public static void main(String[] args) {
		new caste().get_class();
	}
}