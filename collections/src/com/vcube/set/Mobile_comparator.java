package com.vcube.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mobile_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile(1, "samsung", "s24ultra", 75000.00, 256);
		Mobile m2 = new Mobile(2, "oneplus", "7 pro", 56000.00, 256);
		Mobile m3 = new Mobile(3, "google", "6a", 35000.00, 126);
		Mobile m4 = new Mobile(4, "apple", "166 pro max", 150000.00, 512);
		Mobile m5 = new Mobile(5, "apple", "iphone air", 75000.00, 126);

		List<Mobile> mobi = new ArrayList<>();
		mobi.add(m1);
		mobi.add(m2);
		mobi.add(m3);
		mobi.add(m4);
		mobi.add(m5);

		for (Mobile mobile : mobi) {
			System.out.println(mobile);
		}

		Comparator<Mobile> m = new Comparator<Mobile>() {
			@Override
			public int compare(Mobile o1, Mobile o2) {

				if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else if (o1.getPrice() == o2.getPrice()) {
					return 0;
				}

				return 1;

			}
		};
		Comparator<Mobile> ms = new Comparator<Mobile>() {
			@Override
			public int compare(Mobile o1, Mobile o2) {
// for string
				return o1.b_name.compareTo(o2.b_name);

			}
		};

		System.out.println("********after********");
		Collections.sort(mobi, m);
		Collections.sort(mobi, ms);
		for (Mobile mobile : mobi) {
			System.out.println(mobile);
		}
	}

}
