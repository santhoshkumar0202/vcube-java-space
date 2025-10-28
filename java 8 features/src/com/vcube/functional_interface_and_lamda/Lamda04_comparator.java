package com.vcube.functional_interface_and_lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lamda04_comparator {

	
	public static void main(String[] args) {
		
		
		List <String> li = new ArrayList();
	
		li.add("elephant");
		li.add("abhi");
		li.add("dog");
		
		li.add("fish");
		li.add("god");
		li.add("bharath");
		li.add("cat");
		
		
		Comparator<String>  srt= (o,j)->{
			return j.compareTo(o);
		} ;
		
		Collections.sort(li,srt);
		System.out.println(li);
 	}
}
