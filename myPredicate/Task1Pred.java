package myPredicate;
import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String name;
	String password;
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public User(String name,String password) {
		this.name=name;
		this.password=password;
	}
	
	
}

public class Task1Pred {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter password: ");
		String pass = sc.next();
		User us = new User(name,pass);
		Predicate<User> p1=u->(u.getName().equals("Rooman")) && (u.getPassword().equals("Rooman@123"));
		if(p1.test(us)) {
			System.out.println("Valid user. Welcome!!");
		}
		else {
			System.out.println("Invalid user.Register!!");
		}

	}

}