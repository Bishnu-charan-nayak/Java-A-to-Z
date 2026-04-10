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



///// Other Example By using Thread

// package myMaltithread;

// // Task 1: Print Numbers
// class NumberTask implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Number: " + i);
//             try {
//                 Thread.sleep(500); // Pause for half a second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// // Task 2: Print Alphabets
// class AlphabetTask implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 65; i < 75; i++) { // Printing A to J to match the 10 numbers
//             System.out.println("Alphabet: " + (char) i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class MultiThreadExample1 {
//     public static void main(String[] args) {
//         System.out.println("Starting both tasks simultaneously...\n");

//         // Create the runnable tasks
//         Runnable task1 = new NumberTask();
//         Runnable task2 = new AlphabetTask();

//         // Assign the tasks to actual Threads
//         Thread thread1 = new Thread(task1);
//         Thread thread2 = new Thread(task2);

//         // Use .start() to run them at the same time
//         // (Do NOT use .run(), as that will just run them sequentially!)
//         thread1.start();
//         thread2.start();
//     }
// }

