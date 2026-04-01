package myFuninterface;

interface Calc {
	int mul(int a, int b);

//	int add(int m,int n);    //can't add multiple Interface
	/*
	 * default void add() {
	 * 
	 * }
	 * 
	 * static void add1() {
	 * 
	 * }
	 * 
	 * private void add2() {
	 * 
	 * }
	 */
}

/*
 * After Marked The Interface As Functional Interface We can't Have more then
 * one Abstract method In the Interface But we can have Default method, Static
 * method ,private method
 */
public class MyMain9 {
	public static void main(String[] args) {

//     Calc m1=(int a ,int b)->a*b;
		Calc m1 = (int a, int b) -> a * b;
		// lambda function can be written for functional interface only
		int res = m1.mul(20, 30);
		System.out.println("Multplication is " + res);
	}

}
