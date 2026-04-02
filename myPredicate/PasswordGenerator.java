 package myPredicate;
 import java.util.function.Supplier;
////One Advance Type
//
//public class PasswordGenerator {
//    public static void main(String[] args) {
//
//        Supplier<String> s = () -> {
//            String password = "";
//            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";
////          //  System.out.println(chars.length());
//            for (int i = 0; i < 8; i++) {
//                if (i % 2 == 0) {
//                    password += chars.charAt((int)(Math.random() * chars.length()));
//                } else {
//                    password += (int)(Math.random() * 10);
//                }
//            }
//            return password;
//        };
//
//        System.out.println("Generated Password: " + s.get());
//    }
//}
//
////Basic Type
//package mySupplier;

//generate the password such that even place have char

//public class PasswordGenerator {
//	public static void main(String[] args) {
//		String symbols = "!@#$%&ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		Supplier<Character> s = () -> symbols.charAt((int) (Math.random() * symbols.length()));
//		Supplier<Integer> d = () -> (int) (Math.random() * 10);//If use +32 generate 12 digite password
//		String pwd = "";
//		for (int i = 1; i <= 8; i++) {
//			if (i % 2 == 0) {
//				pwd = pwd + s.get();
//			} else {
//				pwd = pwd + d.get();
//			}
//		}
//
//		System.out.println("Generated Password: " + pwd);
//
//	}
//}


//Another Method
//generate the password such that even place have char
public class PasswordGenerator {
	public static void main(String[] args) {
		String symbols = "!@#$%&ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		 System.out.println(symbols.length());
		
		Supplier<Character> s = () -> symbols.charAt((int) (Math.random() * symbols.length()));
		
		Supplier<Integer> d = () -> (int) (Math.random() * 10);
		
		String pwd = "";

		//another logic 
		for (int i = 1; i <= 4; i++) {
			
			pwd=pwd+d.get();
			pwd=pwd+s.get();
			
		}

		System.out.println("Generated Password: " +pwd);

	}
}
