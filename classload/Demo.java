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
		
	public static void main(String[] args) {
      Eemo d= new Eemo();
      d.display();
	   }

	}
		
	
