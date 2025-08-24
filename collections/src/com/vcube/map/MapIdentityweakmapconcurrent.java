package com.vcube.map;

import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapIdentityweakmapconcurrent {
	public static void main(String[] args) {

		// hashmap->no preserve based upon hashcode, no sorted,cap-16 , no thread safe
		// ,faster,only one null key
		// linkedhashmap-> preserved insertion order,no sorted,cap-16, no thread safe
		// ,lil slower, only one null key
		// identity hashmap--> no order ,cap-16,no thread safe,allow
		// dublicate key,null key can be there
		// since it checks with object reference (obj1==obj2),no threadsafe
		// weakhasmap --> not preserved for calling the garbage collector it doest
		// follow
		// cachable it dominatess cachable,no sorted oreder,null key only once ,no
		// threadsafe
		// concurrent hashmap--> not preserved ,thread safe ,cap-16, no null key ,thread
		// safe
		// hastable-->no order,no sort no null,thread safe,cap-11
		// ****sortedmap interface****
		// treemap--> sorted,no null key,no thread safe

		Map<String, Integer> identity = new IdentityHashMap<>();
		Map<Integer, String> identity1 = new IdentityHashMap<>();
		identity1.put(128, "kalo");
//		identity1.put(128, "kalo");
		identity1.put(56, null);
		identity1.put(562, "hero");
		identity.put("hello", 124);
		identity.put("hello", 356);
		identity.put("hi", 573);
		identity.put("hi", 573);
		System.out.println(identity1.remove(128, "kalo"));
		System.out.println(identity.replace("hi", 573, 200));
		System.out.println(identity.toString());
		System.out.println(identity1);

		// ****************************************************************************

		Map<String, Integer> weakhash = new WeakHashMap<String, Integer>();

		weakhash.put("jello", 256);
		weakhash.put("kalo", 256);
		weakhash.put("telo", 256);
		System.out.println(weakhash);
		weakhash.put(new String("kendu"), 756);
		System.gc();
		System.out.println(weakhash);
		System.out.println(weakhash.remove("kalo"));
		System.out.println(weakhash.replace("telo", 256, 200));
		System.out.println(weakhash);
		// *****************************************************************************
		
		SortedMap<Integer, String> name=new TreeMap<Integer, String>();
		name.put(1, "sai");
		name.put(2, "sai");
		name.put(3, "chelo");
		name.put(4, "sai");
		name.put(5, "sai");
		System.out.println(name);
		
		System.out.println(name.reversed());
		System.out.println(name);
		//**************************************************************************************
		
		Hashtable<Integer, String> frndname=new Hashtable();
		frndname.put(1, "hero");
		frndname.put(2, "hero");
		frndname.put(3, "hero");
		frndname.put(4, "hero");
		frndname.put(5, "hero");
		frndname.put(6, "hero");
		frndname.put(7, "hero");
		frndname.put(8, "hero");
		frndname.put(9, "hero");
		frndname.put(10, "hero");
		frndname.put(11, "hero");
		frndname.put(13, "hero");
		frndname.put(24, "hero");
		System.out.println(frndname);
		
		
	}
}
