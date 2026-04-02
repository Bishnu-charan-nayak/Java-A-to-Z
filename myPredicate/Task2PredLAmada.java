package myPredicate;
	import java.util.Scanner;
	import java.util.function.Predicate;

	class User1 {
	    String name;
	    String password;

	    public User1(String name, String password) {
	        this.name = name;
	        this.password = password;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPassword() {
	        return password;
	    }
	}

	public class Task2PredLAmada {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        String name = sc.next();

	        System.out.print("Enter password: ");
	        String pass = sc.next();

	        User1 user = new User1(name, pass);

	        // ✅ Lambda Predicate
	        Predicate<User1> isValidUser = u ->
	                u.getName().equals("Rooman") &&
	                u.getPassword().equals("Rooman@123");

	        // ✅ Using lambda
	        if (isValidUser.test(user)) {
	            System.out.println("Valid user. Welcome!!");
	        } else {
	            System.out.println("Invalid user. Register!!");
	        }

	        sc.close();
	    }
	}
