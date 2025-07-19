package com.vcube.collections;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList; // Arralist class which implemnts the abdtract methods

import java.util.Collection; // is interface (srs) 
import java.util.Iterator;

public class Democol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection <String> name= new ArrayList<>();
name.add("kiran");
name.add("sohail");
name.add("abilash");
//name.add(12345);

Collection <String> college_name= new ArrayList<>();
college_name.add("rahul");
college_name.add("harsha");
college_name.add("chary");
System.out.println(college_name);
System.out.println(name);

Collection <String> all_name= new ArrayList<>();
all_name.addAll(college_name);

System.out.println(all_name);
System.out.println(all_name.contains("Rahul suresh"));
System.out.println(all_name.hashCode());
System.out.println(name.hashCode());

 Iterator itr=name.iterator();
 
 while (itr.hasNext()) {
	 // has next returns boolean and if there is next value
	System.out.println(itr.next());// next return next string 
}
 
	}

}
