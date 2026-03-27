package mylist;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {

		Vector<Integer>v1=new Vector<>();
	 v1.add(100);
	 v1.add(200);
	 v1.add(300);
	 v1.add(400);
	 v1.add(500);
	 v1.add(null);
	 v1.add(null);
	 v1.add(null);
	
	 System.out.println(v1);
	 
	 //Iteration for Vector
	 Enumeration<Integer>enc = v1.elements();
	 while(enc.hasMoreElements()) {
		 System.out.println(enc.nextElement());
		 
	 }
	 while(enc.hasMoreElements()) {
		 System.out.println(enc.hasMoreElements());
	 }
	}

}
