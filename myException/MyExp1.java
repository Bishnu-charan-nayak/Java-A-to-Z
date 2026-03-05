package myException;

import java.util.Scanner;

public class MyExp1 {

	public static void main(String[] args) {
 System.out.println("connection established !!!");
 Scanner scan = new Scanner(System.in);
 try {
	 System.out.println("Enter ur age " );
	 int age = scan.nextInt();
	 System.out.println("Age enterd " + age);
 }
 catch(Exception e) {
	 System.out.println("Age can't be string.KIndly, provide an integer");
 }
 System.out.println("Connection terminated gracefull");
 scan.close();
	}

}
