package myPredicate;

public class MyRunable1 {
	public static void main(String[] args) {
		        // Thread 1 (Table of 2)
		        Runnable r = () -> {
		            for (int i = 1; i <= 10; i++) {
		                try {
		                    System.out.println("2 * " + i + " = " + (2 * i));
		                    Thread.sleep(500);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        };

		        // Thread 2 (Table of 3)
		        Runnable r1 = () -> {
		            for (int i = 1; i <= 10; i++) {
		                System.out.println("3 * " + i + " = " + (3 * i));
		            }
		        };

		        // Start both threads
		    
		        new Thread(r1).start();
		    }
		}
