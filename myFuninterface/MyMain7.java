package myFuninterface;
interface Opns{
	void add(int a,int b);
	
}
//class Calc implements Opns {
//	public void add(int a,int b) {
//		int c=a+b;
//		System.out.println("Sum is "+c);
//	}
//}

public class MyMain7 {
    public static void main(String[] args) {

        Opns obj = (int a, int b) -> {
            int c = a + b;
            System.out.println("Sum is " + c);
        };

        // calling method	
        obj.add(10, 20);
    }
}