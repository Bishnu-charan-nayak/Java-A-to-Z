package objectMethods;

import java.util.Scanner;

public class MyLastIndex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "Rooman";
		System.out.println(s.indexOf('R')); // 0
		System.out.println(s.indexOf('n')); // 5

		System.out.println("Enter the char you want index:");
		char ch =sc.next().charAt(0);
		int index =-1;
		for (int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==ch) {
				index=i;
				break;
			}
		}

		System.out.println(s);
	}

}
