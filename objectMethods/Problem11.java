package objectMethods;

import java.util.Scanner;
//import static utils.printUtils.sop;

public class Problem11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		System.out.println("Enter the index within : "+ str.length());
		
		int idx = scan.nextInt();
		if(idx <= str.length()-1) {
			System.out.println("Character at "+idx+" : "+charof(str, idx));			
		} else {
			System.out.println("You are going beyond the length");
		}
		
		
	}
	
	static char charof(String str,int idx) {

		char[] ch = str.toCharArray();
		return ch[idx];
	}

}