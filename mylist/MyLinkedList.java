package mylist;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(20);
		ll.add(30);
//		ll.add("Rooman");//When LinkList Under <Object>
		System.out.println(ll);

		System.out.println(" ");
		System.out.println("");
		Iterator<Integer> ill = ll.iterator();
		while (ill.hasNext()) {
			System.out.println(ill.next());
		}
		System.out.println(" ");
		System.out.println("Using foreach Loop");
		for(Integer a:ll) {
			System.out.println(a);
		}
	}

}
