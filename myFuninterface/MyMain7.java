package myFuninterface;
interface Opns{
	void add(int a,int b);
	
}
//class Calc implements Opns {
//	public void add(int a,int b) {
//		int c=a+b;
//		System.out.println("Sum is "+c);
//	}
//}

public class MyMain7 {
    public static void main(String[] args) {

        Opns obj = (int a, int b) -> {
            int c = a + b;
            System.out.println("Sum is " + c);
        };

        // calling method	
        obj.add(10, 20);
    }
}
// interface Opns {
//     int execute(int a, int b); // Changed to return int
// }

// public class MyMain7 {
//     public static void main(String[] args) {
//         // Using lambda for addition
//         Opns add = (a, b) -> a + b;
        
//         // Using the same interface for multiplication!
//         Opns multiply = (a, b) -> a * b;


// import java.util.function.BiConsumer;

// public class MyMain7 {
//     public static void main(String[] args) {
//         BiConsumer<Integer, Integer> add = (a, b) -> {
//             System.out.println("Sum is " + (a + b));
//         };

//         add.accept(10, 20);
//     }
// }
//         System.out.println("Addition: " + add.execute(10, 20));
//         System.out.println("Multiplication: " + multiply.execute(10, 20));
//     }
}
