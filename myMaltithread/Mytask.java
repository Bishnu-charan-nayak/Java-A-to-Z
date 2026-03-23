package myMaltithread;

public class Mytask {
	public static void main(String[] args) {

		System.out.println("Number.....");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" ");
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char) i);
		}

		System.out.println("");
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("2x" + i + "=" + (2 * i));
		}
	}
}
