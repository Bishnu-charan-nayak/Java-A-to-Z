package myPredicate;

import java.util.function.Supplier;
public class MySupplier {
    public static void main(String[] args) {

        Supplier<String> s = () -> {
            String otp = "";
            for (int i = 1; i <= 6; i++) {
                otp = otp + (int)(Math.random() * 10);
            }
            return otp;  // must be inside lambda
        };

        // Calling the supplier
        System.out.println("Generated OTP: " + s.get());
    }
}



/*More Example*/
import java.util.function.Supplier;

public class PasswordSupplier {
    public static void main(String[] args) {
        Supplier<String> passwordGen = () -> {
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
            StringBuilder pwd = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                int index = (int) (Math.random() * symbols.length());
                pwd.append(symbols.charAt(index));
            }
            return pwd.toString();
        };

        System.out.println("Suggested Password: " + passwordGen.get());
    }
}
