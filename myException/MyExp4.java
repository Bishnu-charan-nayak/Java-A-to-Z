package myException;
import java.util.Scanner;

public class MyExp4 {
	//Negative Array Size Exception for looking

	public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
			System.out.println("connection Estabalished");
			System.out.println("Enter the size of an array:");
			try {
				int n=scan.nextInt();
				int[] arr=new int[n];
		    System.out.println("Length of an array "+ arr.length);
			}
			catch(Exception e) {
				System.out.println("array length sholudn't be -ve ");
			}
	 System.out.println("Connection terminated");
     scan.close();
	}

}
