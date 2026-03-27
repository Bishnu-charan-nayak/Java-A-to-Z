package mySetinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyHashSet {
	public static void main(String[] args) {

		HashSet<String> hs =new HashSet <>();
		hs.add("abc");
		hs.add("efg");
		hs.add("efg");
		hs.add("hij");
		hs.add("klm");
		hs.add("null");      //null value show as hasvalue
		hs.add("null");     //It does not allow Duplicate
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
