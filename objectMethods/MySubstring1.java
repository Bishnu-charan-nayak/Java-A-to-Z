package objectMethods;
import java.util.Scanner;

public class MySubstring1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String s = sc.nextLine();

		System.out.println("Enter Start Index:");
		int si = sc.nextInt();

		System.out.println("Enter End Index:");
		int ei = sc.nextInt();

		String t = "";

		for (int i = si; i < ei; i++) {
			t = t + s.charAt(i);
		}

//		System.out.println("Substring is: " + t);
		System.out.println(s.charAt(si));
	}
}