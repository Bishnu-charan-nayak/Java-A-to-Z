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