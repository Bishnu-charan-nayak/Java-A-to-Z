package mylist;

import java.util.ArrayList;

public class MyArrayList {

	/*
	 * Arraylist is backed by array.
	 * It maintain insertion order (insertion order is preserved)
	 * Arraylist is dynamic
	 * It allows duplicates
	 * It all heterogeneous type data
	 * It allows Nall values
	
	*/
	public static void main(String[] args) {
		
		ArrayList a1 =new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		System.out.println(a1);
		a1.add(40);
		a1.add(50);
		a1.add(50);
		System.out.println(a1);
		
		a1.add("Rooman");
		a1.add(50);      //It allows Duplicate
        a1.add(null);
        a1.add(null);
		System.out.println(a1);
		System.out.println();
		System.out.println("Iterating over list using for");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("iterating over list using foreach");
		for(Object o:a1) {
			System.out.println(o);
			
		}
		
	}

}
