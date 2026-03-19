package myException;
import java.util.Scanner;

	
// Create a customize exception for amount withdraw beyond limit
class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class MyWithdraw {
	double availableBal;
	
	public MyWithdraw(double availableBal) {
		this.availableBal = availableBal;
	}
	
	public void withdraw() throws InsufficientBalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = sc.nextInt();
		
		if(amount > availableBal) {
			throw new InsufficientBalanceException("You do not have the sufficient balance.");
		} else {
			System.out.println("Transaction successful. Available Balance: " + (availableBal - amount));
		}
	}
}
public class Balance {

	public static void main(String[] args) {
		
	
		
		MyWithdraw mw = new MyWithdraw(100000.0);
		try {
			mw.withdraw();
		} catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
