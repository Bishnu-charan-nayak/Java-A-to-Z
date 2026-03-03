package abstraction;


abstract class MyAbstract{
	
	static int a=10;
	static {
		System.out.println("Inside static block");
	}
	public static void m1(){
		System.out.println("inside static method");
	}
	int x=100;
	{
		System.out.println("Inside Instanse block");
	}
	
	public MyAbstract() {
		System.out.println("Inside constractor");
	}
	private void m2() {
System.out.println("inside Instance Method");
	}
	
	public abstract void m3();
	
}

 
public class MynewClass {

	public static void main(String[] args) {
//     MyAbstract ma=new MyAbstract ();
		
	}

}
