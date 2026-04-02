package myPredicate;
import java.util.function.Supplier;
import java.util.Date;
public class MySupplier1 {
    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}