package interface1;
//interface A{
//	public abstract void m1();
//}
///interface B implements A{//not possible
///  interface B extends A {   //Possible
//	interface B{  
//	public abstract void m2();
//}
//	interface c extends A,B{		
//	}
//public class MyAlpha implements B {//multiple inhertance can done by interface
//	public static void main(String[] args) {
//  MyAlpha ma =new MyAlpha();
//          ma.m1();
//          ma.m2();
//	}
//	public void m1() {
//		System.out.println("This is interface A");
//	}
//	public void m2() {
//    
//		System.out.println("This is interface B");
//	}
//
//}

interface MyInterf{
	void m1();
	public static final int A=25;
	
}
class Alpha{
	public void m1() {
		System.out.println("m1() of Alpha");
	}
}
class MyImpln extends Alpha implements MyInterf{
	public static void main(String[] args) {
		MyInterf .A=30;
		System.out.println(MyInterf.A);
		
		
	}
}

