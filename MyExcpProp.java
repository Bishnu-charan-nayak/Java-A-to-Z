package myException;
import java.util.InputMismatchException;
import java.util.Scanner;

	class Demo3{
		
		public void m3() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Connection4 established");
			System.out.println("Enter your age");
			int age = scan.nextInt();
			System.out.println("Age entered is "+age);
			System.out.println("Connection4 terminated");
//			try {
//				System.out.println("Enter your age");
//				int age = scan.nextInt();
//				System.out.println("Age entered is "+age);
//				System.out.println("Connection4 terminated");
//			}
//			catch(Exception e){
//				System.out.println("Input can't be String");
//				System.out.println("Exception handle by m3");
    //		}

		}
	}

	class Demo2{
		
		public void m2() {
			System.out.println("Connection3 established");
			Demo3 d3=new Demo3();
			d3.m3();
//			try {
//				Demo3 d3=new Demo3();
//				d3.m3();
//			}
//			catch(InputMismatchException e) {
//				System.out.println("Input can't be String");
//			}
			System.out.println("Connection3 terminated");

		}
	}

	class Demo1{
		
		public void m1() {
			System.out.println("Connection2 established");
			Demo2 d2=new Demo2();
			d2.m2();
			System.out.println("Connection2 terminated");

		}
	}

	public class MyExcpProp {

		public static void main(String[] args) {
		System.out.println("Connection1 established");
		try {
		Demo1 d1=new Demo1();
		d1.m1();
		}
		catch(Exception e) {
			System.out.println("Input can't terminated");
		}
		System.out.println("Connection1 terminated");
		//	   main(args);///recarcive method for connection continue 

		}

	}

