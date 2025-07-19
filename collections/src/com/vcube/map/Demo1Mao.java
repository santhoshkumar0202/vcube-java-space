package com.vcube.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1Mao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Map <String,String> m = new HashMap<String, String>() ;
                 String n=new String("hari");
                 m.put("hari", "10th");
                 m.put("sri", "10th");
                 m.put("nani", "12th");
//                 m.put("hari", "9th");
                 m.put("munna", "10th");
                 m.put(n, "12th");
    
                 
              Set<String> s = m.keySet();
              System.out.println(s);
              
              
              Collection<String> l=m.values();
              
              System.out.println(l);
              System.out.println("******entryset******");
              Set<Map.Entry<String, String>> s2=m.entrySet();
              System.out.println(s2);
              
              for (Map.Entry<String, String> entry : s2) {
				System.out.println(entry.getKey() +":"+entry.getValue());
			}
	}

}
