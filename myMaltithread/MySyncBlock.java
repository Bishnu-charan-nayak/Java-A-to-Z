package myMaltithread;

class MySyncThread extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println(name + "accessing the Line1");
			Thread.sleep(500);
			System.out.println(name + "accessing the Line2");
			Thread.sleep(500);

			System.out.println(name + "accessing the Line3");
			Thread.sleep(500);

			System.out.println(name + "accessing the Line4");
			Thread.sleep(500);
			synchronized (this) {
				System.out.println(name + "accessing the Line5");
				Thread.sleep(500);

				System.out.println(name + "accessing the Line6");
				Thread.sleep(500);

				System.out.println(name + "accessing the Line7");
				Thread.sleep(500);

				System.out.println(name + "accessing the Line8");
				Thread.sleep(500);
			}
			System.out.println(name + "accessing the Line9");
			Thread.sleep(500);

			System.out.println(name + "accessing the Line10");
			Thread.sleep(500);
			// when synchronized method use under line will be apper serially

		} catch (InterruptedException e) {
			System.out.println("some exception i m not worried");
			e.printStackTrace();
		}
	}
}

public class MySyncBlock {

	public static void main(String[] args) {

		MySyncThread m = new MySyncThread();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);

		t1.setName("Java ");
		t2.setName("AWS ");
		t3.setName("Cyber ");

		t1.setPriority(1);
		t2.setPriority(8);
		t3.setPriority(9);// highest priority

		t1.start();
		t2.start();
		t3.start();
	}

}
