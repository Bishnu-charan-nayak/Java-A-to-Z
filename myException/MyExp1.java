package myException;

import java.util.Scanner;

public class MyExp1 {

	public static void main(String[] args) {
 System.out.println("connection established !!!");
 Scanner scan = new Scanner(System.in);
 try {
	 System.out.println("Enter ur age " );
	 int age = scan.nextInt();
	 System.out.println("Age enterd " + age);
 }
 catch(Exception e) {
	 System.out.println("Age can't be string.KIndly, provide an integer");
 }
 System.out.println("Connection terminated gracefull");
 scan.close();
	}

}


// package myException;

// import java.util.Scanner;
// import java.util.InputMismatchException;

// public class MyExp1 {

//     public static void main(String[] args) {
//         System.out.println("--- Connection Established ---");

//         // Using try-with-resources to automatically close the scanner
//         try (Scanner scan = new Scanner(System.in)) {
//             boolean isInvalid = true;

//             while (isInvalid) {
//                 try {
//                     System.out.print("Enter your age: ");
//                     int age = scan.nextInt();

//                     if (age < 0 || age > 120) {
//                         // Manually throwing an exception for logic errors
//                         throw new IllegalArgumentException("Age must be between 0 and 120.");
//                     }

//                     System.out.println("Age entered successfully: " + age);
//                     isInvalid = false; // Break the loop
                    
//                 } catch (InputMismatchException e) {
//                     System.out.println("Error: Age must be a whole number. Please try again.");
//                     scan.nextLine(); // Clear the invalid input from the buffer
//                 } catch (IllegalArgumentException e) {
//                     System.out.println("Error: " + e.getMessage());
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println("An unexpected error occurred: " + e.getMessage());
//         }

//         System.out.println("--- Connection Terminated Gracefully ---");
//     }
// }
