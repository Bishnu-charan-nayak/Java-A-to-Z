package classload;

   class Eemo {
	int a=10;
	int b=20;

	public void display() {
		System.out.println("inside display");
		System.out.println(a);
		System.out.println(b); 
	}

   }
 
	
	public class Demo {
		
	public static void main(String[] args) 
      Eemo d= new Eemo();
      d.display();
	   }

	}
		
	

// Use Constructor for pratice

	package classload;

class Calculator {
    int x;
    int y;

    // Constructor to initialize values
    Calculator(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public void add() {
        System.out.println("Sum: " + (x + y));
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator(50, 25); // Passing values here
        obj.add();
    }
}
