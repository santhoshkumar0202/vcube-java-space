package com.vcube.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Testmobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list will preserve the insertion order and allow duplicates and any null values are accepted and it is indexed unlike collection
		//
		List<Mobile> ls = new ArrayList<>();
		Set<Mobile> ms = new HashSet<>();
		Set<Mobile> msl = new LinkedHashSet<>();
		Mobile m1 = new Mobile(1, "samsung", "s24ultra", 75000.00, 256);
		Mobile m2 = new Mobile(2, "oneplus", "7 pro", 56000.00, 256);
		Mobile m3 = new Mobile(3, "google", "6a", 35000.00, 126);
		Mobile m4 = new Mobile(4, "apple", "166 pro max", 150000.00, 512);
		Mobile m5 = new Mobile(5, "apple", "iphone air", 75000.00, 126);

		ms.add(m1);
		ms.add(m2);
		ms.add(m3);
		ms.add(m4);
		ms.add(m5);

//ms.add(m6);
		for (Mobile itm : ms) {
			System.out.println(itm);
		}
		System.out.println("above one is no filter");

		System.out.println("*******************");

		msl.add(m1);
		msl.add(m2);
		msl.add(m3);
		msl.add(m4);
		msl.add(m5);

		for (Mobile itm : msl) {
			System.out.println(itm);
		}
		System.out.println();

		System.out.println("*********lls**********");
		ls.add(m1);
		ls.add(m2);
		ls.add(m3);
		ls.add(m4);
		ls.add(m5);
		Collections.sort(ls);
		for (Mobile itm : ls) {
			System.out.println(itm);
		}

	}

}
