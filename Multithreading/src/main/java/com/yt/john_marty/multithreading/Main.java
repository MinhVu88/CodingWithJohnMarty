package main.java.com.yt.john_marty.multithreading;

public class Main {
	public static void main(String[] args) {
		/*
		main.java.com.yt.john_marty.multithreading.Multithreading1 thread1 = new main.java.com.yt.john_marty.multithreading.Multithreading1();
		main.java.com.yt.john_marty.multithreading.Multithreading1 thread2 = new main.java.com.yt.john_marty.multithreading.Multithreading1();
		thread1.start();
		thread2.start();
		*/

		for(int i = 0; i <= 2; i++) {
			// main.java.com.yt.john_marty.multithreading.Multithreading1 thread = new main.java.com.yt.john_marty.multithreading.Multithreading1();
			Multithreading1 thread = new Multithreading1(i);

			thread.start();

			try {
				thread.join();

				System.out.println("\tis thread #" + i + " alive -> " + thread.isAlive());
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

		// throw new RuntimeException();

		System.out.println();

		for(int i = 3; i <= 5; i++) {
			Multithreading2 runnableThread = new Multithreading2(i);

			Thread thread = new Thread(runnableThread);

			thread.start();

			System.out.println("\tis thread #" + i + " alive -> " + thread.isAlive());
		}
	}
}
