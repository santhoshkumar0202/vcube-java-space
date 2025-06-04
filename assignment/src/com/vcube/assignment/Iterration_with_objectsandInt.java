package com.vcube.assignment;

import java.util.Iterator;

public class Iterration_with_objectsandInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a = { 1, 2, new Object[] { 3, 4, new Object[] { 5, 6 } } };

		iterate(a);

		for (int i = 0; i < a.length; i++) {
			if(a[i]instanceof Object[]) {
				//later need specify function
			}
		}
	}

	static void iterate(Object[] a) {

		for (Object c : a) {
			if (c instanceof Object[]) {
				iterate((Object[]) c);
			} else {
				System.out.print(c);
			}
		}
	}

}
