package myMaltithread;

class MyTask1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class MyTask2 extends Thread {

	public void run() {

		for (int i = 65; i <= 90; i++) {
			try {
				Thread.sleep(2000);
				System.out.println((char) i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyTask3 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("2 x " + i + " = " + (2 * i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		}

	}

}

public class MyMultiThread {

	public static void main(String[] args) {
		
		MyTask1 t1 = new MyTask1();
		MyTask2 t2 = new MyTask2();
		MyTask3 t3 = new MyTask3();
		t1.start();
		t2.start();
		t3.start();
		

	}

}