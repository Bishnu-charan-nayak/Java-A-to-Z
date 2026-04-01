package myPredicate;

import java.util.function.Predicate;

public class MyPredicate {
	public static void main(String[] args) {
//
//		int [] a = {1,2,3,10,15,20,25,27,28,30,36};
//		Predicate<Integer> p=num -> num %2==0;
//		for(int n:a ) {
//			if(p.test(n)) {
//				System.out.println("Even no is "+n);
//			}
//		}
//	}
		///// Ingteger variable

		String[] a = { "Sundergarh", "Sunderbans", "Bengalur", "Karnataka", "Bhubaneswar" };

		Predicate<String> p = str -> str.toLowerCase().startsWith("s");

		for (String n : a) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
	}
}