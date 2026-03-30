package objectMethods;

import java.util.Scanner;

public class Myindexof {
	public static void main(String[] args) {

		String s = "Rooman";
		System.out.println(s.indexOf('R')); // 0
		System.out.println(s.indexOf('n')); // 5

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char c = sc.next().charAt(0);

		boolean found = false;

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				System.out.println("Index: " + i);
				found = true;
				break; // stop after first match
			}
		}

		if (!found) {
			System.out.println("-1");
		}
	}
}