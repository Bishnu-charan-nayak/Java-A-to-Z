package myMaltithread;

class WhiteBoard implements Runnable{
	@Override
  synchronized public void run() {
	
		String name=Thread.currentThread().getName();
		try {
			System.out.println(name+ "trying to acces whiteboard");
			Thread.sleep(500);
			System.out.println(name+ "got acces to whiteboars");
			for(int i=1;i<=10;i++) {
				System.out.println(name+ "Writing on the board");
				Thread.sleep(500);
			}
			System.out.println(name+ "completed accessing the board");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class MySharedResources {

	public static void main(String[] args) {

		WhiteBoard w = new WhiteBoard();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("Java");
		t2.setName("AWS");
		t3.setName("Cyber");
		
		t1.setPriority(1);
		t2.setPriority(8);
		t3.setPriority(9);//highest priority
		
		t1.start();
		t2.start();
		t3.start();
        
	}

}
