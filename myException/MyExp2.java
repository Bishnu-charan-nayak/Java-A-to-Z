package myException;

import java.util.Scanner;

public class MyExp2 {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("connection Estabalished");
       System.out.println("Enter int a");
       int a =sc.nextInt();
   try {
	   System.out.println("Enter int b");
	    int b=sc.nextInt();
	    int c=a/b;
	    System.out.println("Reasult of a/b is: " + c);
   }
   catch(Exception e) {
	   System.out.println("Dominator can't be 0,should be >0");
   }
    System.out.println("Connection terminated");
	}

}
