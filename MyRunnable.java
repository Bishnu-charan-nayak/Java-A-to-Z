package myMaltithread;

class MyTaskChar implements Runnable {
	public void run() {
		for (char c = 65; c <= 75; c++) {
			try {
				Thread.sleep(1000);
				System.out.println(c);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyTaskNum implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTaskTable extends Thread implements Runnable { // (we also able to run extend Thread class )
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("2x" + i + "=" + (2 * 1));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTaskTable3 extends Thread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("3x" + i + "=" + (3 * i));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTaskTable4 extends Thread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("4x" + i + "=" + (4 * i));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyRunnable {

	public static void main(String[] args) {

		MyTaskChar t1 = new MyTaskChar();
		MyTaskNum t2 = new MyTaskNum();
		MyTaskTable t3 = new MyTaskTable();
		MyTaskTable3 t4 = new MyTaskTable3();
		MyTaskTable4 t5 = new MyTaskTable4();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
//		Thread th3 = new Thread(t3);

		th1.start();
		th2.start();
		t3.start();
		t4.start();
		t5.start();

//		  main(args);
	}

}
