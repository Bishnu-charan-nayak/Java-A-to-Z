package mystatickeyword;

public class Mystatic1 {
	static int a=1000;
	static {
		System.out.println(a);
     	System.out.println("Hello world");
		a=100;
		System.out.println(a);
	}

	 static public void main(String [] args) {

		System.out.println("Hello main method");
	}

}
