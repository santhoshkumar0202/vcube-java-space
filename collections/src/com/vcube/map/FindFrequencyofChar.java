package com.vcube.map;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is simple in vcube";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();

		for (char c : ch ) {
			if (m.containsKey(c)  && !(" ".equals(c+""))) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		
		for ( Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
	}

}
