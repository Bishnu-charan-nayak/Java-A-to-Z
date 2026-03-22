package com.Method;

public class Calci1 {
//	public void add() {
//		int a=10;
//		int b =20;
//		System.out.println("a+b inside add()"+ (a+b));
//	}
// public static void main(String[] args) {
//	 		Calci1 c=new Calci1();
//	 		   c.add();
	

public int add() {
	int a =200;
	int b=300;
	int c=a+b;
	return c;
  }
public static void main(String[] args) {
	Calci1 c =new Calci1();
	int i = c.add();
	System.out.println("result sum is printed inside main ()"+i);
}
}