package objectMethods;

import java.util.Scanner;

public class MySubString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		System.out.print("Enter starting index: ");
		int start = sc.nextInt();

		System.out.print("Enter ending index: ");
		int end = sc.nextInt();

		// substring with start and end index
		String result = str.substring(start, end);

		System.out.println("Substring is: " + result);

		sc.close();
	}
}