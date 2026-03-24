package myMaltithread;

class MyBeta extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Line 1 ");
			Thread.sleep(500);
			System.out.println("Line 2");
			Thread.sleep(500);
			System.out.println("Line 3");
			Thread.sleep(500);
			System.out.println("Line 4");
			Thread.sleep(500);
			System.out.println("Line 5");
            Thread.currentThread().interrupt();
			System.out.println("Line 6");
			Thread.sleep(500);
			System.out.println("Line 7");
			Thread.sleep(500);
			System.out.println("Line 8");
			Thread.sleep(500);
			System.out.println("Line 9");
			Thread.sleep(500);
			System.out.println("Line 10");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Thread got Interrupted");
//			e.printStackTrace();
		}
	}

}

public class Myinterupt {

	public static void main(String[] args) {
		System.out.println("Main Started");
		MyBeta b = new MyBeta();
       Thread t1 = new Thread(b);
		t1.start();
	}

}
