package com.vcube.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demoset1 {
	public static void main(String[] args) {
		Set<Integer> se = new HashSet<Integer>();
		Set<Integer> sd = new HashSet<Integer>();
		List<Integer> inte = new ArrayList<>();
		List<String> str = new ArrayList<>();
		Set<Integer> str1 = new LinkedHashSet<>();
		// hashset-->hasmap-->hastable-->bucketlist-->linked list-->each row capacity
		// --16 based on remainder 16)33(2 ->1 (1'based)
		se.add(null);
		se.add(1);
		se.add(2);
		se.add(3);
		se.add(4);
		se.add(5);
		se.add(6);
		se.add(75);
		se.add(8);
		se.add(9);
		se.add(45);
		se.add(11);
		se.add(33);
		se.add(91);
		se.add(14);
//	se.add(15);
//	se.add(16);
//	se.add(15);
		sd.add(17);
		sd.add(25);
		sd.add(30);
		System.out.println(se);
		System.out.println("******************LinkedHashSet********");
		str1.add(2);
		str1.add(5);
		str1.add(10);
		str1.add(7);
		str1.add(8);
		str1.add(6);
		System.out.println(str1);
//	Collections.sort(str1);

		System.out.println("***********list**************");
		str.add("kiran");
		str.add("ranga");
		str.add("balayya");
		str.add("baayya");
		str.add("suresh");
		str.add("anusha");
		str.add("keerthana");
		System.out.println("***********list*******int*******");
		inte.add(2);
		inte.add(7);
		inte.add(9);
		inte.add(6);
		inte.add(5);
		inte.add(4);
		System.out.println(str);
		Collections.sort(str);
		System.out.println("after : " + str);
	}
}
