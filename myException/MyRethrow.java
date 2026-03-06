package myException;

import java.util.Scanner;

class MyATM {
	public void m1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection Established");
		try {
			System.out.println("Enter a; ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result of a/b is" + c);
		} catch (Exception e) {
			System.out.println("Sorry for inconvenience.We'll get soon");
			throw e;
		} finally {
			System.out.println("Connection terminated");
			sc.close();
		}
	}
}

public class MyRethrow {

	public static void main(String[] args) {

		MyATM m = new MyATM();
		try {
			m.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
