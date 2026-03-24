package myMaltithread;

class MyCode extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("2 x " + i + " = " + (2 * i));
		}
	}
}

class MyCode1 extends Thread{
	
public void run() {
	for (int i = 1; i <= 10; i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3 x " + i + " = " + (3 * i));
	}
}
}

class MyCode2 extends Thread{ 
	
public void run() {
	for (int i = 1; i <= 10; i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("4 x " + i + " = " + (4 * i));
	}
}
}


public class Mytask2 {
	public static void main(String[] args) {
		MyCode t1  = new MyCode();
		MyCode1 t2 = new MyCode1();
		MyCode2 t3 = new MyCode2();
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}