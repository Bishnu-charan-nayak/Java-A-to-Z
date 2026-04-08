package myException;

import java.util.Scanner;

public class MyExp2 {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("connection Estabalished");
       System.out.println("Enter int a");
       int a =sc.nextInt();
   try {
	   System.out.println("Enter int b");
	    int b=sc.nextInt();
	    int c=a/b;
	    System.out.println("Reasult of a/b is: " + c);
   }
   catch(Exception e) {
	   System.out.println("Dominator can't be 0,should be >0");
   }
    System.out.println("Connection terminated");
	}

}






// package myException;

// import java.util.Scanner;
// import java.util.InputMismatchException;

// public class MyExp2 {
//     public static void main(String[] args) {
//         // Using try-with-resources to ensure scanner closes automatically
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Connection Established");
            
//             try {
//                 System.out.print("Enter numerator (a): ");
//                 int a = sc.nextInt();

//                 System.out.print("Enter denominator (b): ");
//                 int b = sc.nextInt();

//                 int c = a / b;
//                 System.out.println("Result of a / b is: " + c);

//             } catch (ArithmeticException e) {
//                 // Specifically catches division by zero
//                 System.out.println("Math Error: You cannot divide by zero!");
                
//             } catch (InputMismatchException e) {
//                 // Specifically catches non-integer inputs (like typing "hello")
//                 System.out.println("Input Error: Please enter whole numbers only.");
                
//             } catch (Exception e) {
//                 // General fallback for any other unexpected issues
//                 System.out.println("An unexpected error occurred: " + e.getMessage());
//             }
            
//         } finally {
//             // This block always runs regardless of what happens in the try/catch
//             System.out.println("Connection terminated gracefully.");
//         }
//     }
// }
