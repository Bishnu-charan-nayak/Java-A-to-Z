package finalKeyword;//interface

import java.util.Scanner;

interface Calculater {
	public abstract void add();
	public abstract void sub ();
}
class Calci implements Calculater{
	public void add () {
		int a= 100,b= 200;
		System.out.println("a+b"+(a+b));
	}
	public void sub() {
		int a= 200,b= 100;
		System.out.println("a-b"+(a-b));
	}
}

class SciCalci  implements Calculater {
	public void add () {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter a");
			int a = s.nextInt();
//		int a=1000,b=2000;
//		System.out.println("sum"+ (a+b));
	}
	public void sub () {
		int a=5000,b=2000;
			System.out.println("dif"+ (a-b));
	}
}
class MathCalci implements Calculater{
	public void add() {
		Scanner Scan =new Scanner (System.in);
System.out.println("Enter num>100");
int a =Scan.nextInt();
if(a>=100) {
	System.out.println("Enter b >");
	 int b=Scan.nextInt();
}
else {
	System.out.println("a can't be >100");
}
//		int a=10,b=300;
//		System.out.println("Addition"+ (a+b));
	}
	public void sub() {
		Scanner Scan1 =new Scanner (System.in);
		System.out.println("Enter num<=101");
		int a =Scan1.nextInt();
		if(a>=100) {
			System.out.println("Enter b a>=101");
			 int b=Scan1.nextInt();
		}
		else {
			System.out.println("a can't be a>=101");
//		int x=1000,y=100;
//		System.out.println("Substraction"+ (x-y));
	}
}
}

public class MyOprn {
	public static void main(String[] args) {

	


	Calci c1=new Calci();
	SciCalci c2=new SciCalci();
	MathCalci c3=new MathCalci();
	
	c1.add();
	c1.sub();
	System.out.println("");
	c2.add();
	c2.sub();
	System.out.println();
	c3.add();
	c3.sub();
	
	}
}
