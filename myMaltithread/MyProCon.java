package myMaltithread;

class Producer extends Thread {
	Queue a;

	public Producer(Queue q) {
		a = q;
	}

	public void run() {
		int i = 0;
		for (;;) {
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a.store(i++);
		}
	}
}

class Queue {
	int x;
	boolean is_data_Present = false;

	synchronized public void store(int j) {
		try {
			if (!is_data_Present) {
				x = j;
				System.out.println("Produced " + x);
				is_data_Present = true;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println("Some issue occurred");
		}
	}

	synchronized public void retrieve() {
		try {
			if (is_data_Present == true) {
				System.out.println("Consumed " + x);
				is_data_Present = false;
				notify();
			} else {
				wait();
			}
		} catch (Exception e) {
			System.out.println("Some issue occurred");

		}
	}
}

class Consumer extends Thread {
	Queue b;

	public Consumer(Queue q) {
		b = q;
	}

	public void run() {
		for (;;) {
			try {
				b.retrieve();
				Thread.sleep(500);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyProCon {
	public static void main(String[] args) {
		Queue q = new Queue();

		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.start();
		c.start();
	}
}