package mystatickeyword;

    class MyStatic {

static int x;
static int y;

     static {
    	 System.out.println("inside static block");
    	 x=10;
    	 y=20;
    	 
     }

	public static void staticMethod() {
		System.out.println("inside  static method");
		System.out.println("accessing static variable");
		System.out.println(x);
		System.out.println(y);

	}
	
	int a;
	int b;
	{
		System.out.println("inside instance block");
		  	a=100;
		  	b=200;
	}
	public static void instanceMethod() {
		System.out.println("inside  static method");

	}
public MyStatic() {
	System.out.println("inside constrsctor");
	System.out.println(" accessing inside variable");
	System.out.println(a);
	System.out.println(b);
}
	
 }
    public class MyAlpha 
    {
    	public static void main(String[] args) {
			MyStatic.staticMethod(); 
			MyStatic m =new MyStatic (); 
					m.instanceMethod();
		}
    }
    
