package myMaltithread;

class Mymainthread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Typing ... " + i);// Main activity executing
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class MyDemo1 extends Thread {

	@Override
	public void run() {

		for (;;) {
			try {
				System.out.println("Auto completion... ");// Demon thread supporting main task
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MyUser1 {

	public static void main(String[] args) {
		System.out.println("Auto Save.....");// main thread start
		Mymainthread1 m1 = new Mymainthread1();
		MyDemo1 u1 = new MyDemo1();
		u1.setDaemon(true);
		m1.start();
		u1.start();
		System.out.println("Main thread ended");

	}

}