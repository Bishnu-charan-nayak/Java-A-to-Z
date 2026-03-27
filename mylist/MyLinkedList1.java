package mylist;

import java.util.LinkedList;

public class MyLinkedList1 {

	public static void main(String[] args) {

		LinkedList <Integer> ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(1000);
		ll.add(2000);
		ll.addFirst(5000);              //for show at first of the add
		ll.addLast(7000);             //Show at last of the array
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println("After peek opration"+ ll);
		System.out.println(ll.pollFirst());  //Remove 1st element of arrayshow 1st element of array first
		System.out.println(ll.pollFirst());  //Remove Last element of arrayshow Last element of array At first 
		System.out.println("After Poll Opration"+ll);

//		ll.remove(new Integer(30));       //this is deprecated
//		ll.remove(Integer.valueOf(20));
//		ll.remove(2);       //It remove the Index
//		LinkedList <Integer> l2 =new LinkedList ();
//		l2.add(1000);
//		l2.add(2000);
//		l2.add(3000);
//		ll.addAll(2,l2);
//		ll.retainAll(l2);       //Show the commmon element
//	    ll.removeAll(l2);

	}

}
