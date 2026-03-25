package myMaltithread;

class BPUT extends Thread {
	String cls1 = "javaclsroom";
	String cls2 = "awsclsroom";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("JAVATRAINER")) {
			javatrainerAcquired();
		} else {
			awstrainerAcquired();
		}
	}

	public void javatrainerAcquired() {
		synchronized (cls1) {
			try {
				System.out.println("Java trainer Acquired javaclass room");
				Thread.sleep(2000);
				synchronized (cls2) {
					System.out.println("Java trainer Acquired awsclass room");
					Thread.sleep(2000);
				}
			}
			catch (Exception e) {
				System.out.println("Some error occured");
			}
		}
	}

	public void awstrainerAcquired() {
		synchronized (cls1) {
			try {
				System.out.println("AWS trainer Acquired javaclass room");
				Thread.sleep(2000);
				synchronized (cls2) {
					System.out.println("AWS trainer Acquired awsclass room");
					Thread.sleep(2000);
				}
			}
			catch (Exception e) {
				System.out.println("Some error occured");
			}
		}
	}
}

public class MyDeadLock {

	public static void main(String[] args) {
		
		BPUT b = new BPUT();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		t1.setName("JAVATRAINER");
		t2.setName("AWSTRAINER");
		t1.start();
		t2.start();

	}

}