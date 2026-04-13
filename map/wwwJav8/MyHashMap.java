package com.map.wwwJav8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMap {
	public static void main(String[] args) {

		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("FirstName ", "Bishnu Charan");
		hs.put("LastName ", "Nayak");
		hs.put("Age", "23");
		hs.put("email", "bishnubablu203@gmail.com");
		hs.put("gender", "Male");
		hs.put("pass", "Bishnu@!#");

		
		  
		/*
		 * System.out.println(hs.get("FirstName "));
		 * System.out.println(hs.get("LastName ")); 
		 * System.out.println(hs.get("Age"));
		 * System.out.println(hs.get("email"));
		 *  System.out.println(hs.get("gender"));
		 * System.out.println(hs.get("pass"));
		 */		 
		
		   ///KEYSET
		
//		Set <String> keySet=hs.keySet();
//		for(String z:keySet) {
//			System.out.println(z);
//		}
//		System.out.println();
//		System.out.println();
//		
//		
//		Collection<String> values =hs.values();
//		
//		
//		for(String n:values) {
//			System.out.println(n);
//		}
//		
		
		Set<Entry<String,String>>entrySet =hs.entrySet();
		for(Entry<String,String> es:entrySet) {
			System.out.println(es);
		}
		
	}

}
