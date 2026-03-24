package myMaltithread;

class Mymainthread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Main activity executing");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyDemo extends Thread {
	public void run() {
		for (;;) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Daemon supporting main task");
		}
	}
}

public class MyUser {

	public static void main(String[] args) {

		System.out.println("main thread started");
		MyDemo d1 = new MyDemo();
		Mymainthread m1 = new Mymainthread();
		d1.start();
		m1.start();
		System.out.println("Main thread ended");
	}

}
